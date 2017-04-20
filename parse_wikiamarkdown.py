import sys
from antlr4 import *
from gen.grammar_wikiLexer import grammar_wikiLexer
from gen.grammar_wikiParser import grammar_wikiParser


def main(argv):
    input = FileStream(argv[1], encoding='utf-8')
    lexer = grammar_wikiLexer(input)
    stream = CommonTokenStream(lexer)
    parser = grammar_wikiParser(stream)
    tree = parser.run_program()
    print(tree.toStringTree(ruleNames=[''], recog=parser))


if __name__ == '__main__':
    main(sys.argv)