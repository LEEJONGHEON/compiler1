grammar compiler1;

FuncType : 'int';
Ident    : 'main';
Return   : 'return';

Hexadecimal_prefix : '0x' | '0X';
Octal_const        : '0' Octal_digit*;
Decimal_const      : Nonzero_digit Digit*;
Hexadecimal_const  : Hexadecimal_prefix Hexadecimal_digit Hexadecimal_digit*;
Nonzero_digit      : '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9';
Octal_digit        : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7';
Digit              : '0' | Nonzero_digit;
Hexadecimal_digit  : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9'
                      | 'a' | 'b' | 'c' | 'd' | 'e' | 'f'
                      | 'A' | 'B' | 'C' | 'D' | 'E' | 'F';
         
Line_comment : '//' .*? '\r'?'\n' -> skip;
Comment : '/*' .*? '*/' -> skip;
WS : [\t | \n | \r | ' '] -> skip;


compUnit : funcDef;
funcDef  : FuncType Ident '(' ')' block;
block    : '{' stmt '}';
stmt     : Return number ';';
number   : Decimal_const | Octal_const | Hexadecimal_const;
