grammar myScanner;

options {
  k = 1;
  language = Java;
}

@header{
  package compilerPackage;
  
  import dataPackage.*;
}

@lexer::header{
  package compilerPackage;
}

@members{
  Handler handler;
  void init(){
    handler = new Handler();
  }

  public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        String hdr = "* " + getErrorHeader(e);
        String msg = " - " + getErrorMessage(e, tokenNames);
        handler.addError ("Sintax Error. " + hdr + "\t" + msg + "\n\t"+e.toString());
   }

}

@lexer::members{
}

//______________________________________________________________________
// Definizione  regole sintattiche (produzioni) parser

// Start:
start
@init { init (); } :
      RET*
      header
      body
      methods
      RET* WS* 
      endings
      { handler.writeToFile(); };

// Header:
header: intestazioneXml?
        intestazioneComposite
        packagedef
        typeofcomponent
        implementationdef
        ;

intestazioneXml: INTESTAZIONE { handler.start(); } RET*;

intestazioneComposite: COMPOSITEDEF INTESTAZIONE_COMPOSITE RET* NAME CODE { handler.setCompositeName($CODE); } ;

packagedef: RET* TARGETNAMESPACE CODE {handler.setPackage($CODE); } GT;

typeofcomponent: RET* WS* COMPONENTDEF NAME CODE GT {handler.setTypeOfComponent($CODE);} ;

implementationdef: RET* WS* IMPLEMENTATIONDEF CLASS CODE {handler.addExtension($CODE);} ENDTAG ;

// Body:
body: RET* WS* PROPERTYDEF NAME propertyID RET* WS*
      propDef*
      ;

propDef : PROPERTYDEF NAME ( NICKNAMEPROP propertyNickName | WEIGHTPROP propertyWeight | HEIGHTPROP propertyHeight | PRICEPROP propertyPrice) RET* WS*;

propertyID: IDPROP GT ID ENDPROPERTY { handler.setIDProperty($ID); } ;

propertyNickName: GT ID ENDPROPERTY { handler.setNickNameProperty($ID); } ;

propertyWeight:  GT NUM ENDPROPERTY { handler.setWeightProperty($NUM); } ;

propertyHeight:  GT NUM ENDPROPERTY { handler.setHeightProperty($NUM); } ;

propertyPrice:  GT NUM ENDPROPERTY { handler.setPriceProperty($NUM); } ;


// Methods:
methods: 
         service1
         service2 
         reference1
         reference2
         ;

service1: SERVICEDEF NAME CODE GT RET* WS* ;
service2: INTERFACEIMPL INTERFACEDEF CODE {handler.addImplementation($CODE);} ENDTAG RET* WS* ENDSERVICE;
reference1: RET* WS* REFERENCEDEF NAME CODE GT RET* WS* ;
reference2: INTERFACEIMPL INTERFACEDEF CODE {handler.addImplementation($CODE);} ENDTAG RET* WS* ENDREFERENCE;
 
// Endings:
endings: ENDCOMPONENT RET* WS* ENDCOMPOSITE { handler.stop(); } ret;

qId : QUOTE? ID (DOT ID)*;

ret : RET+ | EOF;

//______________________________________________________________________
// Definizione  tokens per il lexer

INTESTAZIONE : ( '<?xml version="1.0" encoding="UTF-8"?>' ) ;

INTESTAZIONE_COMPOSITE : ( 'xmlns="http://www.osoa.org/xmlns/sca/1.0"' ) ;

COMPOSITEDEF : ( '<composite ' ) ;
ENDCOMPOSITE : ( '</composite>' ) ;
COMPONENTDEF : ( '<component ' ) ;
ENDCOMPONENT : ( '</component>' ) ;
PROPERTYDEF : ( '<property ' ) ;
ENDPROPERTY : ( '</property>' ) ;
IMPLEMENTATIONDEF : ( '<implementation.java ' ) ;
ENDTAG : ( '/>' ) ;
SERVICEDEF : ( '<service ' ) ;
ENDSERVICE : ( '</service>' ) ;
REFERENCEDEF : ( '<reference ' ) ;
ENDREFERENCE : ( '</reference>' ) ;
INTERFACEIMPL : ( '<interface.java ' ) ;

NAME : ( 'name=' ) ;
TARGETNAMESPACE : ( 'targetNamespace=' ) ;
CLASS : ( 'class=' ) ;
INTERFACEDEF : ( 'interface=' );

IDPROP : ( '"ID"' ) ;
NICKNAMEPROP : ( '"nickname"' ) ;
WEIGHTPROP : ( '"weight"' ) ;
HEIGHTPROP : ( '"height"' ) ;
PRICEPROP : ( '"price"' ) ;

ID  : ('a'..'z'|'A'..'Z') 
          ('a'..'z'|'A'..'Z'|'0'..'9'|'_'|'.'|':'|'/')* ;

NUM :
   (
    ('1'..'9') ('0'..'9')* '.' ('0'..'9')* 
    |   '0''.' ('0'..'9')+ 
    |   '.' ('0'..'9')+ 
    | ('1'..'9') ('0'..'9')*
   );

WS ://white spaces
  ( ' ' )+  ; 
  
GT    : '>' ;
LT    : '<' ; 
QUOTE : '"' ;
DOT : '.' ;

RET: ('\r' | '\n' | '\t' | ' ') ;

fragment BACKSLASH: '\\';

CODE: QUOTE (ID | CODE )* QUOTE ;

COMMENT:   '//' ~(RET)* {$channel=HIDDEN;}
  | '/*' .* '*/' {$channel = HIDDEN;}
  ; 

ERROR : . ; 
