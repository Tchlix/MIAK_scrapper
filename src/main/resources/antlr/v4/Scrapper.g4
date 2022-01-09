grammar Scrapper;
start:
    codeBlock;

//Main block, if  block or loop block
codeBlock:
    (mainFunction END | COMMENT | WS)*;

//Functions which end with ';'
mainFunction:
    (ifBlock | create | assign | log | forLoop);

//Create new variable
create:
    'CREATE'
    WS
    assign
    ;

//Assign value to variable
assign:
    assignable
    WS
    'SET'
    WS
    (operation | request | fchildren)
    ;

//Tokens to which we can assign variable
assignable:
    (var | arrayElement);

//Log operation
log:
    'LOG'
    WS
    operation;

//Parse operation
parse:
    'PARSE'
    WS
    operation
    WS
    'TO'
    WS
    PARSE_OPTION
    ;

//Replace operation
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

//Get element children operation
fchildren:
    'CHILDREN'
    WS*
    '('
    WS*
    assignable
    WS*
    ')'
    ;

//Get array elements from appropriate tokens
arrayElement:
    (var | fchildren)
    (
    '['
    operation
    ']'
    )+
    ;

//Tokens which have/can contain string data
string:
    (SINGLE_QUOTATION | DOUBLE_QUOTATION | var | arrayElement | innerText | getAttribute);

//Get attribute from tokens which can contain element data
getAttribute:
    assignable
    WS
    'GET'
    WS
    'ATTRIBUTE'
    WS
    string
    ;

//Get text from tokens which can contain element data
innerText:
    assignable
    WS
    'INNER'
    WS
    'TEXT'
    ;

//If check with it's code block
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

//For loop with it's code block
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

//Tokens which can contain number
number:
    (NUMBER | arrayElement | length );

operation:
    (operable | WS OPERATOR WS operation )+;

//Length function
length:
    (var | arrayElement | elements | string)
    WS
    'LENGTH'
    ;

//Tokens on which we can make operations
operable:
    (primitive | elements | parse | arrayElement | innerText | replace | length | getAttribute);

//Webpage request
request:
    'GET'
    WS
    'WEB'
    WS
    string
    ;

//Tokens which we just output without modifications
primitive:
    VAR | SINGLE_QUOTATION | DOUBLE_QUOTATION | NUMBER;

//Get elements by ELEMENTS_TYPE from current page if document is not specified
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

//Tokens which can contain document data
documents:
    (VAR | request | arrayElement)WS;

//Wrapped var for easier visitor implementation
var:
    VAR;

COMMENT
  :  '#' ~( '\r' | '\n' )* -> skip;


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