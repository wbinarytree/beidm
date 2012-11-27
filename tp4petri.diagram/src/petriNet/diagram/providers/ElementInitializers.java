package petriNet.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = petriNet.diagram.part.PetriNetDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			petriNet.diagram.part.PetriNetDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
