package simplepdl.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import simplepdl.diagram.part.SimplePDLVisualIDRegistry;

/**
 * @generated
 */
public class SimplePDLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (SimplePDLVisualIDRegistry.getVisualID(view)) {

			case ProcessEditPart.VISUAL_ID:
				return new ProcessEditPart(view);

			case RessourceEditPart.VISUAL_ID:
				return new RessourceEditPart(view);

			case RessourceNameEditPart.VISUAL_ID:
				return new RessourceNameEditPart(view);

			case GuidanceEditPart.VISUAL_ID:
				return new GuidanceEditPart(view);

			case GuidanceTextEditPart.VISUAL_ID:
				return new GuidanceTextEditPart(view);

			case WorkDefinitionEditPart.VISUAL_ID:
				return new WorkDefinitionEditPart(view);

			case WorkDefinitionNameEditPart.VISUAL_ID:
				return new WorkDefinitionNameEditPart(view);

			case WorkSequenceEditPart.VISUAL_ID:
				return new WorkSequenceEditPart(view);

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
