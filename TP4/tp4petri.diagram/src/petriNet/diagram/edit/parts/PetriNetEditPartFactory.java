package petriNet.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class PetriNetEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (petriNet.diagram.part.PetriNetVisualIDRegistry
					.getVisualID(view)) {

			case petriNet.diagram.edit.parts.PetriNetEditPart.VISUAL_ID:
				return new petriNet.diagram.edit.parts.PetriNetEditPart(view);

			case petriNet.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new petriNet.diagram.edit.parts.TransitionEditPart(view);

			case petriNet.diagram.edit.parts.TransitionNameEditPart.VISUAL_ID:
				return new petriNet.diagram.edit.parts.TransitionNameEditPart(
						view);

			case petriNet.diagram.edit.parts.PlaceEditPart.VISUAL_ID:
				return new petriNet.diagram.edit.parts.PlaceEditPart(view);

			case petriNet.diagram.edit.parts.PlaceNameEditPart.VISUAL_ID:
				return new petriNet.diagram.edit.parts.PlaceNameEditPart(view);

			case petriNet.diagram.edit.parts.ArcEditPart.VISUAL_ID:
				return new petriNet.diagram.edit.parts.ArcEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
