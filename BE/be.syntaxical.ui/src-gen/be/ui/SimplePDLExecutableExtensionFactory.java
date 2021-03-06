/*
 * generated by Xtext
 */
package be.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import be.ui.internal.SimplePDLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SimplePDLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return SimplePDLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return SimplePDLActivator.getInstance().getInjector(SimplePDLActivator.BE_SIMPLEPDL);
	}
	
}
