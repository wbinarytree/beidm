/*
* generated by Xtext
*/
package fr.enseeiht.txt;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SimplePDLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return fr.enseeiht.txt.ui.internal.SimplePDLActivator.getInstance().getInjector("fr.enseeiht.txt.SimplePDL");
	}
	
}
