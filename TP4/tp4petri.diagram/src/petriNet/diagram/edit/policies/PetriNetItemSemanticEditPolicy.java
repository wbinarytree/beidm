package petriNet.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

/**
 * @generated
 */
public class PetriNetItemSemanticEditPolicy extends
		petriNet.diagram.edit.policies.PetriNetBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PetriNetItemSemanticEditPolicy() {
		super(petriNet.diagram.providers.PetriNetElementTypes.PetriNet_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (petriNet.diagram.providers.PetriNetElementTypes.Transition_2002 == req
				.getElementType()) {
			return getGEFWrapper(new petriNet.diagram.edit.commands.TransitionCreateCommand(
					req));
		}
		if (petriNet.diagram.providers.PetriNetElementTypes.Place_2001 == req
				.getElementType()) {
			return getGEFWrapper(new petriNet.diagram.edit.commands.PlaceCreateCommand(
					req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
