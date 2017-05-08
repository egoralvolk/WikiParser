grammar wiki_grammar;

wiki_article
    :   element_markup* EOF
    ;

element_markup
    :   comment
    |   tags
    |   table
    |   link
    |   additionally
    |   template
    |   address
    |   assignement
    |   headers
    |   '<br>'
    |   (ANYTEXT | MANAGE__SYMBOL | WHITESPACE)+
    ;

comment
    :   '<!--' comment_content? '-->'
    ;

tags
    :   ref | ignored_tags | other_tags
    ;

ignored_tags
    :   '<' IGNORED_TAGS WHITESPACE* '>' .*? '</' IGNORED_TAGS '>'
    |   '<' IGNORED_TAGS WHITESPACE* '/>'
    ;

other_tags
    :   '<' element_markup+ '>' element_markup* '</' ANYTEXT '>'
    |   '<' element_markup+ '/>'
    ;

ref
    :   '<ref' ((' name' element_markup) | (' group' element_markup))* '>' ref_content? '</ref>'
    |   '<ref' ((' name' element_markup) | (' group' element_markup))* '/>'
    ;

table
    :   '{|'  .*? '|''}'
    |   '{{{!}}' .*? '{{!}}}'
    ;

link
    :   '[[' link_content? ('|' link_content?)* ']]'
    ;

additionally
    :   '(' element_markup* ')'
    ;

assignement
    :   '=' element_markup*
    ;

address
    :   '[' address_content? ']'
    ;

template
    :   '{{' template_content? ('|' template_content?)* '}}'
    ;

headers
    :   H1 headers_content* H1
    |   H2 headers_content* H2
    |   H3 headers_content* H3
    |   H4 headers_content* H4
    |   H5 headers_content* H5
    |   H6 headers_content* H6;

address_content:   (element_markup ('|' element_markup)?)+;
template_content:   element_markup+;
link_content:   element_markup+;
comment_content:  element_markup+;
ref_content:   element_markup+;
headers_content:    element_markup+;

MANAGE__SYMBOL
    :   '!' | '-' | '/' | TABLE_DELIMITER
    ;

IGNORED_TAGS
    :   'nowiki' | 'code' | 'syntaxhighlight' | 'math' | 'pre'
    ;

REF_NAME
    :   'name' WHITESPACE* '=' '"'? ANYTEXT '"'?
    ;

ANYTEXT
    :  ~[/}|=\][{<> )(-]+;

H1: '=';
H2: '==';
H3: '===';
H4: '====';
H5: '=====';
H6: '======';

TABLE_DELIMITER
    :   '{{!}}'
    ;

WHITESPACE
    :   [ \t] -> skip
    ;

NEWLINE
    :   ([\r]? [\n])+
    ;