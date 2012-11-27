package simplepdl.diagram.providers;

import simplepdl.diagram.part.SimplePDLDiagramEditorPlugin;

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
		ElementInitializers cached = SimplePDLDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			SimplePDLDiagramEditorPlugin.getInstance().setElementInitializers(
					cached = new ElementInitializers());
		}
		return cached;
	}
}
