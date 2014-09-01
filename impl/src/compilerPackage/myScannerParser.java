// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g 2014-07-24 10:40:58

  package compilerPackage;
  
  import dataPackage.*;


import org.antlr.runtime.*;

public class myScannerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RET", "WS", "INTESTAZIONE", "COMPOSITEDEF", "INTESTAZIONE_COMPOSITE", "NAME", "CODE", "TARGETNAMESPACE", "GT", "COMPONENTDEF", "IMPLEMENTATIONDEF", "CLASS", "ENDTAG", "PROPERTYDEF", "NICKNAMEPROP", "WEIGHTPROP", "HEIGHTPROP", "PRICEPROP", "IDPROP", "ID", "ENDPROPERTY", "NUM", "SERVICEDEF", "INTERFACEIMPL", "INTERFACEDEF", "ENDSERVICE", "REFERENCEDEF", "ENDREFERENCE", "ENDCOMPONENT", "ENDCOMPOSITE", "QUOTE", "DOT", "LT", "BACKSLASH", "COMMENT", "ERROR"
    };
    public static final int LT=36;
    public static final int CLASS=15;
    public static final int ENDTAG=16;
    public static final int TARGETNAMESPACE=11;
    public static final int COMPONENTDEF=13;
    public static final int ENDCOMPONENT=32;
    public static final int ENDREFERENCE=31;
    public static final int WEIGHTPROP=19;
    public static final int COMPOSITEDEF=7;
    public static final int ERROR=39;
    public static final int ID=23;
    public static final int IDPROP=22;
    public static final int EOF=-1;
    public static final int ENDPROPERTY=24;
    public static final int PROPERTYDEF=17;
    public static final int SERVICEDEF=26;
    public static final int NUM=25;
    public static final int INTESTAZIONE_COMPOSITE=8;
    public static final int INTERFACEIMPL=27;
    public static final int CODE=10;
    public static final int HEIGHTPROP=20;
    public static final int QUOTE=34;
    public static final int RET=4;
    public static final int NAME=9;
    public static final int WS=5;
    public static final int IMPLEMENTATIONDEF=14;
    public static final int NICKNAMEPROP=18;
    public static final int INTESTAZIONE=6;
    public static final int ENDSERVICE=29;
    public static final int ENDCOMPOSITE=33;
    public static final int GT=12;
    public static final int COMMENT=38;
    public static final int DOT=35;
    public static final int INTERFACEDEF=28;
    public static final int REFERENCEDEF=30;
    public static final int BACKSLASH=37;
    public static final int PRICEPROP=21;

    // delegates
    // delegators


        public myScannerParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public myScannerParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return myScannerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g"; }


      Handler handler;
      void init(){
        handler = new Handler();
      }

      public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
            String hdr = "* " + getErrorHeader(e);
            String msg = " - " + getErrorMessage(e, tokenNames);
            handler.addError ("Sintax Error. " + hdr + "\t" + msg + "\n\t"+e.toString());
       }




    // $ANTLR start "start"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:39:1: start : ( RET )* header body methods ( RET )* ( WS )* endings ;
    public final void start() throws RecognitionException {
         init (); 
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:40:20: ( ( RET )* header body methods ( RET )* ( WS )* endings )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:41:7: ( RET )* header body methods ( RET )* ( WS )* endings
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:41:7: ( RET )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RET) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:41:7: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_start74); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            pushFollow(FOLLOW_header_in_start83);
            header();

            state._fsp--;

            pushFollow(FOLLOW_body_in_start91);
            body();

            state._fsp--;

            pushFollow(FOLLOW_methods_in_start99);
            methods();

            state._fsp--;

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:45:7: ( RET )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RET) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:45:7: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_start107); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:45:12: ( WS )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==WS) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:45:12: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_start110); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            pushFollow(FOLLOW_endings_in_start120);
            endings();

            state._fsp--;

             handler.writeToFile(); 

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
    // $ANTLR end "start"


    // $ANTLR start "header"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:50:1: header : ( intestazioneXml )? intestazioneComposite packagedef typeofcomponent implementationdef ;
    public final void header() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:50:7: ( ( intestazioneXml )? intestazioneComposite packagedef typeofcomponent implementationdef )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:50:9: ( intestazioneXml )? intestazioneComposite packagedef typeofcomponent implementationdef
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:50:9: ( intestazioneXml )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INTESTAZIONE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:50:9: intestazioneXml
                    {
                    pushFollow(FOLLOW_intestazioneXml_in_header136);
                    intestazioneXml();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_intestazioneComposite_in_header147);
            intestazioneComposite();

            state._fsp--;

            pushFollow(FOLLOW_packagedef_in_header157);
            packagedef();

            state._fsp--;

            pushFollow(FOLLOW_typeofcomponent_in_header167);
            typeofcomponent();

            state._fsp--;

            pushFollow(FOLLOW_implementationdef_in_header177);
            implementationdef();

            state._fsp--;


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
    // $ANTLR end "header"


    // $ANTLR start "intestazioneXml"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:57:1: intestazioneXml : INTESTAZIONE ( RET )* ;
    public final void intestazioneXml() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:57:16: ( INTESTAZIONE ( RET )* )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:57:18: INTESTAZIONE ( RET )*
            {
            match(input,INTESTAZIONE,FOLLOW_INTESTAZIONE_in_intestazioneXml193); 
             handler.start(); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:57:52: ( RET )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RET) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:57:52: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_intestazioneXml197); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


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
    // $ANTLR end "intestazioneXml"


    // $ANTLR start "intestazioneComposite"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:59:1: intestazioneComposite : COMPOSITEDEF INTESTAZIONE_COMPOSITE ( RET )* NAME CODE ;
    public final void intestazioneComposite() throws RecognitionException {
        Token CODE1=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:59:22: ( COMPOSITEDEF INTESTAZIONE_COMPOSITE ( RET )* NAME CODE )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:59:24: COMPOSITEDEF INTESTAZIONE_COMPOSITE ( RET )* NAME CODE
            {
            match(input,COMPOSITEDEF,FOLLOW_COMPOSITEDEF_in_intestazioneComposite205); 
            match(input,INTESTAZIONE_COMPOSITE,FOLLOW_INTESTAZIONE_COMPOSITE_in_intestazioneComposite207); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:59:60: ( RET )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RET) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:59:60: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_intestazioneComposite209); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match(input,NAME,FOLLOW_NAME_in_intestazioneComposite212); 
            CODE1=(Token)match(input,CODE,FOLLOW_CODE_in_intestazioneComposite214); 
             handler.setCompositeName(CODE1); 

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
    // $ANTLR end "intestazioneComposite"


    // $ANTLR start "packagedef"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:61:1: packagedef : ( RET )* TARGETNAMESPACE CODE GT ;
    public final void packagedef() throws RecognitionException {
        Token CODE2=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:61:11: ( ( RET )* TARGETNAMESPACE CODE GT )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:61:13: ( RET )* TARGETNAMESPACE CODE GT
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:61:13: ( RET )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==RET) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:61:13: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_packagedef224); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match(input,TARGETNAMESPACE,FOLLOW_TARGETNAMESPACE_in_packagedef227); 
            CODE2=(Token)match(input,CODE,FOLLOW_CODE_in_packagedef229); 
            handler.setPackage(CODE2); 
            match(input,GT,FOLLOW_GT_in_packagedef233); 

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
    // $ANTLR end "packagedef"


    // $ANTLR start "typeofcomponent"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:63:1: typeofcomponent : ( RET )* ( WS )* COMPONENTDEF NAME CODE GT ;
    public final void typeofcomponent() throws RecognitionException {
        Token CODE3=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:63:16: ( ( RET )* ( WS )* COMPONENTDEF NAME CODE GT )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:63:18: ( RET )* ( WS )* COMPONENTDEF NAME CODE GT
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:63:18: ( RET )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RET) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:63:18: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_typeofcomponent240); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:63:23: ( WS )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==WS) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:63:23: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_typeofcomponent243); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match(input,COMPONENTDEF,FOLLOW_COMPONENTDEF_in_typeofcomponent246); 
            match(input,NAME,FOLLOW_NAME_in_typeofcomponent248); 
            CODE3=(Token)match(input,CODE,FOLLOW_CODE_in_typeofcomponent250); 
            match(input,GT,FOLLOW_GT_in_typeofcomponent252); 
            handler.setTypeOfComponent(CODE3);

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
    // $ANTLR end "typeofcomponent"


    // $ANTLR start "implementationdef"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:65:1: implementationdef : ( RET )* ( WS )* IMPLEMENTATIONDEF CLASS CODE ENDTAG ;
    public final void implementationdef() throws RecognitionException {
        Token CODE4=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:65:18: ( ( RET )* ( WS )* IMPLEMENTATIONDEF CLASS CODE ENDTAG )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:65:20: ( RET )* ( WS )* IMPLEMENTATIONDEF CLASS CODE ENDTAG
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:65:20: ( RET )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RET) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:65:20: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_implementationdef262); 

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:65:25: ( WS )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==WS) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:65:25: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_implementationdef265); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(input,IMPLEMENTATIONDEF,FOLLOW_IMPLEMENTATIONDEF_in_implementationdef268); 
            match(input,CLASS,FOLLOW_CLASS_in_implementationdef270); 
            CODE4=(Token)match(input,CODE,FOLLOW_CODE_in_implementationdef272); 
            handler.addExtension(CODE4);
            match(input,ENDTAG,FOLLOW_ENDTAG_in_implementationdef276); 

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
    // $ANTLR end "implementationdef"


    // $ANTLR start "body"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:1: body : ( RET )* ( WS )* PROPERTYDEF NAME propertyID ( RET )* ( WS )* ( propDef )* ;
    public final void body() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:5: ( ( RET )* ( WS )* PROPERTYDEF NAME propertyID ( RET )* ( WS )* ( propDef )* )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:7: ( RET )* ( WS )* PROPERTYDEF NAME propertyID ( RET )* ( WS )* ( propDef )*
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:7: ( RET )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RET) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:7: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_body285); 

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:12: ( WS )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==WS) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:12: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_body288); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match(input,PROPERTYDEF,FOLLOW_PROPERTYDEF_in_body291); 
            match(input,NAME,FOLLOW_NAME_in_body293); 
            pushFollow(FOLLOW_propertyID_in_body295);
            propertyID();

            state._fsp--;

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:44: ( RET )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==RET) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:44: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_body297); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:49: ( WS )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==WS) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:68:49: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_body300); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:69:7: ( propDef )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==PROPERTYDEF) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:69:7: propDef
            	    {
            	    pushFollow(FOLLOW_propDef_in_body309);
            	    propDef();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "body"


    // $ANTLR start "propDef"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:1: propDef : PROPERTYDEF NAME ( NICKNAMEPROP propertyNickName | WEIGHTPROP propertyWeight | HEIGHTPROP propertyHeight | PRICEPROP propertyPrice ) ( RET )* ( WS )* ;
    public final void propDef() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:9: ( PROPERTYDEF NAME ( NICKNAMEPROP propertyNickName | WEIGHTPROP propertyWeight | HEIGHTPROP propertyHeight | PRICEPROP propertyPrice ) ( RET )* ( WS )* )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:11: PROPERTYDEF NAME ( NICKNAMEPROP propertyNickName | WEIGHTPROP propertyWeight | HEIGHTPROP propertyHeight | PRICEPROP propertyPrice ) ( RET )* ( WS )*
            {
            match(input,PROPERTYDEF,FOLLOW_PROPERTYDEF_in_propDef325); 
            match(input,NAME,FOLLOW_NAME_in_propDef327); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:28: ( NICKNAMEPROP propertyNickName | WEIGHTPROP propertyWeight | HEIGHTPROP propertyHeight | PRICEPROP propertyPrice )
            int alt17=4;
            switch ( input.LA(1) ) {
            case NICKNAMEPROP:
                {
                alt17=1;
                }
                break;
            case WEIGHTPROP:
                {
                alt17=2;
                }
                break;
            case HEIGHTPROP:
                {
                alt17=3;
                }
                break;
            case PRICEPROP:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:30: NICKNAMEPROP propertyNickName
                    {
                    match(input,NICKNAMEPROP,FOLLOW_NICKNAMEPROP_in_propDef331); 
                    pushFollow(FOLLOW_propertyNickName_in_propDef333);
                    propertyNickName();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:62: WEIGHTPROP propertyWeight
                    {
                    match(input,WEIGHTPROP,FOLLOW_WEIGHTPROP_in_propDef337); 
                    pushFollow(FOLLOW_propertyWeight_in_propDef339);
                    propertyWeight();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:90: HEIGHTPROP propertyHeight
                    {
                    match(input,HEIGHTPROP,FOLLOW_HEIGHTPROP_in_propDef343); 
                    pushFollow(FOLLOW_propertyHeight_in_propDef345);
                    propertyHeight();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:118: PRICEPROP propertyPrice
                    {
                    match(input,PRICEPROP,FOLLOW_PRICEPROP_in_propDef349); 
                    pushFollow(FOLLOW_propertyPrice_in_propDef351);
                    propertyPrice();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:143: ( RET )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==RET) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:143: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_propDef354); 

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:148: ( WS )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==WS) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:72:148: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_propDef357); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "propDef"


    // $ANTLR start "propertyID"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:74:1: propertyID : IDPROP GT ID ENDPROPERTY ;
    public final void propertyID() throws RecognitionException {
        Token ID5=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:74:11: ( IDPROP GT ID ENDPROPERTY )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:74:13: IDPROP GT ID ENDPROPERTY
            {
            match(input,IDPROP,FOLLOW_IDPROP_in_propertyID365); 
            match(input,GT,FOLLOW_GT_in_propertyID367); 
            ID5=(Token)match(input,ID,FOLLOW_ID_in_propertyID369); 
            match(input,ENDPROPERTY,FOLLOW_ENDPROPERTY_in_propertyID371); 
             handler.setIDProperty(ID5); 

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
    // $ANTLR end "propertyID"


    // $ANTLR start "propertyNickName"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:76:1: propertyNickName : GT ID ENDPROPERTY ;
    public final void propertyNickName() throws RecognitionException {
        Token ID6=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:76:17: ( GT ID ENDPROPERTY )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:76:19: GT ID ENDPROPERTY
            {
            match(input,GT,FOLLOW_GT_in_propertyNickName381); 
            ID6=(Token)match(input,ID,FOLLOW_ID_in_propertyNickName383); 
            match(input,ENDPROPERTY,FOLLOW_ENDPROPERTY_in_propertyNickName385); 
             handler.setNickNameProperty(ID6); 

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
    // $ANTLR end "propertyNickName"


    // $ANTLR start "propertyWeight"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:78:1: propertyWeight : GT NUM ENDPROPERTY ;
    public final void propertyWeight() throws RecognitionException {
        Token NUM7=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:78:15: ( GT NUM ENDPROPERTY )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:78:18: GT NUM ENDPROPERTY
            {
            match(input,GT,FOLLOW_GT_in_propertyWeight396); 
            NUM7=(Token)match(input,NUM,FOLLOW_NUM_in_propertyWeight398); 
            match(input,ENDPROPERTY,FOLLOW_ENDPROPERTY_in_propertyWeight400); 
             handler.setWeightProperty(NUM7); 

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
    // $ANTLR end "propertyWeight"


    // $ANTLR start "propertyHeight"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:80:1: propertyHeight : GT NUM ENDPROPERTY ;
    public final void propertyHeight() throws RecognitionException {
        Token NUM8=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:80:15: ( GT NUM ENDPROPERTY )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:80:18: GT NUM ENDPROPERTY
            {
            match(input,GT,FOLLOW_GT_in_propertyHeight411); 
            NUM8=(Token)match(input,NUM,FOLLOW_NUM_in_propertyHeight413); 
            match(input,ENDPROPERTY,FOLLOW_ENDPROPERTY_in_propertyHeight415); 
             handler.setHeightProperty(NUM8); 

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
    // $ANTLR end "propertyHeight"


    // $ANTLR start "propertyPrice"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:82:1: propertyPrice : GT NUM ENDPROPERTY ;
    public final void propertyPrice() throws RecognitionException {
        Token NUM9=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:82:14: ( GT NUM ENDPROPERTY )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:82:17: GT NUM ENDPROPERTY
            {
            match(input,GT,FOLLOW_GT_in_propertyPrice426); 
            NUM9=(Token)match(input,NUM,FOLLOW_NUM_in_propertyPrice428); 
            match(input,ENDPROPERTY,FOLLOW_ENDPROPERTY_in_propertyPrice430); 
             handler.setPriceProperty(NUM9); 

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
    // $ANTLR end "propertyPrice"


    // $ANTLR start "methods"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:86:1: methods : service1 service2 reference1 reference2 ;
    public final void methods() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:86:8: ( service1 service2 reference1 reference2 )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:87:10: service1 service2 reference1 reference2
            {
            pushFollow(FOLLOW_service1_in_methods452);
            service1();

            state._fsp--;

            pushFollow(FOLLOW_service2_in_methods463);
            service2();

            state._fsp--;

            pushFollow(FOLLOW_reference1_in_methods475);
            reference1();

            state._fsp--;

            pushFollow(FOLLOW_reference2_in_methods486);
            reference2();

            state._fsp--;


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
    // $ANTLR end "methods"


    // $ANTLR start "service1"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:93:1: service1 : SERVICEDEF NAME CODE GT ( RET )* ( WS )* ;
    public final void service1() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:93:9: ( SERVICEDEF NAME CODE GT ( RET )* ( WS )* )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:93:11: SERVICEDEF NAME CODE GT ( RET )* ( WS )*
            {
            match(input,SERVICEDEF,FOLLOW_SERVICEDEF_in_service1503); 
            match(input,NAME,FOLLOW_NAME_in_service1505); 
            match(input,CODE,FOLLOW_CODE_in_service1507); 
            match(input,GT,FOLLOW_GT_in_service1509); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:93:35: ( RET )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==RET) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:93:35: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_service1511); 

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:93:40: ( WS )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==WS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:93:40: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_service1514); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


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
    // $ANTLR end "service1"


    // $ANTLR start "service2"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:94:1: service2 : INTERFACEIMPL INTERFACEDEF CODE ENDTAG ( RET )* ( WS )* ENDSERVICE ;
    public final void service2() throws RecognitionException {
        Token CODE10=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:94:9: ( INTERFACEIMPL INTERFACEDEF CODE ENDTAG ( RET )* ( WS )* ENDSERVICE )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:94:11: INTERFACEIMPL INTERFACEDEF CODE ENDTAG ( RET )* ( WS )* ENDSERVICE
            {
            match(input,INTERFACEIMPL,FOLLOW_INTERFACEIMPL_in_service2522); 
            match(input,INTERFACEDEF,FOLLOW_INTERFACEDEF_in_service2524); 
            CODE10=(Token)match(input,CODE,FOLLOW_CODE_in_service2526); 
            handler.addImplementation(CODE10);
            match(input,ENDTAG,FOLLOW_ENDTAG_in_service2530); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:94:86: ( RET )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==RET) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:94:86: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_service2532); 

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:94:91: ( WS )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==WS) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:94:91: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_service2535); 

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,ENDSERVICE,FOLLOW_ENDSERVICE_in_service2538); 

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
    // $ANTLR end "service2"


    // $ANTLR start "reference1"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:1: reference1 : ( RET )* ( WS )* REFERENCEDEF NAME CODE GT ( RET )* ( WS )* ;
    public final void reference1() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:11: ( ( RET )* ( WS )* REFERENCEDEF NAME CODE GT ( RET )* ( WS )* )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:13: ( RET )* ( WS )* REFERENCEDEF NAME CODE GT ( RET )* ( WS )*
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:13: ( RET )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==RET) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:13: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_reference1544); 

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:18: ( WS )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==WS) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:18: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_reference1547); 

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            match(input,REFERENCEDEF,FOLLOW_REFERENCEDEF_in_reference1550); 
            match(input,NAME,FOLLOW_NAME_in_reference1552); 
            match(input,CODE,FOLLOW_CODE_in_reference1554); 
            match(input,GT,FOLLOW_GT_in_reference1556); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:48: ( RET )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==RET) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:48: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_reference1558); 

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:53: ( WS )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==WS) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:95:53: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_reference1561); 

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


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
    // $ANTLR end "reference1"


    // $ANTLR start "reference2"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:96:1: reference2 : INTERFACEIMPL INTERFACEDEF CODE ENDTAG ( RET )* ( WS )* ENDREFERENCE ;
    public final void reference2() throws RecognitionException {
        Token CODE11=null;

        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:96:11: ( INTERFACEIMPL INTERFACEDEF CODE ENDTAG ( RET )* ( WS )* ENDREFERENCE )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:96:13: INTERFACEIMPL INTERFACEDEF CODE ENDTAG ( RET )* ( WS )* ENDREFERENCE
            {
            match(input,INTERFACEIMPL,FOLLOW_INTERFACEIMPL_in_reference2569); 
            match(input,INTERFACEDEF,FOLLOW_INTERFACEDEF_in_reference2571); 
            CODE11=(Token)match(input,CODE,FOLLOW_CODE_in_reference2573); 
            handler.addImplementation(CODE11);
            match(input,ENDTAG,FOLLOW_ENDTAG_in_reference2577); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:96:88: ( RET )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==RET) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:96:88: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_reference2579); 

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:96:93: ( WS )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==WS) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:96:93: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_reference2582); 

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,ENDREFERENCE,FOLLOW_ENDREFERENCE_in_reference2585); 

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
    // $ANTLR end "reference2"


    // $ANTLR start "endings"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:99:1: endings : ENDCOMPONENT ( RET )* ( WS )* ENDCOMPOSITE ret ;
    public final void endings() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:99:8: ( ENDCOMPONENT ( RET )* ( WS )* ENDCOMPOSITE ret )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:99:10: ENDCOMPONENT ( RET )* ( WS )* ENDCOMPOSITE ret
            {
            match(input,ENDCOMPONENT,FOLLOW_ENDCOMPONENT_in_endings594); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:99:23: ( RET )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RET) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:99:23: RET
            	    {
            	    match(input,RET,FOLLOW_RET_in_endings596); 

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:99:28: ( WS )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==WS) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:99:28: WS
            	    {
            	    match(input,WS,FOLLOW_WS_in_endings599); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            match(input,ENDCOMPOSITE,FOLLOW_ENDCOMPOSITE_in_endings602); 
             handler.stop(); 
            pushFollow(FOLLOW_ret_in_endings606);
            ret();

            state._fsp--;


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
    // $ANTLR end "endings"


    // $ANTLR start "qId"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:101:1: qId : ( QUOTE )? ID ( DOT ID )* ;
    public final void qId() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:101:5: ( ( QUOTE )? ID ( DOT ID )* )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:101:7: ( QUOTE )? ID ( DOT ID )*
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:101:7: ( QUOTE )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==QUOTE) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:101:7: QUOTE
                    {
                    match(input,QUOTE,FOLLOW_QUOTE_in_qId614); 

                    }
                    break;

            }

            match(input,ID,FOLLOW_ID_in_qId617); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:101:17: ( DOT ID )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==DOT) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:101:18: DOT ID
            	    {
            	    match(input,DOT,FOLLOW_DOT_in_qId620); 
            	    match(input,ID,FOLLOW_ID_in_qId622); 

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


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
    // $ANTLR end "qId"


    // $ANTLR start "ret"
    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:103:1: ret : ( ( RET )+ | EOF );
    public final void ret() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:103:5: ( ( RET )+ | EOF )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RET) ) {
                alt35=1;
            }
            else if ( (LA35_0==EOF) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:103:7: ( RET )+
                    {
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:103:7: ( RET )+
                    int cnt34=0;
                    loop34:
                    do {
                        int alt34=2;
                        int LA34_0 = input.LA(1);

                        if ( (LA34_0==RET) ) {
                            alt34=1;
                        }


                        switch (alt34) {
                    	case 1 :
                    	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:103:7: RET
                    	    {
                    	    match(input,RET,FOLLOW_RET_in_ret632); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt34 >= 1 ) break loop34;
                                EarlyExitException eee =
                                    new EarlyExitException(34, input);
                                throw eee;
                        }
                        cnt34++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:103:14: EOF
                    {
                    match(input,EOF,FOLLOW_EOF_in_ret637); 

                    }
                    break;

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
    // $ANTLR end "ret"

    // Delegated rules


 

    public static final BitSet FOLLOW_RET_in_start74 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_header_in_start83 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_body_in_start91 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_methods_in_start99 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_RET_in_start107 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_WS_in_start110 = new BitSet(new long[]{0x0000000100000030L});
    public static final BitSet FOLLOW_endings_in_start120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intestazioneXml_in_header136 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_intestazioneComposite_in_header147 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_packagedef_in_header157 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_typeofcomponent_in_header167 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_implementationdef_in_header177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTESTAZIONE_in_intestazioneXml193 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_RET_in_intestazioneXml197 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_COMPOSITEDEF_in_intestazioneComposite205 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_INTESTAZIONE_COMPOSITE_in_intestazioneComposite207 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_RET_in_intestazioneComposite209 = new BitSet(new long[]{0x0000000000000210L});
    public static final BitSet FOLLOW_NAME_in_intestazioneComposite212 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CODE_in_intestazioneComposite214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RET_in_packagedef224 = new BitSet(new long[]{0x0000000000000810L});
    public static final BitSet FOLLOW_TARGETNAMESPACE_in_packagedef227 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CODE_in_packagedef229 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GT_in_packagedef233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RET_in_typeofcomponent240 = new BitSet(new long[]{0x0000000000002030L});
    public static final BitSet FOLLOW_WS_in_typeofcomponent243 = new BitSet(new long[]{0x0000000000002020L});
    public static final BitSet FOLLOW_COMPONENTDEF_in_typeofcomponent246 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_typeofcomponent248 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CODE_in_typeofcomponent250 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GT_in_typeofcomponent252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RET_in_implementationdef262 = new BitSet(new long[]{0x0000000000004030L});
    public static final BitSet FOLLOW_WS_in_implementationdef265 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_IMPLEMENTATIONDEF_in_implementationdef268 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLASS_in_implementationdef270 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CODE_in_implementationdef272 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDTAG_in_implementationdef276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RET_in_body285 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_WS_in_body288 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_PROPERTYDEF_in_body291 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_body293 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_propertyID_in_body295 = new BitSet(new long[]{0x0000000000020032L});
    public static final BitSet FOLLOW_RET_in_body297 = new BitSet(new long[]{0x0000000000020032L});
    public static final BitSet FOLLOW_WS_in_body300 = new BitSet(new long[]{0x0000000000020022L});
    public static final BitSet FOLLOW_propDef_in_body309 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_PROPERTYDEF_in_propDef325 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_propDef327 = new BitSet(new long[]{0x00000000003C0000L});
    public static final BitSet FOLLOW_NICKNAMEPROP_in_propDef331 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_propertyNickName_in_propDef333 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_WEIGHTPROP_in_propDef337 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_propertyWeight_in_propDef339 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_HEIGHTPROP_in_propDef343 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_propertyHeight_in_propDef345 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_PRICEPROP_in_propDef349 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_propertyPrice_in_propDef351 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RET_in_propDef354 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_WS_in_propDef357 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_IDPROP_in_propertyID365 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GT_in_propertyID367 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_propertyID369 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDPROPERTY_in_propertyID371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_propertyNickName381 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_propertyNickName383 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDPROPERTY_in_propertyNickName385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_propertyWeight396 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NUM_in_propertyWeight398 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDPROPERTY_in_propertyWeight400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_propertyHeight411 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NUM_in_propertyHeight413 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDPROPERTY_in_propertyHeight415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GT_in_propertyPrice426 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_NUM_in_propertyPrice428 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDPROPERTY_in_propertyPrice430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_service1_in_methods452 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_service2_in_methods463 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_reference1_in_methods475 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_reference2_in_methods486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SERVICEDEF_in_service1503 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_service1505 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CODE_in_service1507 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GT_in_service1509 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RET_in_service1511 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_WS_in_service1514 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_INTERFACEIMPL_in_service2522 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INTERFACEDEF_in_service2524 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CODE_in_service2526 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDTAG_in_service2530 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_RET_in_service2532 = new BitSet(new long[]{0x0000000020000030L});
    public static final BitSet FOLLOW_WS_in_service2535 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_ENDSERVICE_in_service2538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RET_in_reference1544 = new BitSet(new long[]{0x0000000040000030L});
    public static final BitSet FOLLOW_WS_in_reference1547 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_REFERENCEDEF_in_reference1550 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_NAME_in_reference1552 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CODE_in_reference1554 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_GT_in_reference1556 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_RET_in_reference1558 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_WS_in_reference1561 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_INTERFACEIMPL_in_reference2569 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_INTERFACEDEF_in_reference2571 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_CODE_in_reference2573 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ENDTAG_in_reference2577 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_RET_in_reference2579 = new BitSet(new long[]{0x0000000080000030L});
    public static final BitSet FOLLOW_WS_in_reference2582 = new BitSet(new long[]{0x0000000080000020L});
    public static final BitSet FOLLOW_ENDREFERENCE_in_reference2585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENDCOMPONENT_in_endings594 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_RET_in_endings596 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_WS_in_endings599 = new BitSet(new long[]{0x0000000200000020L});
    public static final BitSet FOLLOW_ENDCOMPOSITE_in_endings602 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ret_in_endings606 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_QUOTE_in_qId614 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_qId617 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_DOT_in_qId620 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ID_in_qId622 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_RET_in_ret632 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_EOF_in_ret637 = new BitSet(new long[]{0x0000000000000002L});

}