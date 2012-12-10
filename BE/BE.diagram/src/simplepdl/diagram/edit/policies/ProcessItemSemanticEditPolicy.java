package simplepdl.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import simplepdl.diagram.edit.commands.GuidanceCreateCommand;
import simplepdl.diagram.edit.commands.RessourceCreateCommand;
import simplepdl.diagram.edit.commands.WorkDefinitionCreateCommand;
import simplepdl.diagram.providers.SimplePDLElementTypes;

/**
 * @generated
 */
public class ProcessItemSemanticEditPolicy extends
		SimplePDLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ProcessItemSemanticEditPolicy() {
		super(SimplePDLElementTypes.Process_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (SimplePDLElementTypes.Ressource_2001 == req.getElementType()) {
			return getGEFWrapper(new RessourceCreateCommand(req));
		}
		if (SimplePDLElementTypes.Guidance_2002 == req.getElementType()) {
			return getGEFWrapper(new GuidanceCreateCommand(req));
		}
		if (SimplePDLElementTypes.WorkDefinition_2003 == req.getElementType()) {
			return getGEFWrapper(new WorkDefinitionCreateCommand(req));
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
