grammar Scrapper;
start:
    codeBlock;

codeBlock:
    (mainFunction END | WS)*;

mainFunction:
    (ifBlock | create | assign | log | forLoop);

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
    (operation | request)
    ;

log:
    'LOG'
    WS
    operation;

parse:
    'PARSE'
    WS
    operation
    WS
    'TO'
    WS
    PARSE_OPTION
    ;

replace:
    string
    WS
    'REPLACE'
    WS
    string
    WS
    'WITH'
    WS
    string
    ;

arrayElement:
    var
    '['
    operation
    ']'
    ;

string:
    (SINGLE_QUOTATION | DOUBLE_QUOTATION | var | arrayElement | innerText | getAttribute);

getAttribute:
    (var | arrayElement)
    WS
    'GET'
    WS
    'ATTRIBUTE'
    WS
    string
    ;

innerText:
    (var | arrayElement | elements)
    WS
    'INNER'
    WS
    'TEXT'
    ;

ifBlock:
    'IF'
    WS
    operable
    WS
    IF_OPERATOR
    WS
    operable
    WS
    codeBlock
    'END'
    WS
    'IF'
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
    codeBlock
    WS?
    'END'
    WS
    'FOR'
    ;

number:
    (NUMBER | arrayElement | length );

operation:
    (operable | WS OPERATOR WS operation )+;

length:
    (var | arrayElement | elements | string)
    WS
    'LENGTH'
    ;

operable:
    (primitive | elements | parse | arrayElement | innerText | replace | length | getAttribute);

request:
    'GET'
    WS
    'WEB'
    WS
    string
    ;

primitive:
    VAR | SINGLE_QUOTATION | DOUBLE_QUOTATION | NUMBER;

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
IF_OPERATOR: '<=' | '>=' | '==' | '!=' | '<' | '>';
VAR: [a-zA-Z][a-zA-Z0-9]*;
NUMBER: [+-]?([0-9]*[.])?[0-9]+;