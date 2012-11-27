package fr.insa.petrinet.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.insa.petrinet.services.PetrinetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinetParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'normal'", "'read_arc'", "'petrinet'", "'{'", "'}'", "'arc'", "'source'", "'target'", "'type'", "'weight'", "'transition'", "'minTime'", "'maxTime'", "'place'", "'marking'"
    };
    public static final int RULE_ID=4;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=8;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__19=19;
    public static final int RULE_STRING=6;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=5;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalPetrinetParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalPetrinetParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalPetrinetParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g"; }


     
     	private PetrinetGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(PetrinetGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRulePetriNet"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:60:1: entryRulePetriNet : rulePetriNet EOF ;
    public final void entryRulePetriNet() throws RecognitionException {
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:61:1: ( rulePetriNet EOF )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:62:1: rulePetriNet EOF
            {
             before(grammarAccess.getPetriNetRule()); 
            pushFollow(FOLLOW_rulePetriNet_in_entryRulePetriNet61);
            rulePetriNet();

            state._fsp--;

             after(grammarAccess.getPetriNetRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePetriNet68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePetriNet"


    // $ANTLR start "rulePetriNet"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:69:1: rulePetriNet : ( ( rule__PetriNet__Group__0 ) ) ;
    public final void rulePetriNet() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:73:2: ( ( ( rule__PetriNet__Group__0 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:74:1: ( ( rule__PetriNet__Group__0 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:74:1: ( ( rule__PetriNet__Group__0 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:75:1: ( rule__PetriNet__Group__0 )
            {
             before(grammarAccess.getPetriNetAccess().getGroup()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:76:1: ( rule__PetriNet__Group__0 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:76:2: rule__PetriNet__Group__0
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__0_in_rulePetriNet94);
            rule__PetriNet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePetriNet"


    // $ANTLR start "entryRuleArc"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:88:1: entryRuleArc : ruleArc EOF ;
    public final void entryRuleArc() throws RecognitionException {
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:89:1: ( ruleArc EOF )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:90:1: ruleArc EOF
            {
             before(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_ruleArc_in_entryRuleArc121);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getArcRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArc128); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:97:1: ruleArc : ( ( rule__Arc__Group__0 ) ) ;
    public final void ruleArc() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:101:2: ( ( ( rule__Arc__Group__0 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:102:1: ( ( rule__Arc__Group__0 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:102:1: ( ( rule__Arc__Group__0 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:103:1: ( rule__Arc__Group__0 )
            {
             before(grammarAccess.getArcAccess().getGroup()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:104:1: ( rule__Arc__Group__0 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:104:2: rule__Arc__Group__0
            {
            pushFollow(FOLLOW_rule__Arc__Group__0_in_ruleArc154);
            rule__Arc__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRuleNoeud"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:116:1: entryRuleNoeud : ruleNoeud EOF ;
    public final void entryRuleNoeud() throws RecognitionException {
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:117:1: ( ruleNoeud EOF )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:118:1: ruleNoeud EOF
            {
             before(grammarAccess.getNoeudRule()); 
            pushFollow(FOLLOW_ruleNoeud_in_entryRuleNoeud181);
            ruleNoeud();

            state._fsp--;

             after(grammarAccess.getNoeudRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoeud188); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNoeud"


    // $ANTLR start "ruleNoeud"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:125:1: ruleNoeud : ( ( rule__Noeud__Alternatives ) ) ;
    public final void ruleNoeud() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:129:2: ( ( ( rule__Noeud__Alternatives ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:130:1: ( ( rule__Noeud__Alternatives ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:130:1: ( ( rule__Noeud__Alternatives ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:131:1: ( rule__Noeud__Alternatives )
            {
             before(grammarAccess.getNoeudAccess().getAlternatives()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:132:1: ( rule__Noeud__Alternatives )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:132:2: rule__Noeud__Alternatives
            {
            pushFollow(FOLLOW_rule__Noeud__Alternatives_in_ruleNoeud214);
            rule__Noeud__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNoeudAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNoeud"


    // $ANTLR start "entryRuleTransition"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:144:1: entryRuleTransition : ruleTransition EOF ;
    public final void entryRuleTransition() throws RecognitionException {
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:145:1: ( ruleTransition EOF )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:146:1: ruleTransition EOF
            {
             before(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition241);
            ruleTransition();

            state._fsp--;

             after(grammarAccess.getTransitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition248); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:153:1: ruleTransition : ( ( rule__Transition__Group__0 ) ) ;
    public final void ruleTransition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:157:2: ( ( ( rule__Transition__Group__0 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:158:1: ( ( rule__Transition__Group__0 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:158:1: ( ( rule__Transition__Group__0 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:159:1: ( rule__Transition__Group__0 )
            {
             before(grammarAccess.getTransitionAccess().getGroup()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:160:1: ( rule__Transition__Group__0 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:160:2: rule__Transition__Group__0
            {
            pushFollow(FOLLOW_rule__Transition__Group__0_in_ruleTransition274);
            rule__Transition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRulePlace"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:172:1: entryRulePlace : rulePlace EOF ;
    public final void entryRulePlace() throws RecognitionException {
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:173:1: ( rulePlace EOF )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:174:1: rulePlace EOF
            {
             before(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_rulePlace_in_entryRulePlace301);
            rulePlace();

            state._fsp--;

             after(grammarAccess.getPlaceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlace308); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:181:1: rulePlace : ( ( rule__Place__Group__0 ) ) ;
    public final void rulePlace() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:185:2: ( ( ( rule__Place__Group__0 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:186:1: ( ( rule__Place__Group__0 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:186:1: ( ( rule__Place__Group__0 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:187:1: ( rule__Place__Group__0 )
            {
             before(grammarAccess.getPlaceAccess().getGroup()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:188:1: ( rule__Place__Group__0 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:188:2: rule__Place__Group__0
            {
            pushFollow(FOLLOW_rule__Place__Group__0_in_rulePlace334);
            rule__Place__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "ruleArcKindType"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:201:1: ruleArcKindType : ( ( rule__ArcKindType__Alternatives ) ) ;
    public final void ruleArcKindType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:205:1: ( ( ( rule__ArcKindType__Alternatives ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:206:1: ( ( rule__ArcKindType__Alternatives ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:206:1: ( ( rule__ArcKindType__Alternatives ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:207:1: ( rule__ArcKindType__Alternatives )
            {
             before(grammarAccess.getArcKindTypeAccess().getAlternatives()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:208:1: ( rule__ArcKindType__Alternatives )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:208:2: rule__ArcKindType__Alternatives
            {
            pushFollow(FOLLOW_rule__ArcKindType__Alternatives_in_ruleArcKindType371);
            rule__ArcKindType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getArcKindTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleArcKindType"


    // $ANTLR start "rule__Noeud__Alternatives"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:219:1: rule__Noeud__Alternatives : ( ( ruleTransition ) | ( rulePlace ) );
    public final void rule__Noeud__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:223:1: ( ( ruleTransition ) | ( rulePlace ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==21) ) {
                alt1=1;
            }
            else if ( (LA1_0==24) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:224:1: ( ruleTransition )
                    {
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:224:1: ( ruleTransition )
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:225:1: ruleTransition
                    {
                     before(grammarAccess.getNoeudAccess().getTransitionParserRuleCall_0()); 
                    pushFollow(FOLLOW_ruleTransition_in_rule__Noeud__Alternatives406);
                    ruleTransition();

                    state._fsp--;

                     after(grammarAccess.getNoeudAccess().getTransitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:230:6: ( rulePlace )
                    {
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:230:6: ( rulePlace )
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:231:1: rulePlace
                    {
                     before(grammarAccess.getNoeudAccess().getPlaceParserRuleCall_1()); 
                    pushFollow(FOLLOW_rulePlace_in_rule__Noeud__Alternatives423);
                    rulePlace();

                    state._fsp--;

                     after(grammarAccess.getNoeudAccess().getPlaceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Noeud__Alternatives"


    // $ANTLR start "rule__ArcKindType__Alternatives"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:241:1: rule__ArcKindType__Alternatives : ( ( ( 'normal' ) ) | ( ( 'read_arc' ) ) );
    public final void rule__ArcKindType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:245:1: ( ( ( 'normal' ) ) | ( ( 'read_arc' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:246:1: ( ( 'normal' ) )
                    {
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:246:1: ( ( 'normal' ) )
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:247:1: ( 'normal' )
                    {
                     before(grammarAccess.getArcKindTypeAccess().getNormalEnumLiteralDeclaration_0()); 
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:248:1: ( 'normal' )
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:248:3: 'normal'
                    {
                    match(input,11,FOLLOW_11_in_rule__ArcKindType__Alternatives456); 

                    }

                     after(grammarAccess.getArcKindTypeAccess().getNormalEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:253:6: ( ( 'read_arc' ) )
                    {
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:253:6: ( ( 'read_arc' ) )
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:254:1: ( 'read_arc' )
                    {
                     before(grammarAccess.getArcKindTypeAccess().getRead_arcEnumLiteralDeclaration_1()); 
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:255:1: ( 'read_arc' )
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:255:3: 'read_arc'
                    {
                    match(input,12,FOLLOW_12_in_rule__ArcKindType__Alternatives477); 

                    }

                     after(grammarAccess.getArcKindTypeAccess().getRead_arcEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ArcKindType__Alternatives"


    // $ANTLR start "rule__PetriNet__Group__0"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:267:1: rule__PetriNet__Group__0 : rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1 ;
    public final void rule__PetriNet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:271:1: ( rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:272:2: rule__PetriNet__Group__0__Impl rule__PetriNet__Group__1
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__0__Impl_in_rule__PetriNet__Group__0510);
            rule__PetriNet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__1_in_rule__PetriNet__Group__0513);
            rule__PetriNet__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__0"


    // $ANTLR start "rule__PetriNet__Group__0__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:279:1: rule__PetriNet__Group__0__Impl : ( 'petrinet' ) ;
    public final void rule__PetriNet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:283:1: ( ( 'petrinet' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:284:1: ( 'petrinet' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:284:1: ( 'petrinet' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:285:1: 'petrinet'
            {
             before(grammarAccess.getPetriNetAccess().getPetrinetKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__PetriNet__Group__0__Impl541); 
             after(grammarAccess.getPetriNetAccess().getPetrinetKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__0__Impl"


    // $ANTLR start "rule__PetriNet__Group__1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:298:1: rule__PetriNet__Group__1 : rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2 ;
    public final void rule__PetriNet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:302:1: ( rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:303:2: rule__PetriNet__Group__1__Impl rule__PetriNet__Group__2
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__1__Impl_in_rule__PetriNet__Group__1572);
            rule__PetriNet__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__2_in_rule__PetriNet__Group__1575);
            rule__PetriNet__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__1"


    // $ANTLR start "rule__PetriNet__Group__1__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:310:1: rule__PetriNet__Group__1__Impl : ( ( rule__PetriNet__NameAssignment_1 ) ) ;
    public final void rule__PetriNet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:314:1: ( ( ( rule__PetriNet__NameAssignment_1 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:315:1: ( ( rule__PetriNet__NameAssignment_1 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:315:1: ( ( rule__PetriNet__NameAssignment_1 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:316:1: ( rule__PetriNet__NameAssignment_1 )
            {
             before(grammarAccess.getPetriNetAccess().getNameAssignment_1()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:317:1: ( rule__PetriNet__NameAssignment_1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:317:2: rule__PetriNet__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__PetriNet__NameAssignment_1_in_rule__PetriNet__Group__1__Impl602);
            rule__PetriNet__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPetriNetAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__1__Impl"


    // $ANTLR start "rule__PetriNet__Group__2"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:327:1: rule__PetriNet__Group__2 : rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3 ;
    public final void rule__PetriNet__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:331:1: ( rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:332:2: rule__PetriNet__Group__2__Impl rule__PetriNet__Group__3
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__2__Impl_in_rule__PetriNet__Group__2632);
            rule__PetriNet__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__3_in_rule__PetriNet__Group__2635);
            rule__PetriNet__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__2"


    // $ANTLR start "rule__PetriNet__Group__2__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:339:1: rule__PetriNet__Group__2__Impl : ( '{' ) ;
    public final void rule__PetriNet__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:343:1: ( ( '{' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:344:1: ( '{' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:344:1: ( '{' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:345:1: '{'
            {
             before(grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__PetriNet__Group__2__Impl663); 
             after(grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__2__Impl"


    // $ANTLR start "rule__PetriNet__Group__3"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:358:1: rule__PetriNet__Group__3 : rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4 ;
    public final void rule__PetriNet__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:362:1: ( rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:363:2: rule__PetriNet__Group__3__Impl rule__PetriNet__Group__4
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__3__Impl_in_rule__PetriNet__Group__3694);
            rule__PetriNet__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__4_in_rule__PetriNet__Group__3697);
            rule__PetriNet__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__3"


    // $ANTLR start "rule__PetriNet__Group__3__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:370:1: rule__PetriNet__Group__3__Impl : ( ( rule__PetriNet__NoeudsAssignment_3 )* ) ;
    public final void rule__PetriNet__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:374:1: ( ( ( rule__PetriNet__NoeudsAssignment_3 )* ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:375:1: ( ( rule__PetriNet__NoeudsAssignment_3 )* )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:375:1: ( ( rule__PetriNet__NoeudsAssignment_3 )* )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:376:1: ( rule__PetriNet__NoeudsAssignment_3 )*
            {
             before(grammarAccess.getPetriNetAccess().getNoeudsAssignment_3()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:377:1: ( rule__PetriNet__NoeudsAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21||LA3_0==24) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:377:2: rule__PetriNet__NoeudsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__PetriNet__NoeudsAssignment_3_in_rule__PetriNet__Group__3__Impl724);
            	    rule__PetriNet__NoeudsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getPetriNetAccess().getNoeudsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__3__Impl"


    // $ANTLR start "rule__PetriNet__Group__4"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:387:1: rule__PetriNet__Group__4 : rule__PetriNet__Group__4__Impl rule__PetriNet__Group__5 ;
    public final void rule__PetriNet__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:391:1: ( rule__PetriNet__Group__4__Impl rule__PetriNet__Group__5 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:392:2: rule__PetriNet__Group__4__Impl rule__PetriNet__Group__5
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__4__Impl_in_rule__PetriNet__Group__4755);
            rule__PetriNet__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PetriNet__Group__5_in_rule__PetriNet__Group__4758);
            rule__PetriNet__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__4"


    // $ANTLR start "rule__PetriNet__Group__4__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:399:1: rule__PetriNet__Group__4__Impl : ( ( rule__PetriNet__ArcsAssignment_4 )* ) ;
    public final void rule__PetriNet__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:403:1: ( ( ( rule__PetriNet__ArcsAssignment_4 )* ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:404:1: ( ( rule__PetriNet__ArcsAssignment_4 )* )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:404:1: ( ( rule__PetriNet__ArcsAssignment_4 )* )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:405:1: ( rule__PetriNet__ArcsAssignment_4 )*
            {
             before(grammarAccess.getPetriNetAccess().getArcsAssignment_4()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:406:1: ( rule__PetriNet__ArcsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:406:2: rule__PetriNet__ArcsAssignment_4
            	    {
            	    pushFollow(FOLLOW_rule__PetriNet__ArcsAssignment_4_in_rule__PetriNet__Group__4__Impl785);
            	    rule__PetriNet__ArcsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPetriNetAccess().getArcsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__4__Impl"


    // $ANTLR start "rule__PetriNet__Group__5"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:416:1: rule__PetriNet__Group__5 : rule__PetriNet__Group__5__Impl ;
    public final void rule__PetriNet__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:420:1: ( rule__PetriNet__Group__5__Impl )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:421:2: rule__PetriNet__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PetriNet__Group__5__Impl_in_rule__PetriNet__Group__5816);
            rule__PetriNet__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__5"


    // $ANTLR start "rule__PetriNet__Group__5__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:427:1: rule__PetriNet__Group__5__Impl : ( '}' ) ;
    public final void rule__PetriNet__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:431:1: ( ( '}' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:432:1: ( '}' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:432:1: ( '}' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:433:1: '}'
            {
             before(grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__PetriNet__Group__5__Impl844); 
             after(grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__Group__5__Impl"


    // $ANTLR start "rule__Arc__Group__0"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:458:1: rule__Arc__Group__0 : rule__Arc__Group__0__Impl rule__Arc__Group__1 ;
    public final void rule__Arc__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:462:1: ( rule__Arc__Group__0__Impl rule__Arc__Group__1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:463:2: rule__Arc__Group__0__Impl rule__Arc__Group__1
            {
            pushFollow(FOLLOW_rule__Arc__Group__0__Impl_in_rule__Arc__Group__0887);
            rule__Arc__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__1_in_rule__Arc__Group__0890);
            rule__Arc__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__0"


    // $ANTLR start "rule__Arc__Group__0__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:470:1: rule__Arc__Group__0__Impl : ( 'arc' ) ;
    public final void rule__Arc__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:474:1: ( ( 'arc' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:475:1: ( 'arc' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:475:1: ( 'arc' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:476:1: 'arc'
            {
             before(grammarAccess.getArcAccess().getArcKeyword_0()); 
            match(input,16,FOLLOW_16_in_rule__Arc__Group__0__Impl918); 
             after(grammarAccess.getArcAccess().getArcKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__0__Impl"


    // $ANTLR start "rule__Arc__Group__1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:489:1: rule__Arc__Group__1 : rule__Arc__Group__1__Impl rule__Arc__Group__2 ;
    public final void rule__Arc__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:493:1: ( rule__Arc__Group__1__Impl rule__Arc__Group__2 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:494:2: rule__Arc__Group__1__Impl rule__Arc__Group__2
            {
            pushFollow(FOLLOW_rule__Arc__Group__1__Impl_in_rule__Arc__Group__1949);
            rule__Arc__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__2_in_rule__Arc__Group__1952);
            rule__Arc__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__1"


    // $ANTLR start "rule__Arc__Group__1__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:501:1: rule__Arc__Group__1__Impl : ( ( rule__Arc__NameAssignment_1 ) ) ;
    public final void rule__Arc__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:505:1: ( ( ( rule__Arc__NameAssignment_1 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:506:1: ( ( rule__Arc__NameAssignment_1 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:506:1: ( ( rule__Arc__NameAssignment_1 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:507:1: ( rule__Arc__NameAssignment_1 )
            {
             before(grammarAccess.getArcAccess().getNameAssignment_1()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:508:1: ( rule__Arc__NameAssignment_1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:508:2: rule__Arc__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Arc__NameAssignment_1_in_rule__Arc__Group__1__Impl979);
            rule__Arc__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__1__Impl"


    // $ANTLR start "rule__Arc__Group__2"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:518:1: rule__Arc__Group__2 : rule__Arc__Group__2__Impl rule__Arc__Group__3 ;
    public final void rule__Arc__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:522:1: ( rule__Arc__Group__2__Impl rule__Arc__Group__3 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:523:2: rule__Arc__Group__2__Impl rule__Arc__Group__3
            {
            pushFollow(FOLLOW_rule__Arc__Group__2__Impl_in_rule__Arc__Group__21009);
            rule__Arc__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__3_in_rule__Arc__Group__21012);
            rule__Arc__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__2"


    // $ANTLR start "rule__Arc__Group__2__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:530:1: rule__Arc__Group__2__Impl : ( '{' ) ;
    public final void rule__Arc__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:534:1: ( ( '{' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:535:1: ( '{' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:535:1: ( '{' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:536:1: '{'
            {
             before(grammarAccess.getArcAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Arc__Group__2__Impl1040); 
             after(grammarAccess.getArcAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__2__Impl"


    // $ANTLR start "rule__Arc__Group__3"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:549:1: rule__Arc__Group__3 : rule__Arc__Group__3__Impl rule__Arc__Group__4 ;
    public final void rule__Arc__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:553:1: ( rule__Arc__Group__3__Impl rule__Arc__Group__4 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:554:2: rule__Arc__Group__3__Impl rule__Arc__Group__4
            {
            pushFollow(FOLLOW_rule__Arc__Group__3__Impl_in_rule__Arc__Group__31071);
            rule__Arc__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__4_in_rule__Arc__Group__31074);
            rule__Arc__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__3"


    // $ANTLR start "rule__Arc__Group__3__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:561:1: rule__Arc__Group__3__Impl : ( 'source' ) ;
    public final void rule__Arc__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:565:1: ( ( 'source' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:566:1: ( 'source' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:566:1: ( 'source' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:567:1: 'source'
            {
             before(grammarAccess.getArcAccess().getSourceKeyword_3()); 
            match(input,17,FOLLOW_17_in_rule__Arc__Group__3__Impl1102); 
             after(grammarAccess.getArcAccess().getSourceKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__3__Impl"


    // $ANTLR start "rule__Arc__Group__4"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:580:1: rule__Arc__Group__4 : rule__Arc__Group__4__Impl rule__Arc__Group__5 ;
    public final void rule__Arc__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:584:1: ( rule__Arc__Group__4__Impl rule__Arc__Group__5 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:585:2: rule__Arc__Group__4__Impl rule__Arc__Group__5
            {
            pushFollow(FOLLOW_rule__Arc__Group__4__Impl_in_rule__Arc__Group__41133);
            rule__Arc__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__5_in_rule__Arc__Group__41136);
            rule__Arc__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__4"


    // $ANTLR start "rule__Arc__Group__4__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:592:1: rule__Arc__Group__4__Impl : ( ( rule__Arc__SourceAssignment_4 ) ) ;
    public final void rule__Arc__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:596:1: ( ( ( rule__Arc__SourceAssignment_4 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:597:1: ( ( rule__Arc__SourceAssignment_4 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:597:1: ( ( rule__Arc__SourceAssignment_4 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:598:1: ( rule__Arc__SourceAssignment_4 )
            {
             before(grammarAccess.getArcAccess().getSourceAssignment_4()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:599:1: ( rule__Arc__SourceAssignment_4 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:599:2: rule__Arc__SourceAssignment_4
            {
            pushFollow(FOLLOW_rule__Arc__SourceAssignment_4_in_rule__Arc__Group__4__Impl1163);
            rule__Arc__SourceAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getSourceAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__4__Impl"


    // $ANTLR start "rule__Arc__Group__5"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:609:1: rule__Arc__Group__5 : rule__Arc__Group__5__Impl rule__Arc__Group__6 ;
    public final void rule__Arc__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:613:1: ( rule__Arc__Group__5__Impl rule__Arc__Group__6 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:614:2: rule__Arc__Group__5__Impl rule__Arc__Group__6
            {
            pushFollow(FOLLOW_rule__Arc__Group__5__Impl_in_rule__Arc__Group__51193);
            rule__Arc__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__6_in_rule__Arc__Group__51196);
            rule__Arc__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__5"


    // $ANTLR start "rule__Arc__Group__5__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:621:1: rule__Arc__Group__5__Impl : ( 'target' ) ;
    public final void rule__Arc__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:625:1: ( ( 'target' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:626:1: ( 'target' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:626:1: ( 'target' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:627:1: 'target'
            {
             before(grammarAccess.getArcAccess().getTargetKeyword_5()); 
            match(input,18,FOLLOW_18_in_rule__Arc__Group__5__Impl1224); 
             after(grammarAccess.getArcAccess().getTargetKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__5__Impl"


    // $ANTLR start "rule__Arc__Group__6"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:640:1: rule__Arc__Group__6 : rule__Arc__Group__6__Impl rule__Arc__Group__7 ;
    public final void rule__Arc__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:644:1: ( rule__Arc__Group__6__Impl rule__Arc__Group__7 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:645:2: rule__Arc__Group__6__Impl rule__Arc__Group__7
            {
            pushFollow(FOLLOW_rule__Arc__Group__6__Impl_in_rule__Arc__Group__61255);
            rule__Arc__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__7_in_rule__Arc__Group__61258);
            rule__Arc__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__6"


    // $ANTLR start "rule__Arc__Group__6__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:652:1: rule__Arc__Group__6__Impl : ( ( rule__Arc__TargetAssignment_6 ) ) ;
    public final void rule__Arc__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:656:1: ( ( ( rule__Arc__TargetAssignment_6 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:657:1: ( ( rule__Arc__TargetAssignment_6 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:657:1: ( ( rule__Arc__TargetAssignment_6 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:658:1: ( rule__Arc__TargetAssignment_6 )
            {
             before(grammarAccess.getArcAccess().getTargetAssignment_6()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:659:1: ( rule__Arc__TargetAssignment_6 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:659:2: rule__Arc__TargetAssignment_6
            {
            pushFollow(FOLLOW_rule__Arc__TargetAssignment_6_in_rule__Arc__Group__6__Impl1285);
            rule__Arc__TargetAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getTargetAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__6__Impl"


    // $ANTLR start "rule__Arc__Group__7"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:669:1: rule__Arc__Group__7 : rule__Arc__Group__7__Impl rule__Arc__Group__8 ;
    public final void rule__Arc__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:673:1: ( rule__Arc__Group__7__Impl rule__Arc__Group__8 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:674:2: rule__Arc__Group__7__Impl rule__Arc__Group__8
            {
            pushFollow(FOLLOW_rule__Arc__Group__7__Impl_in_rule__Arc__Group__71315);
            rule__Arc__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__8_in_rule__Arc__Group__71318);
            rule__Arc__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__7"


    // $ANTLR start "rule__Arc__Group__7__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:681:1: rule__Arc__Group__7__Impl : ( 'type' ) ;
    public final void rule__Arc__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:685:1: ( ( 'type' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:686:1: ( 'type' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:686:1: ( 'type' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:687:1: 'type'
            {
             before(grammarAccess.getArcAccess().getTypeKeyword_7()); 
            match(input,19,FOLLOW_19_in_rule__Arc__Group__7__Impl1346); 
             after(grammarAccess.getArcAccess().getTypeKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__7__Impl"


    // $ANTLR start "rule__Arc__Group__8"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:700:1: rule__Arc__Group__8 : rule__Arc__Group__8__Impl rule__Arc__Group__9 ;
    public final void rule__Arc__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:704:1: ( rule__Arc__Group__8__Impl rule__Arc__Group__9 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:705:2: rule__Arc__Group__8__Impl rule__Arc__Group__9
            {
            pushFollow(FOLLOW_rule__Arc__Group__8__Impl_in_rule__Arc__Group__81377);
            rule__Arc__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__9_in_rule__Arc__Group__81380);
            rule__Arc__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__8"


    // $ANTLR start "rule__Arc__Group__8__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:712:1: rule__Arc__Group__8__Impl : ( ( rule__Arc__ArcTypeAssignment_8 ) ) ;
    public final void rule__Arc__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:716:1: ( ( ( rule__Arc__ArcTypeAssignment_8 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:717:1: ( ( rule__Arc__ArcTypeAssignment_8 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:717:1: ( ( rule__Arc__ArcTypeAssignment_8 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:718:1: ( rule__Arc__ArcTypeAssignment_8 )
            {
             before(grammarAccess.getArcAccess().getArcTypeAssignment_8()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:719:1: ( rule__Arc__ArcTypeAssignment_8 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:719:2: rule__Arc__ArcTypeAssignment_8
            {
            pushFollow(FOLLOW_rule__Arc__ArcTypeAssignment_8_in_rule__Arc__Group__8__Impl1407);
            rule__Arc__ArcTypeAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getArcTypeAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__8__Impl"


    // $ANTLR start "rule__Arc__Group__9"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:729:1: rule__Arc__Group__9 : rule__Arc__Group__9__Impl rule__Arc__Group__10 ;
    public final void rule__Arc__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:733:1: ( rule__Arc__Group__9__Impl rule__Arc__Group__10 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:734:2: rule__Arc__Group__9__Impl rule__Arc__Group__10
            {
            pushFollow(FOLLOW_rule__Arc__Group__9__Impl_in_rule__Arc__Group__91437);
            rule__Arc__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__10_in_rule__Arc__Group__91440);
            rule__Arc__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__9"


    // $ANTLR start "rule__Arc__Group__9__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:741:1: rule__Arc__Group__9__Impl : ( 'weight' ) ;
    public final void rule__Arc__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:745:1: ( ( 'weight' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:746:1: ( 'weight' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:746:1: ( 'weight' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:747:1: 'weight'
            {
             before(grammarAccess.getArcAccess().getWeightKeyword_9()); 
            match(input,20,FOLLOW_20_in_rule__Arc__Group__9__Impl1468); 
             after(grammarAccess.getArcAccess().getWeightKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__9__Impl"


    // $ANTLR start "rule__Arc__Group__10"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:760:1: rule__Arc__Group__10 : rule__Arc__Group__10__Impl rule__Arc__Group__11 ;
    public final void rule__Arc__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:764:1: ( rule__Arc__Group__10__Impl rule__Arc__Group__11 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:765:2: rule__Arc__Group__10__Impl rule__Arc__Group__11
            {
            pushFollow(FOLLOW_rule__Arc__Group__10__Impl_in_rule__Arc__Group__101499);
            rule__Arc__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Arc__Group__11_in_rule__Arc__Group__101502);
            rule__Arc__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__10"


    // $ANTLR start "rule__Arc__Group__10__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:772:1: rule__Arc__Group__10__Impl : ( ( rule__Arc__WeightAssignment_10 ) ) ;
    public final void rule__Arc__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:776:1: ( ( ( rule__Arc__WeightAssignment_10 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:777:1: ( ( rule__Arc__WeightAssignment_10 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:777:1: ( ( rule__Arc__WeightAssignment_10 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:778:1: ( rule__Arc__WeightAssignment_10 )
            {
             before(grammarAccess.getArcAccess().getWeightAssignment_10()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:779:1: ( rule__Arc__WeightAssignment_10 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:779:2: rule__Arc__WeightAssignment_10
            {
            pushFollow(FOLLOW_rule__Arc__WeightAssignment_10_in_rule__Arc__Group__10__Impl1529);
            rule__Arc__WeightAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getArcAccess().getWeightAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__10__Impl"


    // $ANTLR start "rule__Arc__Group__11"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:789:1: rule__Arc__Group__11 : rule__Arc__Group__11__Impl ;
    public final void rule__Arc__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:793:1: ( rule__Arc__Group__11__Impl )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:794:2: rule__Arc__Group__11__Impl
            {
            pushFollow(FOLLOW_rule__Arc__Group__11__Impl_in_rule__Arc__Group__111559);
            rule__Arc__Group__11__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__11"


    // $ANTLR start "rule__Arc__Group__11__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:800:1: rule__Arc__Group__11__Impl : ( '}' ) ;
    public final void rule__Arc__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:804:1: ( ( '}' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:805:1: ( '}' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:805:1: ( '}' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:806:1: '}'
            {
             before(grammarAccess.getArcAccess().getRightCurlyBracketKeyword_11()); 
            match(input,15,FOLLOW_15_in_rule__Arc__Group__11__Impl1587); 
             after(grammarAccess.getArcAccess().getRightCurlyBracketKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__Group__11__Impl"


    // $ANTLR start "rule__Transition__Group__0"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:843:1: rule__Transition__Group__0 : rule__Transition__Group__0__Impl rule__Transition__Group__1 ;
    public final void rule__Transition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:847:1: ( rule__Transition__Group__0__Impl rule__Transition__Group__1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:848:2: rule__Transition__Group__0__Impl rule__Transition__Group__1
            {
            pushFollow(FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01642);
            rule__Transition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01645);
            rule__Transition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0"


    // $ANTLR start "rule__Transition__Group__0__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:855:1: rule__Transition__Group__0__Impl : ( 'transition' ) ;
    public final void rule__Transition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:859:1: ( ( 'transition' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:860:1: ( 'transition' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:860:1: ( 'transition' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:861:1: 'transition'
            {
             before(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__Transition__Group__0__Impl1673); 
             after(grammarAccess.getTransitionAccess().getTransitionKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__0__Impl"


    // $ANTLR start "rule__Transition__Group__1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:874:1: rule__Transition__Group__1 : rule__Transition__Group__1__Impl rule__Transition__Group__2 ;
    public final void rule__Transition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:878:1: ( rule__Transition__Group__1__Impl rule__Transition__Group__2 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:879:2: rule__Transition__Group__1__Impl rule__Transition__Group__2
            {
            pushFollow(FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11704);
            rule__Transition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11707);
            rule__Transition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1"


    // $ANTLR start "rule__Transition__Group__1__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:886:1: rule__Transition__Group__1__Impl : ( ( rule__Transition__NameAssignment_1 ) ) ;
    public final void rule__Transition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:890:1: ( ( ( rule__Transition__NameAssignment_1 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:891:1: ( ( rule__Transition__NameAssignment_1 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:891:1: ( ( rule__Transition__NameAssignment_1 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:892:1: ( rule__Transition__NameAssignment_1 )
            {
             before(grammarAccess.getTransitionAccess().getNameAssignment_1()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:893:1: ( rule__Transition__NameAssignment_1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:893:2: rule__Transition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Transition__NameAssignment_1_in_rule__Transition__Group__1__Impl1734);
            rule__Transition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__1__Impl"


    // $ANTLR start "rule__Transition__Group__2"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:903:1: rule__Transition__Group__2 : rule__Transition__Group__2__Impl rule__Transition__Group__3 ;
    public final void rule__Transition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:907:1: ( rule__Transition__Group__2__Impl rule__Transition__Group__3 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:908:2: rule__Transition__Group__2__Impl rule__Transition__Group__3
            {
            pushFollow(FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21764);
            rule__Transition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21767);
            rule__Transition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2"


    // $ANTLR start "rule__Transition__Group__2__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:915:1: rule__Transition__Group__2__Impl : ( '{' ) ;
    public final void rule__Transition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:919:1: ( ( '{' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:920:1: ( '{' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:920:1: ( '{' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:921:1: '{'
            {
             before(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Transition__Group__2__Impl1795); 
             after(grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__2__Impl"


    // $ANTLR start "rule__Transition__Group__3"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:934:1: rule__Transition__Group__3 : rule__Transition__Group__3__Impl rule__Transition__Group__4 ;
    public final void rule__Transition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:938:1: ( rule__Transition__Group__3__Impl rule__Transition__Group__4 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:939:2: rule__Transition__Group__3__Impl rule__Transition__Group__4
            {
            pushFollow(FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__31826);
            rule__Transition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__31829);
            rule__Transition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3"


    // $ANTLR start "rule__Transition__Group__3__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:946:1: rule__Transition__Group__3__Impl : ( ( rule__Transition__Group_3__0 )? ) ;
    public final void rule__Transition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:950:1: ( ( ( rule__Transition__Group_3__0 )? ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:951:1: ( ( rule__Transition__Group_3__0 )? )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:951:1: ( ( rule__Transition__Group_3__0 )? )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:952:1: ( rule__Transition__Group_3__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_3()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:953:1: ( rule__Transition__Group_3__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:953:2: rule__Transition__Group_3__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl1856);
                    rule__Transition__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__3__Impl"


    // $ANTLR start "rule__Transition__Group__4"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:963:1: rule__Transition__Group__4 : rule__Transition__Group__4__Impl rule__Transition__Group__5 ;
    public final void rule__Transition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:967:1: ( rule__Transition__Group__4__Impl rule__Transition__Group__5 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:968:2: rule__Transition__Group__4__Impl rule__Transition__Group__5
            {
            pushFollow(FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__41887);
            rule__Transition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__41890);
            rule__Transition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4"


    // $ANTLR start "rule__Transition__Group__4__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:975:1: rule__Transition__Group__4__Impl : ( ( rule__Transition__Group_4__0 )? ) ;
    public final void rule__Transition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:979:1: ( ( ( rule__Transition__Group_4__0 )? ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:980:1: ( ( rule__Transition__Group_4__0 )? )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:980:1: ( ( rule__Transition__Group_4__0 )? )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:981:1: ( rule__Transition__Group_4__0 )?
            {
             before(grammarAccess.getTransitionAccess().getGroup_4()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:982:1: ( rule__Transition__Group_4__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:982:2: rule__Transition__Group_4__0
                    {
                    pushFollow(FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl1917);
                    rule__Transition__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTransitionAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__4__Impl"


    // $ANTLR start "rule__Transition__Group__5"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:992:1: rule__Transition__Group__5 : rule__Transition__Group__5__Impl ;
    public final void rule__Transition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:996:1: ( rule__Transition__Group__5__Impl )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:997:2: rule__Transition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__51948);
            rule__Transition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5"


    // $ANTLR start "rule__Transition__Group__5__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1003:1: rule__Transition__Group__5__Impl : ( '}' ) ;
    public final void rule__Transition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1007:1: ( ( '}' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1008:1: ( '}' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1008:1: ( '}' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1009:1: '}'
            {
             before(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Transition__Group__5__Impl1976); 
             after(grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group__5__Impl"


    // $ANTLR start "rule__Transition__Group_3__0"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1034:1: rule__Transition__Group_3__0 : rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 ;
    public final void rule__Transition__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1038:1: ( rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1039:2: rule__Transition__Group_3__0__Impl rule__Transition__Group_3__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__02019);
            rule__Transition__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__02022);
            rule__Transition__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0"


    // $ANTLR start "rule__Transition__Group_3__0__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1046:1: rule__Transition__Group_3__0__Impl : ( 'minTime' ) ;
    public final void rule__Transition__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1050:1: ( ( 'minTime' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1051:1: ( 'minTime' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1051:1: ( 'minTime' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1052:1: 'minTime'
            {
             before(grammarAccess.getTransitionAccess().getMinTimeKeyword_3_0()); 
            match(input,22,FOLLOW_22_in_rule__Transition__Group_3__0__Impl2050); 
             after(grammarAccess.getTransitionAccess().getMinTimeKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__0__Impl"


    // $ANTLR start "rule__Transition__Group_3__1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1065:1: rule__Transition__Group_3__1 : rule__Transition__Group_3__1__Impl ;
    public final void rule__Transition__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1069:1: ( rule__Transition__Group_3__1__Impl )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1070:2: rule__Transition__Group_3__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__12081);
            rule__Transition__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1"


    // $ANTLR start "rule__Transition__Group_3__1__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1076:1: rule__Transition__Group_3__1__Impl : ( ( rule__Transition__MinTimeAssignment_3_1 ) ) ;
    public final void rule__Transition__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1080:1: ( ( ( rule__Transition__MinTimeAssignment_3_1 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1081:1: ( ( rule__Transition__MinTimeAssignment_3_1 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1081:1: ( ( rule__Transition__MinTimeAssignment_3_1 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1082:1: ( rule__Transition__MinTimeAssignment_3_1 )
            {
             before(grammarAccess.getTransitionAccess().getMinTimeAssignment_3_1()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1083:1: ( rule__Transition__MinTimeAssignment_3_1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1083:2: rule__Transition__MinTimeAssignment_3_1
            {
            pushFollow(FOLLOW_rule__Transition__MinTimeAssignment_3_1_in_rule__Transition__Group_3__1__Impl2108);
            rule__Transition__MinTimeAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getMinTimeAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_3__1__Impl"


    // $ANTLR start "rule__Transition__Group_4__0"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1097:1: rule__Transition__Group_4__0 : rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 ;
    public final void rule__Transition__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1101:1: ( rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1102:2: rule__Transition__Group_4__0__Impl rule__Transition__Group_4__1
            {
            pushFollow(FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__02142);
            rule__Transition__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__02145);
            rule__Transition__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0"


    // $ANTLR start "rule__Transition__Group_4__0__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1109:1: rule__Transition__Group_4__0__Impl : ( 'maxTime' ) ;
    public final void rule__Transition__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1113:1: ( ( 'maxTime' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1114:1: ( 'maxTime' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1114:1: ( 'maxTime' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1115:1: 'maxTime'
            {
             before(grammarAccess.getTransitionAccess().getMaxTimeKeyword_4_0()); 
            match(input,23,FOLLOW_23_in_rule__Transition__Group_4__0__Impl2173); 
             after(grammarAccess.getTransitionAccess().getMaxTimeKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__0__Impl"


    // $ANTLR start "rule__Transition__Group_4__1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1128:1: rule__Transition__Group_4__1 : rule__Transition__Group_4__1__Impl ;
    public final void rule__Transition__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1132:1: ( rule__Transition__Group_4__1__Impl )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1133:2: rule__Transition__Group_4__1__Impl
            {
            pushFollow(FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__12204);
            rule__Transition__Group_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1"


    // $ANTLR start "rule__Transition__Group_4__1__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1139:1: rule__Transition__Group_4__1__Impl : ( ( rule__Transition__MaxTimeAssignment_4_1 ) ) ;
    public final void rule__Transition__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1143:1: ( ( ( rule__Transition__MaxTimeAssignment_4_1 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1144:1: ( ( rule__Transition__MaxTimeAssignment_4_1 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1144:1: ( ( rule__Transition__MaxTimeAssignment_4_1 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1145:1: ( rule__Transition__MaxTimeAssignment_4_1 )
            {
             before(grammarAccess.getTransitionAccess().getMaxTimeAssignment_4_1()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1146:1: ( rule__Transition__MaxTimeAssignment_4_1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1146:2: rule__Transition__MaxTimeAssignment_4_1
            {
            pushFollow(FOLLOW_rule__Transition__MaxTimeAssignment_4_1_in_rule__Transition__Group_4__1__Impl2231);
            rule__Transition__MaxTimeAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getTransitionAccess().getMaxTimeAssignment_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__Group_4__1__Impl"


    // $ANTLR start "rule__Place__Group__0"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1160:1: rule__Place__Group__0 : rule__Place__Group__0__Impl rule__Place__Group__1 ;
    public final void rule__Place__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1164:1: ( rule__Place__Group__0__Impl rule__Place__Group__1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1165:2: rule__Place__Group__0__Impl rule__Place__Group__1
            {
            pushFollow(FOLLOW_rule__Place__Group__0__Impl_in_rule__Place__Group__02265);
            rule__Place__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__1_in_rule__Place__Group__02268);
            rule__Place__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0"


    // $ANTLR start "rule__Place__Group__0__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1172:1: rule__Place__Group__0__Impl : ( 'place' ) ;
    public final void rule__Place__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1176:1: ( ( 'place' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1177:1: ( 'place' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1177:1: ( 'place' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1178:1: 'place'
            {
             before(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Place__Group__0__Impl2296); 
             after(grammarAccess.getPlaceAccess().getPlaceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__0__Impl"


    // $ANTLR start "rule__Place__Group__1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1191:1: rule__Place__Group__1 : rule__Place__Group__1__Impl rule__Place__Group__2 ;
    public final void rule__Place__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1195:1: ( rule__Place__Group__1__Impl rule__Place__Group__2 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1196:2: rule__Place__Group__1__Impl rule__Place__Group__2
            {
            pushFollow(FOLLOW_rule__Place__Group__1__Impl_in_rule__Place__Group__12327);
            rule__Place__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__2_in_rule__Place__Group__12330);
            rule__Place__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1"


    // $ANTLR start "rule__Place__Group__1__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1203:1: rule__Place__Group__1__Impl : ( ( rule__Place__NameAssignment_1 ) ) ;
    public final void rule__Place__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1207:1: ( ( ( rule__Place__NameAssignment_1 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1208:1: ( ( rule__Place__NameAssignment_1 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1208:1: ( ( rule__Place__NameAssignment_1 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1209:1: ( rule__Place__NameAssignment_1 )
            {
             before(grammarAccess.getPlaceAccess().getNameAssignment_1()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1210:1: ( rule__Place__NameAssignment_1 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1210:2: rule__Place__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Place__NameAssignment_1_in_rule__Place__Group__1__Impl2357);
            rule__Place__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__1__Impl"


    // $ANTLR start "rule__Place__Group__2"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1220:1: rule__Place__Group__2 : rule__Place__Group__2__Impl rule__Place__Group__3 ;
    public final void rule__Place__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1224:1: ( rule__Place__Group__2__Impl rule__Place__Group__3 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1225:2: rule__Place__Group__2__Impl rule__Place__Group__3
            {
            pushFollow(FOLLOW_rule__Place__Group__2__Impl_in_rule__Place__Group__22387);
            rule__Place__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__3_in_rule__Place__Group__22390);
            rule__Place__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2"


    // $ANTLR start "rule__Place__Group__2__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1232:1: rule__Place__Group__2__Impl : ( '{' ) ;
    public final void rule__Place__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1236:1: ( ( '{' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1237:1: ( '{' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1237:1: ( '{' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1238:1: '{'
            {
             before(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_14_in_rule__Place__Group__2__Impl2418); 
             after(grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__2__Impl"


    // $ANTLR start "rule__Place__Group__3"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1251:1: rule__Place__Group__3 : rule__Place__Group__3__Impl rule__Place__Group__4 ;
    public final void rule__Place__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1255:1: ( rule__Place__Group__3__Impl rule__Place__Group__4 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1256:2: rule__Place__Group__3__Impl rule__Place__Group__4
            {
            pushFollow(FOLLOW_rule__Place__Group__3__Impl_in_rule__Place__Group__32449);
            rule__Place__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__4_in_rule__Place__Group__32452);
            rule__Place__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3"


    // $ANTLR start "rule__Place__Group__3__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1263:1: rule__Place__Group__3__Impl : ( 'marking' ) ;
    public final void rule__Place__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1267:1: ( ( 'marking' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1268:1: ( 'marking' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1268:1: ( 'marking' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1269:1: 'marking'
            {
             before(grammarAccess.getPlaceAccess().getMarkingKeyword_3()); 
            match(input,25,FOLLOW_25_in_rule__Place__Group__3__Impl2480); 
             after(grammarAccess.getPlaceAccess().getMarkingKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__3__Impl"


    // $ANTLR start "rule__Place__Group__4"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1282:1: rule__Place__Group__4 : rule__Place__Group__4__Impl rule__Place__Group__5 ;
    public final void rule__Place__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1286:1: ( rule__Place__Group__4__Impl rule__Place__Group__5 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1287:2: rule__Place__Group__4__Impl rule__Place__Group__5
            {
            pushFollow(FOLLOW_rule__Place__Group__4__Impl_in_rule__Place__Group__42511);
            rule__Place__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Place__Group__5_in_rule__Place__Group__42514);
            rule__Place__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4"


    // $ANTLR start "rule__Place__Group__4__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1294:1: rule__Place__Group__4__Impl : ( ( rule__Place__MarkingAssignment_4 ) ) ;
    public final void rule__Place__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1298:1: ( ( ( rule__Place__MarkingAssignment_4 ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1299:1: ( ( rule__Place__MarkingAssignment_4 ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1299:1: ( ( rule__Place__MarkingAssignment_4 ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1300:1: ( rule__Place__MarkingAssignment_4 )
            {
             before(grammarAccess.getPlaceAccess().getMarkingAssignment_4()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1301:1: ( rule__Place__MarkingAssignment_4 )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1301:2: rule__Place__MarkingAssignment_4
            {
            pushFollow(FOLLOW_rule__Place__MarkingAssignment_4_in_rule__Place__Group__4__Impl2541);
            rule__Place__MarkingAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPlaceAccess().getMarkingAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__4__Impl"


    // $ANTLR start "rule__Place__Group__5"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1311:1: rule__Place__Group__5 : rule__Place__Group__5__Impl ;
    public final void rule__Place__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1315:1: ( rule__Place__Group__5__Impl )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1316:2: rule__Place__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__Place__Group__5__Impl_in_rule__Place__Group__52571);
            rule__Place__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__5"


    // $ANTLR start "rule__Place__Group__5__Impl"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1322:1: rule__Place__Group__5__Impl : ( '}' ) ;
    public final void rule__Place__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1326:1: ( ( '}' ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1327:1: ( '}' )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1327:1: ( '}' )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1328:1: '}'
            {
             before(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_5()); 
            match(input,15,FOLLOW_15_in_rule__Place__Group__5__Impl2599); 
             after(grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__Group__5__Impl"


    // $ANTLR start "rule__PetriNet__NameAssignment_1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1354:1: rule__PetriNet__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PetriNet__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1358:1: ( ( RULE_ID ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1359:1: ( RULE_ID )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1359:1: ( RULE_ID )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1360:1: RULE_ID
            {
             before(grammarAccess.getPetriNetAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PetriNet__NameAssignment_12647); 
             after(grammarAccess.getPetriNetAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__NameAssignment_1"


    // $ANTLR start "rule__PetriNet__NoeudsAssignment_3"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1369:1: rule__PetriNet__NoeudsAssignment_3 : ( ruleNoeud ) ;
    public final void rule__PetriNet__NoeudsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1373:1: ( ( ruleNoeud ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1374:1: ( ruleNoeud )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1374:1: ( ruleNoeud )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1375:1: ruleNoeud
            {
             before(grammarAccess.getPetriNetAccess().getNoeudsNoeudParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleNoeud_in_rule__PetriNet__NoeudsAssignment_32678);
            ruleNoeud();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getNoeudsNoeudParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__NoeudsAssignment_3"


    // $ANTLR start "rule__PetriNet__ArcsAssignment_4"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1384:1: rule__PetriNet__ArcsAssignment_4 : ( ruleArc ) ;
    public final void rule__PetriNet__ArcsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1388:1: ( ( ruleArc ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1389:1: ( ruleArc )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1389:1: ( ruleArc )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1390:1: ruleArc
            {
             before(grammarAccess.getPetriNetAccess().getArcsArcParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleArc_in_rule__PetriNet__ArcsAssignment_42709);
            ruleArc();

            state._fsp--;

             after(grammarAccess.getPetriNetAccess().getArcsArcParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PetriNet__ArcsAssignment_4"


    // $ANTLR start "rule__Arc__NameAssignment_1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1399:1: rule__Arc__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Arc__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1403:1: ( ( RULE_ID ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1404:1: ( RULE_ID )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1404:1: ( RULE_ID )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1405:1: RULE_ID
            {
             before(grammarAccess.getArcAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Arc__NameAssignment_12740); 
             after(grammarAccess.getArcAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__NameAssignment_1"


    // $ANTLR start "rule__Arc__SourceAssignment_4"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1414:1: rule__Arc__SourceAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__Arc__SourceAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1418:1: ( ( ( RULE_ID ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1419:1: ( ( RULE_ID ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1419:1: ( ( RULE_ID ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1420:1: ( RULE_ID )
            {
             before(grammarAccess.getArcAccess().getSourceNoeudCrossReference_4_0()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1421:1: ( RULE_ID )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1422:1: RULE_ID
            {
             before(grammarAccess.getArcAccess().getSourceNoeudIDTerminalRuleCall_4_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Arc__SourceAssignment_42775); 
             after(grammarAccess.getArcAccess().getSourceNoeudIDTerminalRuleCall_4_0_1()); 

            }

             after(grammarAccess.getArcAccess().getSourceNoeudCrossReference_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__SourceAssignment_4"


    // $ANTLR start "rule__Arc__TargetAssignment_6"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1433:1: rule__Arc__TargetAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Arc__TargetAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1437:1: ( ( ( RULE_ID ) ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1438:1: ( ( RULE_ID ) )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1438:1: ( ( RULE_ID ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1439:1: ( RULE_ID )
            {
             before(grammarAccess.getArcAccess().getTargetNoeudCrossReference_6_0()); 
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1440:1: ( RULE_ID )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1441:1: RULE_ID
            {
             before(grammarAccess.getArcAccess().getTargetNoeudIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Arc__TargetAssignment_62814); 
             after(grammarAccess.getArcAccess().getTargetNoeudIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getArcAccess().getTargetNoeudCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__TargetAssignment_6"


    // $ANTLR start "rule__Arc__ArcTypeAssignment_8"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1452:1: rule__Arc__ArcTypeAssignment_8 : ( ruleArcKindType ) ;
    public final void rule__Arc__ArcTypeAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1456:1: ( ( ruleArcKindType ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1457:1: ( ruleArcKindType )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1457:1: ( ruleArcKindType )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1458:1: ruleArcKindType
            {
             before(grammarAccess.getArcAccess().getArcTypeArcKindTypeEnumRuleCall_8_0()); 
            pushFollow(FOLLOW_ruleArcKindType_in_rule__Arc__ArcTypeAssignment_82849);
            ruleArcKindType();

            state._fsp--;

             after(grammarAccess.getArcAccess().getArcTypeArcKindTypeEnumRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__ArcTypeAssignment_8"


    // $ANTLR start "rule__Arc__WeightAssignment_10"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1467:1: rule__Arc__WeightAssignment_10 : ( RULE_INT ) ;
    public final void rule__Arc__WeightAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1471:1: ( ( RULE_INT ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1472:1: ( RULE_INT )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1472:1: ( RULE_INT )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1473:1: RULE_INT
            {
             before(grammarAccess.getArcAccess().getWeightINTTerminalRuleCall_10_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Arc__WeightAssignment_102880); 
             after(grammarAccess.getArcAccess().getWeightINTTerminalRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Arc__WeightAssignment_10"


    // $ANTLR start "rule__Transition__NameAssignment_1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1482:1: rule__Transition__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Transition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1486:1: ( ( RULE_ID ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1487:1: ( RULE_ID )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1487:1: ( RULE_ID )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1488:1: RULE_ID
            {
             before(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_12911); 
             after(grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__NameAssignment_1"


    // $ANTLR start "rule__Transition__MinTimeAssignment_3_1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1497:1: rule__Transition__MinTimeAssignment_3_1 : ( RULE_INT ) ;
    public final void rule__Transition__MinTimeAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1501:1: ( ( RULE_INT ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1502:1: ( RULE_INT )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1502:1: ( RULE_INT )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1503:1: RULE_INT
            {
             before(grammarAccess.getTransitionAccess().getMinTimeINTTerminalRuleCall_3_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transition__MinTimeAssignment_3_12942); 
             after(grammarAccess.getTransitionAccess().getMinTimeINTTerminalRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__MinTimeAssignment_3_1"


    // $ANTLR start "rule__Transition__MaxTimeAssignment_4_1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1512:1: rule__Transition__MaxTimeAssignment_4_1 : ( RULE_INT ) ;
    public final void rule__Transition__MaxTimeAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1516:1: ( ( RULE_INT ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1517:1: ( RULE_INT )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1517:1: ( RULE_INT )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1518:1: RULE_INT
            {
             before(grammarAccess.getTransitionAccess().getMaxTimeINTTerminalRuleCall_4_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Transition__MaxTimeAssignment_4_12973); 
             after(grammarAccess.getTransitionAccess().getMaxTimeINTTerminalRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Transition__MaxTimeAssignment_4_1"


    // $ANTLR start "rule__Place__NameAssignment_1"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1527:1: rule__Place__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Place__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1531:1: ( ( RULE_ID ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1532:1: ( RULE_ID )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1532:1: ( RULE_ID )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1533:1: RULE_ID
            {
             before(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Place__NameAssignment_13004); 
             after(grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__NameAssignment_1"


    // $ANTLR start "rule__Place__MarkingAssignment_4"
    // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1542:1: rule__Place__MarkingAssignment_4 : ( RULE_INT ) ;
    public final void rule__Place__MarkingAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1546:1: ( ( RULE_INT ) )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1547:1: ( RULE_INT )
            {
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1547:1: ( RULE_INT )
            // ../fr.insa.petrinet.ui/src-gen/fr/insa/petrinet/ui/contentassist/antlr/internal/InternalPetrinet.g:1548:1: RULE_INT
            {
             before(grammarAccess.getPlaceAccess().getMarkingINTTerminalRuleCall_4_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Place__MarkingAssignment_43035); 
             after(grammarAccess.getPlaceAccess().getMarkingINTTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Place__MarkingAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePetriNet_in_entryRulePetriNet61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePetriNet68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__0_in_rulePetriNet94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArc_in_entryRuleArc121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArc128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__0_in_ruleArc154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoeud_in_entryRuleNoeud181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoeud188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Noeud__Alternatives_in_ruleNoeud214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0_in_ruleTransition274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_entryRulePlace301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlace308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__0_in_rulePlace334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ArcKindType__Alternatives_in_ruleArcKindType371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_rule__Noeud__Alternatives406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_rule__Noeud__Alternatives423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ArcKindType__Alternatives456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ArcKindType__Alternatives477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__0__Impl_in_rule__PetriNet__Group__0510 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__1_in_rule__PetriNet__Group__0513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PetriNet__Group__0__Impl541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__1__Impl_in_rule__PetriNet__Group__1572 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__2_in_rule__PetriNet__Group__1575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__NameAssignment_1_in_rule__PetriNet__Group__1__Impl602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__2__Impl_in_rule__PetriNet__Group__2632 = new BitSet(new long[]{0x0000000001218000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__3_in_rule__PetriNet__Group__2635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PetriNet__Group__2__Impl663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__3__Impl_in_rule__PetriNet__Group__3694 = new BitSet(new long[]{0x0000000001218000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__4_in_rule__PetriNet__Group__3697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__NoeudsAssignment_3_in_rule__PetriNet__Group__3__Impl724 = new BitSet(new long[]{0x0000000001200002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__4__Impl_in_rule__PetriNet__Group__4755 = new BitSet(new long[]{0x0000000001218000L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__5_in_rule__PetriNet__Group__4758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PetriNet__ArcsAssignment_4_in_rule__PetriNet__Group__4__Impl785 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_rule__PetriNet__Group__5__Impl_in_rule__PetriNet__Group__5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__PetriNet__Group__5__Impl844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__0__Impl_in_rule__Arc__Group__0887 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Arc__Group__1_in_rule__Arc__Group__0890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Arc__Group__0__Impl918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__1__Impl_in_rule__Arc__Group__1949 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Arc__Group__2_in_rule__Arc__Group__1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__NameAssignment_1_in_rule__Arc__Group__1__Impl979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__2__Impl_in_rule__Arc__Group__21009 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_rule__Arc__Group__3_in_rule__Arc__Group__21012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Arc__Group__2__Impl1040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__3__Impl_in_rule__Arc__Group__31071 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Arc__Group__4_in_rule__Arc__Group__31074 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Arc__Group__3__Impl1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__4__Impl_in_rule__Arc__Group__41133 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Arc__Group__5_in_rule__Arc__Group__41136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__SourceAssignment_4_in_rule__Arc__Group__4__Impl1163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__5__Impl_in_rule__Arc__Group__51193 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Arc__Group__6_in_rule__Arc__Group__51196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Arc__Group__5__Impl1224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__6__Impl_in_rule__Arc__Group__61255 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__Arc__Group__7_in_rule__Arc__Group__61258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__TargetAssignment_6_in_rule__Arc__Group__6__Impl1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__7__Impl_in_rule__Arc__Group__71315 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__Arc__Group__8_in_rule__Arc__Group__71318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Arc__Group__7__Impl1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__8__Impl_in_rule__Arc__Group__81377 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__Arc__Group__9_in_rule__Arc__Group__81380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__ArcTypeAssignment_8_in_rule__Arc__Group__8__Impl1407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__9__Impl_in_rule__Arc__Group__91437 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Arc__Group__10_in_rule__Arc__Group__91440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Arc__Group__9__Impl1468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__10__Impl_in_rule__Arc__Group__101499 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Arc__Group__11_in_rule__Arc__Group__101502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__WeightAssignment_10_in_rule__Arc__Group__10__Impl1529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Arc__Group__11__Impl_in_rule__Arc__Group__111559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Arc__Group__11__Impl1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__0__Impl_in_rule__Transition__Group__01642 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Transition__Group__1_in_rule__Transition__Group__01645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Transition__Group__0__Impl1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__1__Impl_in_rule__Transition__Group__11704 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Transition__Group__2_in_rule__Transition__Group__11707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__NameAssignment_1_in_rule__Transition__Group__1__Impl1734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__2__Impl_in_rule__Transition__Group__21764 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_rule__Transition__Group__3_in_rule__Transition__Group__21767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Transition__Group__2__Impl1795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__3__Impl_in_rule__Transition__Group__31826 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_rule__Transition__Group__4_in_rule__Transition__Group__31829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__0_in_rule__Transition__Group__3__Impl1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__4__Impl_in_rule__Transition__Group__41887 = new BitSet(new long[]{0x0000000000C08000L});
    public static final BitSet FOLLOW_rule__Transition__Group__5_in_rule__Transition__Group__41890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__0_in_rule__Transition__Group__4__Impl1917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group__5__Impl_in_rule__Transition__Group__51948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Transition__Group__5__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__0__Impl_in_rule__Transition__Group_3__02019 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__1_in_rule__Transition__Group_3__02022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Transition__Group_3__0__Impl2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_3__1__Impl_in_rule__Transition__Group_3__12081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__MinTimeAssignment_3_1_in_rule__Transition__Group_3__1__Impl2108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__0__Impl_in_rule__Transition__Group_4__02142 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__1_in_rule__Transition__Group_4__02145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Transition__Group_4__0__Impl2173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__Group_4__1__Impl_in_rule__Transition__Group_4__12204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Transition__MaxTimeAssignment_4_1_in_rule__Transition__Group_4__1__Impl2231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__0__Impl_in_rule__Place__Group__02265 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Place__Group__1_in_rule__Place__Group__02268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Place__Group__0__Impl2296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__1__Impl_in_rule__Place__Group__12327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Place__Group__2_in_rule__Place__Group__12330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__NameAssignment_1_in_rule__Place__Group__1__Impl2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__2__Impl_in_rule__Place__Group__22387 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_rule__Place__Group__3_in_rule__Place__Group__22390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Place__Group__2__Impl2418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__3__Impl_in_rule__Place__Group__32449 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Place__Group__4_in_rule__Place__Group__32452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Place__Group__3__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__4__Impl_in_rule__Place__Group__42511 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_rule__Place__Group__5_in_rule__Place__Group__42514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__MarkingAssignment_4_in_rule__Place__Group__4__Impl2541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Place__Group__5__Impl_in_rule__Place__Group__52571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Place__Group__5__Impl2599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PetriNet__NameAssignment_12647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoeud_in_rule__PetriNet__NoeudsAssignment_32678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArc_in_rule__PetriNet__ArcsAssignment_42709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Arc__NameAssignment_12740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Arc__SourceAssignment_42775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Arc__TargetAssignment_62814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArcKindType_in_rule__Arc__ArcTypeAssignment_82849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Arc__WeightAssignment_102880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Transition__NameAssignment_12911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transition__MinTimeAssignment_3_12942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Transition__MaxTimeAssignment_4_12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Place__NameAssignment_13004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Place__MarkingAssignment_43035 = new BitSet(new long[]{0x0000000000000002L});

}