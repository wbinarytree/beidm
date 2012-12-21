package be.ui.contentassist.antlr.internal; 

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
import be.services.SimplePDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalSimplePDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'s2f'", "'f2s'", "'f2f'", "'process'", "'{'", "'min_time'", "'max_time'", "'}'", "'wd'", "'min'", "'max'", "'ws'", "'from'", "'to'", "'rd'", "'number'", "'ri'", "'type'", "'activity'", "'instances'", "'-'"
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
    public static final int T__32=32;
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
    public String getGrammarFileName() { return "../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g"; }


     
     	private SimplePDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(SimplePDLGrammarAccess grammarAccess) {
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




    // $ANTLR start "entryRuleProcess"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:60:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:61:1: ( ruleProcess EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:62:1: ruleProcess EOF
            {
             before(grammarAccess.getProcessRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcess_in_entryRuleProcess61);
            ruleProcess();

            state._fsp--;

             after(grammarAccess.getProcessRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcess68); 

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
    // $ANTLR end "entryRuleProcess"


    // $ANTLR start "ruleProcess"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:69:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:73:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:74:1: ( ( rule__Process__Group__0 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:74:1: ( ( rule__Process__Group__0 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:75:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:76:1: ( rule__Process__Group__0 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:76:2: rule__Process__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__0_in_ruleProcess94);
            rule__Process__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getGroup()); 

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
    // $ANTLR end "ruleProcess"


    // $ANTLR start "entryRuleProcessElement"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:88:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:89:1: ( ruleProcessElement EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:90:1: ruleProcessElement EOF
            {
             before(grammarAccess.getProcessElementRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcessElement_in_entryRuleProcessElement121);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessElementRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleProcessElement128); 

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
    // $ANTLR end "entryRuleProcessElement"


    // $ANTLR start "ruleProcessElement"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:97:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:101:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:103:1: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:104:1: ( rule__ProcessElement__Alternatives )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:104:2: rule__ProcessElement__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__ProcessElement__Alternatives_in_ruleProcessElement154);
            rule__ProcessElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getProcessElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleProcessElement"


    // $ANTLR start "entryRuleEString"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:117:1: ( ruleEString EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:118:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString181);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString188); 

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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:132:1: ( rule__EString__Alternatives )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:132:2: rule__EString__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__EString__Alternatives_in_ruleEString214);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleWorkDefinition"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:144:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:145:1: ( ruleWorkDefinition EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:146:1: ruleWorkDefinition EOF
            {
             before(grammarAccess.getWorkDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition241);
            ruleWorkDefinition();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWorkDefinition248); 

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
    // $ANTLR end "entryRuleWorkDefinition"


    // $ANTLR start "ruleWorkDefinition"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:153:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:157:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:158:1: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:158:1: ( ( rule__WorkDefinition__Group__0 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:159:1: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:160:1: ( rule__WorkDefinition__Group__0 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:160:2: rule__WorkDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__0_in_ruleWorkDefinition274);
            rule__WorkDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkDefinition"


    // $ANTLR start "entryRuleWorkSequence"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:172:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:173:1: ( ruleWorkSequence EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:174:1: ruleWorkSequence EOF
            {
             before(grammarAccess.getWorkSequenceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence301);
            ruleWorkSequence();

            state._fsp--;

             after(grammarAccess.getWorkSequenceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleWorkSequence308); 

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
    // $ANTLR end "entryRuleWorkSequence"


    // $ANTLR start "ruleWorkSequence"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:181:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:185:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:186:1: ( ( rule__WorkSequence__Group__0 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:186:1: ( ( rule__WorkSequence__Group__0 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:187:1: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:188:1: ( rule__WorkSequence__Group__0 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:188:2: rule__WorkSequence__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__0_in_ruleWorkSequence334);
            rule__WorkSequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getGroup()); 

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
    // $ANTLR end "ruleWorkSequence"


    // $ANTLR start "entryRuleGuidance"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:200:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:201:1: ( ruleGuidance EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:202:1: ruleGuidance EOF
            {
             before(grammarAccess.getGuidanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGuidance_in_entryRuleGuidance361);
            ruleGuidance();

            state._fsp--;

             after(grammarAccess.getGuidanceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGuidance368); 

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
    // $ANTLR end "entryRuleGuidance"


    // $ANTLR start "ruleGuidance"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:209:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:213:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:214:1: ( ( rule__Guidance__Group__0 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:214:1: ( ( rule__Guidance__Group__0 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:215:1: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:216:1: ( rule__Guidance__Group__0 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:216:2: rule__Guidance__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__0_in_ruleGuidance394);
            rule__Guidance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getGroup()); 

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
    // $ANTLR end "ruleGuidance"


    // $ANTLR start "entryRuleRessourceDefinition"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:228:1: entryRuleRessourceDefinition : ruleRessourceDefinition EOF ;
    public final void entryRuleRessourceDefinition() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:229:1: ( ruleRessourceDefinition EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:230:1: ruleRessourceDefinition EOF
            {
             before(grammarAccess.getRessourceDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRessourceDefinition_in_entryRuleRessourceDefinition421);
            ruleRessourceDefinition();

            state._fsp--;

             after(grammarAccess.getRessourceDefinitionRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRessourceDefinition428); 

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
    // $ANTLR end "entryRuleRessourceDefinition"


    // $ANTLR start "ruleRessourceDefinition"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:237:1: ruleRessourceDefinition : ( ( rule__RessourceDefinition__Group__0 ) ) ;
    public final void ruleRessourceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:241:2: ( ( ( rule__RessourceDefinition__Group__0 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:242:1: ( ( rule__RessourceDefinition__Group__0 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:242:1: ( ( rule__RessourceDefinition__Group__0 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:243:1: ( rule__RessourceDefinition__Group__0 )
            {
             before(grammarAccess.getRessourceDefinitionAccess().getGroup()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:244:1: ( rule__RessourceDefinition__Group__0 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:244:2: rule__RessourceDefinition__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__0_in_ruleRessourceDefinition454);
            rule__RessourceDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleRessourceDefinition"


    // $ANTLR start "entryRuleRessourceInstance"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:256:1: entryRuleRessourceInstance : ruleRessourceInstance EOF ;
    public final void entryRuleRessourceInstance() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:257:1: ( ruleRessourceInstance EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:258:1: ruleRessourceInstance EOF
            {
             before(grammarAccess.getRessourceInstanceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRessourceInstance_in_entryRuleRessourceInstance481);
            ruleRessourceInstance();

            state._fsp--;

             after(grammarAccess.getRessourceInstanceRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRessourceInstance488); 

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
    // $ANTLR end "entryRuleRessourceInstance"


    // $ANTLR start "ruleRessourceInstance"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:265:1: ruleRessourceInstance : ( ( rule__RessourceInstance__Group__0 ) ) ;
    public final void ruleRessourceInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:269:2: ( ( ( rule__RessourceInstance__Group__0 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:270:1: ( ( rule__RessourceInstance__Group__0 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:270:1: ( ( rule__RessourceInstance__Group__0 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:271:1: ( rule__RessourceInstance__Group__0 )
            {
             before(grammarAccess.getRessourceInstanceAccess().getGroup()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:272:1: ( rule__RessourceInstance__Group__0 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:272:2: rule__RessourceInstance__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__0_in_ruleRessourceInstance514);
            rule__RessourceInstance__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceInstanceAccess().getGroup()); 

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
    // $ANTLR end "ruleRessourceInstance"


    // $ANTLR start "entryRuleEInt"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:284:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:285:1: ( ruleEInt EOF )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:286:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt541);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt548); 

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
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:293:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:297:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:298:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:298:1: ( ( rule__EInt__Group__0 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:299:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:300:1: ( rule__EInt__Group__0 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:300:2: rule__EInt__Group__0
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0_in_ruleEInt574);
            rule__EInt__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEIntAccess().getGroup()); 

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "ruleWorkSequenceType"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:313:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:317:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:318:1: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:318:1: ( ( rule__WorkSequenceType__Alternatives ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:319:1: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:320:1: ( rule__WorkSequenceType__Alternatives )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:320:2: rule__WorkSequenceType__Alternatives
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequenceType__Alternatives_in_ruleWorkSequenceType611);
            rule__WorkSequenceType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleWorkSequenceType"


    // $ANTLR start "rule__ProcessElement__Alternatives"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:331:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessourceDefinition ) | ( ruleRessourceInstance ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:335:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessourceDefinition ) | ( ruleRessourceInstance ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt1=1;
                }
                break;
            case 23:
                {
                alt1=2;
                }
                break;
            case RULE_STRING:
                {
                alt1=3;
                }
                break;
            case 26:
                {
                alt1=4;
                }
                break;
            case 28:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:336:1: ( ruleWorkDefinition )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:336:1: ( ruleWorkDefinition )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:337:1: ruleWorkDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWorkDefinition_in_rule__ProcessElement__Alternatives646);
                    ruleWorkDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkDefinitionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:342:6: ( ruleWorkSequence )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:342:6: ( ruleWorkSequence )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:343:1: ruleWorkSequence
                    {
                     before(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 
                    pushFollow(FollowSets000.FOLLOW_ruleWorkSequence_in_rule__ProcessElement__Alternatives663);
                    ruleWorkSequence();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getWorkSequenceParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:348:6: ( ruleGuidance )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:348:6: ( ruleGuidance )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:349:1: ruleGuidance
                    {
                     before(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 
                    pushFollow(FollowSets000.FOLLOW_ruleGuidance_in_rule__ProcessElement__Alternatives680);
                    ruleGuidance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getGuidanceParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:354:6: ( ruleRessourceDefinition )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:354:6: ( ruleRessourceDefinition )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:355:1: ruleRessourceDefinition
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceDefinitionParserRuleCall_3()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRessourceDefinition_in_rule__ProcessElement__Alternatives697);
                    ruleRessourceDefinition();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceDefinitionParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:360:6: ( ruleRessourceInstance )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:360:6: ( ruleRessourceInstance )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:361:1: ruleRessourceInstance
                    {
                     before(grammarAccess.getProcessElementAccess().getRessourceInstanceParserRuleCall_4()); 
                    pushFollow(FollowSets000.FOLLOW_ruleRessourceInstance_in_rule__ProcessElement__Alternatives714);
                    ruleRessourceInstance();

                    state._fsp--;

                     after(grammarAccess.getProcessElementAccess().getRessourceInstanceParserRuleCall_4()); 

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
    // $ANTLR end "rule__ProcessElement__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:371:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:375:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:376:1: ( RULE_STRING )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:376:1: ( RULE_STRING )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:377:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives746); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:382:6: ( RULE_ID )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:382:6: ( RULE_ID )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:383:1: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_rule__EString__Alternatives763); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__WorkSequenceType__Alternatives"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:393:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2s' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:397:1: ( ( ( 's2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2s' ) ) | ( ( 'f2f' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:398:1: ( ( 's2s' ) )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:398:1: ( ( 's2s' ) )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:399:1: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:400:1: ( 's2s' )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:400:3: 's2s'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__WorkSequenceType__Alternatives796); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:405:6: ( ( 's2f' ) )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:405:6: ( ( 's2f' ) )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:406:1: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_1()); 
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:407:1: ( 's2f' )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:407:3: 's2f'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__WorkSequenceType__Alternatives817); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:412:6: ( ( 'f2s' ) )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:412:6: ( ( 'f2s' ) )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:413:1: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_2()); 
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:414:1: ( 'f2s' )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:414:3: 'f2s'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__WorkSequenceType__Alternatives838); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:419:6: ( ( 'f2f' ) )
                    {
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:419:6: ( ( 'f2f' ) )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:420:1: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:421:1: ( 'f2f' )
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:421:3: 'f2f'
                    {
                    match(input,14,FollowSets000.FOLLOW_14_in_rule__WorkSequenceType__Alternatives859); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 

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
    // $ANTLR end "rule__WorkSequenceType__Alternatives"


    // $ANTLR start "rule__Process__Group__0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:433:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:437:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:438:2: rule__Process__Group__0__Impl rule__Process__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__0892);
            rule__Process__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__1_in_rule__Process__Group__0895);
            rule__Process__Group__1();

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
    // $ANTLR end "rule__Process__Group__0"


    // $ANTLR start "rule__Process__Group__0__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:445:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:449:1: ( ( () ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:450:1: ( () )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:450:1: ( () )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:451:1: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:452:1: ()
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:454:1: 
            {
            }

             after(grammarAccess.getProcessAccess().getProcessAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Process__Group__0__Impl"


    // $ANTLR start "rule__Process__Group__1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:464:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:468:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:469:2: rule__Process__Group__1__Impl rule__Process__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__1953);
            rule__Process__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__2_in_rule__Process__Group__1956);
            rule__Process__Group__2();

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
    // $ANTLR end "rule__Process__Group__1"


    // $ANTLR start "rule__Process__Group__1__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:476:1: rule__Process__Group__1__Impl : ( 'process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:480:1: ( ( 'process' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:481:1: ( 'process' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:481:1: ( 'process' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:482:1: 'process'
            {
             before(grammarAccess.getProcessAccess().getProcessKeyword_1()); 
            match(input,15,FollowSets000.FOLLOW_15_in_rule__Process__Group__1__Impl984); 
             after(grammarAccess.getProcessAccess().getProcessKeyword_1()); 

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
    // $ANTLR end "rule__Process__Group__1__Impl"


    // $ANTLR start "rule__Process__Group__2"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:495:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:499:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:500:2: rule__Process__Group__2__Impl rule__Process__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__21015);
            rule__Process__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__3_in_rule__Process__Group__21018);
            rule__Process__Group__3();

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
    // $ANTLR end "rule__Process__Group__2"


    // $ANTLR start "rule__Process__Group__2__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:507:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:511:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:512:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:512:1: ( ( rule__Process__NameAssignment_2 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:513:1: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:514:1: ( rule__Process__NameAssignment_2 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:514:2: rule__Process__NameAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__NameAssignment_2_in_rule__Process__Group__2__Impl1045);
            rule__Process__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Process__Group__2__Impl"


    // $ANTLR start "rule__Process__Group__3"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:524:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:528:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:529:2: rule__Process__Group__3__Impl rule__Process__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__31075);
            rule__Process__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__4_in_rule__Process__Group__31078);
            rule__Process__Group__4();

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
    // $ANTLR end "rule__Process__Group__3"


    // $ANTLR start "rule__Process__Group__3__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:536:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:540:1: ( ( '{' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:541:1: ( '{' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:541:1: ( '{' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:542:1: '{'
            {
             before(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FollowSets000.FOLLOW_16_in_rule__Process__Group__3__Impl1106); 
             after(grammarAccess.getProcessAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Process__Group__3__Impl"


    // $ANTLR start "rule__Process__Group__4"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:555:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:559:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:560:2: rule__Process__Group__4__Impl rule__Process__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__41137);
            rule__Process__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__5_in_rule__Process__Group__41140);
            rule__Process__Group__5();

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
    // $ANTLR end "rule__Process__Group__4"


    // $ANTLR start "rule__Process__Group__4__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:567:1: rule__Process__Group__4__Impl : ( 'min_time' ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:571:1: ( ( 'min_time' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:572:1: ( 'min_time' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:572:1: ( 'min_time' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:573:1: 'min_time'
            {
             before(grammarAccess.getProcessAccess().getMin_timeKeyword_4()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Process__Group__4__Impl1168); 
             after(grammarAccess.getProcessAccess().getMin_timeKeyword_4()); 

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
    // $ANTLR end "rule__Process__Group__4__Impl"


    // $ANTLR start "rule__Process__Group__5"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:586:1: rule__Process__Group__5 : rule__Process__Group__5__Impl rule__Process__Group__6 ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:590:1: ( rule__Process__Group__5__Impl rule__Process__Group__6 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:591:2: rule__Process__Group__5__Impl rule__Process__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__5__Impl_in_rule__Process__Group__51199);
            rule__Process__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__6_in_rule__Process__Group__51202);
            rule__Process__Group__6();

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
    // $ANTLR end "rule__Process__Group__5"


    // $ANTLR start "rule__Process__Group__5__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:598:1: rule__Process__Group__5__Impl : ( ( rule__Process__Min_timeAssignment_5 ) ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:602:1: ( ( ( rule__Process__Min_timeAssignment_5 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:603:1: ( ( rule__Process__Min_timeAssignment_5 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:603:1: ( ( rule__Process__Min_timeAssignment_5 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:604:1: ( rule__Process__Min_timeAssignment_5 )
            {
             before(grammarAccess.getProcessAccess().getMin_timeAssignment_5()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:605:1: ( rule__Process__Min_timeAssignment_5 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:605:2: rule__Process__Min_timeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Min_timeAssignment_5_in_rule__Process__Group__5__Impl1229);
            rule__Process__Min_timeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getMin_timeAssignment_5()); 

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
    // $ANTLR end "rule__Process__Group__5__Impl"


    // $ANTLR start "rule__Process__Group__6"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:615:1: rule__Process__Group__6 : rule__Process__Group__6__Impl rule__Process__Group__7 ;
    public final void rule__Process__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:619:1: ( rule__Process__Group__6__Impl rule__Process__Group__7 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:620:2: rule__Process__Group__6__Impl rule__Process__Group__7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__6__Impl_in_rule__Process__Group__61259);
            rule__Process__Group__6__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__7_in_rule__Process__Group__61262);
            rule__Process__Group__7();

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
    // $ANTLR end "rule__Process__Group__6"


    // $ANTLR start "rule__Process__Group__6__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:627:1: rule__Process__Group__6__Impl : ( 'max_time' ) ;
    public final void rule__Process__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:631:1: ( ( 'max_time' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:632:1: ( 'max_time' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:632:1: ( 'max_time' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:633:1: 'max_time'
            {
             before(grammarAccess.getProcessAccess().getMax_timeKeyword_6()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__Process__Group__6__Impl1290); 
             after(grammarAccess.getProcessAccess().getMax_timeKeyword_6()); 

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
    // $ANTLR end "rule__Process__Group__6__Impl"


    // $ANTLR start "rule__Process__Group__7"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:646:1: rule__Process__Group__7 : rule__Process__Group__7__Impl rule__Process__Group__8 ;
    public final void rule__Process__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:650:1: ( rule__Process__Group__7__Impl rule__Process__Group__8 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:651:2: rule__Process__Group__7__Impl rule__Process__Group__8
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__7__Impl_in_rule__Process__Group__71321);
            rule__Process__Group__7__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__8_in_rule__Process__Group__71324);
            rule__Process__Group__8();

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
    // $ANTLR end "rule__Process__Group__7"


    // $ANTLR start "rule__Process__Group__7__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:658:1: rule__Process__Group__7__Impl : ( ( rule__Process__Max_timeAssignment_7 ) ) ;
    public final void rule__Process__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:662:1: ( ( ( rule__Process__Max_timeAssignment_7 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:663:1: ( ( rule__Process__Max_timeAssignment_7 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:663:1: ( ( rule__Process__Max_timeAssignment_7 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:664:1: ( rule__Process__Max_timeAssignment_7 )
            {
             before(grammarAccess.getProcessAccess().getMax_timeAssignment_7()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:665:1: ( rule__Process__Max_timeAssignment_7 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:665:2: rule__Process__Max_timeAssignment_7
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Max_timeAssignment_7_in_rule__Process__Group__7__Impl1351);
            rule__Process__Max_timeAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getMax_timeAssignment_7()); 

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
    // $ANTLR end "rule__Process__Group__7__Impl"


    // $ANTLR start "rule__Process__Group__8"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:675:1: rule__Process__Group__8 : rule__Process__Group__8__Impl rule__Process__Group__9 ;
    public final void rule__Process__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:679:1: ( rule__Process__Group__8__Impl rule__Process__Group__9 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:680:2: rule__Process__Group__8__Impl rule__Process__Group__9
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__8__Impl_in_rule__Process__Group__81381);
            rule__Process__Group__8__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__9_in_rule__Process__Group__81384);
            rule__Process__Group__9();

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
    // $ANTLR end "rule__Process__Group__8"


    // $ANTLR start "rule__Process__Group__8__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:687:1: rule__Process__Group__8__Impl : ( ( rule__Process__Group_8__0 )? ) ;
    public final void rule__Process__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:691:1: ( ( ( rule__Process__Group_8__0 )? ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:692:1: ( ( rule__Process__Group_8__0 )? )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:692:1: ( ( rule__Process__Group_8__0 )? )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:693:1: ( rule__Process__Group_8__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_8()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:694:1: ( rule__Process__Group_8__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING||LA4_0==20||LA4_0==23||LA4_0==26||LA4_0==28) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:694:2: rule__Process__Group_8__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Process__Group_8__0_in_rule__Process__Group__8__Impl1411);
                    rule__Process__Group_8__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_8()); 

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
    // $ANTLR end "rule__Process__Group__8__Impl"


    // $ANTLR start "rule__Process__Group__9"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:704:1: rule__Process__Group__9 : rule__Process__Group__9__Impl ;
    public final void rule__Process__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:708:1: ( rule__Process__Group__9__Impl )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:709:2: rule__Process__Group__9__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__9__Impl_in_rule__Process__Group__91442);
            rule__Process__Group__9__Impl();

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
    // $ANTLR end "rule__Process__Group__9"


    // $ANTLR start "rule__Process__Group__9__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:715:1: rule__Process__Group__9__Impl : ( '}' ) ;
    public final void rule__Process__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:719:1: ( ( '}' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:720:1: ( '}' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:720:1: ( '}' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:721:1: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_9()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__Process__Group__9__Impl1470); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_9()); 

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
    // $ANTLR end "rule__Process__Group__9__Impl"


    // $ANTLR start "rule__Process__Group_8__0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:754:1: rule__Process__Group_8__0 : rule__Process__Group_8__0__Impl rule__Process__Group_8__1 ;
    public final void rule__Process__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:758:1: ( rule__Process__Group_8__0__Impl rule__Process__Group_8__1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:759:2: rule__Process__Group_8__0__Impl rule__Process__Group_8__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_8__0__Impl_in_rule__Process__Group_8__01521);
            rule__Process__Group_8__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_8__1_in_rule__Process__Group_8__01524);
            rule__Process__Group_8__1();

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
    // $ANTLR end "rule__Process__Group_8__0"


    // $ANTLR start "rule__Process__Group_8__0__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:766:1: rule__Process__Group_8__0__Impl : ( ( rule__Process__ProcessElementsAssignment_8_0 ) ) ;
    public final void rule__Process__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:770:1: ( ( ( rule__Process__ProcessElementsAssignment_8_0 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:771:1: ( ( rule__Process__ProcessElementsAssignment_8_0 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:771:1: ( ( rule__Process__ProcessElementsAssignment_8_0 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:772:1: ( rule__Process__ProcessElementsAssignment_8_0 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_8_0()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:773:1: ( rule__Process__ProcessElementsAssignment_8_0 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:773:2: rule__Process__ProcessElementsAssignment_8_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__ProcessElementsAssignment_8_0_in_rule__Process__Group_8__0__Impl1551);
            rule__Process__ProcessElementsAssignment_8_0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_8_0()); 

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
    // $ANTLR end "rule__Process__Group_8__0__Impl"


    // $ANTLR start "rule__Process__Group_8__1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:783:1: rule__Process__Group_8__1 : rule__Process__Group_8__1__Impl ;
    public final void rule__Process__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:787:1: ( rule__Process__Group_8__1__Impl )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:788:2: rule__Process__Group_8__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_8__1__Impl_in_rule__Process__Group_8__11581);
            rule__Process__Group_8__1__Impl();

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
    // $ANTLR end "rule__Process__Group_8__1"


    // $ANTLR start "rule__Process__Group_8__1__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:794:1: rule__Process__Group_8__1__Impl : ( ( rule__Process__ProcessElementsAssignment_8_1 )* ) ;
    public final void rule__Process__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:798:1: ( ( ( rule__Process__ProcessElementsAssignment_8_1 )* ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:799:1: ( ( rule__Process__ProcessElementsAssignment_8_1 )* )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:799:1: ( ( rule__Process__ProcessElementsAssignment_8_1 )* )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:800:1: ( rule__Process__ProcessElementsAssignment_8_1 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_8_1()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:801:1: ( rule__Process__ProcessElementsAssignment_8_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING||LA5_0==20||LA5_0==23||LA5_0==26||LA5_0==28) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:801:2: rule__Process__ProcessElementsAssignment_8_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Process__ProcessElementsAssignment_8_1_in_rule__Process__Group_8__1__Impl1608);
            	    rule__Process__ProcessElementsAssignment_8_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_8_1()); 

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
    // $ANTLR end "rule__Process__Group_8__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:815:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:819:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:820:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__01643);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__01646);
            rule__WorkDefinition__Group__1();

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
    // $ANTLR end "rule__WorkDefinition__Group__0"


    // $ANTLR start "rule__WorkDefinition__Group__0__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:827:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:831:1: ( ( 'wd' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:832:1: ( 'wd' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:832:1: ( 'wd' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:833:1: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__WorkDefinition__Group__0__Impl1674); 
             after(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__0__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:846:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:850:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:851:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__11705);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__2_in_rule__WorkDefinition__Group__11708);
            rule__WorkDefinition__Group__2();

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
    // $ANTLR end "rule__WorkDefinition__Group__1"


    // $ANTLR start "rule__WorkDefinition__Group__1__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:858:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:862:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:863:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:863:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:864:1: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:865:1: ( rule__WorkDefinition__NameAssignment_1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:865:2: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl1735);
            rule__WorkDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__2"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:875:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:879:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:880:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__2__Impl_in_rule__WorkDefinition__Group__21765);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__3_in_rule__WorkDefinition__Group__21768);
            rule__WorkDefinition__Group__3();

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
    // $ANTLR end "rule__WorkDefinition__Group__2"


    // $ANTLR start "rule__WorkDefinition__Group__2__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:887:1: rule__WorkDefinition__Group__2__Impl : ( 'min' ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:891:1: ( ( 'min' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:892:1: ( 'min' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:892:1: ( 'min' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:893:1: 'min'
            {
             before(grammarAccess.getWorkDefinitionAccess().getMinKeyword_2()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__WorkDefinition__Group__2__Impl1796); 
             after(grammarAccess.getWorkDefinitionAccess().getMinKeyword_2()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__2__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__3"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:906:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:910:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:911:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__3__Impl_in_rule__WorkDefinition__Group__31827);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__4_in_rule__WorkDefinition__Group__31830);
            rule__WorkDefinition__Group__4();

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
    // $ANTLR end "rule__WorkDefinition__Group__3"


    // $ANTLR start "rule__WorkDefinition__Group__3__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:918:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__Min_timeAssignment_3 ) ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:922:1: ( ( ( rule__WorkDefinition__Min_timeAssignment_3 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:923:1: ( ( rule__WorkDefinition__Min_timeAssignment_3 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:923:1: ( ( rule__WorkDefinition__Min_timeAssignment_3 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:924:1: ( rule__WorkDefinition__Min_timeAssignment_3 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getMin_timeAssignment_3()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:925:1: ( rule__WorkDefinition__Min_timeAssignment_3 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:925:2: rule__WorkDefinition__Min_timeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Min_timeAssignment_3_in_rule__WorkDefinition__Group__3__Impl1857);
            rule__WorkDefinition__Min_timeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getMin_timeAssignment_3()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__3__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__4"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:935:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:939:1: ( rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:940:2: rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__4__Impl_in_rule__WorkDefinition__Group__41887);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__5_in_rule__WorkDefinition__Group__41890);
            rule__WorkDefinition__Group__5();

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
    // $ANTLR end "rule__WorkDefinition__Group__4"


    // $ANTLR start "rule__WorkDefinition__Group__4__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:947:1: rule__WorkDefinition__Group__4__Impl : ( 'max' ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:951:1: ( ( 'max' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:952:1: ( 'max' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:952:1: ( 'max' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:953:1: 'max'
            {
             before(grammarAccess.getWorkDefinitionAccess().getMaxKeyword_4()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__WorkDefinition__Group__4__Impl1918); 
             after(grammarAccess.getWorkDefinitionAccess().getMaxKeyword_4()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__4__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__5"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:966:1: rule__WorkDefinition__Group__5 : rule__WorkDefinition__Group__5__Impl ;
    public final void rule__WorkDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:970:1: ( rule__WorkDefinition__Group__5__Impl )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:971:2: rule__WorkDefinition__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__5__Impl_in_rule__WorkDefinition__Group__51949);
            rule__WorkDefinition__Group__5__Impl();

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
    // $ANTLR end "rule__WorkDefinition__Group__5"


    // $ANTLR start "rule__WorkDefinition__Group__5__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:977:1: rule__WorkDefinition__Group__5__Impl : ( ( rule__WorkDefinition__Max_timeAssignment_5 ) ) ;
    public final void rule__WorkDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:981:1: ( ( ( rule__WorkDefinition__Max_timeAssignment_5 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:982:1: ( ( rule__WorkDefinition__Max_timeAssignment_5 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:982:1: ( ( rule__WorkDefinition__Max_timeAssignment_5 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:983:1: ( rule__WorkDefinition__Max_timeAssignment_5 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getMax_timeAssignment_5()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:984:1: ( rule__WorkDefinition__Max_timeAssignment_5 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:984:2: rule__WorkDefinition__Max_timeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Max_timeAssignment_5_in_rule__WorkDefinition__Group__5__Impl1976);
            rule__WorkDefinition__Max_timeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkDefinitionAccess().getMax_timeAssignment_5()); 

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
    // $ANTLR end "rule__WorkDefinition__Group__5__Impl"


    // $ANTLR start "rule__WorkSequence__Group__0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1006:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1010:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1011:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__0__Impl_in_rule__WorkSequence__Group__02018);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__1_in_rule__WorkSequence__Group__02021);
            rule__WorkSequence__Group__1();

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
    // $ANTLR end "rule__WorkSequence__Group__0"


    // $ANTLR start "rule__WorkSequence__Group__0__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1018:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1022:1: ( ( 'ws' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1023:1: ( 'ws' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1023:1: ( 'ws' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1024:1: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__WorkSequence__Group__0__Impl2049); 
             after(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 

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
    // $ANTLR end "rule__WorkSequence__Group__0__Impl"


    // $ANTLR start "rule__WorkSequence__Group__1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1037:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1041:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1042:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__1__Impl_in_rule__WorkSequence__Group__12080);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__2_in_rule__WorkSequence__Group__12083);
            rule__WorkSequence__Group__2();

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
    // $ANTLR end "rule__WorkSequence__Group__1"


    // $ANTLR start "rule__WorkSequence__Group__1__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1049:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1053:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1054:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1054:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1055:1: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1056:1: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1056:2: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__LinkTypeAssignment_1_in_rule__WorkSequence__Group__1__Impl2110);
            rule__WorkSequence__LinkTypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 

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
    // $ANTLR end "rule__WorkSequence__Group__1__Impl"


    // $ANTLR start "rule__WorkSequence__Group__2"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1066:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1070:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1071:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__2__Impl_in_rule__WorkSequence__Group__22140);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__3_in_rule__WorkSequence__Group__22143);
            rule__WorkSequence__Group__3();

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
    // $ANTLR end "rule__WorkSequence__Group__2"


    // $ANTLR start "rule__WorkSequence__Group__2__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1078:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1082:1: ( ( 'from' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1083:1: ( 'from' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1083:1: ( 'from' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1084:1: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__WorkSequence__Group__2__Impl2171); 
             after(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 

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
    // $ANTLR end "rule__WorkSequence__Group__2__Impl"


    // $ANTLR start "rule__WorkSequence__Group__3"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1097:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1101:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1102:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__3__Impl_in_rule__WorkSequence__Group__32202);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__4_in_rule__WorkSequence__Group__32205);
            rule__WorkSequence__Group__4();

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
    // $ANTLR end "rule__WorkSequence__Group__3"


    // $ANTLR start "rule__WorkSequence__Group__3__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1109:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1113:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1114:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1114:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1115:1: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1116:1: ( rule__WorkSequence__PredecessorAssignment_3 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1116:2: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__PredecessorAssignment_3_in_rule__WorkSequence__Group__3__Impl2232);
            rule__WorkSequence__PredecessorAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 

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
    // $ANTLR end "rule__WorkSequence__Group__3__Impl"


    // $ANTLR start "rule__WorkSequence__Group__4"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1126:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1130:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1131:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__4__Impl_in_rule__WorkSequence__Group__42262);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__5_in_rule__WorkSequence__Group__42265);
            rule__WorkSequence__Group__5();

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
    // $ANTLR end "rule__WorkSequence__Group__4"


    // $ANTLR start "rule__WorkSequence__Group__4__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1138:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1142:1: ( ( 'to' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1143:1: ( 'to' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1143:1: ( 'to' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1144:1: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__WorkSequence__Group__4__Impl2293); 
             after(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 

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
    // $ANTLR end "rule__WorkSequence__Group__4__Impl"


    // $ANTLR start "rule__WorkSequence__Group__5"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1157:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1161:1: ( rule__WorkSequence__Group__5__Impl )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1162:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__5__Impl_in_rule__WorkSequence__Group__52324);
            rule__WorkSequence__Group__5__Impl();

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
    // $ANTLR end "rule__WorkSequence__Group__5"


    // $ANTLR start "rule__WorkSequence__Group__5__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1168:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1172:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1173:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1173:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1174:1: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1175:1: ( rule__WorkSequence__SuccessorAssignment_5 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1175:2: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__SuccessorAssignment_5_in_rule__WorkSequence__Group__5__Impl2351);
            rule__WorkSequence__SuccessorAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 

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
    // $ANTLR end "rule__WorkSequence__Group__5__Impl"


    // $ANTLR start "rule__Guidance__Group__0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1197:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1201:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1202:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02393);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02396);
            rule__Guidance__Group__1();

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
    // $ANTLR end "rule__Guidance__Group__0"


    // $ANTLR start "rule__Guidance__Group__0__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1209:1: rule__Guidance__Group__0__Impl : ( () ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1213:1: ( ( () ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1214:1: ( () )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1214:1: ( () )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1215:1: ()
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1216:1: ()
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1218:1: 
            {
            }

             after(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Guidance__Group__0__Impl"


    // $ANTLR start "rule__Guidance__Group__1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1228:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1232:1: ( rule__Guidance__Group__1__Impl )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1233:2: rule__Guidance__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12454);
            rule__Guidance__Group__1__Impl();

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
    // $ANTLR end "rule__Guidance__Group__1"


    // $ANTLR start "rule__Guidance__Group__1__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1239:1: rule__Guidance__Group__1__Impl : ( ( rule__Guidance__TextAssignment_1 ) ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1243:1: ( ( ( rule__Guidance__TextAssignment_1 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1244:1: ( ( rule__Guidance__TextAssignment_1 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1244:1: ( ( rule__Guidance__TextAssignment_1 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1245:1: ( rule__Guidance__TextAssignment_1 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1246:1: ( rule__Guidance__TextAssignment_1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1246:2: rule__Guidance__TextAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guidance__TextAssignment_1_in_rule__Guidance__Group__1__Impl2481);
            rule__Guidance__TextAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_1()); 

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
    // $ANTLR end "rule__Guidance__Group__1__Impl"


    // $ANTLR start "rule__RessourceDefinition__Group__0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1260:1: rule__RessourceDefinition__Group__0 : rule__RessourceDefinition__Group__0__Impl rule__RessourceDefinition__Group__1 ;
    public final void rule__RessourceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1264:1: ( rule__RessourceDefinition__Group__0__Impl rule__RessourceDefinition__Group__1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1265:2: rule__RessourceDefinition__Group__0__Impl rule__RessourceDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__0__Impl_in_rule__RessourceDefinition__Group__02515);
            rule__RessourceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__1_in_rule__RessourceDefinition__Group__02518);
            rule__RessourceDefinition__Group__1();

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
    // $ANTLR end "rule__RessourceDefinition__Group__0"


    // $ANTLR start "rule__RessourceDefinition__Group__0__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1272:1: rule__RessourceDefinition__Group__0__Impl : ( 'rd' ) ;
    public final void rule__RessourceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1276:1: ( ( 'rd' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1277:1: ( 'rd' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1277:1: ( 'rd' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1278:1: 'rd'
            {
             before(grammarAccess.getRessourceDefinitionAccess().getRdKeyword_0()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__RessourceDefinition__Group__0__Impl2546); 
             after(grammarAccess.getRessourceDefinitionAccess().getRdKeyword_0()); 

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
    // $ANTLR end "rule__RessourceDefinition__Group__0__Impl"


    // $ANTLR start "rule__RessourceDefinition__Group__1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1291:1: rule__RessourceDefinition__Group__1 : rule__RessourceDefinition__Group__1__Impl rule__RessourceDefinition__Group__2 ;
    public final void rule__RessourceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1295:1: ( rule__RessourceDefinition__Group__1__Impl rule__RessourceDefinition__Group__2 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1296:2: rule__RessourceDefinition__Group__1__Impl rule__RessourceDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__1__Impl_in_rule__RessourceDefinition__Group__12577);
            rule__RessourceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__2_in_rule__RessourceDefinition__Group__12580);
            rule__RessourceDefinition__Group__2();

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
    // $ANTLR end "rule__RessourceDefinition__Group__1"


    // $ANTLR start "rule__RessourceDefinition__Group__1__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1303:1: rule__RessourceDefinition__Group__1__Impl : ( ( rule__RessourceDefinition__NameAssignment_1 ) ) ;
    public final void rule__RessourceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1307:1: ( ( ( rule__RessourceDefinition__NameAssignment_1 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1308:1: ( ( rule__RessourceDefinition__NameAssignment_1 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1308:1: ( ( rule__RessourceDefinition__NameAssignment_1 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1309:1: ( rule__RessourceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNameAssignment_1()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1310:1: ( rule__RessourceDefinition__NameAssignment_1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1310:2: rule__RessourceDefinition__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__NameAssignment_1_in_rule__RessourceDefinition__Group__1__Impl2607);
            rule__RessourceDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRessourceDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__RessourceDefinition__Group__1__Impl"


    // $ANTLR start "rule__RessourceDefinition__Group__2"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1320:1: rule__RessourceDefinition__Group__2 : rule__RessourceDefinition__Group__2__Impl rule__RessourceDefinition__Group__3 ;
    public final void rule__RessourceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1324:1: ( rule__RessourceDefinition__Group__2__Impl rule__RessourceDefinition__Group__3 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1325:2: rule__RessourceDefinition__Group__2__Impl rule__RessourceDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__2__Impl_in_rule__RessourceDefinition__Group__22637);
            rule__RessourceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__3_in_rule__RessourceDefinition__Group__22640);
            rule__RessourceDefinition__Group__3();

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
    // $ANTLR end "rule__RessourceDefinition__Group__2"


    // $ANTLR start "rule__RessourceDefinition__Group__2__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1332:1: rule__RessourceDefinition__Group__2__Impl : ( 'number' ) ;
    public final void rule__RessourceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1336:1: ( ( 'number' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1337:1: ( 'number' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1337:1: ( 'number' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1338:1: 'number'
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNumberKeyword_2()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RessourceDefinition__Group__2__Impl2668); 
             after(grammarAccess.getRessourceDefinitionAccess().getNumberKeyword_2()); 

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
    // $ANTLR end "rule__RessourceDefinition__Group__2__Impl"


    // $ANTLR start "rule__RessourceDefinition__Group__3"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1351:1: rule__RessourceDefinition__Group__3 : rule__RessourceDefinition__Group__3__Impl ;
    public final void rule__RessourceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1355:1: ( rule__RessourceDefinition__Group__3__Impl )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1356:2: rule__RessourceDefinition__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__3__Impl_in_rule__RessourceDefinition__Group__32699);
            rule__RessourceDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__RessourceDefinition__Group__3"


    // $ANTLR start "rule__RessourceDefinition__Group__3__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1362:1: rule__RessourceDefinition__Group__3__Impl : ( ( rule__RessourceDefinition__NumberAssignment_3 ) ) ;
    public final void rule__RessourceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1366:1: ( ( ( rule__RessourceDefinition__NumberAssignment_3 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1367:1: ( ( rule__RessourceDefinition__NumberAssignment_3 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1367:1: ( ( rule__RessourceDefinition__NumberAssignment_3 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1368:1: ( rule__RessourceDefinition__NumberAssignment_3 )
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNumberAssignment_3()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1369:1: ( rule__RessourceDefinition__NumberAssignment_3 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1369:2: rule__RessourceDefinition__NumberAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__NumberAssignment_3_in_rule__RessourceDefinition__Group__3__Impl2726);
            rule__RessourceDefinition__NumberAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRessourceDefinitionAccess().getNumberAssignment_3()); 

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
    // $ANTLR end "rule__RessourceDefinition__Group__3__Impl"


    // $ANTLR start "rule__RessourceInstance__Group__0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1387:1: rule__RessourceInstance__Group__0 : rule__RessourceInstance__Group__0__Impl rule__RessourceInstance__Group__1 ;
    public final void rule__RessourceInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1391:1: ( rule__RessourceInstance__Group__0__Impl rule__RessourceInstance__Group__1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1392:2: rule__RessourceInstance__Group__0__Impl rule__RessourceInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__0__Impl_in_rule__RessourceInstance__Group__02764);
            rule__RessourceInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__1_in_rule__RessourceInstance__Group__02767);
            rule__RessourceInstance__Group__1();

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
    // $ANTLR end "rule__RessourceInstance__Group__0"


    // $ANTLR start "rule__RessourceInstance__Group__0__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1399:1: rule__RessourceInstance__Group__0__Impl : ( 'ri' ) ;
    public final void rule__RessourceInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1403:1: ( ( 'ri' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1404:1: ( 'ri' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1404:1: ( 'ri' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1405:1: 'ri'
            {
             before(grammarAccess.getRessourceInstanceAccess().getRiKeyword_0()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__RessourceInstance__Group__0__Impl2795); 
             after(grammarAccess.getRessourceInstanceAccess().getRiKeyword_0()); 

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
    // $ANTLR end "rule__RessourceInstance__Group__0__Impl"


    // $ANTLR start "rule__RessourceInstance__Group__1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1418:1: rule__RessourceInstance__Group__1 : rule__RessourceInstance__Group__1__Impl rule__RessourceInstance__Group__2 ;
    public final void rule__RessourceInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1422:1: ( rule__RessourceInstance__Group__1__Impl rule__RessourceInstance__Group__2 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1423:2: rule__RessourceInstance__Group__1__Impl rule__RessourceInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__1__Impl_in_rule__RessourceInstance__Group__12826);
            rule__RessourceInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__2_in_rule__RessourceInstance__Group__12829);
            rule__RessourceInstance__Group__2();

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
    // $ANTLR end "rule__RessourceInstance__Group__1"


    // $ANTLR start "rule__RessourceInstance__Group__1__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1430:1: rule__RessourceInstance__Group__1__Impl : ( 'type' ) ;
    public final void rule__RessourceInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1434:1: ( ( 'type' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1435:1: ( 'type' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1435:1: ( 'type' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1436:1: 'type'
            {
             before(grammarAccess.getRessourceInstanceAccess().getTypeKeyword_1()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__RessourceInstance__Group__1__Impl2857); 
             after(grammarAccess.getRessourceInstanceAccess().getTypeKeyword_1()); 

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
    // $ANTLR end "rule__RessourceInstance__Group__1__Impl"


    // $ANTLR start "rule__RessourceInstance__Group__2"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1449:1: rule__RessourceInstance__Group__2 : rule__RessourceInstance__Group__2__Impl rule__RessourceInstance__Group__3 ;
    public final void rule__RessourceInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1453:1: ( rule__RessourceInstance__Group__2__Impl rule__RessourceInstance__Group__3 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1454:2: rule__RessourceInstance__Group__2__Impl rule__RessourceInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__2__Impl_in_rule__RessourceInstance__Group__22888);
            rule__RessourceInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__3_in_rule__RessourceInstance__Group__22891);
            rule__RessourceInstance__Group__3();

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
    // $ANTLR end "rule__RessourceInstance__Group__2"


    // $ANTLR start "rule__RessourceInstance__Group__2__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1461:1: rule__RessourceInstance__Group__2__Impl : ( ( rule__RessourceInstance__TypeAssignment_2 ) ) ;
    public final void rule__RessourceInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1465:1: ( ( ( rule__RessourceInstance__TypeAssignment_2 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1466:1: ( ( rule__RessourceInstance__TypeAssignment_2 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1466:1: ( ( rule__RessourceInstance__TypeAssignment_2 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1467:1: ( rule__RessourceInstance__TypeAssignment_2 )
            {
             before(grammarAccess.getRessourceInstanceAccess().getTypeAssignment_2()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1468:1: ( rule__RessourceInstance__TypeAssignment_2 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1468:2: rule__RessourceInstance__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__TypeAssignment_2_in_rule__RessourceInstance__Group__2__Impl2918);
            rule__RessourceInstance__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRessourceInstanceAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__RessourceInstance__Group__2__Impl"


    // $ANTLR start "rule__RessourceInstance__Group__3"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1478:1: rule__RessourceInstance__Group__3 : rule__RessourceInstance__Group__3__Impl rule__RessourceInstance__Group__4 ;
    public final void rule__RessourceInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1482:1: ( rule__RessourceInstance__Group__3__Impl rule__RessourceInstance__Group__4 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1483:2: rule__RessourceInstance__Group__3__Impl rule__RessourceInstance__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__3__Impl_in_rule__RessourceInstance__Group__32948);
            rule__RessourceInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__4_in_rule__RessourceInstance__Group__32951);
            rule__RessourceInstance__Group__4();

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
    // $ANTLR end "rule__RessourceInstance__Group__3"


    // $ANTLR start "rule__RessourceInstance__Group__3__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1490:1: rule__RessourceInstance__Group__3__Impl : ( 'activity' ) ;
    public final void rule__RessourceInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1494:1: ( ( 'activity' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1495:1: ( 'activity' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1495:1: ( 'activity' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1496:1: 'activity'
            {
             before(grammarAccess.getRessourceInstanceAccess().getActivityKeyword_3()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RessourceInstance__Group__3__Impl2979); 
             after(grammarAccess.getRessourceInstanceAccess().getActivityKeyword_3()); 

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
    // $ANTLR end "rule__RessourceInstance__Group__3__Impl"


    // $ANTLR start "rule__RessourceInstance__Group__4"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1509:1: rule__RessourceInstance__Group__4 : rule__RessourceInstance__Group__4__Impl rule__RessourceInstance__Group__5 ;
    public final void rule__RessourceInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1513:1: ( rule__RessourceInstance__Group__4__Impl rule__RessourceInstance__Group__5 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1514:2: rule__RessourceInstance__Group__4__Impl rule__RessourceInstance__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__4__Impl_in_rule__RessourceInstance__Group__43010);
            rule__RessourceInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__5_in_rule__RessourceInstance__Group__43013);
            rule__RessourceInstance__Group__5();

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
    // $ANTLR end "rule__RessourceInstance__Group__4"


    // $ANTLR start "rule__RessourceInstance__Group__4__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1521:1: rule__RessourceInstance__Group__4__Impl : ( ( rule__RessourceInstance__ActivityAssignment_4 ) ) ;
    public final void rule__RessourceInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1525:1: ( ( ( rule__RessourceInstance__ActivityAssignment_4 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1526:1: ( ( rule__RessourceInstance__ActivityAssignment_4 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1526:1: ( ( rule__RessourceInstance__ActivityAssignment_4 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1527:1: ( rule__RessourceInstance__ActivityAssignment_4 )
            {
             before(grammarAccess.getRessourceInstanceAccess().getActivityAssignment_4()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1528:1: ( rule__RessourceInstance__ActivityAssignment_4 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1528:2: rule__RessourceInstance__ActivityAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__ActivityAssignment_4_in_rule__RessourceInstance__Group__4__Impl3040);
            rule__RessourceInstance__ActivityAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRessourceInstanceAccess().getActivityAssignment_4()); 

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
    // $ANTLR end "rule__RessourceInstance__Group__4__Impl"


    // $ANTLR start "rule__RessourceInstance__Group__5"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1538:1: rule__RessourceInstance__Group__5 : rule__RessourceInstance__Group__5__Impl rule__RessourceInstance__Group__6 ;
    public final void rule__RessourceInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1542:1: ( rule__RessourceInstance__Group__5__Impl rule__RessourceInstance__Group__6 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1543:2: rule__RessourceInstance__Group__5__Impl rule__RessourceInstance__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__5__Impl_in_rule__RessourceInstance__Group__53070);
            rule__RessourceInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__6_in_rule__RessourceInstance__Group__53073);
            rule__RessourceInstance__Group__6();

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
    // $ANTLR end "rule__RessourceInstance__Group__5"


    // $ANTLR start "rule__RessourceInstance__Group__5__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1550:1: rule__RessourceInstance__Group__5__Impl : ( 'instances' ) ;
    public final void rule__RessourceInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1554:1: ( ( 'instances' ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1555:1: ( 'instances' )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1555:1: ( 'instances' )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1556:1: 'instances'
            {
             before(grammarAccess.getRessourceInstanceAccess().getInstancesKeyword_5()); 
            match(input,31,FollowSets000.FOLLOW_31_in_rule__RessourceInstance__Group__5__Impl3101); 
             after(grammarAccess.getRessourceInstanceAccess().getInstancesKeyword_5()); 

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
    // $ANTLR end "rule__RessourceInstance__Group__5__Impl"


    // $ANTLR start "rule__RessourceInstance__Group__6"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1569:1: rule__RessourceInstance__Group__6 : rule__RessourceInstance__Group__6__Impl ;
    public final void rule__RessourceInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1573:1: ( rule__RessourceInstance__Group__6__Impl )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1574:2: rule__RessourceInstance__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__6__Impl_in_rule__RessourceInstance__Group__63132);
            rule__RessourceInstance__Group__6__Impl();

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
    // $ANTLR end "rule__RessourceInstance__Group__6"


    // $ANTLR start "rule__RessourceInstance__Group__6__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1580:1: rule__RessourceInstance__Group__6__Impl : ( ( rule__RessourceInstance__InstancesAssignment_6 ) ) ;
    public final void rule__RessourceInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1584:1: ( ( ( rule__RessourceInstance__InstancesAssignment_6 ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1585:1: ( ( rule__RessourceInstance__InstancesAssignment_6 ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1585:1: ( ( rule__RessourceInstance__InstancesAssignment_6 ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1586:1: ( rule__RessourceInstance__InstancesAssignment_6 )
            {
             before(grammarAccess.getRessourceInstanceAccess().getInstancesAssignment_6()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1587:1: ( rule__RessourceInstance__InstancesAssignment_6 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1587:2: rule__RessourceInstance__InstancesAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__InstancesAssignment_6_in_rule__RessourceInstance__Group__6__Impl3159);
            rule__RessourceInstance__InstancesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getRessourceInstanceAccess().getInstancesAssignment_6()); 

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
    // $ANTLR end "rule__RessourceInstance__Group__6__Impl"


    // $ANTLR start "rule__EInt__Group__0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1611:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1615:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1616:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03203);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03206);
            rule__EInt__Group__1();

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
    // $ANTLR end "rule__EInt__Group__0"


    // $ANTLR start "rule__EInt__Group__0__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1623:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1627:1: ( ( ( '-' )? ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1628:1: ( ( '-' )? )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1628:1: ( ( '-' )? )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1629:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1630:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==32) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1631:2: '-'
                    {
                    match(input,32,FollowSets000.FOLLOW_32_in_rule__EInt__Group__0__Impl3235); 

                    }
                    break;

            }

             after(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 

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
    // $ANTLR end "rule__EInt__Group__0__Impl"


    // $ANTLR start "rule__EInt__Group__1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1642:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1646:1: ( rule__EInt__Group__1__Impl )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1647:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13268);
            rule__EInt__Group__1__Impl();

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
    // $ANTLR end "rule__EInt__Group__1"


    // $ANTLR start "rule__EInt__Group__1__Impl"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1653:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1657:1: ( ( RULE_INT ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1658:1: ( RULE_INT )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1658:1: ( RULE_INT )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1659:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3295); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EInt__Group__1__Impl"


    // $ANTLR start "rule__Process__NameAssignment_2"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1675:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1679:1: ( ( ruleEString ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1680:1: ( ruleEString )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1680:1: ( ruleEString )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1681:1: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Process__NameAssignment_23333);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Process__NameAssignment_2"


    // $ANTLR start "rule__Process__Min_timeAssignment_5"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1690:1: rule__Process__Min_timeAssignment_5 : ( ruleEInt ) ;
    public final void rule__Process__Min_timeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1694:1: ( ( ruleEInt ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1695:1: ( ruleEInt )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1695:1: ( ruleEInt )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1696:1: ruleEInt
            {
             before(grammarAccess.getProcessAccess().getMin_timeEIntParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Process__Min_timeAssignment_53364);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getMin_timeEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__Process__Min_timeAssignment_5"


    // $ANTLR start "rule__Process__Max_timeAssignment_7"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1705:1: rule__Process__Max_timeAssignment_7 : ( ruleEInt ) ;
    public final void rule__Process__Max_timeAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1709:1: ( ( ruleEInt ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1710:1: ( ruleEInt )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1710:1: ( ruleEInt )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1711:1: ruleEInt
            {
             before(grammarAccess.getProcessAccess().getMax_timeEIntParserRuleCall_7_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__Process__Max_timeAssignment_73395);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getMax_timeEIntParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Process__Max_timeAssignment_7"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_8_0"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1720:1: rule__Process__ProcessElementsAssignment_8_0 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_8_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1724:1: ( ( ruleProcessElement ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1725:1: ( ruleProcessElement )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1725:1: ( ruleProcessElement )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1726:1: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_8_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_8_03426);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_8_0_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_8_0"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_8_1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1735:1: rule__Process__ProcessElementsAssignment_8_1 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1739:1: ( ( ruleProcessElement ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1740:1: ( ruleProcessElement )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1740:1: ( ruleProcessElement )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1741:1: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_8_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_8_13457);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_8_1_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_8_1"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1750:1: rule__WorkDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1754:1: ( ( ruleEString ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1755:1: ( ruleEString )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1755:1: ( ruleEString )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1756:1: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WorkDefinition__NameAssignment_13488);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkDefinition__NameAssignment_1"


    // $ANTLR start "rule__WorkDefinition__Min_timeAssignment_3"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1765:1: rule__WorkDefinition__Min_timeAssignment_3 : ( ruleEInt ) ;
    public final void rule__WorkDefinition__Min_timeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1769:1: ( ( ruleEInt ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1770:1: ( ruleEInt )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1770:1: ( ruleEInt )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1771:1: ruleEInt
            {
             before(grammarAccess.getWorkDefinitionAccess().getMin_timeEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__WorkDefinition__Min_timeAssignment_33519);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getMin_timeEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Min_timeAssignment_3"


    // $ANTLR start "rule__WorkDefinition__Max_timeAssignment_5"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1780:1: rule__WorkDefinition__Max_timeAssignment_5 : ( ruleEInt ) ;
    public final void rule__WorkDefinition__Max_timeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1784:1: ( ( ruleEInt ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1785:1: ( ruleEInt )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1785:1: ( ruleEInt )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1786:1: ruleEInt
            {
             before(grammarAccess.getWorkDefinitionAccess().getMax_timeEIntParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__WorkDefinition__Max_timeAssignment_53550);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getWorkDefinitionAccess().getMax_timeEIntParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__WorkDefinition__Max_timeAssignment_5"


    // $ANTLR start "rule__WorkSequence__LinkTypeAssignment_1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1795:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1799:1: ( ( ruleWorkSequenceType ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1800:1: ( ruleWorkSequenceType )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1800:1: ( ruleWorkSequenceType )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1801:1: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWorkSequenceType_in_rule__WorkSequence__LinkTypeAssignment_13581);
            ruleWorkSequenceType();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 

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
    // $ANTLR end "rule__WorkSequence__LinkTypeAssignment_1"


    // $ANTLR start "rule__WorkSequence__PredecessorAssignment_3"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1810:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1814:1: ( ( ( ruleEString ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1815:1: ( ( ruleEString ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1815:1: ( ( ruleEString ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1816:1: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1817:1: ( ruleEString )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1818:1: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WorkSequence__PredecessorAssignment_33616);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 

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
    // $ANTLR end "rule__WorkSequence__PredecessorAssignment_3"


    // $ANTLR start "rule__WorkSequence__SuccessorAssignment_5"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1829:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1833:1: ( ( ( ruleEString ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1834:1: ( ( ruleEString ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1834:1: ( ( ruleEString ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1835:1: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1836:1: ( ruleEString )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1837:1: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WorkSequence__SuccessorAssignment_53655);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_5_0_1()); 

            }

             after(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 

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
    // $ANTLR end "rule__WorkSequence__SuccessorAssignment_5"


    // $ANTLR start "rule__Guidance__TextAssignment_1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1848:1: rule__Guidance__TextAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1852:1: ( ( RULE_STRING ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1853:1: ( RULE_STRING )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1853:1: ( RULE_STRING )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1854:1: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment_13690); 
             after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Guidance__TextAssignment_1"


    // $ANTLR start "rule__RessourceDefinition__NameAssignment_1"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1863:1: rule__RessourceDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RessourceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1867:1: ( ( ruleEString ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1868:1: ( ruleEString )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1868:1: ( ruleEString )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1869:1: ruleEString
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RessourceDefinition__NameAssignment_13721);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRessourceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__RessourceDefinition__NameAssignment_1"


    // $ANTLR start "rule__RessourceDefinition__NumberAssignment_3"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1878:1: rule__RessourceDefinition__NumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__RessourceDefinition__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1882:1: ( ( ruleEInt ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1883:1: ( ruleEInt )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1883:1: ( ruleEInt )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1884:1: ruleEInt
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNumberEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RessourceDefinition__NumberAssignment_33752);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRessourceDefinitionAccess().getNumberEIntParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__RessourceDefinition__NumberAssignment_3"


    // $ANTLR start "rule__RessourceInstance__TypeAssignment_2"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1893:1: rule__RessourceInstance__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__RessourceInstance__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1897:1: ( ( ( ruleEString ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1898:1: ( ( ruleEString ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1898:1: ( ( ruleEString ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1899:1: ( ruleEString )
            {
             before(grammarAccess.getRessourceInstanceAccess().getTypeRessourceDefinitionCrossReference_2_0()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1900:1: ( ruleEString )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1901:1: ruleEString
            {
             before(grammarAccess.getRessourceInstanceAccess().getTypeRessourceDefinitionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RessourceInstance__TypeAssignment_23787);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRessourceInstanceAccess().getTypeRessourceDefinitionEStringParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getRessourceInstanceAccess().getTypeRessourceDefinitionCrossReference_2_0()); 

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
    // $ANTLR end "rule__RessourceInstance__TypeAssignment_2"


    // $ANTLR start "rule__RessourceInstance__ActivityAssignment_4"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1912:1: rule__RessourceInstance__ActivityAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RessourceInstance__ActivityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1916:1: ( ( ( ruleEString ) ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1917:1: ( ( ruleEString ) )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1917:1: ( ( ruleEString ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1918:1: ( ruleEString )
            {
             before(grammarAccess.getRessourceInstanceAccess().getActivityWorkDefinitionCrossReference_4_0()); 
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1919:1: ( ruleEString )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1920:1: ruleEString
            {
             before(grammarAccess.getRessourceInstanceAccess().getActivityWorkDefinitionEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RessourceInstance__ActivityAssignment_43826);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRessourceInstanceAccess().getActivityWorkDefinitionEStringParserRuleCall_4_0_1()); 

            }

             after(grammarAccess.getRessourceInstanceAccess().getActivityWorkDefinitionCrossReference_4_0()); 

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
    // $ANTLR end "rule__RessourceInstance__ActivityAssignment_4"


    // $ANTLR start "rule__RessourceInstance__InstancesAssignment_6"
    // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1931:1: rule__RessourceInstance__InstancesAssignment_6 : ( ruleEInt ) ;
    public final void rule__RessourceInstance__InstancesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1935:1: ( ( ruleEInt ) )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1936:1: ( ruleEInt )
            {
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1936:1: ( ruleEInt )
            // ../be.syntaxical.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1937:1: ruleEInt
            {
             before(grammarAccess.getRessourceInstanceAccess().getInstancesEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RessourceInstance__InstancesAssignment_63861);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getRessourceInstanceAccess().getInstancesEIntParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__RessourceInstance__InstancesAssignment_6"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleProcess_in_entryRuleProcess61 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcess68 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__0_in_ruleProcess94 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessElement_in_entryRuleProcessElement121 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleProcessElement128 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__ProcessElement__Alternatives_in_ruleProcessElement154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString181 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString188 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EString__Alternatives_in_ruleEString214 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkDefinition_in_entryRuleWorkDefinition241 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWorkDefinition248 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__0_in_ruleWorkDefinition274 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkSequence_in_entryRuleWorkSequence301 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleWorkSequence308 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__0_in_ruleWorkSequence334 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuidance_in_entryRuleGuidance361 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGuidance368 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guidance__Group__0_in_ruleGuidance394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRessourceDefinition_in_entryRuleRessourceDefinition421 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRessourceDefinition428 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__0_in_ruleRessourceDefinition454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRessourceInstance_in_entryRuleRessourceInstance481 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRessourceInstance488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__0_in_ruleRessourceInstance514 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt541 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt548 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0_in_ruleEInt574 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequenceType__Alternatives_in_ruleWorkSequenceType611 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkDefinition_in_rule__ProcessElement__Alternatives646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkSequence_in_rule__ProcessElement__Alternatives663 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleGuidance_in_rule__ProcessElement__Alternatives680 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRessourceDefinition_in_rule__ProcessElement__Alternatives697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRessourceInstance_in_rule__ProcessElement__Alternatives714 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__EString__Alternatives746 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_rule__EString__Alternatives763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rule__WorkSequenceType__Alternatives796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_12_in_rule__WorkSequenceType__Alternatives817 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_13_in_rule__WorkSequenceType__Alternatives838 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_14_in_rule__WorkSequenceType__Alternatives859 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__0__Impl_in_rule__Process__Group__0892 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_rule__Process__Group__1_in_rule__Process__Group__0895 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__1__Impl_in_rule__Process__Group__1953 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__Process__Group__2_in_rule__Process__Group__1956 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rule__Process__Group__1__Impl984 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__2__Impl_in_rule__Process__Group__21015 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_rule__Process__Group__3_in_rule__Process__Group__21018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__NameAssignment_2_in_rule__Process__Group__2__Impl1045 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__31075 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__31078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Process__Group__3__Impl1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__41137 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_rule__Process__Group__5_in_rule__Process__Group__41140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Process__Group__4__Impl1168 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__5__Impl_in_rule__Process__Group__51199 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_rule__Process__Group__6_in_rule__Process__Group__51202 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Min_timeAssignment_5_in_rule__Process__Group__5__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__6__Impl_in_rule__Process__Group__61259 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_rule__Process__Group__7_in_rule__Process__Group__61262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__Process__Group__6__Impl1290 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__7__Impl_in_rule__Process__Group__71321 = new BitSet(new long[]{0x0000000014980010L});
        public static final BitSet FOLLOW_rule__Process__Group__8_in_rule__Process__Group__71324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Max_timeAssignment_7_in_rule__Process__Group__7__Impl1351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__8__Impl_in_rule__Process__Group__81381 = new BitSet(new long[]{0x0000000014980010L});
        public static final BitSet FOLLOW_rule__Process__Group__9_in_rule__Process__Group__81384 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_8__0_in_rule__Process__Group__8__Impl1411 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__9__Impl_in_rule__Process__Group__91442 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__Process__Group__9__Impl1470 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_8__0__Impl_in_rule__Process__Group_8__01521 = new BitSet(new long[]{0x0000000014900010L});
        public static final BitSet FOLLOW_rule__Process__Group_8__1_in_rule__Process__Group_8__01524 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_8_0_in_rule__Process__Group_8__0__Impl1551 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_8__1__Impl_in_rule__Process__Group_8__11581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_8_1_in_rule__Process__Group_8__1__Impl1608 = new BitSet(new long[]{0x0000000014900012L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__01643 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__01646 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__WorkDefinition__Group__0__Impl1674 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__11705 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__2_in_rule__WorkDefinition__Group__11708 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl1735 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__2__Impl_in_rule__WorkDefinition__Group__21765 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__3_in_rule__WorkDefinition__Group__21768 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__WorkDefinition__Group__2__Impl1796 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__3__Impl_in_rule__WorkDefinition__Group__31827 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__4_in_rule__WorkDefinition__Group__31830 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Min_timeAssignment_3_in_rule__WorkDefinition__Group__3__Impl1857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__4__Impl_in_rule__WorkDefinition__Group__41887 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__5_in_rule__WorkDefinition__Group__41890 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__WorkDefinition__Group__4__Impl1918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__5__Impl_in_rule__WorkDefinition__Group__51949 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Max_timeAssignment_5_in_rule__WorkDefinition__Group__5__Impl1976 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__0__Impl_in_rule__WorkSequence__Group__02018 = new BitSet(new long[]{0x0000000000007800L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__1_in_rule__WorkSequence__Group__02021 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__WorkSequence__Group__0__Impl2049 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__1__Impl_in_rule__WorkSequence__Group__12080 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__2_in_rule__WorkSequence__Group__12083 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__LinkTypeAssignment_1_in_rule__WorkSequence__Group__1__Impl2110 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__2__Impl_in_rule__WorkSequence__Group__22140 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__3_in_rule__WorkSequence__Group__22143 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__WorkSequence__Group__2__Impl2171 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__3__Impl_in_rule__WorkSequence__Group__32202 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__4_in_rule__WorkSequence__Group__32205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__PredecessorAssignment_3_in_rule__WorkSequence__Group__3__Impl2232 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__4__Impl_in_rule__WorkSequence__Group__42262 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__5_in_rule__WorkSequence__Group__42265 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__WorkSequence__Group__4__Impl2293 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__5__Impl_in_rule__WorkSequence__Group__52324 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__SuccessorAssignment_5_in_rule__WorkSequence__Group__5__Impl2351 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02393 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02396 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12454 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guidance__TextAssignment_1_in_rule__Guidance__Group__1__Impl2481 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__0__Impl_in_rule__RessourceDefinition__Group__02515 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__1_in_rule__RessourceDefinition__Group__02518 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__RessourceDefinition__Group__0__Impl2546 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__1__Impl_in_rule__RessourceDefinition__Group__12577 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__2_in_rule__RessourceDefinition__Group__12580 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__NameAssignment_1_in_rule__RessourceDefinition__Group__1__Impl2607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__2__Impl_in_rule__RessourceDefinition__Group__22637 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__3_in_rule__RessourceDefinition__Group__22640 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RessourceDefinition__Group__2__Impl2668 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__3__Impl_in_rule__RessourceDefinition__Group__32699 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__NumberAssignment_3_in_rule__RessourceDefinition__Group__3__Impl2726 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__0__Impl_in_rule__RessourceInstance__Group__02764 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__1_in_rule__RessourceInstance__Group__02767 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__RessourceInstance__Group__0__Impl2795 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__1__Impl_in_rule__RessourceInstance__Group__12826 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__2_in_rule__RessourceInstance__Group__12829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__RessourceInstance__Group__1__Impl2857 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__2__Impl_in_rule__RessourceInstance__Group__22888 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__3_in_rule__RessourceInstance__Group__22891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__TypeAssignment_2_in_rule__RessourceInstance__Group__2__Impl2918 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__3__Impl_in_rule__RessourceInstance__Group__32948 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__4_in_rule__RessourceInstance__Group__32951 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RessourceInstance__Group__3__Impl2979 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__4__Impl_in_rule__RessourceInstance__Group__43010 = new BitSet(new long[]{0x0000000080000000L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__5_in_rule__RessourceInstance__Group__43013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__ActivityAssignment_4_in_rule__RessourceInstance__Group__4__Impl3040 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__5__Impl_in_rule__RessourceInstance__Group__53070 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__6_in_rule__RessourceInstance__Group__53073 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__RessourceInstance__Group__5__Impl3101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__6__Impl_in_rule__RessourceInstance__Group__63132 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__InstancesAssignment_6_in_rule__RessourceInstance__Group__6__Impl3159 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03203 = new BitSet(new long[]{0x0000000100000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03206 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rule__EInt__Group__0__Impl3235 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13268 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3295 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Process__NameAssignment_23333 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Process__Min_timeAssignment_53364 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__Process__Max_timeAssignment_73395 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_8_03426 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_8_13457 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WorkDefinition__NameAssignment_13488 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__WorkDefinition__Min_timeAssignment_33519 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__WorkDefinition__Max_timeAssignment_53550 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkSequenceType_in_rule__WorkSequence__LinkTypeAssignment_13581 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WorkSequence__PredecessorAssignment_33616 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WorkSequence__SuccessorAssignment_53655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment_13690 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RessourceDefinition__NameAssignment_13721 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RessourceDefinition__NumberAssignment_33752 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RessourceInstance__TypeAssignment_23787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RessourceInstance__ActivityAssignment_43826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RessourceInstance__InstancesAssignment_63861 = new BitSet(new long[]{0x0000000000000002L});
    }


}