package fr.insa.petrinet.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.insa.petrinet.services.PetrinetGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalPetrinetParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'petrinet'", "'{'", "'}'", "'arc'", "'source'", "'target'", "'type'", "'weight'", "'transition'", "'minTime'", "'maxTime'", "'place'", "'marking'", "'normal'", "'read_arc'"
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
    public String getGrammarFileName() { return "../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g"; }



     	private PetrinetGrammarAccess grammarAccess;
     	
        public InternalPetrinetParser(TokenStream input, PetrinetGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PetriNet";	
       	}
       	
       	@Override
       	protected PetrinetGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePetriNet"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:68:1: entryRulePetriNet returns [EObject current=null] : iv_rulePetriNet= rulePetriNet EOF ;
    public final EObject entryRulePetriNet() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePetriNet = null;


        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:69:2: (iv_rulePetriNet= rulePetriNet EOF )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:70:2: iv_rulePetriNet= rulePetriNet EOF
            {
             newCompositeNode(grammarAccess.getPetriNetRule()); 
            pushFollow(FOLLOW_rulePetriNet_in_entryRulePetriNet75);
            iv_rulePetriNet=rulePetriNet();

            state._fsp--;

             current =iv_rulePetriNet; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePetriNet85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePetriNet"


    // $ANTLR start "rulePetriNet"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:77:1: rulePetriNet returns [EObject current=null] : (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_noeuds_3_0= ruleNoeud ) )* ( (lv_arcs_4_0= ruleArc ) )* otherlv_5= '}' ) ;
    public final EObject rulePetriNet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_noeuds_3_0 = null;

        EObject lv_arcs_4_0 = null;


         enterRule(); 
            
        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:80:28: ( (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_noeuds_3_0= ruleNoeud ) )* ( (lv_arcs_4_0= ruleArc ) )* otherlv_5= '}' ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:81:1: (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_noeuds_3_0= ruleNoeud ) )* ( (lv_arcs_4_0= ruleArc ) )* otherlv_5= '}' )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:81:1: (otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_noeuds_3_0= ruleNoeud ) )* ( (lv_arcs_4_0= ruleArc ) )* otherlv_5= '}' )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:81:3: otherlv_0= 'petrinet' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_noeuds_3_0= ruleNoeud ) )* ( (lv_arcs_4_0= ruleArc ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_rulePetriNet122); 

                	newLeafNode(otherlv_0, grammarAccess.getPetriNetAccess().getPetrinetKeyword_0());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:85:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:86:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:86:1: (lv_name_1_0= RULE_ID )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:87:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePetriNet139); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPetriNetAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPetriNetRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePetriNet156); 

                	newLeafNode(otherlv_2, grammarAccess.getPetriNetAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:107:1: ( (lv_noeuds_3_0= ruleNoeud ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==19||LA1_0==22) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:108:1: (lv_noeuds_3_0= ruleNoeud )
            	    {
            	    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:108:1: (lv_noeuds_3_0= ruleNoeud )
            	    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:109:3: lv_noeuds_3_0= ruleNoeud
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPetriNetAccess().getNoeudsNoeudParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleNoeud_in_rulePetriNet177);
            	    lv_noeuds_3_0=ruleNoeud();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPetriNetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"noeuds",
            	            		lv_noeuds_3_0, 
            	            		"Noeud");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:125:3: ( (lv_arcs_4_0= ruleArc ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:126:1: (lv_arcs_4_0= ruleArc )
            	    {
            	    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:126:1: (lv_arcs_4_0= ruleArc )
            	    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:127:3: lv_arcs_4_0= ruleArc
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getPetriNetAccess().getArcsArcParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleArc_in_rulePetriNet199);
            	    lv_arcs_4_0=ruleArc();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getPetriNetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"arcs",
            	            		lv_arcs_4_0, 
            	            		"Arc");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_rulePetriNet212); 

                	newLeafNode(otherlv_5, grammarAccess.getPetriNetAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePetriNet"


    // $ANTLR start "entryRuleArc"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:155:1: entryRuleArc returns [EObject current=null] : iv_ruleArc= ruleArc EOF ;
    public final EObject entryRuleArc() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArc = null;


        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:156:2: (iv_ruleArc= ruleArc EOF )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:157:2: iv_ruleArc= ruleArc EOF
            {
             newCompositeNode(grammarAccess.getArcRule()); 
            pushFollow(FOLLOW_ruleArc_in_entryRuleArc248);
            iv_ruleArc=ruleArc();

            state._fsp--;

             current =iv_ruleArc; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleArc258); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArc"


    // $ANTLR start "ruleArc"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:164:1: ruleArc returns [EObject current=null] : (otherlv_0= 'arc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_arcType_8_0= ruleArcKindType ) ) otherlv_9= 'weight' ( (lv_weight_10_0= RULE_INT ) ) otherlv_11= '}' ) ;
    public final EObject ruleArc() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_weight_10_0=null;
        Token otherlv_11=null;
        Enumerator lv_arcType_8_0 = null;


         enterRule(); 
            
        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:167:28: ( (otherlv_0= 'arc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_arcType_8_0= ruleArcKindType ) ) otherlv_9= 'weight' ( (lv_weight_10_0= RULE_INT ) ) otherlv_11= '}' ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:168:1: (otherlv_0= 'arc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_arcType_8_0= ruleArcKindType ) ) otherlv_9= 'weight' ( (lv_weight_10_0= RULE_INT ) ) otherlv_11= '}' )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:168:1: (otherlv_0= 'arc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_arcType_8_0= ruleArcKindType ) ) otherlv_9= 'weight' ( (lv_weight_10_0= RULE_INT ) ) otherlv_11= '}' )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:168:3: otherlv_0= 'arc' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'source' ( (otherlv_4= RULE_ID ) ) otherlv_5= 'target' ( (otherlv_6= RULE_ID ) ) otherlv_7= 'type' ( (lv_arcType_8_0= ruleArcKindType ) ) otherlv_9= 'weight' ( (lv_weight_10_0= RULE_INT ) ) otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleArc295); 

                	newLeafNode(otherlv_0, grammarAccess.getArcAccess().getArcKeyword_0());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:172:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:173:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:173:1: (lv_name_1_0= RULE_ID )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:174:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArc312); 

            			newLeafNode(lv_name_1_0, grammarAccess.getArcAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArcRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleArc329); 

                	newLeafNode(otherlv_2, grammarAccess.getArcAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,15,FOLLOW_15_in_ruleArc341); 

                	newLeafNode(otherlv_3, grammarAccess.getArcAccess().getSourceKeyword_3());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:198:1: ( (otherlv_4= RULE_ID ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:199:1: (otherlv_4= RULE_ID )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:199:1: (otherlv_4= RULE_ID )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:200:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArcRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArc361); 

            		newLeafNode(otherlv_4, grammarAccess.getArcAccess().getSourceNoeudCrossReference_4_0()); 
            	

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleArc373); 

                	newLeafNode(otherlv_5, grammarAccess.getArcAccess().getTargetKeyword_5());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:215:1: ( (otherlv_6= RULE_ID ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:216:1: (otherlv_6= RULE_ID )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:216:1: (otherlv_6= RULE_ID )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:217:3: otherlv_6= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getArcRule());
            	        }
                    
            otherlv_6=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleArc393); 

            		newLeafNode(otherlv_6, grammarAccess.getArcAccess().getTargetNoeudCrossReference_6_0()); 
            	

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_17_in_ruleArc405); 

                	newLeafNode(otherlv_7, grammarAccess.getArcAccess().getTypeKeyword_7());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:232:1: ( (lv_arcType_8_0= ruleArcKindType ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:233:1: (lv_arcType_8_0= ruleArcKindType )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:233:1: (lv_arcType_8_0= ruleArcKindType )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:234:3: lv_arcType_8_0= ruleArcKindType
            {
             
            	        newCompositeNode(grammarAccess.getArcAccess().getArcTypeArcKindTypeEnumRuleCall_8_0()); 
            	    
            pushFollow(FOLLOW_ruleArcKindType_in_ruleArc426);
            lv_arcType_8_0=ruleArcKindType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getArcRule());
            	        }
                   		set(
                   			current, 
                   			"arcType",
                    		lv_arcType_8_0, 
                    		"ArcKindType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,18,FOLLOW_18_in_ruleArc438); 

                	newLeafNode(otherlv_9, grammarAccess.getArcAccess().getWeightKeyword_9());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:254:1: ( (lv_weight_10_0= RULE_INT ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:255:1: (lv_weight_10_0= RULE_INT )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:255:1: (lv_weight_10_0= RULE_INT )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:256:3: lv_weight_10_0= RULE_INT
            {
            lv_weight_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArc455); 

            			newLeafNode(lv_weight_10_0, grammarAccess.getArcAccess().getWeightINTTerminalRuleCall_10_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getArcRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"weight",
                    		lv_weight_10_0, 
                    		"INT");
            	    

            }


            }

            otherlv_11=(Token)match(input,13,FOLLOW_13_in_ruleArc472); 

                	newLeafNode(otherlv_11, grammarAccess.getArcAccess().getRightCurlyBracketKeyword_11());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArc"


    // $ANTLR start "entryRuleNoeud"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:284:1: entryRuleNoeud returns [EObject current=null] : iv_ruleNoeud= ruleNoeud EOF ;
    public final EObject entryRuleNoeud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNoeud = null;


        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:285:2: (iv_ruleNoeud= ruleNoeud EOF )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:286:2: iv_ruleNoeud= ruleNoeud EOF
            {
             newCompositeNode(grammarAccess.getNoeudRule()); 
            pushFollow(FOLLOW_ruleNoeud_in_entryRuleNoeud508);
            iv_ruleNoeud=ruleNoeud();

            state._fsp--;

             current =iv_ruleNoeud; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleNoeud518); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNoeud"


    // $ANTLR start "ruleNoeud"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:293:1: ruleNoeud returns [EObject current=null] : (this_Transition_0= ruleTransition | this_Place_1= rulePlace ) ;
    public final EObject ruleNoeud() throws RecognitionException {
        EObject current = null;

        EObject this_Transition_0 = null;

        EObject this_Place_1 = null;


         enterRule(); 
            
        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:296:28: ( (this_Transition_0= ruleTransition | this_Place_1= rulePlace ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:297:1: (this_Transition_0= ruleTransition | this_Place_1= rulePlace )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:297:1: (this_Transition_0= ruleTransition | this_Place_1= rulePlace )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            else if ( (LA3_0==22) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:298:5: this_Transition_0= ruleTransition
                    {
                     
                            newCompositeNode(grammarAccess.getNoeudAccess().getTransitionParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleTransition_in_ruleNoeud565);
                    this_Transition_0=ruleTransition();

                    state._fsp--;

                     
                            current = this_Transition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:308:5: this_Place_1= rulePlace
                    {
                     
                            newCompositeNode(grammarAccess.getNoeudAccess().getPlaceParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePlace_in_ruleNoeud592);
                    this_Place_1=rulePlace();

                    state._fsp--;

                     
                            current = this_Place_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNoeud"


    // $ANTLR start "entryRuleTransition"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:324:1: entryRuleTransition returns [EObject current=null] : iv_ruleTransition= ruleTransition EOF ;
    public final EObject entryRuleTransition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTransition = null;


        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:325:2: (iv_ruleTransition= ruleTransition EOF )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:326:2: iv_ruleTransition= ruleTransition EOF
            {
             newCompositeNode(grammarAccess.getTransitionRule()); 
            pushFollow(FOLLOW_ruleTransition_in_entryRuleTransition627);
            iv_ruleTransition=ruleTransition();

            state._fsp--;

             current =iv_ruleTransition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleTransition637); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTransition"


    // $ANTLR start "ruleTransition"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:333:1: ruleTransition returns [EObject current=null] : (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'minTime' ( (lv_minTime_4_0= RULE_INT ) ) )? (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= RULE_INT ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleTransition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_minTime_4_0=null;
        Token otherlv_5=null;
        Token lv_maxTime_6_0=null;
        Token otherlv_7=null;

         enterRule(); 
            
        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:336:28: ( (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'minTime' ( (lv_minTime_4_0= RULE_INT ) ) )? (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= RULE_INT ) ) )? otherlv_7= '}' ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:337:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'minTime' ( (lv_minTime_4_0= RULE_INT ) ) )? (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= RULE_INT ) ) )? otherlv_7= '}' )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:337:1: (otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'minTime' ( (lv_minTime_4_0= RULE_INT ) ) )? (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= RULE_INT ) ) )? otherlv_7= '}' )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:337:3: otherlv_0= 'transition' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' (otherlv_3= 'minTime' ( (lv_minTime_4_0= RULE_INT ) ) )? (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= RULE_INT ) ) )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleTransition674); 

                	newLeafNode(otherlv_0, grammarAccess.getTransitionAccess().getTransitionKeyword_0());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:341:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:342:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:342:1: (lv_name_1_0= RULE_ID )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:343:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleTransition691); 

            			newLeafNode(lv_name_1_0, grammarAccess.getTransitionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getTransitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleTransition708); 

                	newLeafNode(otherlv_2, grammarAccess.getTransitionAccess().getLeftCurlyBracketKeyword_2());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:363:1: (otherlv_3= 'minTime' ( (lv_minTime_4_0= RULE_INT ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==20) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:363:3: otherlv_3= 'minTime' ( (lv_minTime_4_0= RULE_INT ) )
                    {
                    otherlv_3=(Token)match(input,20,FOLLOW_20_in_ruleTransition721); 

                        	newLeafNode(otherlv_3, grammarAccess.getTransitionAccess().getMinTimeKeyword_3_0());
                        
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:367:1: ( (lv_minTime_4_0= RULE_INT ) )
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:368:1: (lv_minTime_4_0= RULE_INT )
                    {
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:368:1: (lv_minTime_4_0= RULE_INT )
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:369:3: lv_minTime_4_0= RULE_INT
                    {
                    lv_minTime_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransition738); 

                    			newLeafNode(lv_minTime_4_0, grammarAccess.getTransitionAccess().getMinTimeINTTerminalRuleCall_3_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"minTime",
                            		lv_minTime_4_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:385:4: (otherlv_5= 'maxTime' ( (lv_maxTime_6_0= RULE_INT ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:385:6: otherlv_5= 'maxTime' ( (lv_maxTime_6_0= RULE_INT ) )
                    {
                    otherlv_5=(Token)match(input,21,FOLLOW_21_in_ruleTransition758); 

                        	newLeafNode(otherlv_5, grammarAccess.getTransitionAccess().getMaxTimeKeyword_4_0());
                        
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:389:1: ( (lv_maxTime_6_0= RULE_INT ) )
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:390:1: (lv_maxTime_6_0= RULE_INT )
                    {
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:390:1: (lv_maxTime_6_0= RULE_INT )
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:391:3: lv_maxTime_6_0= RULE_INT
                    {
                    lv_maxTime_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleTransition775); 

                    			newLeafNode(lv_maxTime_6_0, grammarAccess.getTransitionAccess().getMaxTimeINTTerminalRuleCall_4_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getTransitionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"maxTime",
                            		lv_maxTime_6_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleTransition794); 

                	newLeafNode(otherlv_7, grammarAccess.getTransitionAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTransition"


    // $ANTLR start "entryRulePlace"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:419:1: entryRulePlace returns [EObject current=null] : iv_rulePlace= rulePlace EOF ;
    public final EObject entryRulePlace() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlace = null;


        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:420:2: (iv_rulePlace= rulePlace EOF )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:421:2: iv_rulePlace= rulePlace EOF
            {
             newCompositeNode(grammarAccess.getPlaceRule()); 
            pushFollow(FOLLOW_rulePlace_in_entryRulePlace830);
            iv_rulePlace=rulePlace();

            state._fsp--;

             current =iv_rulePlace; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePlace840); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlace"


    // $ANTLR start "rulePlace"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:428:1: rulePlace returns [EObject current=null] : (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'marking' ( (lv_marking_4_0= RULE_INT ) ) otherlv_5= '}' ) ;
    public final EObject rulePlace() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_marking_4_0=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:431:28: ( (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'marking' ( (lv_marking_4_0= RULE_INT ) ) otherlv_5= '}' ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:432:1: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'marking' ( (lv_marking_4_0= RULE_INT ) ) otherlv_5= '}' )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:432:1: (otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'marking' ( (lv_marking_4_0= RULE_INT ) ) otherlv_5= '}' )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:432:3: otherlv_0= 'place' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'marking' ( (lv_marking_4_0= RULE_INT ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_rulePlace877); 

                	newLeafNode(otherlv_0, grammarAccess.getPlaceAccess().getPlaceKeyword_0());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:436:1: ( (lv_name_1_0= RULE_ID ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:437:1: (lv_name_1_0= RULE_ID )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:437:1: (lv_name_1_0= RULE_ID )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:438:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePlace894); 

            			newLeafNode(lv_name_1_0, grammarAccess.getPlaceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_rulePlace911); 

                	newLeafNode(otherlv_2, grammarAccess.getPlaceAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulePlace923); 

                	newLeafNode(otherlv_3, grammarAccess.getPlaceAccess().getMarkingKeyword_3());
                
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:462:1: ( (lv_marking_4_0= RULE_INT ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:463:1: (lv_marking_4_0= RULE_INT )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:463:1: (lv_marking_4_0= RULE_INT )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:464:3: lv_marking_4_0= RULE_INT
            {
            lv_marking_4_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_rulePlace940); 

            			newLeafNode(lv_marking_4_0, grammarAccess.getPlaceAccess().getMarkingINTTerminalRuleCall_4_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getPlaceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"marking",
                    		lv_marking_4_0, 
                    		"INT");
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FOLLOW_13_in_rulePlace957); 

                	newLeafNode(otherlv_5, grammarAccess.getPlaceAccess().getRightCurlyBracketKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlace"


    // $ANTLR start "ruleArcKindType"
    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:492:1: ruleArcKindType returns [Enumerator current=null] : ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'read_arc' ) ) ;
    public final Enumerator ruleArcKindType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:494:28: ( ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'read_arc' ) ) )
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:495:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'read_arc' ) )
            {
            // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:495:1: ( (enumLiteral_0= 'normal' ) | (enumLiteral_1= 'read_arc' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==24) ) {
                alt6=1;
            }
            else if ( (LA6_0==25) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:495:2: (enumLiteral_0= 'normal' )
                    {
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:495:2: (enumLiteral_0= 'normal' )
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:495:4: enumLiteral_0= 'normal'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleArcKindType1007); 

                            current = grammarAccess.getArcKindTypeAccess().getNormalEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getArcKindTypeAccess().getNormalEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:501:6: (enumLiteral_1= 'read_arc' )
                    {
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:501:6: (enumLiteral_1= 'read_arc' )
                    // ../fr.insa.petrinet/src-gen/fr/insa/petrinet/parser/antlr/internal/InternalPetrinet.g:501:8: enumLiteral_1= 'read_arc'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleArcKindType1024); 

                            current = grammarAccess.getArcKindTypeAccess().getRead_arcEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getArcKindTypeAccess().getRead_arcEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArcKindType"

    // Delegated rules


 

    public static final BitSet FOLLOW_rulePetriNet_in_entryRulePetriNet75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePetriNet85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rulePetriNet122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePetriNet139 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePetriNet156 = new BitSet(new long[]{0x0000000000486000L});
    public static final BitSet FOLLOW_ruleNoeud_in_rulePetriNet177 = new BitSet(new long[]{0x0000000000486000L});
    public static final BitSet FOLLOW_ruleArc_in_rulePetriNet199 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_13_in_rulePetriNet212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArc_in_entryRuleArc248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArc258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleArc295 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArc312 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleArc329 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleArc341 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArc361 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleArc373 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleArc393 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleArc405 = new BitSet(new long[]{0x0000000003000000L});
    public static final BitSet FOLLOW_ruleArcKindType_in_ruleArc426 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleArc438 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArc455 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleArc472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNoeud_in_entryRuleNoeud508 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNoeud518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_ruleNoeud565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_ruleNoeud592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTransition_in_entryRuleTransition627 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTransition637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleTransition674 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleTransition691 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleTransition708 = new BitSet(new long[]{0x0000000000302000L});
    public static final BitSet FOLLOW_20_in_ruleTransition721 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransition738 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_21_in_ruleTransition758 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleTransition775 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleTransition794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePlace_in_entryRulePlace830 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePlace840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePlace877 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePlace894 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_rulePlace911 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePlace923 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_INT_in_rulePlace940 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePlace957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleArcKindType1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleArcKindType1024 = new BitSet(new long[]{0x0000000000000002L});

}