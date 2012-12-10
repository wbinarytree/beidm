package simplepdl.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import simplepdl.Process;
import simplepdl.WorkDefinition;
import simplepdl.WorkSequence;
import simplepdl.diagram.edit.policies.SimplePDLBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class WorkSequenceReorientCommand extends EditElementCommand {

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
	public WorkSequenceReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof WorkSequence) {
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
		WorkDefinition target = getLink().getSuccessor();
		if (!(getLink().eContainer() instanceof Process)) {
			return false;
		}
		Process container = (Process) getLink().eContainer();
		return SimplePDLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistWorkSequence_4001(container, getLink(),
						getNewSource(), target);
	}

	/**
	 * @generated
	 */
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof WorkDefinition && newEnd instanceof WorkDefinition)) {
			return false;
		}
		WorkDefinition source = getLink().getPredecessor();
		if (!(getLink().eContainer() instanceof Process)) {
			return false;
		}
		Process container = (Process) getLink().eContainer();
		return SimplePDLBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistWorkSequence_4001(container, getLink(), source,
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
		getLink().setPredecessor(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setSuccessor(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	 * @generated
	 */
	protected WorkSequence getLink() {
		return (WorkSequence) getElementToEdit();
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
	protected WorkDefinition getOldTarget() {
		return (WorkDefinition) oldEnd;
	}

	/**
	 * @generated
	 */
	protected WorkDefinition getNewTarget() {
		return (WorkDefinition) newEnd;
	}
}
