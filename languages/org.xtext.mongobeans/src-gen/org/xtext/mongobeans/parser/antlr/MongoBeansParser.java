/*******************************************************************************
 * Copyright (c) 2012 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 ******************************************************************************/
package org.xtext.mongobeans.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.mongobeans.services.MongoBeansGrammarAccess;

public class MongoBeansParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private MongoBeansGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected org.xtext.mongobeans.parser.antlr.internal.InternalMongoBeansParser createParser(XtextTokenStream stream) {
		return new org.xtext.mongobeans.parser.antlr.internal.InternalMongoBeansParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "MongoFile";
	}
	
	public MongoBeansGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(MongoBeansGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}