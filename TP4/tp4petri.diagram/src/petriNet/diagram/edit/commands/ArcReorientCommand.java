package petriNet.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class ArcReorientCommand extends EditElementCommand {

	/**
	 * @generated
	 */
	private final int reorientDirection;

	/**
	 * @generated
	 */
	private final EObject oldEnd;

	/**
	 * @generated
	 */
	private final EObject newEnd;

	/**
	 * @generated
	 */
	public ArcReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof petriNet.Arc) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof petriNet.Node && newEnd instanceof petriNet.Node)) {
			return false;
		}
		petriNet.Node target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof petriNet.PetriNet)) {
			return false;
		}
		petriNet.PetriNet container = (petriNet.PetriNet) getLink()
				.eContainer();
		return petriNet.diagram.edit.policies.PetriNetBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistArc_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof petriNet.Node && newEnd instanceof petriNet.Node)) {
			return false;
		}
		petriNet.Node source = getLink().getSource();
		if (!(getLink().eContainer() instanceof petriNet.PetriNet)) {
			return false;
		}
		petriNet.PetriNet container = (petriNet.PetriNet) getLink()
				.eContainer();
		return petriNet.diagram.edit.policies.PetriNetBaseItemSemanticEditPolicy
				.getLinkConstraints().canExistArc_4001(container, getLink(),
						source, getNewTarget());
	}

	/**
	 * @generated
	 */
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor,
			IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException(
					"Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected petriNet.Arc getLink() {
		return (petriNet.Arc) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected petriNet.Node getOldSource() {
		return (petriNet.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected petriNet.Node getNewSource() {
		return (petriNet.Node) newEnd;
	}

	/**
	 * @generated
	 */
	protected petriNet.Node getOldTarget() {
		return (petriNet.Node) oldEnd;
	}

	/**
	 * @generated
	 */
	protected petriNet.Node getNewTarget() {
		return (petriNet.Node) newEnd;
	}
}
