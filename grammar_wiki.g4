grammar grammar_wiki;

run_program
    :   elements? EOF
    ;

elements
    :   (element)+
    ;

element
    :   TextComment | link | heading | reference | template | AnyText
    ;

link
    :   StartLink link_args? EndLink
    ;

link_args
    :   link_arg (OrDelimitter link_arg)*
    ;

link_arg
    :   AnyText | link
    ;

reference
    :   StartRef ('name=' AnyText)? '>' reference_content EndRef
    ;

reference_content
    :   TextComment | AnyText | link | template
    ;

template
    :   StartTemplate AnyText (OrDelimitter template_args)* EndTemplate
    ;

template_args
    :   AnyText AssignementDelimitter AnyText
    ;


heading
    :   heading1
    |   heading2
    |   heading3
    |   heading4
    |   heading5
    |   heading6;

heading1: H1 AnyText H1;
heading2: H2 AnyText H2;
heading3: H3 AnyText H3;
heading4: H4 AnyText H4;
heading5: H5 AnyText H5;
heading6: H6 AnyText H6;

TextComment
    :   '<!--' .*? '-->' -> skip
    ;

StartLink
    :   '[['
    ;

EndLink
    :   ']]'
    ;

StartTemplate
    :   '{{'
    ;

EndTemplate
    :   '}}'
    ;

StartRef
    :   '<ref'
    ;

EndRef
    :   '</ref>'
    ;

OrDelimitter
    :   '|'
    ;

AssignementDelimitter
    :   '='
    ;

ManageSymbols
    :   '[[' | ']]' | '{{' | '}}' | '=' | OrDelimitter
    ;

AnyText
    :   AnySymbol
        (   AnySymbol | Whitespace
        )*
    ;

fragment
AnySymbol
    :   'a'..'z'
    |   'A'..'Z'
    |   'а'..'я'
    |   'А'..'Я'
    |   '@'
    |   [&%$№#!?*^:;_+0-9-]
    |   '/'
    |   '\''
    |   '"'
    |   [)(~`\\]
    |   [—,.]
    ;

Whitespace
    :   [ \t] -> skip
    ;

H1: '=';
H2: '==';
H3: '===';
H4: '====';
H5: '=====';
H6: '======';