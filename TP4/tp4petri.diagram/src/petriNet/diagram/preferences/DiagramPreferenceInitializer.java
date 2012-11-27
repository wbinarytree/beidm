package petriNet.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	 * @generated
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		petriNet.diagram.preferences.DiagramGeneralPreferencePage
				.initDefaults(store);
		petriNet.diagram.preferences.DiagramAppearancePreferencePage
				.initDefaults(store);
		petriNet.diagram.preferences.DiagramConnectionsPreferencePage
				.initDefaults(store);
		petriNet.diagram.preferences.DiagramPrintingPreferencePage
				.initDefaults(store);
		petriNet.diagram.preferences.DiagramRulersAndGridPreferencePage
				.initDefaults(store);

	}

	/**
	 * @generated
	 */
	protected IPreferenceStore getPreferenceStore() {
		return petriNet.diagram.part.PetriNetDiagramEditorPlugin.getInstance()
				.getPreferenceStore();
	}
}
