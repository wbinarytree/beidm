package simplepdl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

import simplepdl.diagram.providers.SimplePDLElementTypes;

/**
 * @generated
 */
public class RessourceInstanceItemSemanticEditPolicy extends
		SimplePDLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RessourceInstanceItemSemanticEditPolicy() {
		super(SimplePDLElementTypes.RessourceInstance_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
