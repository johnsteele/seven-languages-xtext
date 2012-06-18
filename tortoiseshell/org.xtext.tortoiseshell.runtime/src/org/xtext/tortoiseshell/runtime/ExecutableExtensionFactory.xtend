package org.xtext.tortoiseshell.runtime

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory

class ExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {
	
	override protected getBundle() {
		Activator::instance.bundle
	}
	
	override protected getInjector() {
		Activator::instance.injector
	}
	
}