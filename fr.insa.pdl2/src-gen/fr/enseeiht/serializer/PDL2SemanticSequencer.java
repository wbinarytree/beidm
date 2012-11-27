package fr.enseeiht.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.enseeiht.pDL2.DependanceFinish;
import fr.enseeiht.pDL2.DependanceStart;
import fr.enseeiht.pDL2.Guidance;
import fr.enseeiht.pDL2.PDL2Package;
import fr.enseeiht.pDL2.WorkDefinition;
import fr.enseeiht.pDL2.WorkSequenceKindFinish;
import fr.enseeiht.pDL2.WorkSequenceKindStart;
import fr.enseeiht.services.PDL2GrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class PDL2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PDL2GrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PDL2Package.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PDL2Package.DEPENDANCE_FINISH:
				if(context == grammarAccess.getDependanceFinishRule()) {
					sequence_DependanceFinish(context, (DependanceFinish) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.DEPENDANCE_START:
				if(context == grammarAccess.getDependanceStartRule()) {
					sequence_DependanceStart(context, (DependanceStart) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.GUIDANCE:
				if(context == grammarAccess.getGuidanceRule() ||
				   context == grammarAccess.getProcessElementRule()) {
					sequence_Guidance(context, (Guidance) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.PROCESS:
				if(context == grammarAccess.getProcessRule()) {
					sequence_Process(context, (fr.enseeiht.pDL2.Process) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.WORK_DEFINITION:
				if(context == grammarAccess.getProcessElementRule() ||
				   context == grammarAccess.getWorkDefinitionRule()) {
					sequence_WorkDefinition(context, (WorkDefinition) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.WORK_SEQUENCE_KIND_FINISH:
				if(context == grammarAccess.getWorkSequenceKindFinishRule()) {
					sequence_WorkSequenceKindFinish(context, (WorkSequenceKindFinish) semanticObject); 
					return; 
				}
				else break;
			case PDL2Package.WORK_SEQUENCE_KIND_START:
				if(context == grammarAccess.getWorkSequenceKindStartRule()) {
					sequence_WorkSequenceKindStart(context, (WorkSequenceKindStart) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (predecessor=[WorkDefinition|ID] link=WorkSequenceKindFinish)
	 */
	protected void sequence_DependanceFinish(EObject context, DependanceFinish semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__PREDECESSOR));
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_FINISH__LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependanceFinishAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.getPredecessor());
		feeder.accept(grammarAccess.getDependanceFinishAccess().getLinkWorkSequenceKindFinishParserRuleCall_1_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (predecessor=[WorkDefinition|ID] link=WorkSequenceKindStart)
	 */
	protected void sequence_DependanceStart(EObject context, DependanceStart semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_START__PREDECESSOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_START__PREDECESSOR));
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.DEPENDANCE_START__LINK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.DEPENDANCE_START__LINK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDependanceStartAccess().getPredecessorWorkDefinitionIDTerminalRuleCall_0_0_1(), semanticObject.getPredecessor());
		feeder.accept(grammarAccess.getDependanceStartAccess().getLinkWorkSequenceKindStartParserRuleCall_1_0(), semanticObject.getLink());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     text=STRING
	 */
	protected void sequence_Guidance(EObject context, Guidance semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PDL2Package.Literals.GUIDANCE__TEXT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PDL2Package.Literals.GUIDANCE__TEXT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_0(), semanticObject.getText());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID processElements+=ProcessElement*)
	 */
	protected void sequence_Process(EObject context, fr.enseeiht.pDL2.Process semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID linksToPredecessors+=DependanceStart* linksToSuccessors+=DependanceFinish*)
	 */
	protected void sequence_WorkDefinition(EObject context, WorkDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Finished2Start='started' | Finished2Finish='finished')
	 */
	protected void sequence_WorkSequenceKindFinish(EObject context, WorkSequenceKindFinish semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (Started2Start='started' | Started2Finish='finished')
	 */
	protected void sequence_WorkSequenceKindStart(EObject context, WorkSequenceKindStart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
