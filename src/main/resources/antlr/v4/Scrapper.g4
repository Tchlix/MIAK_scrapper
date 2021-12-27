grammar Scrapper;

program:
    (((create | assign | log ) END ) | WS)*;

create:
    'CREATE'
    WS
    assign
    ;

assign:
    (var | arrayElement)
    WS
    'SET'
    WS
    operable
    ;

log:
    'LOG'
    WS
    operable;

parse:
    'PARSE'
    WS
    operable
    WS
    'TO'
    WS
    PARSE_OPTION
    ;

replace:
    replaceSub
    WS
    'REPLACE'
    WS
    replaceSub
    WS
    'WITH'
    WS
    replaceSub
    ;

replaceSub:
    (var | string | arrayElement | innerText);

arrayElement:
    (var | string)
    '['
    operable
    ']'
    ;

innerText:
    (var | arrayElement)
    WS
    'INNER'
    WS
    'TEXT'
    ;


operable:
    (operableSub | WS OPERATOR WS operable )+;

length:
    (var | arrayElement | elements | string)
    WS
    'LENGTH'
    ;

operableSub:
    (primitive | elements | parse | arrayElement | innerText | replace | length);

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
var:
    VAR;

SINGLE_QUOTATION:
    '\'' ~('\'')* '\''
    ;
DOUBLE_QUOTATION:
    '"' ~('"')* '"'
    ;

WS: [ \t\r\n]+;

ELEMENTS_TYPE: 'CLASS NAME' | 'TAG NAME';
PARSE_OPTION: 'INT' | 'FLOAT' | 'STRING';

END: ';';
OPERATOR: [/*+-];
VAR: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [+-]?([0-9]*[.])?[0-9]+;