package fr.insa.petrinet.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.insa.petrinet.petrinet.Arc;
import fr.insa.petrinet.petrinet.PetriNet;
import fr.insa.petrinet.petrinet.PetrinetPackage;
import fr.insa.petrinet.petrinet.Place;
import fr.insa.petrinet.petrinet.Transition;
import fr.insa.petrinet.services.PetrinetGrammarAccess;
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
public class PetrinetSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private PetrinetGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == PetrinetPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case PetrinetPackage.ARC:
				if(context == grammarAccess.getArcRule()) {
					sequence_Arc(context, (Arc) semanticObject); 
					return; 
				}
				else break;
			case PetrinetPackage.PETRI_NET:
				if(context == grammarAccess.getPetriNetRule()) {
					sequence_PetriNet(context, (PetriNet) semanticObject); 
					return; 
				}
				else break;
			case PetrinetPackage.PLACE:
				if(context == grammarAccess.getNoeudRule() ||
				   context == grammarAccess.getPlaceRule()) {
					sequence_Place(context, (Place) semanticObject); 
					return; 
				}
				else break;
			case PetrinetPackage.TRANSITION:
				if(context == grammarAccess.getNoeudRule() ||
				   context == grammarAccess.getTransitionRule()) {
					sequence_Transition(context, (Transition) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID source=[Noeud|ID] target=[Noeud|ID] arcType=ArcKindType weight=INT)
	 */
	protected void sequence_Arc(EObject context, Arc semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PetrinetPackage.Literals.ARC__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetPackage.Literals.ARC__NAME));
			if(transientValues.isValueTransient(semanticObject, PetrinetPackage.Literals.ARC__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetPackage.Literals.ARC__SOURCE));
			if(transientValues.isValueTransient(semanticObject, PetrinetPackage.Literals.ARC__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetPackage.Literals.ARC__TARGET));
			if(transientValues.isValueTransient(semanticObject, PetrinetPackage.Literals.ARC__ARC_TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetPackage.Literals.ARC__ARC_TYPE));
			if(transientValues.isValueTransient(semanticObject, PetrinetPackage.Literals.ARC__WEIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetPackage.Literals.ARC__WEIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getArcAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getArcAccess().getSourceNoeudIDTerminalRuleCall_4_0_1(), semanticObject.getSource());
		feeder.accept(grammarAccess.getArcAccess().getTargetNoeudIDTerminalRuleCall_6_0_1(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getArcAccess().getArcTypeArcKindTypeEnumRuleCall_8_0(), semanticObject.getArcType());
		feeder.accept(grammarAccess.getArcAccess().getWeightINTTerminalRuleCall_10_0(), semanticObject.getWeight());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID noeuds+=Noeud* arcs+=Arc*)
	 */
	protected void sequence_PetriNet(EObject context, PetriNet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID marking=INT)
	 */
	protected void sequence_Place(EObject context, Place semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, PetrinetPackage.Literals.NOEUD__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetPackage.Literals.NOEUD__NAME));
			if(transientValues.isValueTransient(semanticObject, PetrinetPackage.Literals.PLACE__MARKING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, PetrinetPackage.Literals.PLACE__MARKING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getPlaceAccess().getMarkingINTTerminalRuleCall_4_0(), semanticObject.getMarking());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID minTime=INT? maxTime=INT?)
	 */
	protected void sequence_Transition(EObject context, Transition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
