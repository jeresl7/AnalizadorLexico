grammar MiLenguaje;

programa: instruccion+ ;

instruccion
    : declaracion
    | asignacion
    | impresion
    | condicional
    | accionRobot
    ;

declaracion
    : ('entero' | 'decimal') ID '=' expresion ';'
    ;

asignacion
    : ID '=' expresion ';'
    ;

impresion
    : 'mostrar' expresion ';'
    ;

condicional
    : 'si' '(' expresion ')' '{' instruccion+ '}'
    ;

accionRobot
    : 'avanzar' '(' expresion ')' ';'
    | 'girar' '(' expresion ')' ';'
    | 'detener' ';'
    | 'esperar' '(' expresion ')' ';'
    ;

expresion
    : expresion op=('*'|'/') expresion     
    | expresion op=('+'|'-') expresion     
    | expresion op=('>'|'<'|'==') expresion 
    | DECIMAL                              
    | ENTERO                               
    | ID                                   
    | '(' expresion ')'                   
    ;

entero: 'entero' ;
decimal: 'decimal' ;
mostrar: 'mostrar' ;
si: 'si' ;
avanzar: 'avanzar' ;
girar: 'girar' ;
detener: 'detener' ;
esperar: 'esperar' ;

ID: [a-zA-Z_][a-zA-Z_0-9]* ;
ENTERO: [0-9]+ ;
DECIMAL: [0-9]+ '.' [0-9]+ ;

WS: [ \t\r\n]+ -> skip ;
