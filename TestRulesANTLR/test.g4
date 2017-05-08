grammar test;

checks222:
    LeftCurlyBrace TestAnyText? RightCurlyBrace
    ;

LeftCurlyBrace: '{';
RightCurlyBrace: '}';

TestAnyText
    : ~(LeftCurlyBrace)+;