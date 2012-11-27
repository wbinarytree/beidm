package simplepdl.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import simplepdl.diagram.providers.SimplePDLElementTypes;

/**
 * @generated
 */
public class GuidanceElementItemSemanticEditPolicy extends
		SimplePDLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public GuidanceElementItemSemanticEditPolicy() {
		super(SimplePDLElementTypes.GuidanceElement_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
