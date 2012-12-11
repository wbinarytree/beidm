package be.parser.antlr.internal; 

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
import be.services.SimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'process'", "'{'", "'}'", "'wd'", "'min'", "'max'", "'ws'", "'from'", "'to'", "'--'", "'rd'", "'number'", "'ri'", "'type'", "'activity'", "'instances'", "'-'", "'s2s'", "'s2f'", "'f2s'", "'f2f'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
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
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalSimplePDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalSimplePDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalSimplePDLParser.tokenNames; }
    public String getGrammarFileName() { return "../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g"; }



     	private SimplePDLGrammarAccess grammarAccess;
     	
        public InternalSimplePDLParser(TokenStream input, SimplePDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Process";	
       	}
       	
       	@Override
       	protected SimplePDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleProcess"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:68:1: entryRuleProcess returns [EObject current=null] : iv_ruleProcess= ruleProcess EOF ;
    public final EObject entryRuleProcess() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcess = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:69:2: (iv_ruleProcess= ruleProcess EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:70:2: iv_ruleProcess= ruleProcess EOF
            {
             newCompositeNode(grammarAccess.getProcessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_entryRuleProcess75);
            iv_ruleProcess=ruleProcess();

            state._fsp--;

             current =iv_ruleProcess; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcess85); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:77:1: ruleProcess returns [EObject current=null] : ( () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_processElements_4_0= ruleProcessElement ) ) ( (lv_processElements_5_0= ruleProcessElement ) )* )? otherlv_6= '}' ) ;
    public final EObject ruleProcess() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_processElements_4_0 = null;

        EObject lv_processElements_5_0 = null;


         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:80:28: ( ( () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_processElements_4_0= ruleProcessElement ) ) ( (lv_processElements_5_0= ruleProcessElement ) )* )? otherlv_6= '}' ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:81:1: ( () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_processElements_4_0= ruleProcessElement ) ) ( (lv_processElements_5_0= ruleProcessElement ) )* )? otherlv_6= '}' )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:81:1: ( () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_processElements_4_0= ruleProcessElement ) ) ( (lv_processElements_5_0= ruleProcessElement ) )* )? otherlv_6= '}' )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:81:2: () otherlv_1= 'process' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' ( ( (lv_processElements_4_0= ruleProcessElement ) ) ( (lv_processElements_5_0= ruleProcessElement ) )* )? otherlv_6= '}'
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:81:2: ()
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getProcessAccess().getProcessAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleProcess131); 

                	newLeafNode(otherlv_1, grammarAccess.getProcessAccess().getProcessKeyword_1());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:92:1: (lv_name_2_0= ruleEString )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleProcess152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProcessRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleProcess164); 

                	newLeafNode(otherlv_3, grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:113:1: ( ( (lv_processElements_4_0= ruleProcessElement ) ) ( (lv_processElements_5_0= ruleProcessElement ) )* )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14||LA2_0==17||(LA2_0>=20 && LA2_0<=21)||LA2_0==23) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:113:2: ( (lv_processElements_4_0= ruleProcessElement ) ) ( (lv_processElements_5_0= ruleProcessElement ) )*
                    {
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:113:2: ( (lv_processElements_4_0= ruleProcessElement ) )
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:114:1: (lv_processElements_4_0= ruleProcessElement )
                    {
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:114:1: (lv_processElements_4_0= ruleProcessElement )
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:115:3: lv_processElements_4_0= ruleProcessElement
                    {
                     
                    	        newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_0_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleProcessElement_in_ruleProcess186);
                    lv_processElements_4_0=ruleProcessElement();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	        }
                           		add(
                           			current, 
                           			"processElements",
                            		lv_processElements_4_0, 
                            		"ProcessElement");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:131:2: ( (lv_processElements_5_0= ruleProcessElement ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==14||LA1_0==17||(LA1_0>=20 && LA1_0<=21)||LA1_0==23) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:132:1: (lv_processElements_5_0= ruleProcessElement )
                    	    {
                    	    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:132:1: (lv_processElements_5_0= ruleProcessElement )
                    	    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:133:3: lv_processElements_5_0= ruleProcessElement
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleProcessElement_in_ruleProcess207);
                    	    lv_processElements_5_0=ruleProcessElement();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getProcessRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"processElements",
                    	            		lv_processElements_5_0, 
                    	            		"ProcessElement");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleProcess222); 

                	newLeafNode(otherlv_6, grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5());
                

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:161:1: entryRuleProcessElement returns [EObject current=null] : iv_ruleProcessElement= ruleProcessElement EOF ;
    public final EObject entryRuleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProcessElement = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:162:2: (iv_ruleProcessElement= ruleProcessElement EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:163:2: iv_ruleProcessElement= ruleProcessElement EOF
            {
             newCompositeNode(grammarAccess.getProcessElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcessElement_in_entryRuleProcessElement258);
            iv_ruleProcessElement=ruleProcessElement();

            state._fsp--;

             current =iv_ruleProcessElement; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcessElement268); 

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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:170:1: ruleProcessElement returns [EObject current=null] : (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_RessourceDefinition_3= ruleRessourceDefinition | this_RessourceInstance_4= ruleRessourceInstance ) ;
    public final EObject ruleProcessElement() throws RecognitionException {
        EObject current = null;

        EObject this_WorkDefinition_0 = null;

        EObject this_WorkSequence_1 = null;

        EObject this_Guidance_2 = null;

        EObject this_RessourceDefinition_3 = null;

        EObject this_RessourceInstance_4 = null;


         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:173:28: ( (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_RessourceDefinition_3= ruleRessourceDefinition | this_RessourceInstance_4= ruleRessourceInstance ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:174:1: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_RessourceDefinition_3= ruleRessourceDefinition | this_RessourceInstance_4= ruleRessourceInstance )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:174:1: (this_WorkDefinition_0= ruleWorkDefinition | this_WorkSequence_1= ruleWorkSequence | this_Guidance_2= ruleGuidance | this_RessourceDefinition_3= ruleRessourceDefinition | this_RessourceInstance_4= ruleRessourceInstance )
            int alt3=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case 20:
                {
                alt3=3;
                }
                break;
            case 21:
                {
                alt3=4;
                }
                break;
            case 23:
                {
                alt3=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:175:5: this_WorkDefinition_0= ruleWorkDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWorkDefinition_in_ruleProcessElement315);
                    this_WorkDefinition_0=ruleWorkDefinition();

                    state._fsp--;

                     
                            current = this_WorkDefinition_0; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:185:5: this_WorkSequence_1= ruleWorkSequence
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleWorkSequence_in_ruleProcessElement342);
                    this_WorkSequence_1=ruleWorkSequence();

                    state._fsp--;

                     
                            current = this_WorkSequence_1; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:195:5: this_Guidance_2= ruleGuidance
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleGuidance_in_ruleProcessElement369);
                    this_Guidance_2=ruleGuidance();

                    state._fsp--;

                     
                            current = this_Guidance_2; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:205:5: this_RessourceDefinition_3= ruleRessourceDefinition
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceDefinitionParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRessourceDefinition_in_ruleProcessElement396);
                    this_RessourceDefinition_3=ruleRessourceDefinition();

                    state._fsp--;

                     
                            current = this_RessourceDefinition_3; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:215:5: this_RessourceInstance_4= ruleRessourceInstance
                    {
                     
                            newCompositeNode(grammarAccess.getProcessElementAccess().getRessourceInstanceParserRuleCall_4()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleRessourceInstance_in_ruleProcessElement423);
                    this_RessourceInstance_4=ruleRessourceInstance();

                    state._fsp--;

                     
                            current = this_RessourceInstance_4; 
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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleEString"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:231:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:232:2: (iv_ruleEString= ruleEString EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:233:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString459);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString470); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:240:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:243:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:244:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:244:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_ID) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:244:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString510); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:252:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString536); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                        

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWorkDefinition"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:267:1: entryRuleWorkDefinition returns [EObject current=null] : iv_ruleWorkDefinition= ruleWorkDefinition EOF ;
    public final EObject entryRuleWorkDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkDefinition = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:268:2: (iv_ruleWorkDefinition= ruleWorkDefinition EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:269:2: iv_ruleWorkDefinition= ruleWorkDefinition EOF
            {
             newCompositeNode(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition581);
            iv_ruleWorkDefinition=ruleWorkDefinition();

            state._fsp--;

             current =iv_ruleWorkDefinition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWorkDefinition591); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:276:1: ruleWorkDefinition returns [EObject current=null] : (otherlv_0= 'wd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'min' ( (lv_min_time_3_0= ruleEInt ) ) otherlv_4= 'max' ( (lv_max_time_5_0= ruleEInt ) ) ) ;
    public final EObject ruleWorkDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_min_time_3_0 = null;

        AntlrDatatypeRuleToken lv_max_time_5_0 = null;


         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:279:28: ( (otherlv_0= 'wd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'min' ( (lv_min_time_3_0= ruleEInt ) ) otherlv_4= 'max' ( (lv_max_time_5_0= ruleEInt ) ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:280:1: (otherlv_0= 'wd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'min' ( (lv_min_time_3_0= ruleEInt ) ) otherlv_4= 'max' ( (lv_max_time_5_0= ruleEInt ) ) )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:280:1: (otherlv_0= 'wd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'min' ( (lv_min_time_3_0= ruleEInt ) ) otherlv_4= 'max' ( (lv_max_time_5_0= ruleEInt ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:280:3: otherlv_0= 'wd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'min' ( (lv_min_time_3_0= ruleEInt ) ) otherlv_4= 'max' ( (lv_max_time_5_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleWorkDefinition628); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkDefinitionAccess().getWdKeyword_0());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:284:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:285:1: (lv_name_1_0= ruleEString )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:285:1: (lv_name_1_0= ruleEString )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:286:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWorkDefinition649);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleWorkDefinition661); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkDefinitionAccess().getMinKeyword_2());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:306:1: ( (lv_min_time_3_0= ruleEInt ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:307:1: (lv_min_time_3_0= ruleEInt )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:307:1: (lv_min_time_3_0= ruleEInt )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:308:3: lv_min_time_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getWorkDefinitionAccess().getMin_timeEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWorkDefinition682);
            lv_min_time_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"min_time",
                    		lv_min_time_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleWorkDefinition694); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkDefinitionAccess().getMaxKeyword_4());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:328:1: ( (lv_max_time_5_0= ruleEInt ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:329:1: (lv_max_time_5_0= ruleEInt )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:329:1: (lv_max_time_5_0= ruleEInt )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:330:3: lv_max_time_5_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getWorkDefinitionAccess().getMax_timeEIntParserRuleCall_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleWorkDefinition715);
            lv_max_time_5_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"max_time",
                    		lv_max_time_5_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:354:1: entryRuleWorkSequence returns [EObject current=null] : iv_ruleWorkSequence= ruleWorkSequence EOF ;
    public final EObject entryRuleWorkSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWorkSequence = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:355:2: (iv_ruleWorkSequence= ruleWorkSequence EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:356:2: iv_ruleWorkSequence= ruleWorkSequence EOF
            {
             newCompositeNode(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence751);
            iv_ruleWorkSequence=ruleWorkSequence();

            state._fsp--;

             current =iv_ruleWorkSequence; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWorkSequence761); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:363:1: ruleWorkSequence returns [EObject current=null] : (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) ) ;
    public final EObject ruleWorkSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_linkType_1_0 = null;


         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:366:28: ( (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:367:1: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:367:1: (otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:367:3: otherlv_0= 'ws' ( (lv_linkType_1_0= ruleWorkSequenceType ) ) otherlv_2= 'from' ( ( ruleEString ) ) otherlv_4= 'to' ( ( ruleEString ) )
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleWorkSequence798); 

                	newLeafNode(otherlv_0, grammarAccess.getWorkSequenceAccess().getWsKeyword_0());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:371:1: ( (lv_linkType_1_0= ruleWorkSequenceType ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:372:1: (lv_linkType_1_0= ruleWorkSequenceType )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:372:1: (lv_linkType_1_0= ruleWorkSequenceType )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:373:3: lv_linkType_1_0= ruleWorkSequenceType
            {
             
            	        newCompositeNode(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleWorkSequenceType_in_ruleWorkSequence819);
            lv_linkType_1_0=ruleWorkSequenceType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getWorkSequenceRule());
            	        }
                   		set(
                   			current, 
                   			"linkType",
                    		lv_linkType_1_0, 
                    		"WorkSequenceType");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleWorkSequence831); 

                	newLeafNode(otherlv_2, grammarAccess.getWorkSequenceAccess().getFromKeyword_2());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:393:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:394:1: ( ruleEString )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:394:1: ( ruleEString )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:395:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSequenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWorkSequence854);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleWorkSequence866); 

                	newLeafNode(otherlv_4, grammarAccess.getWorkSequenceAccess().getToKeyword_4());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:412:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:413:1: ( ruleEString )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:413:1: ( ruleEString )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:414:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getWorkSequenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleWorkSequence889);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:435:1: entryRuleGuidance returns [EObject current=null] : iv_ruleGuidance= ruleGuidance EOF ;
    public final EObject entryRuleGuidance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGuidance = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:436:2: (iv_ruleGuidance= ruleGuidance EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:437:2: iv_ruleGuidance= ruleGuidance EOF
            {
             newCompositeNode(grammarAccess.getGuidanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuidance_in_entryRuleGuidance925);
            iv_ruleGuidance=ruleGuidance();

            state._fsp--;

             current =iv_ruleGuidance; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuidance935); 

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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:444:1: ruleGuidance returns [EObject current=null] : ( () otherlv_1= '--' ( (lv_text_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleGuidance() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_text_2_0=null;

         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:447:28: ( ( () otherlv_1= '--' ( (lv_text_2_0= RULE_STRING ) ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:448:1: ( () otherlv_1= '--' ( (lv_text_2_0= RULE_STRING ) ) )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:448:1: ( () otherlv_1= '--' ( (lv_text_2_0= RULE_STRING ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:448:2: () otherlv_1= '--' ( (lv_text_2_0= RULE_STRING ) )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:448:2: ()
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:449:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGuidanceAccess().getGuidanceAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleGuidance981); 

                	newLeafNode(otherlv_1, grammarAccess.getGuidanceAccess().getHyphenMinusHyphenMinusKeyword_1());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:458:1: ( (lv_text_2_0= RULE_STRING ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:459:1: (lv_text_2_0= RULE_STRING )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:459:1: (lv_text_2_0= RULE_STRING )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:460:3: lv_text_2_0= RULE_STRING
            {
            lv_text_2_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleGuidance998); 

            			newLeafNode(lv_text_2_0, grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGuidanceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"text",
                    		lv_text_2_0, 
                    		"STRING");
            	    

            }


            }


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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessourceDefinition"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:484:1: entryRuleRessourceDefinition returns [EObject current=null] : iv_ruleRessourceDefinition= ruleRessourceDefinition EOF ;
    public final EObject entryRuleRessourceDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessourceDefinition = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:485:2: (iv_ruleRessourceDefinition= ruleRessourceDefinition EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:486:2: iv_ruleRessourceDefinition= ruleRessourceDefinition EOF
            {
             newCompositeNode(grammarAccess.getRessourceDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRessourceDefinition_in_entryRuleRessourceDefinition1039);
            iv_ruleRessourceDefinition=ruleRessourceDefinition();

            state._fsp--;

             current =iv_ruleRessourceDefinition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRessourceDefinition1049); 

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
    // $ANTLR end "entryRuleRessourceDefinition"


    // $ANTLR start "ruleRessourceDefinition"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:493:1: ruleRessourceDefinition returns [EObject current=null] : (otherlv_0= 'rd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'number' ( (lv_number_3_0= ruleEInt ) ) ) ;
    public final EObject ruleRessourceDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_number_3_0 = null;


         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:496:28: ( (otherlv_0= 'rd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'number' ( (lv_number_3_0= ruleEInt ) ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:497:1: (otherlv_0= 'rd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'number' ( (lv_number_3_0= ruleEInt ) ) )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:497:1: (otherlv_0= 'rd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'number' ( (lv_number_3_0= ruleEInt ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:497:3: otherlv_0= 'rd' ( (lv_name_1_0= ruleEString ) ) otherlv_2= 'number' ( (lv_number_3_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleRessourceDefinition1086); 

                	newLeafNode(otherlv_0, grammarAccess.getRessourceDefinitionAccess().getRdKeyword_0());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:501:1: ( (lv_name_1_0= ruleEString ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:502:1: (lv_name_1_0= ruleEString )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:502:1: (lv_name_1_0= ruleEString )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:503:3: lv_name_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRessourceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRessourceDefinition1107);
            lv_name_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRessourceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleRessourceDefinition1119); 

                	newLeafNode(otherlv_2, grammarAccess.getRessourceDefinitionAccess().getNumberKeyword_2());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:523:1: ( (lv_number_3_0= ruleEInt ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:524:1: (lv_number_3_0= ruleEInt )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:524:1: (lv_number_3_0= ruleEInt )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:525:3: lv_number_3_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRessourceDefinitionAccess().getNumberEIntParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRessourceDefinition1140);
            lv_number_3_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRessourceDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"number",
                    		lv_number_3_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleRessourceDefinition"


    // $ANTLR start "entryRuleRessourceInstance"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:549:1: entryRuleRessourceInstance returns [EObject current=null] : iv_ruleRessourceInstance= ruleRessourceInstance EOF ;
    public final EObject entryRuleRessourceInstance() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessourceInstance = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:550:2: (iv_ruleRessourceInstance= ruleRessourceInstance EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:551:2: iv_ruleRessourceInstance= ruleRessourceInstance EOF
            {
             newCompositeNode(grammarAccess.getRessourceInstanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRessourceInstance_in_entryRuleRessourceInstance1176);
            iv_ruleRessourceInstance=ruleRessourceInstance();

            state._fsp--;

             current =iv_ruleRessourceInstance; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRessourceInstance1186); 

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
    // $ANTLR end "entryRuleRessourceInstance"


    // $ANTLR start "ruleRessourceInstance"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:558:1: ruleRessourceInstance returns [EObject current=null] : (otherlv_0= 'ri' otherlv_1= 'type' ( ( ruleEString ) ) otherlv_3= 'activity' ( ( ruleEString ) ) otherlv_5= 'instances' ( (lv_instances_6_0= ruleEInt ) ) ) ;
    public final EObject ruleRessourceInstance() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_instances_6_0 = null;


         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:561:28: ( (otherlv_0= 'ri' otherlv_1= 'type' ( ( ruleEString ) ) otherlv_3= 'activity' ( ( ruleEString ) ) otherlv_5= 'instances' ( (lv_instances_6_0= ruleEInt ) ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:562:1: (otherlv_0= 'ri' otherlv_1= 'type' ( ( ruleEString ) ) otherlv_3= 'activity' ( ( ruleEString ) ) otherlv_5= 'instances' ( (lv_instances_6_0= ruleEInt ) ) )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:562:1: (otherlv_0= 'ri' otherlv_1= 'type' ( ( ruleEString ) ) otherlv_3= 'activity' ( ( ruleEString ) ) otherlv_5= 'instances' ( (lv_instances_6_0= ruleEInt ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:562:3: otherlv_0= 'ri' otherlv_1= 'type' ( ( ruleEString ) ) otherlv_3= 'activity' ( ( ruleEString ) ) otherlv_5= 'instances' ( (lv_instances_6_0= ruleEInt ) )
            {
            otherlv_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleRessourceInstance1223); 

                	newLeafNode(otherlv_0, grammarAccess.getRessourceInstanceAccess().getRiKeyword_0());
                
            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleRessourceInstance1235); 

                	newLeafNode(otherlv_1, grammarAccess.getRessourceInstanceAccess().getTypeKeyword_1());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:570:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:571:1: ( ruleEString )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:571:1: ( ruleEString )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:572:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRessourceInstanceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRessourceInstanceAccess().getTypeRessourceDefinitionCrossReference_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRessourceInstance1258);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleRessourceInstance1270); 

                	newLeafNode(otherlv_3, grammarAccess.getRessourceInstanceAccess().getActivityKeyword_3());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:589:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:590:1: ( ruleEString )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:590:1: ( ruleEString )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:591:3: ruleEString
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getRessourceInstanceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getRessourceInstanceAccess().getActivityWorkDefinitionCrossReference_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRessourceInstance1293);
            ruleEString();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRessourceInstance1305); 

                	newLeafNode(otherlv_5, grammarAccess.getRessourceInstanceAccess().getInstancesKeyword_5());
                
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:608:1: ( (lv_instances_6_0= ruleEInt ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:609:1: (lv_instances_6_0= ruleEInt )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:609:1: (lv_instances_6_0= ruleEInt )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:610:3: lv_instances_6_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getRessourceInstanceAccess().getInstancesEIntParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleRessourceInstance1326);
            lv_instances_6_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRessourceInstanceRule());
            	        }
                   		set(
                   			current, 
                   			"instances",
                    		lv_instances_6_0, 
                    		"EInt");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


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
    // $ANTLR end "ruleRessourceInstance"


    // $ANTLR start "entryRuleEInt"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:634:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:635:2: (iv_ruleEInt= ruleEInt EOF )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:636:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1363);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1374); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:643:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:646:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:647:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:647:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:647:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:647:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==27) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:648:2: kw= '-'
                    {
                    kw=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleEInt1413); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1430); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleWorkSequenceType"
    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:668:1: ruleWorkSequenceType returns [Enumerator current=null] : ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 's2f' ) | (enumLiteral_2= 'f2s' ) | (enumLiteral_3= 'f2f' ) ) ;
    public final Enumerator ruleWorkSequenceType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:670:28: ( ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 's2f' ) | (enumLiteral_2= 'f2s' ) | (enumLiteral_3= 'f2f' ) ) )
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:671:1: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 's2f' ) | (enumLiteral_2= 'f2s' ) | (enumLiteral_3= 'f2f' ) )
            {
            // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:671:1: ( (enumLiteral_0= 's2s' ) | (enumLiteral_1= 's2f' ) | (enumLiteral_2= 'f2s' ) | (enumLiteral_3= 'f2f' ) )
            int alt6=4;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt6=1;
                }
                break;
            case 29:
                {
                alt6=2;
                }
                break;
            case 30:
                {
                alt6=3;
                }
                break;
            case 31:
                {
                alt6=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:671:2: (enumLiteral_0= 's2s' )
                    {
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:671:2: (enumLiteral_0= 's2s' )
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:671:4: enumLiteral_0= 's2s'
                    {
                    enumLiteral_0=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleWorkSequenceType1489); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:677:6: (enumLiteral_1= 's2f' )
                    {
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:677:6: (enumLiteral_1= 's2f' )
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:677:8: enumLiteral_1= 's2f'
                    {
                    enumLiteral_1=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleWorkSequenceType1506); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:683:6: (enumLiteral_2= 'f2s' )
                    {
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:683:6: (enumLiteral_2= 'f2s' )
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:683:8: enumLiteral_2= 'f2s'
                    {
                    enumLiteral_2=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleWorkSequenceType1523); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:689:6: (enumLiteral_3= 'f2f' )
                    {
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:689:6: (enumLiteral_3= 'f2f' )
                    // ../be.syntaxical.pdl/src-gen/be/parser/antlr/internal/InternalSimplePDL.g:689:8: enumLiteral_3= 'f2f'
                    {
                    enumLiteral_3=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleWorkSequenceType1540); 

                            current = grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                        

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
    // $ANTLR end "ruleWorkSequenceType"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcess85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleProcess131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleProcess152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleProcess164 = new BitSet(new long[]{0x0000000000B26000L});
        public static final BitSet FOLLOW_ruleProcessElement_in_ruleProcess186 = new BitSet(new long[]{0x0000000000B26000L});
        public static final BitSet FOLLOW_ruleProcessElement_in_ruleProcess207 = new BitSet(new long[]{0x0000000000B26000L});
        public static final BitSet FOLLOW_13_in_ruleProcess222 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessElement_in_entryRuleProcessElement258 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcessElement268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkDefinition_in_ruleProcessElement315 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkSequence_in_ruleProcessElement342 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuidance_in_ruleProcessElement369 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRessourceDefinition_in_ruleProcessElement396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRessourceInstance_in_ruleProcessElement423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString459 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString536 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition581 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWorkDefinition591 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_ruleWorkDefinition628 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWorkDefinition649 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_ruleWorkDefinition661 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWorkDefinition682 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleWorkDefinition694 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleWorkDefinition715 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence751 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequence761 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleWorkSequence798 = new BitSet(new long[]{0x00000000F0000000L});
        public static final BitSet FOLLOW_ruleWorkSequenceType_in_ruleWorkSequence819 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleWorkSequence831 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWorkSequence854 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_19_in_ruleWorkSequence866 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleWorkSequence889 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance925 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuidance935 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleGuidance981 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleGuidance998 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRessourceDefinition_in_entryRuleRessourceDefinition1039 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRessourceDefinition1049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleRessourceDefinition1086 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRessourceDefinition1107 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_22_in_ruleRessourceDefinition1119 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRessourceDefinition1140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRessourceInstance_in_entryRuleRessourceInstance1176 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRessourceInstance1186 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleRessourceInstance1223 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_24_in_ruleRessourceInstance1235 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRessourceInstance1258 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleRessourceInstance1270 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRessourceInstance1293 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleRessourceInstance1305 = new BitSet(new long[]{0x0000000008000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleRessourceInstance1326 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1363 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1374 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleEInt1413 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1430 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleWorkSequenceType1489 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleWorkSequenceType1506 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleWorkSequenceType1523 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleWorkSequenceType1540 = new BitSet(new long[]{0x0000000000000002L});
    }


}