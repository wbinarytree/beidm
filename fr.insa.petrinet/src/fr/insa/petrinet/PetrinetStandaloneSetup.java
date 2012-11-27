
package fr.insa.petrinet;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class PetrinetStandaloneSetup extends PetrinetStandaloneSetupGenerated{

	public static void doSetup() {
		new PetrinetStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

