/*
* generated by Xtext
*/
package be.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import be.services.SimplePDLGrammarAccess;

public class SimplePDLParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private SimplePDLGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected be.parser.antlr.internal.InternalSimplePDLParser createParser(XtextTokenStream stream) {
		return new be.parser.antlr.internal.InternalSimplePDLParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Process";
	}
	
	public SimplePDLGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SimplePDLGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
