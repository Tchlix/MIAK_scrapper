grammar Scrapper;

program:
    (((create | assign | log | forLoop) END ) | WS)*;

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
    (operable | request)
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

forLoop:
    'FOR'
    WS
    'LOOP'
    WS
    VAR
    WS
    'FROM'
    WS
    number
    WS
    'TO'
    WS
    number
    WS
    program
    WS?
    'END'
    WS
    'FOR'
    ;

number:
    (NUMBER | arrayElement | length );

operable:
    (operableSub | WS OPERATOR WS operable )+;

length:
    (var | arrayElement | elements | string)
    WS
    'LENGTH'
    ;

operableSub:
    (primitive | elements | parse | arrayElement | innerText | replace | length );

request:
    'GET'
    WS
    'WEB'
    WS
    replaceSub
    ;

primitive:
    VAR | string | NUMBER;

elements:
   documents?
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

documents:
    (VAR | request | arrayElement)WS;

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