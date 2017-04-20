# Generated from D:/Git/Парсер Викиразмертки\grammar_wiki.g4 by ANTLR 4.7
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys


def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17")
        buf.write("f\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\7\2&\n\2\f\2\16")
        buf.write("\2)\13\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3")
        buf.write("\4\3\5\3\5\3\6\3\6\5\6;\n\6\3\7\3\7\3\7\7\7@\n\7\f\7\16")
        buf.write("\7C\13\7\3\b\5\bF\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13")
        buf.write("\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3")
        buf.write("\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17")
        buf.write("\3\'\2\20\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\n\25\13")
        buf.write("\27\f\31\r\33\16\35\17\3\2\5\6\2]]__}}\177\177\n\2#>@")
        buf.write("\\^^`|\u0080\u0080\u0412\u0451\u2016\u2016\u2118\u2118")
        buf.write("\4\2\13\13\"\"\2h\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2")
        buf.write("\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23")
        buf.write("\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3")
        buf.write("\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5\60\3\2\2\2\7\63\3\2")
        buf.write("\2\2\t\66\3\2\2\2\13:\3\2\2\2\r<\3\2\2\2\17E\3\2\2\2\21")
        buf.write("G\3\2\2\2\23K\3\2\2\2\25M\3\2\2\2\27P\3\2\2\2\31T\3\2")
        buf.write("\2\2\33Y\3\2\2\2\35_\3\2\2\2\37 \7>\2\2 !\7#\2\2!\"\7")
        buf.write("/\2\2\"#\7/\2\2#\'\3\2\2\2$&\13\2\2\2%$\3\2\2\2&)\3\2")
        buf.write("\2\2\'(\3\2\2\2\'%\3\2\2\2(*\3\2\2\2)\'\3\2\2\2*+\7/\2")
        buf.write("\2+,\7/\2\2,-\7@\2\2-.\3\2\2\2./\b\2\2\2/\4\3\2\2\2\60")
        buf.write("\61\7]\2\2\61\62\7]\2\2\62\6\3\2\2\2\63\64\7_\2\2\64\65")
        buf.write("\7_\2\2\65\b\3\2\2\2\66\67\7~\2\2\67\n\3\2\2\28;\t\2\2")
        buf.write("\29;\5\t\5\2:8\3\2\2\2:9\3\2\2\2;\f\3\2\2\2<A\5\17\b\2")
        buf.write("=@\5\17\b\2>@\5\21\t\2?=\3\2\2\2?>\3\2\2\2@C\3\2\2\2A")
        buf.write("?\3\2\2\2AB\3\2\2\2B\16\3\2\2\2CA\3\2\2\2DF\t\3\2\2ED")
        buf.write("\3\2\2\2F\20\3\2\2\2GH\t\4\2\2HI\3\2\2\2IJ\b\t\2\2J\22")
        buf.write("\3\2\2\2KL\7?\2\2L\24\3\2\2\2MN\7?\2\2NO\7?\2\2O\26\3")
        buf.write("\2\2\2PQ\7?\2\2QR\7?\2\2RS\7?\2\2S\30\3\2\2\2TU\7?\2\2")
        buf.write("UV\7?\2\2VW\7?\2\2WX\7?\2\2X\32\3\2\2\2YZ\7?\2\2Z[\7?")
        buf.write("\2\2[\\\7?\2\2\\]\7?\2\2]^\7?\2\2^\34\3\2\2\2_`\7?\2\2")
        buf.write("`a\7?\2\2ab\7?\2\2bc\7?\2\2cd\7?\2\2de\7?\2\2e\36\3\2")
        buf.write("\2\2\b\2\':?AE\3\b\2\2")
        return buf.getvalue()


class grammar_wikiLexer(Lexer):

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    TextComment = 1
    StartLink = 2
    EndLink = 3
    OrDelimitter = 4
    ManageSymbols = 5
    AnyText = 6
    Whitespace = 7
    H1 = 8
    H2 = 9
    H3 = 10
    H4 = 11
    H5 = 12
    H6 = 13

    channelNames = [ u"DEFAULT_TOKEN_CHANNEL", u"HIDDEN" ]

    modeNames = [ "DEFAULT_MODE" ]

    literalNames = [ "<INVALID>",
            "'[['", "']]'", "'|'", "'='", "'=='", "'==='", "'===='", "'====='", 
            "'======'" ]

    symbolicNames = [ "<INVALID>",
            "TextComment", "StartLink", "EndLink", "OrDelimitter", "ManageSymbols", 
            "AnyText", "Whitespace", "H1", "H2", "H3", "H4", "H5", "H6" ]

    ruleNames = [ "TextComment", "StartLink", "EndLink", "OrDelimitter", 
                  "ManageSymbols", "AnyText", "AnySymbol", "Whitespace", 
                  "H1", "H2", "H3", "H4", "H5", "H6" ]

    grammarFileName = "grammar_wiki.g4"

    def __init__(self, input=None, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7")
        self._interp = LexerATNSimulator(self, self.atn, self.decisionsToDFA, PredictionContextCache())
        self._actions = None
        self._predicates = None


