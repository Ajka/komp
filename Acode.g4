grammar Acode;

init: statements;

statements: statement (NEWLINE statement)*;

statement:
     type lvalue (ASSIGN expression)? ';'                  # AssignVar
     | lvalue ASSIGN expression ';'               	# Assign
     | expression                                       # Print
     | 'ret' (expression)?	';' 			# Ret
     | block              				#Block_st
     | IF expression block ('elseif' expression block )* ('else' block)?  # If
     | WHILE PAREN_OPEN expression PAREN_CLOSE block    # While 
     | FOR PAREN_OPEN statement expression';' own_assign PAREN_CLOSE block	#For
     | 'def' type name '(' args ')' block		# FunctionDef
     |                                                  # Emp
     | own_assign (';')?	  			# OwnAssing
     |'extern' 'def' type lvalue '('args')' ';' 	#Extern
     |'break' ';'					#Break
     ;

block:  BLOCK_START statements BLOCK_END ;

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

own_assign: lvalue op = ( '+='|'-='|'*=' |'/=' | '%=' |'^=') expression;

expression:
					
      op=('-'|'+') expression                            # Una
     | name '(' param_call ')'	(';')? 		   	 # FuncCall
     | expression op=EXP<assoc=right> expression         # Exp
     | expression op=(DIV|MUL|MOD) expression            # Mul
     | expression op=(ADD|SUB) expression                # Add
     | op=NOT expression                                 # Not
     | expression op=AND expression                      # And
     | expression op=OR expression                       # Or
     | expression op=(EQ| NE| LE| GE| GT| LT) expression  #Cmp
     | PAREN_OPEN expression PAREN_CLOSE                 # Par
     | lvalue						#Val
     | STRING                                            # Var
     | INT                                               # Int
     
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

STRING: [a-zA-Z][a-zA-Z0-9]*;
BOOL : 'false' | 'true';
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

EQ: '==';
NE: '!=';
LE: '<=';
GE: '>=';
GT: '>';
LT: '<';
