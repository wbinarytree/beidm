package simplepdl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;

import simplepdl.diagram.edit.commands.GuidanceElementCreateCommand;
import simplepdl.diagram.edit.commands.GuidanceElementReorientCommand;
import simplepdl.diagram.edit.parts.GuidanceElementEditPart;
import simplepdl.diagram.providers.SimplePDLElementTypes;

/**
 * @generated
 */
public class WorkSequenceItemSemanticEditPolicy extends
		SimplePDLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public WorkSequenceItemSemanticEditPolicy() {
		super(SimplePDLElementTypes.WorkSequence_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SimplePDLElementTypes.GuidanceElement_4001 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (SimplePDLElementTypes.GuidanceElement_4001 == req.getElementType()) {
			return getGEFWrapper(new GuidanceElementCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case GuidanceElementEditPart.VISUAL_ID:
			return getGEFWrapper(new GuidanceElementReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
