# SCRAP language to Javascript converter
Program accepts single path to file with SCRAP code and outputs to console JS equivalent
```
java -jar MIAK_scrapper.jar examples\example4.scrap
```

Grammar with comments can be found in
MIAK_scrapper/src/main/resources/antlr/v4/Scrapper.g4

# SCRAP Language
## Creating new variable
CREATE {variable name} SET {value};
## Setting variable value
{variable name} SET {value};
## Logging
LOG {variable name / operations};
## Math operations
LOG x SET x + 1 - 2 * 15 / 3 + "test";
## Parsing
PARSE {operable} TO {'INT' | 'FLOAT' | 'STRING'}
## Replace
{string} REPLACE {string} WITH {string}
## Get children
CHILDREN({element})
## Array
{array}[{number}]
## Get attribute
{element} GET ATTRIBUTE {string}
## Get inner text
{element} INNER TEXT
## If block
IF {variable} {operator} {variable}
  {code block}
END IF;
## For loop
FOR LOOP {variable name} FROM {variable/number} TO {variable/number}
  {code block}
END FOR;
## Length
{variable / string} LENGTH
## Web request
GET WEB {string}
## Get elements
GET ELEMENTS BY {'CLASS NAME' | 'TAG NAME'} {string}
## Comment
\# Some text
