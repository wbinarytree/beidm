package simplepdl.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import simplepdl.Process;
import simplepdl.RessourceDefinition;
import simplepdl.RessourceInstance;
import simplepdl.WorkDefinition;
import simplepdl.diagram.edit.policies.SimplePDLBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class RessourceInstanceReorientCommand extends EditElementCommand {

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
	public RessourceInstanceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof RessourceInstance) {
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
		if (!(oldEnd instanceof WorkDefinition && newEnd instanceof WorkDefinition)) {
			return false;
		}
		RessourceDefinition target = getLink().getType();
		if (!(getLink().eContainer() instanceof Process)) {
			return false;
		}
		Process container = (Process) getLink().eContainer();
		return SimplePDLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRessourceInstance_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof RessourceDefinition && newEnd instanceof RessourceDefinition)) {
			return false;
		}
		WorkDefinition source = getLink().getActivity();
		if (!(getLink().eContainer() instanceof Process)) {
			return false;
		}
		Process container = (Process) getLink().eContainer();
		return SimplePDLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistRessourceInstance_4001(container, getLink(), source,
						getNewTarget());
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
		getLink().setActivity(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setType(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected RessourceInstance getLink() {
		return (RessourceInstance) getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected WorkDefinition getOldSource() {
		return (WorkDefinition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected WorkDefinition getNewSource() {
		return (WorkDefinition) newEnd;
	}

	/**
	 * @generated
	 */
	protected RessourceDefinition getOldTarget() {
		return (RessourceDefinition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected RessourceDefinition getNewTarget() {
		return (RessourceDefinition) newEnd;
	}
}
