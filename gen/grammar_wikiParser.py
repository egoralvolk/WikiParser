# Generated from D:/Git/Парсер Викиразмертки\grammar_wiki.g4 by ANTLR 4.7
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17")
        buf.write("_\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b")
        buf.write("\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t")
        buf.write("\16\3\2\5\2\36\n\2\3\2\3\2\3\3\6\3#\n\3\r\3\16\3$\3\4")
        buf.write("\3\4\3\4\3\4\5\4+\n\4\3\5\3\5\5\5/\n\5\3\5\3\5\3\6\3\6")
        buf.write("\3\6\7\6\66\n\6\f\6\16\69\13\6\3\7\3\7\5\7=\n\7\3\b\3")
        buf.write("\b\3\b\3\b\3\b\3\b\5\bE\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3")
        buf.write("\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r")
        buf.write("\3\r\3\16\3\16\3\16\3\16\3\16\2\2\17\2\4\6\b\n\f\16\20")
        buf.write("\22\24\26\30\32\2\2\2^\2\35\3\2\2\2\4\"\3\2\2\2\6*\3\2")
        buf.write("\2\2\b,\3\2\2\2\n\62\3\2\2\2\f<\3\2\2\2\16D\3\2\2\2\20")
        buf.write("F\3\2\2\2\22J\3\2\2\2\24N\3\2\2\2\26R\3\2\2\2\30V\3\2")
        buf.write("\2\2\32Z\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\35\36\3\2")
        buf.write("\2\2\36\37\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!#\5\6\4\2\"")
        buf.write("!\3\2\2\2#$\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\5\3\2\2\2&+")
        buf.write("\7\3\2\2\'+\5\b\5\2(+\7\b\2\2)+\5\16\b\2*&\3\2\2\2*\'")
        buf.write("\3\2\2\2*(\3\2\2\2*)\3\2\2\2+\7\3\2\2\2,.\7\4\2\2-/\5")
        buf.write("\n\6\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\7\5\2\2\61")
        buf.write("\t\3\2\2\2\62\67\5\f\7\2\63\64\7\6\2\2\64\66\5\f\7\2\65")
        buf.write("\63\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\13")
        buf.write("\3\2\2\29\67\3\2\2\2:=\7\b\2\2;=\5\b\5\2<:\3\2\2\2<;\3")
        buf.write("\2\2\2=\r\3\2\2\2>E\5\20\t\2?E\5\22\n\2@E\5\24\13\2AE")
        buf.write("\5\26\f\2BE\5\30\r\2CE\5\32\16\2D>\3\2\2\2D?\3\2\2\2D")
        buf.write("@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\17\3\2\2\2FG")
        buf.write("\7\n\2\2GH\7\b\2\2HI\7\n\2\2I\21\3\2\2\2JK\7\13\2\2KL")
        buf.write("\7\b\2\2LM\7\13\2\2M\23\3\2\2\2NO\7\f\2\2OP\7\b\2\2PQ")
        buf.write("\7\f\2\2Q\25\3\2\2\2RS\7\r\2\2ST\7\b\2\2TU\7\r\2\2U\27")
        buf.write("\3\2\2\2VW\7\16\2\2WX\7\b\2\2XY\7\16\2\2Y\31\3\2\2\2Z")
        buf.write("[\7\17\2\2[\\\7\b\2\2\\]\7\17\2\2]\33\3\2\2\2\t\35$*.")
        buf.write("\67<D")
        return buf.getvalue()


class grammar_wikiParser ( Parser ):

    grammarFileName = "grammar_wiki.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "<INVALID>", "'[['", "']]'", "'|'", "<INVALID>", 
                     "<INVALID>", "<INVALID>", "'='", "'=='", "'==='", "'===='", 
                     "'====='", "'======'" ]

    symbolicNames = [ "<INVALID>", "TextComment", "StartLink", "EndLink", 
                      "OrDelimitter", "ManageSymbols", "AnyText", "Whitespace", 
                      "H1", "H2", "H3", "H4", "H5", "H6" ]

    RULE_run_program = 0
    RULE_elements = 1
    RULE_element = 2
    RULE_link = 3
    RULE_link_args = 4
    RULE_link_arg = 5
    RULE_headings = 6
    RULE_heading1 = 7
    RULE_heading2 = 8
    RULE_heading3 = 9
    RULE_heading4 = 10
    RULE_heading5 = 11
    RULE_heading6 = 12

    ruleNames =  [ "run_program", "elements", "element", "link", "link_args", 
                   "link_arg", "headings", "heading1", "heading2", "heading3", 
                   "heading4", "heading5", "heading6" ]

    EOF = Token.EOF
    TextComment=1
    StartLink=2
    EndLink=3
    OrDelimitter=4
    ManageSymbols=5
    AnyText=6
    Whitespace=7
    H1=8
    H2=9
    H3=10
    H4=11
    H5=12
    H6=13

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class Run_programContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def EOF(self):
            return self.getToken(grammar_wikiParser.EOF, 0)

        def elements(self):
            return self.getTypedRuleContext(grammar_wikiParser.ElementsContext,0)


        def getRuleIndex(self):
            return grammar_wikiParser.RULE_run_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterRun_program" ):
                listener.enterRun_program(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitRun_program" ):
                listener.exitRun_program(self)




    def run_program(self):

        localctx = grammar_wikiParser.Run_programContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_run_program)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 27
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if (((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << grammar_wikiParser.TextComment) | (1 << grammar_wikiParser.StartLink) | (1 << grammar_wikiParser.AnyText) | (1 << grammar_wikiParser.H1) | (1 << grammar_wikiParser.H2) | (1 << grammar_wikiParser.H3) | (1 << grammar_wikiParser.H4) | (1 << grammar_wikiParser.H5) | (1 << grammar_wikiParser.H6))) != 0):
                self.state = 26
                self.elements()


            self.state = 29
            self.match(grammar_wikiParser.EOF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ElementsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def element(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(grammar_wikiParser.ElementContext)
            else:
                return self.getTypedRuleContext(grammar_wikiParser.ElementContext,i)


        def getRuleIndex(self):
            return grammar_wikiParser.RULE_elements

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElements" ):
                listener.enterElements(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElements" ):
                listener.exitElements(self)




    def elements(self):

        localctx = grammar_wikiParser.ElementsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_elements)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 32 
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while True:
                self.state = 31
                self.element()
                self.state = 34 
                self._errHandler.sync(self)
                _la = self._input.LA(1)
                if not ((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << grammar_wikiParser.TextComment) | (1 << grammar_wikiParser.StartLink) | (1 << grammar_wikiParser.AnyText) | (1 << grammar_wikiParser.H1) | (1 << grammar_wikiParser.H2) | (1 << grammar_wikiParser.H3) | (1 << grammar_wikiParser.H4) | (1 << grammar_wikiParser.H5) | (1 << grammar_wikiParser.H6))) != 0)):
                    break

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ElementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def TextComment(self):
            return self.getToken(grammar_wikiParser.TextComment, 0)

        def link(self):
            return self.getTypedRuleContext(grammar_wikiParser.LinkContext,0)


        def AnyText(self):
            return self.getToken(grammar_wikiParser.AnyText, 0)

        def headings(self):
            return self.getTypedRuleContext(grammar_wikiParser.HeadingsContext,0)


        def getRuleIndex(self):
            return grammar_wikiParser.RULE_element

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterElement" ):
                listener.enterElement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitElement" ):
                listener.exitElement(self)




    def element(self):

        localctx = grammar_wikiParser.ElementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_element)
        try:
            self.state = 40
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [grammar_wikiParser.TextComment]:
                self.enterOuterAlt(localctx, 1)
                self.state = 36
                self.match(grammar_wikiParser.TextComment)
                pass
            elif token in [grammar_wikiParser.StartLink]:
                self.enterOuterAlt(localctx, 2)
                self.state = 37
                self.link()
                pass
            elif token in [grammar_wikiParser.AnyText]:
                self.enterOuterAlt(localctx, 3)
                self.state = 38
                self.match(grammar_wikiParser.AnyText)
                pass
            elif token in [grammar_wikiParser.H1, grammar_wikiParser.H2, grammar_wikiParser.H3, grammar_wikiParser.H4, grammar_wikiParser.H5, grammar_wikiParser.H6]:
                self.enterOuterAlt(localctx, 4)
                self.state = 39
                self.headings()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class LinkContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def StartLink(self):
            return self.getToken(grammar_wikiParser.StartLink, 0)

        def EndLink(self):
            return self.getToken(grammar_wikiParser.EndLink, 0)

        def link_args(self):
            return self.getTypedRuleContext(grammar_wikiParser.Link_argsContext,0)


        def getRuleIndex(self):
            return grammar_wikiParser.RULE_link

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLink" ):
                listener.enterLink(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLink" ):
                listener.exitLink(self)




    def link(self):

        localctx = grammar_wikiParser.LinkContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_link)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 42
            self.match(grammar_wikiParser.StartLink)
            self.state = 44
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            if _la==grammar_wikiParser.StartLink or _la==grammar_wikiParser.AnyText:
                self.state = 43
                self.link_args()


            self.state = 46
            self.match(grammar_wikiParser.EndLink)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Link_argsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def link_arg(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(grammar_wikiParser.Link_argContext)
            else:
                return self.getTypedRuleContext(grammar_wikiParser.Link_argContext,i)


        def OrDelimitter(self, i:int=None):
            if i is None:
                return self.getTokens(grammar_wikiParser.OrDelimitter)
            else:
                return self.getToken(grammar_wikiParser.OrDelimitter, i)

        def getRuleIndex(self):
            return grammar_wikiParser.RULE_link_args

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLink_args" ):
                listener.enterLink_args(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLink_args" ):
                listener.exitLink_args(self)




    def link_args(self):

        localctx = grammar_wikiParser.Link_argsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_link_args)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 48
            self.link_arg()
            self.state = 53
            self._errHandler.sync(self)
            _la = self._input.LA(1)
            while _la==grammar_wikiParser.OrDelimitter:
                self.state = 49
                self.match(grammar_wikiParser.OrDelimitter)
                self.state = 50
                self.link_arg()
                self.state = 55
                self._errHandler.sync(self)
                _la = self._input.LA(1)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Link_argContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def AnyText(self):
            return self.getToken(grammar_wikiParser.AnyText, 0)

        def link(self):
            return self.getTypedRuleContext(grammar_wikiParser.LinkContext,0)


        def getRuleIndex(self):
            return grammar_wikiParser.RULE_link_arg

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLink_arg" ):
                listener.enterLink_arg(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLink_arg" ):
                listener.exitLink_arg(self)




    def link_arg(self):

        localctx = grammar_wikiParser.Link_argContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_link_arg)
        try:
            self.state = 58
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [grammar_wikiParser.AnyText]:
                self.enterOuterAlt(localctx, 1)
                self.state = 56
                self.match(grammar_wikiParser.AnyText)
                pass
            elif token in [grammar_wikiParser.StartLink]:
                self.enterOuterAlt(localctx, 2)
                self.state = 57
                self.link()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class HeadingsContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def heading1(self):
            return self.getTypedRuleContext(grammar_wikiParser.Heading1Context,0)


        def heading2(self):
            return self.getTypedRuleContext(grammar_wikiParser.Heading2Context,0)


        def heading3(self):
            return self.getTypedRuleContext(grammar_wikiParser.Heading3Context,0)


        def heading4(self):
            return self.getTypedRuleContext(grammar_wikiParser.Heading4Context,0)


        def heading5(self):
            return self.getTypedRuleContext(grammar_wikiParser.Heading5Context,0)


        def heading6(self):
            return self.getTypedRuleContext(grammar_wikiParser.Heading6Context,0)


        def getRuleIndex(self):
            return grammar_wikiParser.RULE_headings

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeadings" ):
                listener.enterHeadings(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeadings" ):
                listener.exitHeadings(self)




    def headings(self):

        localctx = grammar_wikiParser.HeadingsContext(self, self._ctx, self.state)
        self.enterRule(localctx, 12, self.RULE_headings)
        try:
            self.state = 66
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [grammar_wikiParser.H1]:
                self.enterOuterAlt(localctx, 1)
                self.state = 60
                self.heading1()
                pass
            elif token in [grammar_wikiParser.H2]:
                self.enterOuterAlt(localctx, 2)
                self.state = 61
                self.heading2()
                pass
            elif token in [grammar_wikiParser.H3]:
                self.enterOuterAlt(localctx, 3)
                self.state = 62
                self.heading3()
                pass
            elif token in [grammar_wikiParser.H4]:
                self.enterOuterAlt(localctx, 4)
                self.state = 63
                self.heading4()
                pass
            elif token in [grammar_wikiParser.H5]:
                self.enterOuterAlt(localctx, 5)
                self.state = 64
                self.heading5()
                pass
            elif token in [grammar_wikiParser.H6]:
                self.enterOuterAlt(localctx, 6)
                self.state = 65
                self.heading6()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Heading1Context(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def H1(self, i:int=None):
            if i is None:
                return self.getTokens(grammar_wikiParser.H1)
            else:
                return self.getToken(grammar_wikiParser.H1, i)

        def AnyText(self):
            return self.getToken(grammar_wikiParser.AnyText, 0)

        def getRuleIndex(self):
            return grammar_wikiParser.RULE_heading1

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeading1" ):
                listener.enterHeading1(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeading1" ):
                listener.exitHeading1(self)




    def heading1(self):

        localctx = grammar_wikiParser.Heading1Context(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_heading1)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 68
            self.match(grammar_wikiParser.H1)
            self.state = 69
            self.match(grammar_wikiParser.AnyText)
            self.state = 70
            self.match(grammar_wikiParser.H1)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Heading2Context(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def H2(self, i:int=None):
            if i is None:
                return self.getTokens(grammar_wikiParser.H2)
            else:
                return self.getToken(grammar_wikiParser.H2, i)

        def AnyText(self):
            return self.getToken(grammar_wikiParser.AnyText, 0)

        def getRuleIndex(self):
            return grammar_wikiParser.RULE_heading2

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeading2" ):
                listener.enterHeading2(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeading2" ):
                listener.exitHeading2(self)




    def heading2(self):

        localctx = grammar_wikiParser.Heading2Context(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_heading2)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 72
            self.match(grammar_wikiParser.H2)
            self.state = 73
            self.match(grammar_wikiParser.AnyText)
            self.state = 74
            self.match(grammar_wikiParser.H2)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Heading3Context(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def H3(self, i:int=None):
            if i is None:
                return self.getTokens(grammar_wikiParser.H3)
            else:
                return self.getToken(grammar_wikiParser.H3, i)

        def AnyText(self):
            return self.getToken(grammar_wikiParser.AnyText, 0)

        def getRuleIndex(self):
            return grammar_wikiParser.RULE_heading3

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeading3" ):
                listener.enterHeading3(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeading3" ):
                listener.exitHeading3(self)




    def heading3(self):

        localctx = grammar_wikiParser.Heading3Context(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_heading3)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 76
            self.match(grammar_wikiParser.H3)
            self.state = 77
            self.match(grammar_wikiParser.AnyText)
            self.state = 78
            self.match(grammar_wikiParser.H3)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Heading4Context(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def H4(self, i:int=None):
            if i is None:
                return self.getTokens(grammar_wikiParser.H4)
            else:
                return self.getToken(grammar_wikiParser.H4, i)

        def AnyText(self):
            return self.getToken(grammar_wikiParser.AnyText, 0)

        def getRuleIndex(self):
            return grammar_wikiParser.RULE_heading4

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeading4" ):
                listener.enterHeading4(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeading4" ):
                listener.exitHeading4(self)




    def heading4(self):

        localctx = grammar_wikiParser.Heading4Context(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_heading4)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 80
            self.match(grammar_wikiParser.H4)
            self.state = 81
            self.match(grammar_wikiParser.AnyText)
            self.state = 82
            self.match(grammar_wikiParser.H4)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Heading5Context(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def H5(self, i:int=None):
            if i is None:
                return self.getTokens(grammar_wikiParser.H5)
            else:
                return self.getToken(grammar_wikiParser.H5, i)

        def AnyText(self):
            return self.getToken(grammar_wikiParser.AnyText, 0)

        def getRuleIndex(self):
            return grammar_wikiParser.RULE_heading5

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeading5" ):
                listener.enterHeading5(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeading5" ):
                listener.exitHeading5(self)




    def heading5(self):

        localctx = grammar_wikiParser.Heading5Context(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_heading5)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 84
            self.match(grammar_wikiParser.H5)
            self.state = 85
            self.match(grammar_wikiParser.AnyText)
            self.state = 86
            self.match(grammar_wikiParser.H5)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class Heading6Context(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def H6(self, i:int=None):
            if i is None:
                return self.getTokens(grammar_wikiParser.H6)
            else:
                return self.getToken(grammar_wikiParser.H6, i)

        def AnyText(self):
            return self.getToken(grammar_wikiParser.AnyText, 0)

        def getRuleIndex(self):
            return grammar_wikiParser.RULE_heading6

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterHeading6" ):
                listener.enterHeading6(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitHeading6" ):
                listener.exitHeading6(self)




    def heading6(self):

        localctx = grammar_wikiParser.Heading6Context(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_heading6)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 88
            self.match(grammar_wikiParser.H6)
            self.state = 89
            self.match(grammar_wikiParser.AnyText)
            self.state = 90
            self.match(grammar_wikiParser.H6)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





