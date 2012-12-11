
package be;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class SimplePDLStandaloneSetup extends SimplePDLStandaloneSetupGenerated{

	public static void doSetup() {
		new SimplePDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

