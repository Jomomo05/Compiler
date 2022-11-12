grammar Yaul;

@header{
    package antlr;
}

//Start Variable

prog: function+ EOF # Program
    ;

function: ID '{' (decl | expr | writeExpressions | writeNormals)+ '}' # FunctionDeclaration ;

decl: INT_TYPE ID '=' NUM SEMICOLON # Declaration
    | MATRIX_TYPE ID '=' MATRIX SEMICOLON # DeclarationMatrix
    | MATRIX_TYPE (','?ID)+ SEMICOLON # DeclarationEmptyMatrix
    | ID '=' MATRIX SEMICOLON # AlreadyDeclaredMatrix
    | INT_TYPE (','?ID)+ SEMICOLON # DeclarationEmptyInt
    | ID '=' NUM SEMICOLON # AlreadyDeclaredInt
    | ID '=' ID TRANSPOSE SEMICOLON # TransposedMatrixDeclaration
    | MATRIX_TYPE ID '=' (expr'^'?) '*' (expr'^'?)+ SEMICOLON # VariableDeclarationExprMult
    | MATRIX_TYPE ID '=' (expr'^'?) '/' (expr'^'?)+ SEMICOLON # VariableDeclarationExprivision
    | MATRIX_TYPE ID '=' (expr'^'?) '+' (expr'^'?)+ SEMICOLON # VariableDeclarationExprAddition
    | MATRIX_TYPE ID '=' (expr'^'?) '-' (expr'^'?)+ SEMICOLON # VariableDeclarationExprSubtraction
    ;

expr: expr '*' expr+ # Multiplication
    | expr '/' expr+ # Division
    | expr '+' expr+ # Addition
    | expr '-' expr+ # Subtraction
    | ID # Variable
    | NUM # Number
    ;

writeExpressions: WRITE expr '*' expr+ SEMICOLON # WriteMultiplication
                | WRITE expr '/' expr+ SEMICOLON # WriteDivision
                | WRITE expr '+' expr+ SEMICOLON # WriteAddition
                | WRITE expr '-' expr+ SEMICOLON # WriteSubtraction
                | WRITE (expr'^'?) '*' (expr'^'?)+ SEMICOLON # WriteMultiplicationTransposed
                | WRITE (expr'^'?) '/' (expr'^'?)+ SEMICOLON # WriteDivisionTransposed
                | WRITE (expr'^'?) '+' (expr'^'?)+ SEMICOLON # WriteAdditionTransposed
                | WRITE (expr'^'?) '-' (expr'^'?)+ SEMICOLON # WriteSubtractionTransposed
                ;

writeNormals: WRITE ID SEMICOLON # WriteVariable
            | WRITE NUM SEMICOLON # WriteNumber
            | WRITE ID TRANSPOSE SEMICOLON # WriteTransposedMatrix
            ;

/* Tokens */

WRITE: 'WRITE';
SEMICOLON: ';';
ID: [a-z][a-zA-Z0-9]*;
NUM: '0' | '-'?[1-9][0-9]*;
MATRIX: '[' (','?[1-9][0-9]*?';'?)* ']';
INT_TYPE: 'int' | 'INT';
MATRIX_TYPE: 'matrix' | 'MATRIX';
COMMENT: '//' ~[\n\r]* -> skip;
WS: [ \t\n\r]+ -> skip;
TRANSPOSE: '^';