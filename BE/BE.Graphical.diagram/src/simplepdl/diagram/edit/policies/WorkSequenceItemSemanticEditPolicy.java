package simplepdl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

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

}
