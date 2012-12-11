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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'s2s'", "'s2f'", "'f2s'", "'f2f'", "'process'", "'{'", "'}'", "'wd'", "'min'", "'max'", "'ws'", "'from'", "'to'", "'--'", "'rd'", "'number'", "'ri'", "'type'", "'activity'", "'instances'", "'-'"
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
    public String getGrammarFileName() { return "../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g"; }


     
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:60:1: entryRuleProcess : ruleProcess EOF ;
    public final void entryRuleProcess() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:61:1: ( ruleProcess EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:62:1: ruleProcess EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:69:1: ruleProcess : ( ( rule__Process__Group__0 ) ) ;
    public final void ruleProcess() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:73:2: ( ( ( rule__Process__Group__0 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:74:1: ( ( rule__Process__Group__0 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:74:1: ( ( rule__Process__Group__0 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:75:1: ( rule__Process__Group__0 )
            {
             before(grammarAccess.getProcessAccess().getGroup()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:76:1: ( rule__Process__Group__0 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:76:2: rule__Process__Group__0
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:88:1: entryRuleProcessElement : ruleProcessElement EOF ;
    public final void entryRuleProcessElement() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:89:1: ( ruleProcessElement EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:90:1: ruleProcessElement EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:97:1: ruleProcessElement : ( ( rule__ProcessElement__Alternatives ) ) ;
    public final void ruleProcessElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:101:2: ( ( ( rule__ProcessElement__Alternatives ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:102:1: ( ( rule__ProcessElement__Alternatives ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:103:1: ( rule__ProcessElement__Alternatives )
            {
             before(grammarAccess.getProcessElementAccess().getAlternatives()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:104:1: ( rule__ProcessElement__Alternatives )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:104:2: rule__ProcessElement__Alternatives
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:116:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:117:1: ( ruleEString EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:118:1: ruleEString EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:125:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:129:2: ( ( ( rule__EString__Alternatives ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:130:1: ( ( rule__EString__Alternatives ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:130:1: ( ( rule__EString__Alternatives ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:131:1: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:132:1: ( rule__EString__Alternatives )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:132:2: rule__EString__Alternatives
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:144:1: entryRuleWorkDefinition : ruleWorkDefinition EOF ;
    public final void entryRuleWorkDefinition() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:145:1: ( ruleWorkDefinition EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:146:1: ruleWorkDefinition EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:153:1: ruleWorkDefinition : ( ( rule__WorkDefinition__Group__0 ) ) ;
    public final void ruleWorkDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:157:2: ( ( ( rule__WorkDefinition__Group__0 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:158:1: ( ( rule__WorkDefinition__Group__0 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:158:1: ( ( rule__WorkDefinition__Group__0 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:159:1: ( rule__WorkDefinition__Group__0 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getGroup()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:160:1: ( rule__WorkDefinition__Group__0 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:160:2: rule__WorkDefinition__Group__0
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:172:1: entryRuleWorkSequence : ruleWorkSequence EOF ;
    public final void entryRuleWorkSequence() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:173:1: ( ruleWorkSequence EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:174:1: ruleWorkSequence EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:181:1: ruleWorkSequence : ( ( rule__WorkSequence__Group__0 ) ) ;
    public final void ruleWorkSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:185:2: ( ( ( rule__WorkSequence__Group__0 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:186:1: ( ( rule__WorkSequence__Group__0 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:186:1: ( ( rule__WorkSequence__Group__0 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:187:1: ( rule__WorkSequence__Group__0 )
            {
             before(grammarAccess.getWorkSequenceAccess().getGroup()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:188:1: ( rule__WorkSequence__Group__0 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:188:2: rule__WorkSequence__Group__0
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:200:1: entryRuleGuidance : ruleGuidance EOF ;
    public final void entryRuleGuidance() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:201:1: ( ruleGuidance EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:202:1: ruleGuidance EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:209:1: ruleGuidance : ( ( rule__Guidance__Group__0 ) ) ;
    public final void ruleGuidance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:213:2: ( ( ( rule__Guidance__Group__0 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:214:1: ( ( rule__Guidance__Group__0 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:214:1: ( ( rule__Guidance__Group__0 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:215:1: ( rule__Guidance__Group__0 )
            {
             before(grammarAccess.getGuidanceAccess().getGroup()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:216:1: ( rule__Guidance__Group__0 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:216:2: rule__Guidance__Group__0
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:228:1: entryRuleRessourceDefinition : ruleRessourceDefinition EOF ;
    public final void entryRuleRessourceDefinition() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:229:1: ( ruleRessourceDefinition EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:230:1: ruleRessourceDefinition EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:237:1: ruleRessourceDefinition : ( ( rule__RessourceDefinition__Group__0 ) ) ;
    public final void ruleRessourceDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:241:2: ( ( ( rule__RessourceDefinition__Group__0 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:242:1: ( ( rule__RessourceDefinition__Group__0 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:242:1: ( ( rule__RessourceDefinition__Group__0 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:243:1: ( rule__RessourceDefinition__Group__0 )
            {
             before(grammarAccess.getRessourceDefinitionAccess().getGroup()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:244:1: ( rule__RessourceDefinition__Group__0 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:244:2: rule__RessourceDefinition__Group__0
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:256:1: entryRuleRessourceInstance : ruleRessourceInstance EOF ;
    public final void entryRuleRessourceInstance() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:257:1: ( ruleRessourceInstance EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:258:1: ruleRessourceInstance EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:265:1: ruleRessourceInstance : ( ( rule__RessourceInstance__Group__0 ) ) ;
    public final void ruleRessourceInstance() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:269:2: ( ( ( rule__RessourceInstance__Group__0 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:270:1: ( ( rule__RessourceInstance__Group__0 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:270:1: ( ( rule__RessourceInstance__Group__0 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:271:1: ( rule__RessourceInstance__Group__0 )
            {
             before(grammarAccess.getRessourceInstanceAccess().getGroup()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:272:1: ( rule__RessourceInstance__Group__0 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:272:2: rule__RessourceInstance__Group__0
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:284:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:285:1: ( ruleEInt EOF )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:286:1: ruleEInt EOF
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:293:1: ruleEInt : ( ( rule__EInt__Group__0 ) ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:297:2: ( ( ( rule__EInt__Group__0 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:298:1: ( ( rule__EInt__Group__0 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:298:1: ( ( rule__EInt__Group__0 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:299:1: ( rule__EInt__Group__0 )
            {
             before(grammarAccess.getEIntAccess().getGroup()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:300:1: ( rule__EInt__Group__0 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:300:2: rule__EInt__Group__0
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:313:1: ruleWorkSequenceType : ( ( rule__WorkSequenceType__Alternatives ) ) ;
    public final void ruleWorkSequenceType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:317:1: ( ( ( rule__WorkSequenceType__Alternatives ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:318:1: ( ( rule__WorkSequenceType__Alternatives ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:318:1: ( ( rule__WorkSequenceType__Alternatives ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:319:1: ( rule__WorkSequenceType__Alternatives )
            {
             before(grammarAccess.getWorkSequenceTypeAccess().getAlternatives()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:320:1: ( rule__WorkSequenceType__Alternatives )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:320:2: rule__WorkSequenceType__Alternatives
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:331:1: rule__ProcessElement__Alternatives : ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessourceDefinition ) | ( ruleRessourceInstance ) );
    public final void rule__ProcessElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:335:1: ( ( ruleWorkDefinition ) | ( ruleWorkSequence ) | ( ruleGuidance ) | ( ruleRessourceDefinition ) | ( ruleRessourceInstance ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt1=1;
                }
                break;
            case 21:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            case 25:
                {
                alt1=4;
                }
                break;
            case 27:
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
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:336:1: ( ruleWorkDefinition )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:336:1: ( ruleWorkDefinition )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:337:1: ruleWorkDefinition
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
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:342:6: ( ruleWorkSequence )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:342:6: ( ruleWorkSequence )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:343:1: ruleWorkSequence
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
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:348:6: ( ruleGuidance )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:348:6: ( ruleGuidance )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:349:1: ruleGuidance
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
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:354:6: ( ruleRessourceDefinition )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:354:6: ( ruleRessourceDefinition )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:355:1: ruleRessourceDefinition
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
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:360:6: ( ruleRessourceInstance )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:360:6: ( ruleRessourceInstance )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:361:1: ruleRessourceInstance
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:371:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:375:1: ( ( RULE_STRING ) | ( RULE_ID ) )
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
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:376:1: ( RULE_STRING )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:376:1: ( RULE_STRING )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:377:1: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__EString__Alternatives746); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:382:6: ( RULE_ID )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:382:6: ( RULE_ID )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:383:1: RULE_ID
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:393:1: rule__WorkSequenceType__Alternatives : ( ( ( 's2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2s' ) ) | ( ( 'f2f' ) ) );
    public final void rule__WorkSequenceType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:397:1: ( ( ( 's2s' ) ) | ( ( 's2f' ) ) | ( ( 'f2s' ) ) | ( ( 'f2f' ) ) )
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
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:398:1: ( ( 's2s' ) )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:398:1: ( ( 's2s' ) )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:399:1: ( 's2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:400:1: ( 's2s' )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:400:3: 's2s'
                    {
                    match(input,11,FollowSets000.FOLLOW_11_in_rule__WorkSequenceType__Alternatives796); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToStartEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:405:6: ( ( 's2f' ) )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:405:6: ( ( 's2f' ) )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:406:1: ( 's2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_1()); 
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:407:1: ( 's2f' )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:407:3: 's2f'
                    {
                    match(input,12,FollowSets000.FOLLOW_12_in_rule__WorkSequenceType__Alternatives817); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getStartToFinishEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:412:6: ( ( 'f2s' ) )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:412:6: ( ( 'f2s' ) )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:413:1: ( 'f2s' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_2()); 
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:414:1: ( 'f2s' )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:414:3: 'f2s'
                    {
                    match(input,13,FollowSets000.FOLLOW_13_in_rule__WorkSequenceType__Alternatives838); 

                    }

                     after(grammarAccess.getWorkSequenceTypeAccess().getFinishToStartEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:419:6: ( ( 'f2f' ) )
                    {
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:419:6: ( ( 'f2f' ) )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:420:1: ( 'f2f' )
                    {
                     before(grammarAccess.getWorkSequenceTypeAccess().getFinishToFinishEnumLiteralDeclaration_3()); 
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:421:1: ( 'f2f' )
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:421:3: 'f2f'
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:433:1: rule__Process__Group__0 : rule__Process__Group__0__Impl rule__Process__Group__1 ;
    public final void rule__Process__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:437:1: ( rule__Process__Group__0__Impl rule__Process__Group__1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:438:2: rule__Process__Group__0__Impl rule__Process__Group__1
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:445:1: rule__Process__Group__0__Impl : ( () ) ;
    public final void rule__Process__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:449:1: ( ( () ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:450:1: ( () )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:450:1: ( () )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:451:1: ()
            {
             before(grammarAccess.getProcessAccess().getProcessAction_0()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:452:1: ()
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:454:1: 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:464:1: rule__Process__Group__1 : rule__Process__Group__1__Impl rule__Process__Group__2 ;
    public final void rule__Process__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:468:1: ( rule__Process__Group__1__Impl rule__Process__Group__2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:469:2: rule__Process__Group__1__Impl rule__Process__Group__2
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:476:1: rule__Process__Group__1__Impl : ( 'process' ) ;
    public final void rule__Process__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:480:1: ( ( 'process' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:481:1: ( 'process' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:481:1: ( 'process' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:482:1: 'process'
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:495:1: rule__Process__Group__2 : rule__Process__Group__2__Impl rule__Process__Group__3 ;
    public final void rule__Process__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:499:1: ( rule__Process__Group__2__Impl rule__Process__Group__3 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:500:2: rule__Process__Group__2__Impl rule__Process__Group__3
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:507:1: rule__Process__Group__2__Impl : ( ( rule__Process__NameAssignment_2 ) ) ;
    public final void rule__Process__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:511:1: ( ( ( rule__Process__NameAssignment_2 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:512:1: ( ( rule__Process__NameAssignment_2 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:512:1: ( ( rule__Process__NameAssignment_2 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:513:1: ( rule__Process__NameAssignment_2 )
            {
             before(grammarAccess.getProcessAccess().getNameAssignment_2()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:514:1: ( rule__Process__NameAssignment_2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:514:2: rule__Process__NameAssignment_2
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:524:1: rule__Process__Group__3 : rule__Process__Group__3__Impl rule__Process__Group__4 ;
    public final void rule__Process__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:528:1: ( rule__Process__Group__3__Impl rule__Process__Group__4 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:529:2: rule__Process__Group__3__Impl rule__Process__Group__4
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:536:1: rule__Process__Group__3__Impl : ( '{' ) ;
    public final void rule__Process__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:540:1: ( ( '{' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:541:1: ( '{' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:541:1: ( '{' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:542:1: '{'
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:555:1: rule__Process__Group__4 : rule__Process__Group__4__Impl rule__Process__Group__5 ;
    public final void rule__Process__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:559:1: ( rule__Process__Group__4__Impl rule__Process__Group__5 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:560:2: rule__Process__Group__4__Impl rule__Process__Group__5
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:567:1: rule__Process__Group__4__Impl : ( ( rule__Process__Group_4__0 )? ) ;
    public final void rule__Process__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:571:1: ( ( ( rule__Process__Group_4__0 )? ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:572:1: ( ( rule__Process__Group_4__0 )? )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:572:1: ( ( rule__Process__Group_4__0 )? )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:573:1: ( rule__Process__Group_4__0 )?
            {
             before(grammarAccess.getProcessAccess().getGroup_4()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:574:1: ( rule__Process__Group_4__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18||LA4_0==21||(LA4_0>=24 && LA4_0<=25)||LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:574:2: rule__Process__Group_4__0
                    {
                    pushFollow(FollowSets000.FOLLOW_rule__Process__Group_4__0_in_rule__Process__Group__4__Impl1167);
                    rule__Process__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getProcessAccess().getGroup_4()); 

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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:584:1: rule__Process__Group__5 : rule__Process__Group__5__Impl ;
    public final void rule__Process__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:588:1: ( rule__Process__Group__5__Impl )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:589:2: rule__Process__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group__5__Impl_in_rule__Process__Group__51198);
            rule__Process__Group__5__Impl();

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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:595:1: rule__Process__Group__5__Impl : ( '}' ) ;
    public final void rule__Process__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:599:1: ( ( '}' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:600:1: ( '}' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:600:1: ( '}' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:601:1: '}'
            {
             before(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FollowSets000.FOLLOW_17_in_rule__Process__Group__5__Impl1226); 
             after(grammarAccess.getProcessAccess().getRightCurlyBracketKeyword_5()); 

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


    // $ANTLR start "rule__Process__Group_4__0"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:626:1: rule__Process__Group_4__0 : rule__Process__Group_4__0__Impl rule__Process__Group_4__1 ;
    public final void rule__Process__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:630:1: ( rule__Process__Group_4__0__Impl rule__Process__Group_4__1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:631:2: rule__Process__Group_4__0__Impl rule__Process__Group_4__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_4__0__Impl_in_rule__Process__Group_4__01269);
            rule__Process__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_4__1_in_rule__Process__Group_4__01272);
            rule__Process__Group_4__1();

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
    // $ANTLR end "rule__Process__Group_4__0"


    // $ANTLR start "rule__Process__Group_4__0__Impl"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:638:1: rule__Process__Group_4__0__Impl : ( ( rule__Process__ProcessElementsAssignment_4_0 ) ) ;
    public final void rule__Process__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:642:1: ( ( ( rule__Process__ProcessElementsAssignment_4_0 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:643:1: ( ( rule__Process__ProcessElementsAssignment_4_0 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:643:1: ( ( rule__Process__ProcessElementsAssignment_4_0 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:644:1: ( rule__Process__ProcessElementsAssignment_4_0 )
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_0()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:645:1: ( rule__Process__ProcessElementsAssignment_4_0 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:645:2: rule__Process__ProcessElementsAssignment_4_0
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__ProcessElementsAssignment_4_0_in_rule__Process__Group_4__0__Impl1299);
            rule__Process__ProcessElementsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_0()); 

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
    // $ANTLR end "rule__Process__Group_4__0__Impl"


    // $ANTLR start "rule__Process__Group_4__1"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:655:1: rule__Process__Group_4__1 : rule__Process__Group_4__1__Impl ;
    public final void rule__Process__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:659:1: ( rule__Process__Group_4__1__Impl )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:660:2: rule__Process__Group_4__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Process__Group_4__1__Impl_in_rule__Process__Group_4__11329);
            rule__Process__Group_4__1__Impl();

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
    // $ANTLR end "rule__Process__Group_4__1"


    // $ANTLR start "rule__Process__Group_4__1__Impl"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:666:1: rule__Process__Group_4__1__Impl : ( ( rule__Process__ProcessElementsAssignment_4_1 )* ) ;
    public final void rule__Process__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:670:1: ( ( ( rule__Process__ProcessElementsAssignment_4_1 )* ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:671:1: ( ( rule__Process__ProcessElementsAssignment_4_1 )* )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:671:1: ( ( rule__Process__ProcessElementsAssignment_4_1 )* )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:672:1: ( rule__Process__ProcessElementsAssignment_4_1 )*
            {
             before(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_1()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:673:1: ( rule__Process__ProcessElementsAssignment_4_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==18||LA5_0==21||(LA5_0>=24 && LA5_0<=25)||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:673:2: rule__Process__ProcessElementsAssignment_4_1
            	    {
            	    pushFollow(FollowSets000.FOLLOW_rule__Process__ProcessElementsAssignment_4_1_in_rule__Process__Group_4__1__Impl1356);
            	    rule__Process__ProcessElementsAssignment_4_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getProcessAccess().getProcessElementsAssignment_4_1()); 

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
    // $ANTLR end "rule__Process__Group_4__1__Impl"


    // $ANTLR start "rule__WorkDefinition__Group__0"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:687:1: rule__WorkDefinition__Group__0 : rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 ;
    public final void rule__WorkDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:691:1: ( rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:692:2: rule__WorkDefinition__Group__0__Impl rule__WorkDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__01391);
            rule__WorkDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__01394);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:699:1: rule__WorkDefinition__Group__0__Impl : ( 'wd' ) ;
    public final void rule__WorkDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:703:1: ( ( 'wd' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:704:1: ( 'wd' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:704:1: ( 'wd' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:705:1: 'wd'
            {
             before(grammarAccess.getWorkDefinitionAccess().getWdKeyword_0()); 
            match(input,18,FollowSets000.FOLLOW_18_in_rule__WorkDefinition__Group__0__Impl1422); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:718:1: rule__WorkDefinition__Group__1 : rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 ;
    public final void rule__WorkDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:722:1: ( rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:723:2: rule__WorkDefinition__Group__1__Impl rule__WorkDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__11453);
            rule__WorkDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__2_in_rule__WorkDefinition__Group__11456);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:730:1: rule__WorkDefinition__Group__1__Impl : ( ( rule__WorkDefinition__NameAssignment_1 ) ) ;
    public final void rule__WorkDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:734:1: ( ( ( rule__WorkDefinition__NameAssignment_1 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:735:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:735:1: ( ( rule__WorkDefinition__NameAssignment_1 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:736:1: ( rule__WorkDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameAssignment_1()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:737:1: ( rule__WorkDefinition__NameAssignment_1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:737:2: rule__WorkDefinition__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl1483);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:747:1: rule__WorkDefinition__Group__2 : rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 ;
    public final void rule__WorkDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:751:1: ( rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:752:2: rule__WorkDefinition__Group__2__Impl rule__WorkDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__2__Impl_in_rule__WorkDefinition__Group__21513);
            rule__WorkDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__3_in_rule__WorkDefinition__Group__21516);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:759:1: rule__WorkDefinition__Group__2__Impl : ( 'min' ) ;
    public final void rule__WorkDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:763:1: ( ( 'min' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:764:1: ( 'min' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:764:1: ( 'min' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:765:1: 'min'
            {
             before(grammarAccess.getWorkDefinitionAccess().getMinKeyword_2()); 
            match(input,19,FollowSets000.FOLLOW_19_in_rule__WorkDefinition__Group__2__Impl1544); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:778:1: rule__WorkDefinition__Group__3 : rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 ;
    public final void rule__WorkDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:782:1: ( rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:783:2: rule__WorkDefinition__Group__3__Impl rule__WorkDefinition__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__3__Impl_in_rule__WorkDefinition__Group__31575);
            rule__WorkDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__4_in_rule__WorkDefinition__Group__31578);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:790:1: rule__WorkDefinition__Group__3__Impl : ( ( rule__WorkDefinition__Min_timeAssignment_3 ) ) ;
    public final void rule__WorkDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:794:1: ( ( ( rule__WorkDefinition__Min_timeAssignment_3 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:795:1: ( ( rule__WorkDefinition__Min_timeAssignment_3 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:795:1: ( ( rule__WorkDefinition__Min_timeAssignment_3 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:796:1: ( rule__WorkDefinition__Min_timeAssignment_3 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getMin_timeAssignment_3()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:797:1: ( rule__WorkDefinition__Min_timeAssignment_3 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:797:2: rule__WorkDefinition__Min_timeAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Min_timeAssignment_3_in_rule__WorkDefinition__Group__3__Impl1605);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:807:1: rule__WorkDefinition__Group__4 : rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 ;
    public final void rule__WorkDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:811:1: ( rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:812:2: rule__WorkDefinition__Group__4__Impl rule__WorkDefinition__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__4__Impl_in_rule__WorkDefinition__Group__41635);
            rule__WorkDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__5_in_rule__WorkDefinition__Group__41638);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:819:1: rule__WorkDefinition__Group__4__Impl : ( 'max' ) ;
    public final void rule__WorkDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:823:1: ( ( 'max' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:824:1: ( 'max' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:824:1: ( 'max' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:825:1: 'max'
            {
             before(grammarAccess.getWorkDefinitionAccess().getMaxKeyword_4()); 
            match(input,20,FollowSets000.FOLLOW_20_in_rule__WorkDefinition__Group__4__Impl1666); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:838:1: rule__WorkDefinition__Group__5 : rule__WorkDefinition__Group__5__Impl ;
    public final void rule__WorkDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:842:1: ( rule__WorkDefinition__Group__5__Impl )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:843:2: rule__WorkDefinition__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Group__5__Impl_in_rule__WorkDefinition__Group__51697);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:849:1: rule__WorkDefinition__Group__5__Impl : ( ( rule__WorkDefinition__Max_timeAssignment_5 ) ) ;
    public final void rule__WorkDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:853:1: ( ( ( rule__WorkDefinition__Max_timeAssignment_5 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:854:1: ( ( rule__WorkDefinition__Max_timeAssignment_5 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:854:1: ( ( rule__WorkDefinition__Max_timeAssignment_5 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:855:1: ( rule__WorkDefinition__Max_timeAssignment_5 )
            {
             before(grammarAccess.getWorkDefinitionAccess().getMax_timeAssignment_5()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:856:1: ( rule__WorkDefinition__Max_timeAssignment_5 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:856:2: rule__WorkDefinition__Max_timeAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkDefinition__Max_timeAssignment_5_in_rule__WorkDefinition__Group__5__Impl1724);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:878:1: rule__WorkSequence__Group__0 : rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 ;
    public final void rule__WorkSequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:882:1: ( rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:883:2: rule__WorkSequence__Group__0__Impl rule__WorkSequence__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__0__Impl_in_rule__WorkSequence__Group__01766);
            rule__WorkSequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__1_in_rule__WorkSequence__Group__01769);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:890:1: rule__WorkSequence__Group__0__Impl : ( 'ws' ) ;
    public final void rule__WorkSequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:894:1: ( ( 'ws' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:895:1: ( 'ws' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:895:1: ( 'ws' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:896:1: 'ws'
            {
             before(grammarAccess.getWorkSequenceAccess().getWsKeyword_0()); 
            match(input,21,FollowSets000.FOLLOW_21_in_rule__WorkSequence__Group__0__Impl1797); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:909:1: rule__WorkSequence__Group__1 : rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 ;
    public final void rule__WorkSequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:913:1: ( rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:914:2: rule__WorkSequence__Group__1__Impl rule__WorkSequence__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__1__Impl_in_rule__WorkSequence__Group__11828);
            rule__WorkSequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__2_in_rule__WorkSequence__Group__11831);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:921:1: rule__WorkSequence__Group__1__Impl : ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) ;
    public final void rule__WorkSequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:925:1: ( ( ( rule__WorkSequence__LinkTypeAssignment_1 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:926:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:926:1: ( ( rule__WorkSequence__LinkTypeAssignment_1 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:927:1: ( rule__WorkSequence__LinkTypeAssignment_1 )
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeAssignment_1()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:928:1: ( rule__WorkSequence__LinkTypeAssignment_1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:928:2: rule__WorkSequence__LinkTypeAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__LinkTypeAssignment_1_in_rule__WorkSequence__Group__1__Impl1858);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:938:1: rule__WorkSequence__Group__2 : rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 ;
    public final void rule__WorkSequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:942:1: ( rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:943:2: rule__WorkSequence__Group__2__Impl rule__WorkSequence__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__2__Impl_in_rule__WorkSequence__Group__21888);
            rule__WorkSequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__3_in_rule__WorkSequence__Group__21891);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:950:1: rule__WorkSequence__Group__2__Impl : ( 'from' ) ;
    public final void rule__WorkSequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:954:1: ( ( 'from' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:955:1: ( 'from' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:955:1: ( 'from' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:956:1: 'from'
            {
             before(grammarAccess.getWorkSequenceAccess().getFromKeyword_2()); 
            match(input,22,FollowSets000.FOLLOW_22_in_rule__WorkSequence__Group__2__Impl1919); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:969:1: rule__WorkSequence__Group__3 : rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 ;
    public final void rule__WorkSequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:973:1: ( rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:974:2: rule__WorkSequence__Group__3__Impl rule__WorkSequence__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__3__Impl_in_rule__WorkSequence__Group__31950);
            rule__WorkSequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__4_in_rule__WorkSequence__Group__31953);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:981:1: rule__WorkSequence__Group__3__Impl : ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) ;
    public final void rule__WorkSequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:985:1: ( ( ( rule__WorkSequence__PredecessorAssignment_3 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:986:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:986:1: ( ( rule__WorkSequence__PredecessorAssignment_3 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:987:1: ( rule__WorkSequence__PredecessorAssignment_3 )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorAssignment_3()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:988:1: ( rule__WorkSequence__PredecessorAssignment_3 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:988:2: rule__WorkSequence__PredecessorAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__PredecessorAssignment_3_in_rule__WorkSequence__Group__3__Impl1980);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:998:1: rule__WorkSequence__Group__4 : rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 ;
    public final void rule__WorkSequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1002:1: ( rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1003:2: rule__WorkSequence__Group__4__Impl rule__WorkSequence__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__4__Impl_in_rule__WorkSequence__Group__42010);
            rule__WorkSequence__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__5_in_rule__WorkSequence__Group__42013);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1010:1: rule__WorkSequence__Group__4__Impl : ( 'to' ) ;
    public final void rule__WorkSequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1014:1: ( ( 'to' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1015:1: ( 'to' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1015:1: ( 'to' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1016:1: 'to'
            {
             before(grammarAccess.getWorkSequenceAccess().getToKeyword_4()); 
            match(input,23,FollowSets000.FOLLOW_23_in_rule__WorkSequence__Group__4__Impl2041); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1029:1: rule__WorkSequence__Group__5 : rule__WorkSequence__Group__5__Impl ;
    public final void rule__WorkSequence__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1033:1: ( rule__WorkSequence__Group__5__Impl )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1034:2: rule__WorkSequence__Group__5__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__Group__5__Impl_in_rule__WorkSequence__Group__52072);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1040:1: rule__WorkSequence__Group__5__Impl : ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) ;
    public final void rule__WorkSequence__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1044:1: ( ( ( rule__WorkSequence__SuccessorAssignment_5 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1045:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1045:1: ( ( rule__WorkSequence__SuccessorAssignment_5 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1046:1: ( rule__WorkSequence__SuccessorAssignment_5 )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorAssignment_5()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1047:1: ( rule__WorkSequence__SuccessorAssignment_5 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1047:2: rule__WorkSequence__SuccessorAssignment_5
            {
            pushFollow(FollowSets000.FOLLOW_rule__WorkSequence__SuccessorAssignment_5_in_rule__WorkSequence__Group__5__Impl2099);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1069:1: rule__Guidance__Group__0 : rule__Guidance__Group__0__Impl rule__Guidance__Group__1 ;
    public final void rule__Guidance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1073:1: ( rule__Guidance__Group__0__Impl rule__Guidance__Group__1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1074:2: rule__Guidance__Group__0__Impl rule__Guidance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02141);
            rule__Guidance__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02144);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1081:1: rule__Guidance__Group__0__Impl : ( () ) ;
    public final void rule__Guidance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1085:1: ( ( () ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1086:1: ( () )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1086:1: ( () )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1087:1: ()
            {
             before(grammarAccess.getGuidanceAccess().getGuidanceAction_0()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1088:1: ()
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1090:1: 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1100:1: rule__Guidance__Group__1 : rule__Guidance__Group__1__Impl rule__Guidance__Group__2 ;
    public final void rule__Guidance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1104:1: ( rule__Guidance__Group__1__Impl rule__Guidance__Group__2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1105:2: rule__Guidance__Group__1__Impl rule__Guidance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12202);
            rule__Guidance__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__12205);
            rule__Guidance__Group__2();

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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1112:1: rule__Guidance__Group__1__Impl : ( '--' ) ;
    public final void rule__Guidance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1116:1: ( ( '--' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1117:1: ( '--' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1117:1: ( '--' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1118:1: '--'
            {
             before(grammarAccess.getGuidanceAccess().getHyphenMinusHyphenMinusKeyword_1()); 
            match(input,24,FollowSets000.FOLLOW_24_in_rule__Guidance__Group__1__Impl2233); 
             after(grammarAccess.getGuidanceAccess().getHyphenMinusHyphenMinusKeyword_1()); 

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


    // $ANTLR start "rule__Guidance__Group__2"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1131:1: rule__Guidance__Group__2 : rule__Guidance__Group__2__Impl ;
    public final void rule__Guidance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1135:1: ( rule__Guidance__Group__2__Impl )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1136:2: rule__Guidance__Group__2__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__22264);
            rule__Guidance__Group__2__Impl();

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
    // $ANTLR end "rule__Guidance__Group__2"


    // $ANTLR start "rule__Guidance__Group__2__Impl"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1142:1: rule__Guidance__Group__2__Impl : ( ( rule__Guidance__TextAssignment_2 ) ) ;
    public final void rule__Guidance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1146:1: ( ( ( rule__Guidance__TextAssignment_2 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1147:1: ( ( rule__Guidance__TextAssignment_2 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1147:1: ( ( rule__Guidance__TextAssignment_2 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1148:1: ( rule__Guidance__TextAssignment_2 )
            {
             before(grammarAccess.getGuidanceAccess().getTextAssignment_2()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1149:1: ( rule__Guidance__TextAssignment_2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1149:2: rule__Guidance__TextAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__Guidance__TextAssignment_2_in_rule__Guidance__Group__2__Impl2291);
            rule__Guidance__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGuidanceAccess().getTextAssignment_2()); 

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
    // $ANTLR end "rule__Guidance__Group__2__Impl"


    // $ANTLR start "rule__RessourceDefinition__Group__0"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1165:1: rule__RessourceDefinition__Group__0 : rule__RessourceDefinition__Group__0__Impl rule__RessourceDefinition__Group__1 ;
    public final void rule__RessourceDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1169:1: ( rule__RessourceDefinition__Group__0__Impl rule__RessourceDefinition__Group__1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1170:2: rule__RessourceDefinition__Group__0__Impl rule__RessourceDefinition__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__0__Impl_in_rule__RessourceDefinition__Group__02327);
            rule__RessourceDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__1_in_rule__RessourceDefinition__Group__02330);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1177:1: rule__RessourceDefinition__Group__0__Impl : ( 'rd' ) ;
    public final void rule__RessourceDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1181:1: ( ( 'rd' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1182:1: ( 'rd' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1182:1: ( 'rd' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1183:1: 'rd'
            {
             before(grammarAccess.getRessourceDefinitionAccess().getRdKeyword_0()); 
            match(input,25,FollowSets000.FOLLOW_25_in_rule__RessourceDefinition__Group__0__Impl2358); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1196:1: rule__RessourceDefinition__Group__1 : rule__RessourceDefinition__Group__1__Impl rule__RessourceDefinition__Group__2 ;
    public final void rule__RessourceDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1200:1: ( rule__RessourceDefinition__Group__1__Impl rule__RessourceDefinition__Group__2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1201:2: rule__RessourceDefinition__Group__1__Impl rule__RessourceDefinition__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__1__Impl_in_rule__RessourceDefinition__Group__12389);
            rule__RessourceDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__2_in_rule__RessourceDefinition__Group__12392);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1208:1: rule__RessourceDefinition__Group__1__Impl : ( ( rule__RessourceDefinition__NameAssignment_1 ) ) ;
    public final void rule__RessourceDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1212:1: ( ( ( rule__RessourceDefinition__NameAssignment_1 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1213:1: ( ( rule__RessourceDefinition__NameAssignment_1 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1213:1: ( ( rule__RessourceDefinition__NameAssignment_1 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1214:1: ( rule__RessourceDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNameAssignment_1()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1215:1: ( rule__RessourceDefinition__NameAssignment_1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1215:2: rule__RessourceDefinition__NameAssignment_1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__NameAssignment_1_in_rule__RessourceDefinition__Group__1__Impl2419);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1225:1: rule__RessourceDefinition__Group__2 : rule__RessourceDefinition__Group__2__Impl rule__RessourceDefinition__Group__3 ;
    public final void rule__RessourceDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1229:1: ( rule__RessourceDefinition__Group__2__Impl rule__RessourceDefinition__Group__3 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1230:2: rule__RessourceDefinition__Group__2__Impl rule__RessourceDefinition__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__2__Impl_in_rule__RessourceDefinition__Group__22449);
            rule__RessourceDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__3_in_rule__RessourceDefinition__Group__22452);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1237:1: rule__RessourceDefinition__Group__2__Impl : ( 'number' ) ;
    public final void rule__RessourceDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1241:1: ( ( 'number' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1242:1: ( 'number' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1242:1: ( 'number' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1243:1: 'number'
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNumberKeyword_2()); 
            match(input,26,FollowSets000.FOLLOW_26_in_rule__RessourceDefinition__Group__2__Impl2480); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1256:1: rule__RessourceDefinition__Group__3 : rule__RessourceDefinition__Group__3__Impl ;
    public final void rule__RessourceDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1260:1: ( rule__RessourceDefinition__Group__3__Impl )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1261:2: rule__RessourceDefinition__Group__3__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__Group__3__Impl_in_rule__RessourceDefinition__Group__32511);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1267:1: rule__RessourceDefinition__Group__3__Impl : ( ( rule__RessourceDefinition__NumberAssignment_3 ) ) ;
    public final void rule__RessourceDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1271:1: ( ( ( rule__RessourceDefinition__NumberAssignment_3 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1272:1: ( ( rule__RessourceDefinition__NumberAssignment_3 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1272:1: ( ( rule__RessourceDefinition__NumberAssignment_3 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1273:1: ( rule__RessourceDefinition__NumberAssignment_3 )
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNumberAssignment_3()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1274:1: ( rule__RessourceDefinition__NumberAssignment_3 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1274:2: rule__RessourceDefinition__NumberAssignment_3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceDefinition__NumberAssignment_3_in_rule__RessourceDefinition__Group__3__Impl2538);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1292:1: rule__RessourceInstance__Group__0 : rule__RessourceInstance__Group__0__Impl rule__RessourceInstance__Group__1 ;
    public final void rule__RessourceInstance__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1296:1: ( rule__RessourceInstance__Group__0__Impl rule__RessourceInstance__Group__1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1297:2: rule__RessourceInstance__Group__0__Impl rule__RessourceInstance__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__0__Impl_in_rule__RessourceInstance__Group__02576);
            rule__RessourceInstance__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__1_in_rule__RessourceInstance__Group__02579);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1304:1: rule__RessourceInstance__Group__0__Impl : ( 'ri' ) ;
    public final void rule__RessourceInstance__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1308:1: ( ( 'ri' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1309:1: ( 'ri' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1309:1: ( 'ri' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1310:1: 'ri'
            {
             before(grammarAccess.getRessourceInstanceAccess().getRiKeyword_0()); 
            match(input,27,FollowSets000.FOLLOW_27_in_rule__RessourceInstance__Group__0__Impl2607); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1323:1: rule__RessourceInstance__Group__1 : rule__RessourceInstance__Group__1__Impl rule__RessourceInstance__Group__2 ;
    public final void rule__RessourceInstance__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1327:1: ( rule__RessourceInstance__Group__1__Impl rule__RessourceInstance__Group__2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1328:2: rule__RessourceInstance__Group__1__Impl rule__RessourceInstance__Group__2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__1__Impl_in_rule__RessourceInstance__Group__12638);
            rule__RessourceInstance__Group__1__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__2_in_rule__RessourceInstance__Group__12641);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1335:1: rule__RessourceInstance__Group__1__Impl : ( 'type' ) ;
    public final void rule__RessourceInstance__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1339:1: ( ( 'type' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1340:1: ( 'type' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1340:1: ( 'type' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1341:1: 'type'
            {
             before(grammarAccess.getRessourceInstanceAccess().getTypeKeyword_1()); 
            match(input,28,FollowSets000.FOLLOW_28_in_rule__RessourceInstance__Group__1__Impl2669); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1354:1: rule__RessourceInstance__Group__2 : rule__RessourceInstance__Group__2__Impl rule__RessourceInstance__Group__3 ;
    public final void rule__RessourceInstance__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1358:1: ( rule__RessourceInstance__Group__2__Impl rule__RessourceInstance__Group__3 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1359:2: rule__RessourceInstance__Group__2__Impl rule__RessourceInstance__Group__3
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__2__Impl_in_rule__RessourceInstance__Group__22700);
            rule__RessourceInstance__Group__2__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__3_in_rule__RessourceInstance__Group__22703);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1366:1: rule__RessourceInstance__Group__2__Impl : ( ( rule__RessourceInstance__TypeAssignment_2 ) ) ;
    public final void rule__RessourceInstance__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1370:1: ( ( ( rule__RessourceInstance__TypeAssignment_2 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1371:1: ( ( rule__RessourceInstance__TypeAssignment_2 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1371:1: ( ( rule__RessourceInstance__TypeAssignment_2 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1372:1: ( rule__RessourceInstance__TypeAssignment_2 )
            {
             before(grammarAccess.getRessourceInstanceAccess().getTypeAssignment_2()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1373:1: ( rule__RessourceInstance__TypeAssignment_2 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1373:2: rule__RessourceInstance__TypeAssignment_2
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__TypeAssignment_2_in_rule__RessourceInstance__Group__2__Impl2730);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1383:1: rule__RessourceInstance__Group__3 : rule__RessourceInstance__Group__3__Impl rule__RessourceInstance__Group__4 ;
    public final void rule__RessourceInstance__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1387:1: ( rule__RessourceInstance__Group__3__Impl rule__RessourceInstance__Group__4 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1388:2: rule__RessourceInstance__Group__3__Impl rule__RessourceInstance__Group__4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__3__Impl_in_rule__RessourceInstance__Group__32760);
            rule__RessourceInstance__Group__3__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__4_in_rule__RessourceInstance__Group__32763);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1395:1: rule__RessourceInstance__Group__3__Impl : ( 'activity' ) ;
    public final void rule__RessourceInstance__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1399:1: ( ( 'activity' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1400:1: ( 'activity' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1400:1: ( 'activity' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1401:1: 'activity'
            {
             before(grammarAccess.getRessourceInstanceAccess().getActivityKeyword_3()); 
            match(input,29,FollowSets000.FOLLOW_29_in_rule__RessourceInstance__Group__3__Impl2791); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1414:1: rule__RessourceInstance__Group__4 : rule__RessourceInstance__Group__4__Impl rule__RessourceInstance__Group__5 ;
    public final void rule__RessourceInstance__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1418:1: ( rule__RessourceInstance__Group__4__Impl rule__RessourceInstance__Group__5 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1419:2: rule__RessourceInstance__Group__4__Impl rule__RessourceInstance__Group__5
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__4__Impl_in_rule__RessourceInstance__Group__42822);
            rule__RessourceInstance__Group__4__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__5_in_rule__RessourceInstance__Group__42825);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1426:1: rule__RessourceInstance__Group__4__Impl : ( ( rule__RessourceInstance__ActivityAssignment_4 ) ) ;
    public final void rule__RessourceInstance__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1430:1: ( ( ( rule__RessourceInstance__ActivityAssignment_4 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1431:1: ( ( rule__RessourceInstance__ActivityAssignment_4 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1431:1: ( ( rule__RessourceInstance__ActivityAssignment_4 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1432:1: ( rule__RessourceInstance__ActivityAssignment_4 )
            {
             before(grammarAccess.getRessourceInstanceAccess().getActivityAssignment_4()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1433:1: ( rule__RessourceInstance__ActivityAssignment_4 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1433:2: rule__RessourceInstance__ActivityAssignment_4
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__ActivityAssignment_4_in_rule__RessourceInstance__Group__4__Impl2852);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1443:1: rule__RessourceInstance__Group__5 : rule__RessourceInstance__Group__5__Impl rule__RessourceInstance__Group__6 ;
    public final void rule__RessourceInstance__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1447:1: ( rule__RessourceInstance__Group__5__Impl rule__RessourceInstance__Group__6 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1448:2: rule__RessourceInstance__Group__5__Impl rule__RessourceInstance__Group__6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__5__Impl_in_rule__RessourceInstance__Group__52882);
            rule__RessourceInstance__Group__5__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__6_in_rule__RessourceInstance__Group__52885);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1455:1: rule__RessourceInstance__Group__5__Impl : ( 'instances' ) ;
    public final void rule__RessourceInstance__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1459:1: ( ( 'instances' ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1460:1: ( 'instances' )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1460:1: ( 'instances' )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1461:1: 'instances'
            {
             before(grammarAccess.getRessourceInstanceAccess().getInstancesKeyword_5()); 
            match(input,30,FollowSets000.FOLLOW_30_in_rule__RessourceInstance__Group__5__Impl2913); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1474:1: rule__RessourceInstance__Group__6 : rule__RessourceInstance__Group__6__Impl ;
    public final void rule__RessourceInstance__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1478:1: ( rule__RessourceInstance__Group__6__Impl )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1479:2: rule__RessourceInstance__Group__6__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__Group__6__Impl_in_rule__RessourceInstance__Group__62944);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1485:1: rule__RessourceInstance__Group__6__Impl : ( ( rule__RessourceInstance__InstancesAssignment_6 ) ) ;
    public final void rule__RessourceInstance__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1489:1: ( ( ( rule__RessourceInstance__InstancesAssignment_6 ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1490:1: ( ( rule__RessourceInstance__InstancesAssignment_6 ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1490:1: ( ( rule__RessourceInstance__InstancesAssignment_6 ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1491:1: ( rule__RessourceInstance__InstancesAssignment_6 )
            {
             before(grammarAccess.getRessourceInstanceAccess().getInstancesAssignment_6()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1492:1: ( rule__RessourceInstance__InstancesAssignment_6 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1492:2: rule__RessourceInstance__InstancesAssignment_6
            {
            pushFollow(FollowSets000.FOLLOW_rule__RessourceInstance__InstancesAssignment_6_in_rule__RessourceInstance__Group__6__Impl2971);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1516:1: rule__EInt__Group__0 : rule__EInt__Group__0__Impl rule__EInt__Group__1 ;
    public final void rule__EInt__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1520:1: ( rule__EInt__Group__0__Impl rule__EInt__Group__1 )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1521:2: rule__EInt__Group__0__Impl rule__EInt__Group__1
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03015);
            rule__EInt__Group__0__Impl();

            state._fsp--;

            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03018);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1528:1: rule__EInt__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EInt__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1532:1: ( ( ( '-' )? ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1533:1: ( ( '-' )? )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1533:1: ( ( '-' )? )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1534:1: ( '-' )?
            {
             before(grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1535:1: ( '-' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==31) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1536:2: '-'
                    {
                    match(input,31,FollowSets000.FOLLOW_31_in_rule__EInt__Group__0__Impl3047); 

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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1547:1: rule__EInt__Group__1 : rule__EInt__Group__1__Impl ;
    public final void rule__EInt__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1551:1: ( rule__EInt__Group__1__Impl )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1552:2: rule__EInt__Group__1__Impl
            {
            pushFollow(FollowSets000.FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13080);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1558:1: rule__EInt__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__EInt__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1562:1: ( ( RULE_INT ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1563:1: ( RULE_INT )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1563:1: ( RULE_INT )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1564:1: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3107); 
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1580:1: rule__Process__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Process__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1584:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1585:1: ( ruleEString )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1585:1: ( ruleEString )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1586:1: ruleEString
            {
             before(grammarAccess.getProcessAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__Process__NameAssignment_23145);
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


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4_0"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1595:1: rule__Process__ProcessElementsAssignment_4_0 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1599:1: ( ( ruleProcessElement ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1600:1: ( ruleProcessElement )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1600:1: ( ruleProcessElement )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1601:1: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_0_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_4_03176);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4_0"


    // $ANTLR start "rule__Process__ProcessElementsAssignment_4_1"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1610:1: rule__Process__ProcessElementsAssignment_4_1 : ( ruleProcessElement ) ;
    public final void rule__Process__ProcessElementsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1614:1: ( ( ruleProcessElement ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1615:1: ( ruleProcessElement )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1615:1: ( ruleProcessElement )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1616:1: ruleProcessElement
            {
             before(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_4_13207);
            ruleProcessElement();

            state._fsp--;

             after(grammarAccess.getProcessAccess().getProcessElementsProcessElementParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Process__ProcessElementsAssignment_4_1"


    // $ANTLR start "rule__WorkDefinition__NameAssignment_1"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1625:1: rule__WorkDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__WorkDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1629:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1630:1: ( ruleEString )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1630:1: ( ruleEString )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1631:1: ruleEString
            {
             before(grammarAccess.getWorkDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WorkDefinition__NameAssignment_13238);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1640:1: rule__WorkDefinition__Min_timeAssignment_3 : ( ruleEInt ) ;
    public final void rule__WorkDefinition__Min_timeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1644:1: ( ( ruleEInt ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1645:1: ( ruleEInt )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1645:1: ( ruleEInt )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1646:1: ruleEInt
            {
             before(grammarAccess.getWorkDefinitionAccess().getMin_timeEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__WorkDefinition__Min_timeAssignment_33269);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1655:1: rule__WorkDefinition__Max_timeAssignment_5 : ( ruleEInt ) ;
    public final void rule__WorkDefinition__Max_timeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1659:1: ( ( ruleEInt ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1660:1: ( ruleEInt )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1660:1: ( ruleEInt )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1661:1: ruleEInt
            {
             before(grammarAccess.getWorkDefinitionAccess().getMax_timeEIntParserRuleCall_5_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__WorkDefinition__Max_timeAssignment_53300);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1670:1: rule__WorkSequence__LinkTypeAssignment_1 : ( ruleWorkSequenceType ) ;
    public final void rule__WorkSequence__LinkTypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1674:1: ( ( ruleWorkSequenceType ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1675:1: ( ruleWorkSequenceType )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1675:1: ( ruleWorkSequenceType )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1676:1: ruleWorkSequenceType
            {
             before(grammarAccess.getWorkSequenceAccess().getLinkTypeWorkSequenceTypeEnumRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleWorkSequenceType_in_rule__WorkSequence__LinkTypeAssignment_13331);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1685:1: rule__WorkSequence__PredecessorAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__PredecessorAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1689:1: ( ( ( ruleEString ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1690:1: ( ( ruleEString ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1690:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1691:1: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionCrossReference_3_0()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1692:1: ( ruleEString )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1693:1: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getPredecessorWorkDefinitionEStringParserRuleCall_3_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WorkSequence__PredecessorAssignment_33366);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1704:1: rule__WorkSequence__SuccessorAssignment_5 : ( ( ruleEString ) ) ;
    public final void rule__WorkSequence__SuccessorAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1708:1: ( ( ( ruleEString ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1709:1: ( ( ruleEString ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1709:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1710:1: ( ruleEString )
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionCrossReference_5_0()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1711:1: ( ruleEString )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1712:1: ruleEString
            {
             before(grammarAccess.getWorkSequenceAccess().getSuccessorWorkDefinitionEStringParserRuleCall_5_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__WorkSequence__SuccessorAssignment_53405);
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


    // $ANTLR start "rule__Guidance__TextAssignment_2"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1723:1: rule__Guidance__TextAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Guidance__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1727:1: ( ( RULE_STRING ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1728:1: ( RULE_STRING )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1728:1: ( RULE_STRING )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1729:1: RULE_STRING
            {
             before(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment_23440); 
             after(grammarAccess.getGuidanceAccess().getTextSTRINGTerminalRuleCall_2_0()); 

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
    // $ANTLR end "rule__Guidance__TextAssignment_2"


    // $ANTLR start "rule__RessourceDefinition__NameAssignment_1"
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1738:1: rule__RessourceDefinition__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__RessourceDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1742:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1743:1: ( ruleEString )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1743:1: ( ruleEString )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1744:1: ruleEString
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RessourceDefinition__NameAssignment_13471);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1753:1: rule__RessourceDefinition__NumberAssignment_3 : ( ruleEInt ) ;
    public final void rule__RessourceDefinition__NumberAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1757:1: ( ( ruleEInt ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1758:1: ( ruleEInt )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1758:1: ( ruleEInt )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1759:1: ruleEInt
            {
             before(grammarAccess.getRessourceDefinitionAccess().getNumberEIntParserRuleCall_3_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RessourceDefinition__NumberAssignment_33502);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1768:1: rule__RessourceInstance__TypeAssignment_2 : ( ( ruleEString ) ) ;
    public final void rule__RessourceInstance__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1772:1: ( ( ( ruleEString ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1773:1: ( ( ruleEString ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1773:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1774:1: ( ruleEString )
            {
             before(grammarAccess.getRessourceInstanceAccess().getTypeRessourceDefinitionCrossReference_2_0()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1775:1: ( ruleEString )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1776:1: ruleEString
            {
             before(grammarAccess.getRessourceInstanceAccess().getTypeRessourceDefinitionEStringParserRuleCall_2_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RessourceInstance__TypeAssignment_23537);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1787:1: rule__RessourceInstance__ActivityAssignment_4 : ( ( ruleEString ) ) ;
    public final void rule__RessourceInstance__ActivityAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1791:1: ( ( ( ruleEString ) ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1792:1: ( ( ruleEString ) )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1792:1: ( ( ruleEString ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1793:1: ( ruleEString )
            {
             before(grammarAccess.getRessourceInstanceAccess().getActivityWorkDefinitionCrossReference_4_0()); 
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1794:1: ( ruleEString )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1795:1: ruleEString
            {
             before(grammarAccess.getRessourceInstanceAccess().getActivityWorkDefinitionEStringParserRuleCall_4_0_1()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rule__RessourceInstance__ActivityAssignment_43576);
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
    // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1806:1: rule__RessourceInstance__InstancesAssignment_6 : ( ruleEInt ) ;
    public final void rule__RessourceInstance__InstancesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1810:1: ( ( ruleEInt ) )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1811:1: ( ruleEInt )
            {
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1811:1: ( ruleEInt )
            // ../be.syntaxical.pdl.ui/src-gen/be/ui/contentassist/antlr/internal/InternalSimplePDL.g:1812:1: ruleEInt
            {
             before(grammarAccess.getRessourceInstanceAccess().getInstancesEIntParserRuleCall_6_0()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rule__RessourceInstance__InstancesAssignment_63611);
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
        public static final BitSet FOLLOW_rule__Process__Group__3__Impl_in_rule__Process__Group__31075 = new BitSet(new long[]{0x000000000B260000L});
        public static final BitSet FOLLOW_rule__Process__Group__4_in_rule__Process__Group__31078 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_16_in_rule__Process__Group__3__Impl1106 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__4__Impl_in_rule__Process__Group__41137 = new BitSet(new long[]{0x000000000B260000L});
        public static final BitSet FOLLOW_rule__Process__Group__5_in_rule__Process__Group__41140 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_4__0_in_rule__Process__Group__4__Impl1167 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group__5__Impl_in_rule__Process__Group__51198 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_rule__Process__Group__5__Impl1226 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_4__0__Impl_in_rule__Process__Group_4__01269 = new BitSet(new long[]{0x000000000B240000L});
        public static final BitSet FOLLOW_rule__Process__Group_4__1_in_rule__Process__Group_4__01272 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_4_0_in_rule__Process__Group_4__0__Impl1299 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__Group_4__1__Impl_in_rule__Process__Group_4__11329 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Process__ProcessElementsAssignment_4_1_in_rule__Process__Group_4__1__Impl1356 = new BitSet(new long[]{0x000000000B240002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__0__Impl_in_rule__WorkDefinition__Group__01391 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__1_in_rule__WorkDefinition__Group__01394 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_18_in_rule__WorkDefinition__Group__0__Impl1422 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__1__Impl_in_rule__WorkDefinition__Group__11453 = new BitSet(new long[]{0x0000000000080000L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__2_in_rule__WorkDefinition__Group__11456 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__NameAssignment_1_in_rule__WorkDefinition__Group__1__Impl1483 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__2__Impl_in_rule__WorkDefinition__Group__21513 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__3_in_rule__WorkDefinition__Group__21516 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_rule__WorkDefinition__Group__2__Impl1544 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__3__Impl_in_rule__WorkDefinition__Group__31575 = new BitSet(new long[]{0x0000000000100000L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__4_in_rule__WorkDefinition__Group__31578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Min_timeAssignment_3_in_rule__WorkDefinition__Group__3__Impl1605 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__4__Impl_in_rule__WorkDefinition__Group__41635 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__5_in_rule__WorkDefinition__Group__41638 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_rule__WorkDefinition__Group__4__Impl1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Group__5__Impl_in_rule__WorkDefinition__Group__51697 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkDefinition__Max_timeAssignment_5_in_rule__WorkDefinition__Group__5__Impl1724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__0__Impl_in_rule__WorkSequence__Group__01766 = new BitSet(new long[]{0x0000000000007800L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__1_in_rule__WorkSequence__Group__01769 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_rule__WorkSequence__Group__0__Impl1797 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__1__Impl_in_rule__WorkSequence__Group__11828 = new BitSet(new long[]{0x0000000000400000L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__2_in_rule__WorkSequence__Group__11831 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__LinkTypeAssignment_1_in_rule__WorkSequence__Group__1__Impl1858 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__2__Impl_in_rule__WorkSequence__Group__21888 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__3_in_rule__WorkSequence__Group__21891 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_rule__WorkSequence__Group__2__Impl1919 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__3__Impl_in_rule__WorkSequence__Group__31950 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__4_in_rule__WorkSequence__Group__31953 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__PredecessorAssignment_3_in_rule__WorkSequence__Group__3__Impl1980 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__4__Impl_in_rule__WorkSequence__Group__42010 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__5_in_rule__WorkSequence__Group__42013 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_rule__WorkSequence__Group__4__Impl2041 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__Group__5__Impl_in_rule__WorkSequence__Group__52072 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__WorkSequence__SuccessorAssignment_5_in_rule__WorkSequence__Group__5__Impl2099 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guidance__Group__0__Impl_in_rule__Guidance__Group__02141 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_rule__Guidance__Group__1_in_rule__Guidance__Group__02144 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guidance__Group__1__Impl_in_rule__Guidance__Group__12202 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_rule__Guidance__Group__2_in_rule__Guidance__Group__12205 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_rule__Guidance__Group__1__Impl2233 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guidance__Group__2__Impl_in_rule__Guidance__Group__22264 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__Guidance__TextAssignment_2_in_rule__Guidance__Group__2__Impl2291 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__0__Impl_in_rule__RessourceDefinition__Group__02327 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__1_in_rule__RessourceDefinition__Group__02330 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_rule__RessourceDefinition__Group__0__Impl2358 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__1__Impl_in_rule__RessourceDefinition__Group__12389 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__2_in_rule__RessourceDefinition__Group__12392 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__NameAssignment_1_in_rule__RessourceDefinition__Group__1__Impl2419 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__2__Impl_in_rule__RessourceDefinition__Group__22449 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__3_in_rule__RessourceDefinition__Group__22452 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_rule__RessourceDefinition__Group__2__Impl2480 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__Group__3__Impl_in_rule__RessourceDefinition__Group__32511 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceDefinition__NumberAssignment_3_in_rule__RessourceDefinition__Group__3__Impl2538 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__0__Impl_in_rule__RessourceInstance__Group__02576 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__1_in_rule__RessourceInstance__Group__02579 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_rule__RessourceInstance__Group__0__Impl2607 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__1__Impl_in_rule__RessourceInstance__Group__12638 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__2_in_rule__RessourceInstance__Group__12641 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_rule__RessourceInstance__Group__1__Impl2669 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__2__Impl_in_rule__RessourceInstance__Group__22700 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__3_in_rule__RessourceInstance__Group__22703 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__TypeAssignment_2_in_rule__RessourceInstance__Group__2__Impl2730 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__3__Impl_in_rule__RessourceInstance__Group__32760 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__4_in_rule__RessourceInstance__Group__32763 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_rule__RessourceInstance__Group__3__Impl2791 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__4__Impl_in_rule__RessourceInstance__Group__42822 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__5_in_rule__RessourceInstance__Group__42825 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__ActivityAssignment_4_in_rule__RessourceInstance__Group__4__Impl2852 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__5__Impl_in_rule__RessourceInstance__Group__52882 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__6_in_rule__RessourceInstance__Group__52885 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_rule__RessourceInstance__Group__5__Impl2913 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__Group__6__Impl_in_rule__RessourceInstance__Group__62944 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__RessourceInstance__InstancesAssignment_6_in_rule__RessourceInstance__Group__6__Impl2971 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__0__Impl_in_rule__EInt__Group__03015 = new BitSet(new long[]{0x0000000080000040L});
        public static final BitSet FOLLOW_rule__EInt__Group__1_in_rule__EInt__Group__03018 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_rule__EInt__Group__0__Impl3047 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rule__EInt__Group__1__Impl_in_rule__EInt__Group__13080 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_rule__EInt__Group__1__Impl3107 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__Process__NameAssignment_23145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_4_03176 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleProcessElement_in_rule__Process__ProcessElementsAssignment_4_13207 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WorkDefinition__NameAssignment_13238 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__WorkDefinition__Min_timeAssignment_33269 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__WorkDefinition__Max_timeAssignment_53300 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleWorkSequenceType_in_rule__WorkSequence__LinkTypeAssignment_13331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WorkSequence__PredecessorAssignment_33366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__WorkSequence__SuccessorAssignment_53405 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_rule__Guidance__TextAssignment_23440 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RessourceDefinition__NameAssignment_13471 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RessourceDefinition__NumberAssignment_33502 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RessourceInstance__TypeAssignment_23537 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_rule__RessourceInstance__ActivityAssignment_43576 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_rule__RessourceInstance__InstancesAssignment_63611 = new BitSet(new long[]{0x0000000000000002L});
    }


}