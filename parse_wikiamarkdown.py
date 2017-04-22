import sys
from antlr4 import *
from gen.wiki_markupLexer import wiki_markupLexer
from gen.wiki_markupParser import wiki_markupParser


def main(argv):
    input = FileStream(argv[1], encoding='utf-8')
    lexer = wiki_markupLexer(input)
    stream = CommonTokenStream(lexer)
    parser = wiki_markupParser(stream)
    tree = parser.wiki_article()
    print(tree.toStringTree(ruleNames=[''], recog=parser))


if __name__ == '__main__':
    main(sys.argv)