/*
* generated by Xtext
*/
package fr.insa.petrinet.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import fr.insa.petrinet.services.PetrinetGrammarAccess;

public class PetrinetParser extends AbstractContentAssistParser {
	
	@Inject
	private PetrinetGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected fr.insa.petrinet.ui.contentassist.antlr.internal.InternalPetrinetParser createParser() {
		fr.insa.petrinet.ui.contentassist.antlr.internal.InternalPetrinetParser result = new fr.insa.petrinet.ui.contentassist.antlr.internal.InternalPetrinetParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getNoeudAccess().getAlternatives(), "rule__Noeud__Alternatives");
					put(grammarAccess.getArcKindTypeAccess().getAlternatives(), "rule__ArcKindType__Alternatives");
					put(grammarAccess.getPetriNetAccess().getGroup(), "rule__PetriNet__Group__0");
					put(grammarAccess.getArcAccess().getGroup(), "rule__Arc__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getTransitionAccess().getGroup_3(), "rule__Transition__Group_3__0");
					put(grammarAccess.getTransitionAccess().getGroup_4(), "rule__Transition__Group_4__0");
					put(grammarAccess.getPlaceAccess().getGroup(), "rule__Place__Group__0");
					put(grammarAccess.getPetriNetAccess().getNameAssignment_1(), "rule__PetriNet__NameAssignment_1");
					put(grammarAccess.getPetriNetAccess().getNoeudsAssignment_3(), "rule__PetriNet__NoeudsAssignment_3");
					put(grammarAccess.getPetriNetAccess().getArcsAssignment_4(), "rule__PetriNet__ArcsAssignment_4");
					put(grammarAccess.getArcAccess().getNameAssignment_1(), "rule__Arc__NameAssignment_1");
					put(grammarAccess.getArcAccess().getSourceAssignment_4(), "rule__Arc__SourceAssignment_4");
					put(grammarAccess.getArcAccess().getTargetAssignment_6(), "rule__Arc__TargetAssignment_6");
					put(grammarAccess.getArcAccess().getArcTypeAssignment_8(), "rule__Arc__ArcTypeAssignment_8");
					put(grammarAccess.getArcAccess().getWeightAssignment_10(), "rule__Arc__WeightAssignment_10");
					put(grammarAccess.getTransitionAccess().getNameAssignment_1(), "rule__Transition__NameAssignment_1");
					put(grammarAccess.getTransitionAccess().getMinTimeAssignment_3_1(), "rule__Transition__MinTimeAssignment_3_1");
					put(grammarAccess.getTransitionAccess().getMaxTimeAssignment_4_1(), "rule__Transition__MaxTimeAssignment_4_1");
					put(grammarAccess.getPlaceAccess().getNameAssignment_1(), "rule__Place__NameAssignment_1");
					put(grammarAccess.getPlaceAccess().getMarkingAssignment_4(), "rule__Place__MarkingAssignment_4");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			fr.insa.petrinet.ui.contentassist.antlr.internal.InternalPetrinetParser typedParser = (fr.insa.petrinet.ui.contentassist.antlr.internal.InternalPetrinetParser) parser;
			typedParser.entryRulePetriNet();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PetrinetGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PetrinetGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
