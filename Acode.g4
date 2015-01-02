grammar Acode;

init: statements;

statements: statement (NEWLINE statement)*;

statement:
         assign_var            # AssVar
     | own_assign              # Own_ass
     | lvalue ASSIGN expression ';'               	# Assign
     | expression                                       # Print
     | 'ret' (expression)?	';' 				# Ret
     | block         	#Block_st
     | IF PAREN_OPEN expression op=(EQ| NE| LE| GE| GT| LT) expression PAREN_CLOSE block ('elseif' expression block )* ('else' block)?  # If
     | WHILE PAREN_OPEN expression PAREN_CLOSE block    # While 
     | FOR PAREN_OPEN assign_var
                    expression op=(EQ| NE| LE| GE| GT| LT) expression';' 
                    own_assign 
           PAREN_CLOSE block 	#For
     | 'def' type name '(' args ')' block		# FunctionDef
     |                                                  # Emp     
     |'extern' 'def' type name'('args')' ';' 	#Extern
     |'break' ';'					#Break
     ;

block:BLOCK_START statements BLOCK_END ;
assign_var: type lvalue (ASSIGN expression)? ';'  ;
own_assign: expression op = ( ADD_A
                        |SUB_A
                        |MUL_A
                        |DIV_A
                        |MOD_A
                        |EXP_A) expression (';')? 
                        ;

args: (type lvalue (',' type lvalue)*)?;
lvalue: 
     STRING
     |STRING ('['']')+ 
     |STRING ('[' expression ']')+ 
     ;

name: STRING;

type:   ('void'|'int'|'str'|'bool'|'char'|'double') #basicType    
    | type ('['']')+ #array
    | type ('[' expression ']')+ #alloc_array
    ;

param_call: (expression (',' expression)*)? ;


expression:				
      op=('-'|'+') expression                            # Una
     | name '(' param_call ')'	(';')? 		   	 # FuncCall
     | expression op=EXP<assoc=right> expression         # Exp
     | expression op=(DIV|MUL|MOD) expression            # Mul
     | expression op=(ADD|SUB) expression                # Add
     | op=NOT expression                                 # Not
     | expression op=AND expression                      # And
     | expression op=OR expression                       # Or
     | expression op=(EQ| NE| LE| GE| GT| LT) expression #Cmp
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | BOOL                                              # Bool
     | STRING                                            # Var
     | INT                                               # Int
     | lvalue					 	 #Val
     ;



AND: 'and'| '&&';
OR: 'or'| '||';
NOT: 'not';
NEWLINE:'\n';
ASSIGN: ':=';
BLOCK_START: '{';
BLOCK_END: '}';
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';


PAREN_OPEN: '(';
PAREN_CLOSE: ')';

BOOL : 'false' | 'true';
STRING: [a-zA-Z][a-zA-Z0-9]*;

INT : NUMBER;
DOUBLE : NUMBER '.' DIGIT*;
STR : '"' (~'"')* '"';
CHAR : '\'' (~'\'') '\'';
NUMBER : '0' | [1-9]DIGIT*;
DIGIT: [0-9];
WHITESPACE: [ |\n|\t] -> skip;

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
EXP: '^';

ADD_A:'+=';
SUB_A:'-=';
MUL_A:'*=';
DIV_A:'/=';
MOD_A: '%=';
EXP_A: '^=';

EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
GT: '>';
LT: '<';
