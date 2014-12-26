grammar Acode;

init: row* block*;

row:
    'extern' 'def' type function ';'
    |assign ';'
    ;

type:
    ('void'|'int'|'str'|'bool'|'char'|'double') #basicType    
    | type ('['']')+ #array
    | type ('[' expr ']')+ #alloc_array
    ;

function: ID '('attrs')';

attrs: (type var (',' type var)*)?;

block: definition '{' in_block+ '}' | if_st;

definition: 'def' type function| loop;

in_block: 
    line ';'
    | block
    ;    

line:
    var_def
    |assign
    |ret 
    |statement 
    |func_call
    |expr
    ;
assign: var ':=' expr; 		
var_def: type var (':=' expr)?; 

func_call:
    ID '(' params ')'
    |ID '(' '"' val '"' ')'
    ;

params: (expr (',' expr)*)?;
loop:
    
    |while_st
    |for_st
    ;

if_st:'if' '(' expr ')' '{' in_block+ '}' ('elseif' '(' expr ')' '{' in_block+ '}' )* ('else' '{' in_block+ '}')?;
while_st: 'while' '(' expr ')';

for_st: 'for' '(' var_def ';' expr ';' statement ')';


var: ID
     | ID ('['']')+ 
     | ID ('[' expr ']')+ 
     ;
ret : 'ret' expr?;
statement: 
    ID '+=' val
    |ID '-=' val
    |ID '*=' val
    |ID '/=' val		
    ;
expr:
    
     expr op=(MUL | DIV |MOD ) expr
    | expr op=(ADD | SUB) expr  
    | expr op=AND expr
    |expr op=(EQ | NE | LE | GE | GT | LT)  expr 
    | '(' expr ')'
    |val
    |func_call
    ;


AND: 'and'| '&&';
OR: 'or'| '||';

ID: ('a'..'z' | 'A'..'Z')([a-zA-Z0-9])* ;
val : var # ValVar
| INT # ValInt
| DOUBLE # ValDouble
| STR # ValString
| CHAR # ValChar
| BOOL # ValBool
;


BOOL : 'false' | 'true';
INT : NUMBER;
DOUBLE : NUMBER '.' DIGIT*;
STR : '"' (~'"')* '"';
CHAR : '\'' (~'\'') '\'';
NUMBER : '0' | [1-9]DIGIT*;
DIGIT : [0-9];
WHITESPACE: [ |\n|\t] -> skip;




ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
EXP: '^';

EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
GT: '>';
LT: '<';
