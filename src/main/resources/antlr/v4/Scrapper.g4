grammar Scrapper;

program:
    (((create | assign | log ) END ) | WS)*;

create:
    'CREATE'
    WS
    assign
    ;

assign:
    VAR
    WS
    'SET'
    WS
    operable
    ;

log:
    'LOG'
    WS
    operable;

operable:
    (primitive | elements | WS OPERATOR WS operable )+;

primitive:
    VAR | string | NUMBER;

elements:
   'GET'
   WS
   'ELEMENTS'
   WS
   'BY'
   WS
   ELEMENTS_TYPE
   WS
   string
   ;

string:
    (SINGLE_QUOTATION | DOUBLE_QUOTATION)
    ;
SINGLE_QUOTATION:
    '\'' ~('\'')+ '\''
    ;
DOUBLE_QUOTATION:
    '"' ~('"')+ '"'
    ;

WS: [ \t\r\n]+;

ELEMENTS_TYPE: 'CLASS NAME' | 'TAG NAME';

END: ';';
OPERATOR: [/*+-];
VAR: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [+-]?([0-9]*[.])?[0-9]+;