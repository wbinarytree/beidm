/*
* generated by Xtext
*/
package fr.enseeiht.txt.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class SimplePDLAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("fr/enseeiht/txt/parser/antlr/internal/InternalSimplePDL.tokens");
	}
}