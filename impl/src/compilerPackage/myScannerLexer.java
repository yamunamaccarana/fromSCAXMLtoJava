// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g 2014-07-24 10:40:59

  package compilerPackage;


import org.antlr.runtime.*;

public class myScannerLexer extends Lexer {
    public static final int ENDTAG=16;
    public static final int CLASS=15;
    public static final int LT=36;
    public static final int TARGETNAMESPACE=11;
    public static final int COMPONENTDEF=13;
    public static final int ENDCOMPONENT=32;
    public static final int ENDREFERENCE=31;
    public static final int WEIGHTPROP=19;
    public static final int COMPOSITEDEF=7;
    public static final int ERROR=39;
    public static final int ID=23;
    public static final int EOF=-1;
    public static final int IDPROP=22;
    public static final int ENDPROPERTY=24;
    public static final int PROPERTYDEF=17;
    public static final int SERVICEDEF=26;
    public static final int INTESTAZIONE_COMPOSITE=8;
    public static final int NUM=25;
    public static final int INTERFACEIMPL=27;
    public static final int CODE=10;
    public static final int HEIGHTPROP=20;
    public static final int RET=4;
    public static final int QUOTE=34;
    public static final int NAME=9;
    public static final int WS=5;
    public static final int NICKNAMEPROP=18;
    public static final int IMPLEMENTATIONDEF=14;
    public static final int INTESTAZIONE=6;
    public static final int ENDSERVICE=29;
    public static final int ENDCOMPOSITE=33;
    public static final int GT=12;
    public static final int INTERFACEDEF=28;
    public static final int DOT=35;
    public static final int COMMENT=38;
    public static final int REFERENCEDEF=30;
    public static final int PRICEPROP=21;
    public static final int BACKSLASH=37;



    // delegates
    // delegators

    public myScannerLexer() {;} 
    public myScannerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public myScannerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g"; }

    // $ANTLR start "INTESTAZIONE"
    public final void mINTESTAZIONE() throws RecognitionException {
        try {
            int _type = INTESTAZIONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:108:14: ( ( '<?xml version=\"1.0\" encoding=\"UTF-8\"?>' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:108:16: ( '<?xml version=\"1.0\" encoding=\"UTF-8\"?>' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:108:16: ( '<?xml version=\"1.0\" encoding=\"UTF-8\"?>' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:108:18: '<?xml version=\"1.0\" encoding=\"UTF-8\"?>'
            {
            match("<?xml version=\"1.0\" encoding=\"UTF-8\"?>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTESTAZIONE"

    // $ANTLR start "INTESTAZIONE_COMPOSITE"
    public final void mINTESTAZIONE_COMPOSITE() throws RecognitionException {
        try {
            int _type = INTESTAZIONE_COMPOSITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:110:24: ( ( 'xmlns=\"http://www.osoa.org/xmlns/sca/1.0\"' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:110:26: ( 'xmlns=\"http://www.osoa.org/xmlns/sca/1.0\"' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:110:26: ( 'xmlns=\"http://www.osoa.org/xmlns/sca/1.0\"' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:110:28: 'xmlns=\"http://www.osoa.org/xmlns/sca/1.0\"'
            {
            match("xmlns=\"http://www.osoa.org/xmlns/sca/1.0\""); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTESTAZIONE_COMPOSITE"

    // $ANTLR start "COMPOSITEDEF"
    public final void mCOMPOSITEDEF() throws RecognitionException {
        try {
            int _type = COMPOSITEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:112:14: ( ( '<composite ' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:112:16: ( '<composite ' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:112:16: ( '<composite ' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:112:18: '<composite '
            {
            match("<composite "); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPOSITEDEF"

    // $ANTLR start "ENDCOMPOSITE"
    public final void mENDCOMPOSITE() throws RecognitionException {
        try {
            int _type = ENDCOMPOSITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:113:14: ( ( '</composite>' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:113:16: ( '</composite>' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:113:16: ( '</composite>' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:113:18: '</composite>'
            {
            match("</composite>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDCOMPOSITE"

    // $ANTLR start "COMPONENTDEF"
    public final void mCOMPONENTDEF() throws RecognitionException {
        try {
            int _type = COMPONENTDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:114:14: ( ( '<component ' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:114:16: ( '<component ' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:114:16: ( '<component ' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:114:18: '<component '
            {
            match("<component "); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMPONENTDEF"

    // $ANTLR start "ENDCOMPONENT"
    public final void mENDCOMPONENT() throws RecognitionException {
        try {
            int _type = ENDCOMPONENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:115:14: ( ( '</component>' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:115:16: ( '</component>' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:115:16: ( '</component>' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:115:18: '</component>'
            {
            match("</component>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDCOMPONENT"

    // $ANTLR start "PROPERTYDEF"
    public final void mPROPERTYDEF() throws RecognitionException {
        try {
            int _type = PROPERTYDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:116:13: ( ( '<property ' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:116:15: ( '<property ' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:116:15: ( '<property ' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:116:17: '<property '
            {
            match("<property "); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROPERTYDEF"

    // $ANTLR start "ENDPROPERTY"
    public final void mENDPROPERTY() throws RecognitionException {
        try {
            int _type = ENDPROPERTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:117:13: ( ( '</property>' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:117:15: ( '</property>' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:117:15: ( '</property>' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:117:17: '</property>'
            {
            match("</property>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDPROPERTY"

    // $ANTLR start "IMPLEMENTATIONDEF"
    public final void mIMPLEMENTATIONDEF() throws RecognitionException {
        try {
            int _type = IMPLEMENTATIONDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:118:19: ( ( '<implementation.java ' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:118:21: ( '<implementation.java ' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:118:21: ( '<implementation.java ' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:118:23: '<implementation.java '
            {
            match("<implementation.java "); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IMPLEMENTATIONDEF"

    // $ANTLR start "ENDTAG"
    public final void mENDTAG() throws RecognitionException {
        try {
            int _type = ENDTAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:119:8: ( ( '/>' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:119:10: ( '/>' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:119:10: ( '/>' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:119:12: '/>'
            {
            match("/>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDTAG"

    // $ANTLR start "SERVICEDEF"
    public final void mSERVICEDEF() throws RecognitionException {
        try {
            int _type = SERVICEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:120:12: ( ( '<service ' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:120:14: ( '<service ' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:120:14: ( '<service ' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:120:16: '<service '
            {
            match("<service "); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SERVICEDEF"

    // $ANTLR start "ENDSERVICE"
    public final void mENDSERVICE() throws RecognitionException {
        try {
            int _type = ENDSERVICE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:121:12: ( ( '</service>' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:121:14: ( '</service>' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:121:14: ( '</service>' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:121:16: '</service>'
            {
            match("</service>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDSERVICE"

    // $ANTLR start "REFERENCEDEF"
    public final void mREFERENCEDEF() throws RecognitionException {
        try {
            int _type = REFERENCEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:122:14: ( ( '<reference ' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:122:16: ( '<reference ' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:122:16: ( '<reference ' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:122:18: '<reference '
            {
            match("<reference "); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REFERENCEDEF"

    // $ANTLR start "ENDREFERENCE"
    public final void mENDREFERENCE() throws RecognitionException {
        try {
            int _type = ENDREFERENCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:123:14: ( ( '</reference>' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:123:16: ( '</reference>' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:123:16: ( '</reference>' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:123:18: '</reference>'
            {
            match("</reference>"); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENDREFERENCE"

    // $ANTLR start "INTERFACEIMPL"
    public final void mINTERFACEIMPL() throws RecognitionException {
        try {
            int _type = INTERFACEIMPL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:124:15: ( ( '<interface.java ' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:124:17: ( '<interface.java ' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:124:17: ( '<interface.java ' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:124:19: '<interface.java '
            {
            match("<interface.java "); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERFACEIMPL"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:126:6: ( ( 'name=' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:126:8: ( 'name=' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:126:8: ( 'name=' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:126:10: 'name='
            {
            match("name="); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "TARGETNAMESPACE"
    public final void mTARGETNAMESPACE() throws RecognitionException {
        try {
            int _type = TARGETNAMESPACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:127:17: ( ( 'targetNamespace=' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:127:19: ( 'targetNamespace=' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:127:19: ( 'targetNamespace=' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:127:21: 'targetNamespace='
            {
            match("targetNamespace="); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TARGETNAMESPACE"

    // $ANTLR start "CLASS"
    public final void mCLASS() throws RecognitionException {
        try {
            int _type = CLASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:128:7: ( ( 'class=' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:128:9: ( 'class=' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:128:9: ( 'class=' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:128:11: 'class='
            {
            match("class="); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLASS"

    // $ANTLR start "INTERFACEDEF"
    public final void mINTERFACEDEF() throws RecognitionException {
        try {
            int _type = INTERFACEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:129:14: ( ( 'interface=' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:129:16: ( 'interface=' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:129:16: ( 'interface=' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:129:18: 'interface='
            {
            match("interface="); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTERFACEDEF"

    // $ANTLR start "IDPROP"
    public final void mIDPROP() throws RecognitionException {
        try {
            int _type = IDPROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:131:8: ( ( '\"ID\"' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:131:10: ( '\"ID\"' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:131:10: ( '\"ID\"' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:131:12: '\"ID\"'
            {
            match("\"ID\""); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IDPROP"

    // $ANTLR start "NICKNAMEPROP"
    public final void mNICKNAMEPROP() throws RecognitionException {
        try {
            int _type = NICKNAMEPROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:132:14: ( ( '\"nickname\"' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:132:16: ( '\"nickname\"' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:132:16: ( '\"nickname\"' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:132:18: '\"nickname\"'
            {
            match("\"nickname\""); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NICKNAMEPROP"

    // $ANTLR start "WEIGHTPROP"
    public final void mWEIGHTPROP() throws RecognitionException {
        try {
            int _type = WEIGHTPROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:133:12: ( ( '\"weight\"' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:133:14: ( '\"weight\"' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:133:14: ( '\"weight\"' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:133:16: '\"weight\"'
            {
            match("\"weight\""); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WEIGHTPROP"

    // $ANTLR start "HEIGHTPROP"
    public final void mHEIGHTPROP() throws RecognitionException {
        try {
            int _type = HEIGHTPROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:134:12: ( ( '\"height\"' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:134:14: ( '\"height\"' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:134:14: ( '\"height\"' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:134:16: '\"height\"'
            {
            match("\"height\""); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "HEIGHTPROP"

    // $ANTLR start "PRICEPROP"
    public final void mPRICEPROP() throws RecognitionException {
        try {
            int _type = PRICEPROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:135:11: ( ( '\"price\"' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:135:13: ( '\"price\"' )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:135:13: ( '\"price\"' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:135:15: '\"price\"'
            {
            match("\"price\""); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRICEPROP"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:137:5: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | ':' | '/' )* )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:137:7: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | ':' | '/' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:138:11: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '.' | ':' | '/' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='.' && LA1_0<=':')||(LA1_0>='A' && LA1_0<='Z')||LA1_0=='_'||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:
            	    {
            	    if ( (input.LA(1)>='.' && input.LA(1)<=':')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
            int _type = NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:140:5: ( ( ( '1' .. '9' ) ( '0' .. '9' )* '.' ( '0' .. '9' )* | '0' '.' ( '0' .. '9' )+ | '.' ( '0' .. '9' )+ | ( '1' .. '9' ) ( '0' .. '9' )* ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:141:4: ( ( '1' .. '9' ) ( '0' .. '9' )* '.' ( '0' .. '9' )* | '0' '.' ( '0' .. '9' )+ | '.' ( '0' .. '9' )+ | ( '1' .. '9' ) ( '0' .. '9' )* )
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:141:4: ( ( '1' .. '9' ) ( '0' .. '9' )* '.' ( '0' .. '9' )* | '0' '.' ( '0' .. '9' )+ | '.' ( '0' .. '9' )+ | ( '1' .. '9' ) ( '0' .. '9' )* )
            int alt7=4;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:142:5: ( '1' .. '9' ) ( '0' .. '9' )* '.' ( '0' .. '9' )*
                    {
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:142:5: ( '1' .. '9' )
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:142:6: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:142:16: ( '0' .. '9' )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>='0' && LA2_0<='9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:142:17: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    match('.'); 
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:142:32: ( '0' .. '9' )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:142:33: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:143:9: '0' '.' ( '0' .. '9' )+
                    {
                    match('0'); 
                    match('.'); 
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:143:16: ( '0' .. '9' )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:143:17: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 3 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:144:9: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:144:13: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:144:14: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt5 >= 1 ) break loop5;
                                EarlyExitException eee =
                                    new EarlyExitException(5, input);
                                throw eee;
                        }
                        cnt5++;
                    } while (true);


                    }
                    break;
                case 4 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:145:7: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:145:7: ( '1' .. '9' )
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:145:8: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:145:18: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:145:19: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUM"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:148:4: ( ( ' ' )+ )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:149:3: ( ' ' )+
            {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:149:3: ( ' ' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:149:5: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:151:7: ( '>' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:151:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:152:7: ( '<' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:152:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "QUOTE"
    public final void mQUOTE() throws RecognitionException {
        try {
            int _type = QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:153:7: ( '\"' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:153:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUOTE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:154:5: ( '.' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:154:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "RET"
    public final void mRET() throws RecognitionException {
        try {
            int _type = RET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:156:4: ( ( '\\r' | '\\n' | '\\t' | ' ' ) )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:156:6: ( '\\r' | '\\n' | '\\t' | ' ' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RET"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:158:19: ( '\\\\' )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:158:21: '\\\\'
            {
            match('\\'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "CODE"
    public final void mCODE() throws RecognitionException {
        try {
            int _type = CODE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:160:5: ( QUOTE ( ID | CODE )* QUOTE )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:160:7: QUOTE ( ID | CODE )* QUOTE
            {
            mQUOTE(); 
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:160:13: ( ID | CODE )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\"') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='\"'||(LA9_1>='A' && LA9_1<='Z')||(LA9_1>='a' && LA9_1<='z')) ) {
                        alt9=2;
                    }


                }
                else if ( ((LA9_0>='A' && LA9_0<='Z')||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:160:14: ID
            	    {
            	    mID(); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:160:19: CODE
            	    {
            	    mCODE(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            mQUOTE(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CODE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:162:8: ( '//' (~ ( RET ) )* | '/*' ( . )* '*/' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='/') ) {
                    alt12=1;
                }
                else if ( (LA12_1=='*') ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:162:12: '//' (~ ( RET ) )*
                    {
                    match("//"); 

                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:162:17: (~ ( RET ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='\u0000' && LA10_0<='\b')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\u001F')||(LA10_0>='!' && LA10_0<='\uFFFF')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:162:17: ~ ( RET )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||(input.LA(1)>='!' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:163:5: '/*' ( . )* '*/'
                    {
                    match("/*"); 

                    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:163:10: ( . )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='*') ) {
                            int LA11_1 = input.LA(2);

                            if ( (LA11_1=='/') ) {
                                alt11=2;
                            }
                            else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                                alt11=1;
                            }


                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:163:10: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match("*/"); 

                    _channel = HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "ERROR"
    public final void mERROR() throws RecognitionException {
        try {
            int _type = ERROR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:166:7: ( . )
            // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:166:9: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ERROR"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:8: ( INTESTAZIONE | INTESTAZIONE_COMPOSITE | COMPOSITEDEF | ENDCOMPOSITE | COMPONENTDEF | ENDCOMPONENT | PROPERTYDEF | ENDPROPERTY | IMPLEMENTATIONDEF | ENDTAG | SERVICEDEF | ENDSERVICE | REFERENCEDEF | ENDREFERENCE | INTERFACEIMPL | NAME | TARGETNAMESPACE | CLASS | INTERFACEDEF | IDPROP | NICKNAMEPROP | WEIGHTPROP | HEIGHTPROP | PRICEPROP | ID | NUM | WS | GT | LT | QUOTE | DOT | RET | CODE | COMMENT | ERROR )
        int alt13=35;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:10: INTESTAZIONE
                {
                mINTESTAZIONE(); 

                }
                break;
            case 2 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:23: INTESTAZIONE_COMPOSITE
                {
                mINTESTAZIONE_COMPOSITE(); 

                }
                break;
            case 3 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:46: COMPOSITEDEF
                {
                mCOMPOSITEDEF(); 

                }
                break;
            case 4 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:59: ENDCOMPOSITE
                {
                mENDCOMPOSITE(); 

                }
                break;
            case 5 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:72: COMPONENTDEF
                {
                mCOMPONENTDEF(); 

                }
                break;
            case 6 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:85: ENDCOMPONENT
                {
                mENDCOMPONENT(); 

                }
                break;
            case 7 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:98: PROPERTYDEF
                {
                mPROPERTYDEF(); 

                }
                break;
            case 8 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:110: ENDPROPERTY
                {
                mENDPROPERTY(); 

                }
                break;
            case 9 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:122: IMPLEMENTATIONDEF
                {
                mIMPLEMENTATIONDEF(); 

                }
                break;
            case 10 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:140: ENDTAG
                {
                mENDTAG(); 

                }
                break;
            case 11 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:147: SERVICEDEF
                {
                mSERVICEDEF(); 

                }
                break;
            case 12 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:158: ENDSERVICE
                {
                mENDSERVICE(); 

                }
                break;
            case 13 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:169: REFERENCEDEF
                {
                mREFERENCEDEF(); 

                }
                break;
            case 14 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:182: ENDREFERENCE
                {
                mENDREFERENCE(); 

                }
                break;
            case 15 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:195: INTERFACEIMPL
                {
                mINTERFACEIMPL(); 

                }
                break;
            case 16 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:209: NAME
                {
                mNAME(); 

                }
                break;
            case 17 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:214: TARGETNAMESPACE
                {
                mTARGETNAMESPACE(); 

                }
                break;
            case 18 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:230: CLASS
                {
                mCLASS(); 

                }
                break;
            case 19 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:236: INTERFACEDEF
                {
                mINTERFACEDEF(); 

                }
                break;
            case 20 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:249: IDPROP
                {
                mIDPROP(); 

                }
                break;
            case 21 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:256: NICKNAMEPROP
                {
                mNICKNAMEPROP(); 

                }
                break;
            case 22 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:269: WEIGHTPROP
                {
                mWEIGHTPROP(); 

                }
                break;
            case 23 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:280: HEIGHTPROP
                {
                mHEIGHTPROP(); 

                }
                break;
            case 24 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:291: PRICEPROP
                {
                mPRICEPROP(); 

                }
                break;
            case 25 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:301: ID
                {
                mID(); 

                }
                break;
            case 26 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:304: NUM
                {
                mNUM(); 

                }
                break;
            case 27 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:308: WS
                {
                mWS(); 

                }
                break;
            case 28 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:311: GT
                {
                mGT(); 

                }
                break;
            case 29 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:314: LT
                {
                mLT(); 

                }
                break;
            case 30 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:317: QUOTE
                {
                mQUOTE(); 

                }
                break;
            case 31 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:323: DOT
                {
                mDOT(); 

                }
                break;
            case 32 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:327: RET
                {
                mRET(); 

                }
                break;
            case 33 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:331: CODE
                {
                mCODE(); 

                }
                break;
            case 34 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:336: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 35 :
                // C:\\Users\\Yamuna\\UNI\\L&C\\Linguaggi&Compilatori\\src\\myScanner.g:1:344: ERROR
                {
                mERROR(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA7_eotS =
        "\1\uffff\1\5\2\uffff\1\5\2\uffff";
    static final String DFA7_eofS =
        "\7\uffff";
    static final String DFA7_minS =
        "\2\56\2\uffff\1\56\2\uffff";
    static final String DFA7_maxS =
        "\2\71\2\uffff\1\71\2\uffff";
    static final String DFA7_acceptS =
        "\2\uffff\1\2\1\3\1\uffff\1\4\1\1";
    static final String DFA7_specialS =
        "\7\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\3\1\uffff\1\2\11\1",
            "\1\6\1\uffff\12\4",
            "",
            "",
            "\1\6\1\uffff\12\4",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "141:4: ( ( '1' .. '9' ) ( '0' .. '9' )* '.' ( '0' .. '9' )* | '0' '.' ( '0' .. '9' )+ | '.' ( '0' .. '9' )+ | ( '1' .. '9' ) ( '0' .. '9' )* )";
        }
    }
    static final String DFA13_eotS =
        "\1\uffff\1\30\1\32\1\20\4\32\1\46\2\uffff\1\20\1\51\14\uffff\1"+
        "\32\3\uffff\4\32\23\uffff\5\32\7\uffff\5\32\1\121\6\uffff\1\32\1"+
        "\uffff\3\32\10\uffff\1\32\1\uffff\1\32\7\uffff\2\32\3\uffff\1\160"+
        "\2\uffff\2\32\1\uffff\1\164\1\165\1\uffff\2\32\3\uffff\1\32\1\uffff"+
        "\1\172\1\32\1\uffff\4\32\1\uffff";
    static final String DFA13_eofS =
        "\u0080\uffff";
    static final String DFA13_minS =
        "\1\0\1\57\1\155\1\52\2\141\1\154\1\156\1\42\2\uffff\1\56\1\60\5"+
        "\uffff\1\157\1\143\1\uffff\1\155\3\uffff\1\154\3\uffff\1\155\1\162"+
        "\1\141\1\164\5\42\7\uffff\1\155\1\157\5\uffff\1\156\1\145\1\147"+
        "\1\163\1\145\5\42\1\160\1\155\1\163\1\75\1\145\1\163\1\162\5\42"+
        "\1\157\1\160\1\75\1\uffff\1\164\1\75\1\146\1\uffff\4\42\1\156\1"+
        "\157\1\uffff\1\116\1\uffff\1\141\4\42\2\uffff\1\156\1\141\1\143"+
        "\4\42\2\uffff\1\155\1\145\3\42\1\uffff\1\145\1\75\1\42\2\uffff\1"+
        "\163\1\uffff\1\42\1\160\1\uffff\1\141\1\143\1\145\1\75\1\uffff";
    static final String DFA13_maxS =
        "\1\uffff\1\163\1\155\1\76\2\141\1\154\1\156\1\172\2\uffff\1\56"+
        "\1\71\5\uffff\1\157\1\163\1\uffff\1\156\3\uffff\1\154\3\uffff\1"+
        "\155\1\162\1\141\1\164\5\172\7\uffff\1\155\1\157\5\uffff\1\156\1"+
        "\145\1\147\1\163\1\145\5\172\1\160\1\155\1\163\1\75\1\145\1\163"+
        "\1\162\5\172\1\157\1\160\1\75\1\uffff\1\164\1\75\1\146\1\uffff\4"+
        "\172\1\163\1\157\1\uffff\1\116\1\uffff\1\141\4\172\2\uffff\1\163"+
        "\1\141\1\143\4\172\2\uffff\1\155\1\145\3\172\1\uffff\1\145\1\75"+
        "\1\172\2\uffff\1\163\1\uffff\1\172\1\160\1\uffff\1\141\1\143\1\145"+
        "\1\75\1\uffff";
    static final String DFA13_acceptS =
        "\11\uffff\1\31\1\32\2\uffff\1\33\1\34\1\40\1\43\1\1\2\uffff\1\7"+
        "\1\uffff\1\13\1\15\1\35\1\uffff\1\31\1\12\1\42\11\uffff\1\36\1\41"+
        "\1\32\1\37\1\33\1\34\1\40\2\uffff\1\10\1\14\1\16\1\11\1\17\31\uffff"+
        "\1\20\3\uffff\1\24\6\uffff\1\2\1\uffff\1\22\5\uffff\1\3\1\5\7\uffff"+
        "\1\4\1\6\5\uffff\1\30\3\uffff\1\26\1\27\1\uffff\1\23\2\uffff\1\25"+
        "\4\uffff\1\21";
    static final String DFA13_specialS =
        "\1\0\177\uffff}>";
    static final String[] DFA13_transitionS = {
            "\11\20\2\17\2\20\1\17\22\20\1\15\1\20\1\10\13\20\1\14\1\3\1"+
            "\13\11\12\2\20\1\1\1\20\1\16\2\20\32\11\6\20\2\11\1\6\5\11\1"+
            "\7\4\11\1\4\5\11\1\5\3\11\1\2\2\11\uff85\20",
            "\1\23\17\uffff\1\21\43\uffff\1\22\5\uffff\1\25\6\uffff\1\24"+
            "\1\uffff\1\27\1\26",
            "\1\31",
            "\1\34\4\uffff\1\34\16\uffff\1\33",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\47\36\uffff\10\47\1\41\21\47\6\uffff\7\47\1\44\5\47\1\42"+
            "\1\47\1\45\6\47\1\43\3\47",
            "",
            "",
            "\1\50",
            "\12\50",
            "",
            "",
            "",
            "",
            "",
            "\1\55",
            "\1\56\14\uffff\1\57\1\uffff\1\61\1\60",
            "",
            "\1\62\1\63",
            "",
            "",
            "",
            "\1\64",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\47\13\uffff\15\47\6\uffff\3\47\1\71\26\47\4\uffff\1\47"+
            "\1\uffff\32\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\10"+
            "\47\1\72\21\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\4"+
            "\47\1\73\25\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\4"+
            "\47\1\74\25\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\21"+
            "\47\1\75\10\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\76",
            "\1\77",
            "",
            "",
            "",
            "",
            "",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\2"+
            "\47\1\106\27\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\10"+
            "\47\1\107\21\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\10"+
            "\47\1\110\21\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\10"+
            "\47\1\111\21\47",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\47\36\uffff\32\47\6\uffff\32\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\12"+
            "\47\1\122\17\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\6"+
            "\47\1\123\23\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\6"+
            "\47\1\124\23\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\2"+
            "\47\1\125\27\47",
            "\1\126",
            "\1\127",
            "\1\130",
            "",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\15"+
            "\47\1\134\14\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\7"+
            "\47\1\135\22\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\7"+
            "\47\1\136\22\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\4"+
            "\47\1\137\25\47",
            "\1\141\4\uffff\1\140",
            "\1\142",
            "",
            "\1\143",
            "",
            "\1\144",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\1"+
            "\145\31\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\146\6\47",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\23"+
            "\47\1\147\6\47",
            "\1\150\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\152\4\uffff\1\151",
            "\1\153",
            "\1\154",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\14"+
            "\47\1\155\15\47",
            "\1\156\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\157\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "\1\47\36\uffff\32\47\6\uffff\32\47",
            "",
            "",
            "\1\161",
            "\1\162",
            "\1\47\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\4"+
            "\47\1\163\25\47",
            "\1\47\36\uffff\32\47\6\uffff\32\47",
            "\1\47\36\uffff\32\47\6\uffff\32\47",
            "",
            "\1\166",
            "\1\167",
            "\1\170\13\uffff\15\47\6\uffff\32\47\4\uffff\1\47\1\uffff\32"+
            "\47",
            "",
            "",
            "\1\171",
            "",
            "\1\47\36\uffff\32\47\6\uffff\32\47",
            "\1\173",
            "",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( INTESTAZIONE | INTESTAZIONE_COMPOSITE | COMPOSITEDEF | ENDCOMPOSITE | COMPONENTDEF | ENDCOMPONENT | PROPERTYDEF | ENDPROPERTY | IMPLEMENTATIONDEF | ENDTAG | SERVICEDEF | ENDSERVICE | REFERENCEDEF | ENDREFERENCE | INTERFACEIMPL | NAME | TARGETNAMESPACE | CLASS | INTERFACEDEF | IDPROP | NICKNAMEPROP | WEIGHTPROP | HEIGHTPROP | PRICEPROP | ID | NUM | WS | GT | LT | QUOTE | DOT | RET | CODE | COMMENT | ERROR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA13_0 = input.LA(1);

                        s = -1;
                        if ( (LA13_0=='<') ) {s = 1;}

                        else if ( (LA13_0=='x') ) {s = 2;}

                        else if ( (LA13_0=='/') ) {s = 3;}

                        else if ( (LA13_0=='n') ) {s = 4;}

                        else if ( (LA13_0=='t') ) {s = 5;}

                        else if ( (LA13_0=='c') ) {s = 6;}

                        else if ( (LA13_0=='i') ) {s = 7;}

                        else if ( (LA13_0=='\"') ) {s = 8;}

                        else if ( ((LA13_0>='A' && LA13_0<='Z')||(LA13_0>='a' && LA13_0<='b')||(LA13_0>='d' && LA13_0<='h')||(LA13_0>='j' && LA13_0<='m')||(LA13_0>='o' && LA13_0<='s')||(LA13_0>='u' && LA13_0<='w')||(LA13_0>='y' && LA13_0<='z')) ) {s = 9;}

                        else if ( ((LA13_0>='1' && LA13_0<='9')) ) {s = 10;}

                        else if ( (LA13_0=='0') ) {s = 11;}

                        else if ( (LA13_0=='.') ) {s = 12;}

                        else if ( (LA13_0==' ') ) {s = 13;}

                        else if ( (LA13_0=='>') ) {s = 14;}

                        else if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r') ) {s = 15;}

                        else if ( ((LA13_0>='\u0000' && LA13_0<='\b')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\u001F')||LA13_0=='!'||(LA13_0>='#' && LA13_0<='-')||(LA13_0>=':' && LA13_0<=';')||LA13_0=='='||(LA13_0>='?' && LA13_0<='@')||(LA13_0>='[' && LA13_0<='`')||(LA13_0>='{' && LA13_0<='\uFFFF')) ) {s = 16;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 13, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}