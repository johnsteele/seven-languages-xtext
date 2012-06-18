package org.xtext.tortoiseshell.interpreter

import com.google.inject.Inject
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.common.types.JvmOperation
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations
import org.eclipse.xtext.xbase.scoping.XbaseScopeProvider
import org.xtext.tortoiseshell.runtime.ITortoiseInterpreter
import org.xtext.tortoiseshell.runtime.Tortoise
import org.xtext.tortoiseshell.tortoiseShell.Executable
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.nodemodel.util.NodeModelUtils

class TortoiseShellInterpeter extends XbaseInterpreter implements ITortoiseInterpreter {
	
	@Inject extension IJvmModelAssociations 
	
	Tortoise tortoise
	
	int stopAtLine
	
	override run(Tortoise tortoise, EObject program, int stopAtLine) {
		if(tortoise != null && program != null) {
			this.tortoise = tortoise
			this.stopAtLine = stopAtLine
			try {
				program.jvmElements.filter(typeof(JvmOperation)).head
					?.invokeOperation(null, Collections::emptyList)
			} catch (StopLineReachedException exc) {
				// ignore
			}
		}
	}
	
	override protected internalEvaluate(XExpression expression, IEvaluationContext context, CancelIndicator indicator) {
		val line = NodeModelUtils::findActualNodeFor(expression)?.startLine
		if(line-1 == stopAtLine)
			throw new StopLineReachedException
		super.internalEvaluate(expression, context, indicator)
	}
	
	override protected invokeOperation(JvmOperation operation, Object receiver, List<Object> argumentValues) {
		val executable = operation.sourceElements.head
		if(executable instanceof Executable) {
			val context = createContext
			context.newValue(XbaseScopeProvider::THIS, tortoise)
			var index = 0
			for(param: operation.parameters) {
				context.newValue(QualifiedName::create(param.name), argumentValues.get(index))
				index = index + 1	
			}
			evaluate((executable as Executable).body, context, CancelIndicator::NullImpl)
		} else {
			super.invokeOperation(operation, receiver, argumentValues)
		}
	}
	
}

class StopLineReachedException extends RuntimeException {
}