// Generated from Acode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AcodeParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__20=1, T__19=2, T__18=3, T__17=4, T__16=5, T__15=6, T__14=7, T__13=8, 
		T__12=9, T__11=10, T__10=11, T__9=12, T__8=13, T__7=14, T__6=15, T__5=16, 
		T__4=17, T__3=18, T__2=19, T__1=20, T__0=21, AND=22, OR=23, NOT=24, NEWLINE=25, 
		ASSIGN=26, BLOCK_START=27, BLOCK_END=28, IF=29, ELSE=30, WHILE=31, FOR=32, 
		PAREN_OPEN=33, PAREN_CLOSE=34, STRING=35, BOOL=36, INT=37, DOUBLE=38, 
		STR=39, CHAR=40, NUMBER=41, DIGIT=42, WHITESPACE=43, ADD=44, SUB=45, MUL=46, 
		DIV=47, MOD=48, EXP=49, EQ=50, NE=51, LE=52, GE=53, GT=54, LT=55;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'-='", "','", "'['", "'int'", "'ret'", "'void'", 
		"'def'", "'double'", "'break'", "'+='", "'^='", "'char'", "'elseif'", 
		"'*='", "'bool'", "'extern'", "';'", "'%='", "'/='", "'str'", "AND", "OR", 
		"'not'", "'\n'", "':='", "'{'", "'}'", "'if'", "'else'", "'while'", "'for'", 
		"'('", "')'", "STRING", "BOOL", "INT", "DOUBLE", "STR", "CHAR", "NUMBER", 
		"DIGIT", "WHITESPACE", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'=='", 
		"'!='", "'<='", "'>='", "'>'", "'<'"
	};
	public static final int
		RULE_init = 0, RULE_statements = 1, RULE_statement = 2, RULE_args = 3, 
		RULE_lvalue = 4, RULE_name = 5, RULE_type = 6, RULE_param_call = 7, RULE_own_assign = 8, 
		RULE_expression = 9;
	public static final String[] ruleNames = {
		"init", "statements", "statement", "args", "lvalue", "name", "type", "param_call", 
		"own_assign", "expression"
	};

	@Override
	public String getGrammarFileName() { return "Acode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public AcodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); statements();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<TerminalNode> NEWLINE() { return getTokens(AcodeParser.NEWLINE); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public TerminalNode NEWLINE(int i) {
			return getToken(AcodeParser.NEWLINE, i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitStatements(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitStatements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statements);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(22); statement();
			setState(27);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					{
					{
					setState(23); match(NEWLINE);
					setState(24); statement();
					}
					} 
				}
				setState(29);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AssignContext extends StatementContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AcodeParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BreakContext extends StatementContext {
		public BreakContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterBreak(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitBreak(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitBreak(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionDefContext extends StatementContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(AcodeParser.BLOCK_END, 0); }
		public TerminalNode BLOCK_START() { return getToken(AcodeParser.BLOCK_START, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FunctionDefContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterFunctionDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitFunctionDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitFunctionDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrintContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVarContext extends StatementContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(AcodeParser.ASSIGN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignVarContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAssignVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAssignVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAssignVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EmpContext extends StatementContext {
		public EmpContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterEmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitEmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitEmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExternContext extends StatementContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ExternContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterExtern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitExtern(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitExtern(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatementContext {
		public TerminalNode WHILE() { return getToken(AcodeParser.WHILE, 0); }
		public TerminalNode PAREN_CLOSE() { return getToken(AcodeParser.PAREN_CLOSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode PAREN_OPEN() { return getToken(AcodeParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhileContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForContext extends StatementContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode PAREN_CLOSE() { return getToken(AcodeParser.PAREN_CLOSE, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public Own_assignContext own_assign() {
			return getRuleContext(Own_assignContext.class,0);
		}
		public TerminalNode FOR() { return getToken(AcodeParser.FOR, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(AcodeParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitFor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OwnAssingContext extends StatementContext {
		public Own_assignContext own_assign() {
			return getRuleContext(Own_assignContext.class,0);
		}
		public OwnAssingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterOwnAssing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitOwnAssing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitOwnAssing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatementContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode IF() { return getToken(AcodeParser.IF, 0); }
		public List<StatementsContext> statements() {
			return getRuleContexts(StatementsContext.class);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementsContext statements(int i) {
			return getRuleContext(StatementsContext.class,i);
		}
		public IfContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RetContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public RetContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitRet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BlockContext extends StatementContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TerminalNode BLOCK_END() { return getToken(AcodeParser.BLOCK_END, 0); }
		public TerminalNode BLOCK_START() { return getToken(AcodeParser.BLOCK_START, 0); }
		public BlockContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(107);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(30); type(0);
				setState(31); lvalue();
				setState(32); match(ASSIGN);
				setState(33); expression(0);
				setState(34); match(18);
				}
				break;

			case 2:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36); lvalue();
				setState(37); match(ASSIGN);
				setState(38); expression(0);
				setState(39); match(18);
				}
				break;

			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(41); expression(0);
				}
				break;

			case 4:
				_localctx = new RetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42); match(6);
				setState(43); expression(0);
				setState(44); match(18);
				}
				break;

			case 5:
				_localctx = new BlockContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(46); match(BLOCK_START);
				setState(47); statements();
				setState(48); match(BLOCK_END);
				}
				break;

			case 6:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(50); match(IF);
				setState(51); expression(0);
				setState(52); statements();
				setState(59);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(53); match(14);
						setState(54); expression(0);
						setState(55); statements();
						}
						} 
					}
					setState(61);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
				}
				setState(64);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(62); match(ELSE);
					setState(63); statements();
					}
					break;
				}
				}
				break;

			case 7:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(66); match(WHILE);
				setState(67); match(PAREN_OPEN);
				setState(68); expression(0);
				setState(69); match(PAREN_CLOSE);
				setState(70); statements();
				}
				break;

			case 8:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(72); match(FOR);
				setState(73); match(PAREN_OPEN);
				setState(74); statement();
				setState(75); expression(0);
				setState(76); match(18);
				setState(77); own_assign();
				setState(78); match(PAREN_CLOSE);
				setState(79); statements();
				}
				break;

			case 9:
				_localctx = new FunctionDefContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(81); match(8);
				setState(82); type(0);
				setState(83); name();
				setState(84); match(PAREN_OPEN);
				setState(85); args();
				setState(86); match(PAREN_CLOSE);
				setState(87); match(BLOCK_START);
				setState(88); statements();
				setState(89); match(BLOCK_END);
				}
				break;

			case 10:
				_localctx = new EmpContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				}
				break;

			case 11:
				_localctx = new OwnAssingContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(92); own_assign();
				setState(94);
				_la = _input.LA(1);
				if (_la==18) {
					{
					setState(93); match(18);
					}
				}

				}
				break;

			case 12:
				_localctx = new ExternContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(96); match(17);
				setState(97); match(8);
				setState(98); type(0);
				setState(99); lvalue();
				setState(100); match(PAREN_OPEN);
				setState(101); args();
				setState(102); match(PAREN_CLOSE);
				setState(103); match(18);
				}
				break;

			case 13:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(105); match(10);
				setState(106); match(18);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgsContext extends ParserRuleContext {
		public LvalueContext lvalue(int i) {
			return getRuleContext(LvalueContext.class,i);
		}
		public List<LvalueContext> lvalue() {
			return getRuleContexts(LvalueContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 9) | (1L << 13) | (1L << 16) | (1L << 21))) != 0)) {
				{
				setState(109); type(0);
				setState(110); lvalue();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(111); match(3);
					setState(112); type(0);
					setState(113); lvalue();
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LvalueContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode STRING() { return getToken(AcodeParser.STRING, 0); }
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterLvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitLvalue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitLvalue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lvalue);
		try {
			int _alt;
			setState(139);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122); match(STRING);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123); match(STRING);
				setState(126); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(124); match(4);
						setState(125); match(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(128); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(130); match(STRING);
				setState(135); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(131); match(4);
						setState(132); expression(0);
						setState(133); match(1);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(137); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
				} while ( _alt!=2 && _alt!=-1 );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(AcodeParser.STRING, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public int _p;
		public TypeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TypeContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_type; }
	 
		public TypeContext() { }
		public void copyFrom(TypeContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class Alloc_arrayContext extends TypeContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Alloc_arrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAlloc_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAlloc_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAlloc_array(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BasicTypeContext extends TypeContext {
		public BasicTypeContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterBasicType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitBasicType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitBasicType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayContext extends TypeContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ArrayContext(TypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState, _p);
		TypeContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, RULE_type);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BasicTypeContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(144);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 5) | (1L << 7) | (1L << 9) | (1L << 13) | (1L << 16) | (1L << 21))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
			}
			_ctx.stop = _input.LT(-1);
			setState(164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(162);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new ArrayContext(new TypeContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(146);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(149); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(147); match(4);
								setState(148); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(151); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;

					case 2:
						{
						_localctx = new Alloc_arrayContext(new TypeContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_type);
						setState(153);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(158); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(154); match(4);
								setState(155); expression(0);
								setState(156); match(1);
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(160); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						} while ( _alt!=2 && _alt!=-1 );
						}
						break;
					}
					} 
				}
				setState(166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Param_callContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public Param_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterParam_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitParam_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitParam_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Param_callContext param_call() throws RecognitionException {
		Param_callContext _localctx = new Param_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_param_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << PAREN_OPEN) | (1L << STRING) | (1L << INT) | (1L << ADD) | (1L << SUB))) != 0)) {
				{
				setState(167); expression(0);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(168); match(3);
					setState(169); expression(0);
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Own_assignContext extends ParserRuleContext {
		public Token op;
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Own_assignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_own_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterOwn_assign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitOwn_assign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitOwn_assign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Own_assignContext own_assign() throws RecognitionException {
		Own_assignContext _localctx = new Own_assignContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_own_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177); lvalue();
			setState(178);
			((Own_assignContext)_localctx).op = _input.LT(1);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << 11) | (1L << 12) | (1L << 15) | (1L << 19) | (1L << 20))) != 0)) ) {
				((Own_assignContext)_localctx).op = (Token)_errHandler.recoverInline(this);
			}
			consume();
			setState(179); expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
			this._p = ctx._p;
		}
	}
	public static class ExpContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EXP() { return getToken(AcodeParser.EXP, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode MUL() { return getToken(AcodeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(AcodeParser.DIV, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode MOD() { return getToken(AcodeParser.MOD, 0); }
		public MulContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterMul(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitMul(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitMul(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OR() { return getToken(AcodeParser.OR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CmpContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LT() { return getToken(AcodeParser.LT, 0); }
		public TerminalNode LE() { return getToken(AcodeParser.LE, 0); }
		public TerminalNode NE() { return getToken(AcodeParser.NE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode GT() { return getToken(AcodeParser.GT, 0); }
		public TerminalNode GE() { return getToken(AcodeParser.GE, 0); }
		public TerminalNode EQ() { return getToken(AcodeParser.EQ, 0); }
		public CmpContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterCmp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitCmp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitCmp(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UnaContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterUna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitUna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitUna(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public TerminalNode SUB() { return getToken(AcodeParser.SUB, 0); }
		public TerminalNode ADD() { return getToken(AcodeParser.ADD, 0); }
		public AddContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExpressionContext {
		public Param_callContext param_call() {
			return getRuleContext(Param_callContext.class,0);
		}
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public FuncCallContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ValContext extends ExpressionContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ValContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitVal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParContext extends ExpressionContext {
		public TerminalNode PAREN_CLOSE() { return getToken(AcodeParser.PAREN_CLOSE, 0); }
		public TerminalNode PAREN_OPEN() { return getToken(AcodeParser.PAREN_OPEN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitPar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitPar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntContext extends ExpressionContext {
		public TerminalNode INT() { return getToken(AcodeParser.INT, 0); }
		public IntContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarContext extends ExpressionContext {
		public TerminalNode STRING() { return getToken(AcodeParser.STRING, 0); }
		public VarContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitVar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public Token op;
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(AcodeParser.AND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotContext extends ExpressionContext {
		public Token op;
		public TerminalNode NOT() { return getToken(AcodeParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NotContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).enterNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AcodeListener ) ((AcodeListener)listener).exitNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AcodeVisitor ) return ((AcodeVisitor<? extends T>)visitor).visitNot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new UnaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(182);
				((UnaContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==SUB) ) {
					((UnaContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				consume();
				setState(183); expression(13);
				}
				break;

			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184); ((NotContext)_localctx).op = match(NOT);
				setState(185); expression(8);
				}
				break;

			case 3:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186); name();
				setState(187); match(PAREN_OPEN);
				setState(188); param_call();
				setState(189); match(PAREN_CLOSE);
				setState(191);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(190); match(18);
					}
					break;
				}
				}
				break;

			case 4:
				{
				_localctx = new ParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(193); match(PAREN_OPEN);
				setState(194); expression(0);
				setState(195); match(PAREN_CLOSE);
				}
				break;

			case 5:
				{
				_localctx = new VarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(197); match(STRING);
				}
				break;

			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(198); match(INT);
				}
				break;

			case 7:
				{
				_localctx = new ValContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(199); lvalue();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(220);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						_localctx = new ExpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(202);
						if (!(11 >= _localctx._p)) throw new FailedPredicateException(this, "11 >= $_p");
						setState(203); ((ExpContext)_localctx).op = match(EXP);
						setState(204); expression(11);
						}
						break;

					case 2:
						{
						_localctx = new MulContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(205);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(206);
						((MulContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MulContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(207); expression(11);
						}
						break;

					case 3:
						{
						_localctx = new AddContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(208);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(209);
						((AddContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD || _la==SUB) ) {
							((AddContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(210); expression(10);
						}
						break;

					case 4:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(211);
						if (!(7 >= _localctx._p)) throw new FailedPredicateException(this, "7 >= $_p");
						setState(212); ((AndContext)_localctx).op = match(AND);
						setState(213); expression(8);
						}
						break;

					case 5:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(214);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(215); ((OrContext)_localctx).op = match(OR);
						setState(216); expression(7);
						}
						break;

					case 6:
						{
						_localctx = new CmpContext(new ExpressionContext(_parentctx, _parentState, _p));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(217);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(218);
						((CmpContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NE) | (1L << LE) | (1L << GE) | (1L << GT) | (1L << LT))) != 0)) ) {
							((CmpContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						consume();
						setState(219); expression(6);
						}
						break;
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6: return type_sempred((TypeContext)_localctx, predIndex);

		case 9: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return 11 >= _localctx._p;

		case 3: return 10 >= _localctx._p;

		case 4: return 9 >= _localctx._p;

		case 5: return 7 >= _localctx._p;

		case 6: return 6 >= _localctx._p;

		case 7: return 5 >= _localctx._p;
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 2 >= _localctx._p;

		case 1: return 1 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\39\u00e4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\7\3\34\n\3\f\3\16\3\37\13\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\5\4C\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4a\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\5\4n\n\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5v\n\5\f\5\16\5"+
		"y\13\5\5\5{\n\5\3\6\3\6\3\6\3\6\6\6\u0081\n\6\r\6\16\6\u0082\3\6\3\6\3"+
		"\6\3\6\3\6\6\6\u008a\n\6\r\6\16\6\u008b\5\6\u008e\n\6\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\6\b\u0098\n\b\r\b\16\b\u0099\3\b\3\b\3\b\3\b\3\b\6\b"+
		"\u00a1\n\b\r\b\16\b\u00a2\7\b\u00a5\n\b\f\b\16\b\u00a8\13\b\3\t\3\t\3"+
		"\t\7\t\u00ad\n\t\f\t\16\t\u00b0\13\t\5\t\u00b2\n\t\3\n\3\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00c2\n\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u00cb\n\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u00df"+
		"\n\13\f\13\16\13\u00e2\13\13\3\13\2\f\2\4\6\b\n\f\16\20\22\24\2\7\b\2"+
		"\7\7\t\t\13\13\17\17\22\22\27\27\6\2\4\4\r\16\21\21\25\26\3\2./\3\2\60"+
		"\62\3\2\649\u0102\2\26\3\2\2\2\4\30\3\2\2\2\6m\3\2\2\2\bz\3\2\2\2\n\u008d"+
		"\3\2\2\2\f\u008f\3\2\2\2\16\u0091\3\2\2\2\20\u00b1\3\2\2\2\22\u00b3\3"+
		"\2\2\2\24\u00ca\3\2\2\2\26\27\5\4\3\2\27\3\3\2\2\2\30\35\5\6\4\2\31\32"+
		"\7\33\2\2\32\34\5\6\4\2\33\31\3\2\2\2\34\37\3\2\2\2\35\33\3\2\2\2\35\36"+
		"\3\2\2\2\36\5\3\2\2\2\37\35\3\2\2\2 !\5\16\b\2!\"\5\n\6\2\"#\7\34\2\2"+
		"#$\5\24\13\2$%\7\24\2\2%n\3\2\2\2&\'\5\n\6\2\'(\7\34\2\2()\5\24\13\2)"+
		"*\7\24\2\2*n\3\2\2\2+n\5\24\13\2,-\7\b\2\2-.\5\24\13\2./\7\24\2\2/n\3"+
		"\2\2\2\60\61\7\35\2\2\61\62\5\4\3\2\62\63\7\36\2\2\63n\3\2\2\2\64\65\7"+
		"\37\2\2\65\66\5\24\13\2\66=\5\4\3\2\678\7\20\2\289\5\24\13\29:\5\4\3\2"+
		":<\3\2\2\2;\67\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>B\3\2\2\2?=\3\2\2"+
		"\2@A\7 \2\2AC\5\4\3\2B@\3\2\2\2BC\3\2\2\2Cn\3\2\2\2DE\7!\2\2EF\7#\2\2"+
		"FG\5\24\13\2GH\7$\2\2HI\5\4\3\2In\3\2\2\2JK\7\"\2\2KL\7#\2\2LM\5\6\4\2"+
		"MN\5\24\13\2NO\7\24\2\2OP\5\22\n\2PQ\7$\2\2QR\5\4\3\2Rn\3\2\2\2ST\7\n"+
		"\2\2TU\5\16\b\2UV\5\f\7\2VW\7#\2\2WX\5\b\5\2XY\7$\2\2YZ\7\35\2\2Z[\5\4"+
		"\3\2[\\\7\36\2\2\\n\3\2\2\2]n\3\2\2\2^`\5\22\n\2_a\7\24\2\2`_\3\2\2\2"+
		"`a\3\2\2\2an\3\2\2\2bc\7\23\2\2cd\7\n\2\2de\5\16\b\2ef\5\n\6\2fg\7#\2"+
		"\2gh\5\b\5\2hi\7$\2\2ij\7\24\2\2jn\3\2\2\2kl\7\f\2\2ln\7\24\2\2m \3\2"+
		"\2\2m&\3\2\2\2m+\3\2\2\2m,\3\2\2\2m\60\3\2\2\2m\64\3\2\2\2mD\3\2\2\2m"+
		"J\3\2\2\2mS\3\2\2\2m]\3\2\2\2m^\3\2\2\2mb\3\2\2\2mk\3\2\2\2n\7\3\2\2\2"+
		"op\5\16\b\2pw\5\n\6\2qr\7\5\2\2rs\5\16\b\2st\5\n\6\2tv\3\2\2\2uq\3\2\2"+
		"\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yw\3\2\2\2zo\3\2\2\2z{\3\2\2"+
		"\2{\t\3\2\2\2|\u008e\7%\2\2}\u0080\7%\2\2~\177\7\6\2\2\177\u0081\7\3\2"+
		"\2\u0080~\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083"+
		"\3\2\2\2\u0083\u008e\3\2\2\2\u0084\u0089\7%\2\2\u0085\u0086\7\6\2\2\u0086"+
		"\u0087\5\24\13\2\u0087\u0088\7\3\2\2\u0088\u008a\3\2\2\2\u0089\u0085\3"+
		"\2\2\2\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\u008e\3\2\2\2\u008d|\3\2\2\2\u008d}\3\2\2\2\u008d\u0084\3\2\2\2\u008e"+
		"\13\3\2\2\2\u008f\u0090\7%\2\2\u0090\r\3\2\2\2\u0091\u0092\b\b\1\2\u0092"+
		"\u0093\t\2\2\2\u0093\u00a6\3\2\2\2\u0094\u0097\6\b\2\3\u0095\u0096\7\6"+
		"\2\2\u0096\u0098\7\3\2\2\u0097\u0095\3\2\2\2\u0098\u0099\3\2\2\2\u0099"+
		"\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u00a5\3\2\2\2\u009b\u00a0\6\b"+
		"\3\3\u009c\u009d\7\6\2\2\u009d\u009e\5\24\13\2\u009e\u009f\7\3\2\2\u009f"+
		"\u00a1\3\2\2\2\u00a0\u009c\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a0\3\2"+
		"\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a5\3\2\2\2\u00a4\u0094\3\2\2\2\u00a4"+
		"\u009b\3\2\2\2\u00a5\u00a8\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\17\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a9\u00ae\5\24\13\2\u00aa"+
		"\u00ab\7\5\2\2\u00ab\u00ad\5\24\13\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00a9\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\21\3\2\2"+
		"\2\u00b3\u00b4\5\n\6\2\u00b4\u00b5\t\3\2\2\u00b5\u00b6\5\24\13\2\u00b6"+
		"\23\3\2\2\2\u00b7\u00b8\b\13\1\2\u00b8\u00b9\t\4\2\2\u00b9\u00cb\5\24"+
		"\13\2\u00ba\u00bb\7\32\2\2\u00bb\u00cb\5\24\13\2\u00bc\u00bd\5\f\7\2\u00bd"+
		"\u00be\7#\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c1\7$\2\2\u00c0\u00c2\7\24"+
		"\2\2\u00c1\u00c0\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00cb\3\2\2\2\u00c3"+
		"\u00c4\7#\2\2\u00c4\u00c5\5\24\13\2\u00c5\u00c6\7$\2\2\u00c6\u00cb\3\2"+
		"\2\2\u00c7\u00cb\7%\2\2\u00c8\u00cb\7\'\2\2\u00c9\u00cb\5\n\6\2\u00ca"+
		"\u00b7\3\2\2\2\u00ca\u00ba\3\2\2\2\u00ca\u00bc\3\2\2\2\u00ca\u00c3\3\2"+
		"\2\2\u00ca\u00c7\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00c9\3\2\2\2\u00cb"+
		"\u00e0\3\2\2\2\u00cc\u00cd\6\13\4\3\u00cd\u00ce\7\63\2\2\u00ce\u00df\5"+
		"\24\13\2\u00cf\u00d0\6\13\5\3\u00d0\u00d1\t\5\2\2\u00d1\u00df\5\24\13"+
		"\2\u00d2\u00d3\6\13\6\3\u00d3\u00d4\t\4\2\2\u00d4\u00df\5\24\13\2\u00d5"+
		"\u00d6\6\13\7\3\u00d6\u00d7\7\30\2\2\u00d7\u00df\5\24\13\2\u00d8\u00d9"+
		"\6\13\b\3\u00d9\u00da\7\31\2\2\u00da\u00df\5\24\13\2\u00db\u00dc\6\13"+
		"\t\3\u00dc\u00dd\t\6\2\2\u00dd\u00df\5\24\13\2\u00de\u00cc\3\2\2\2\u00de"+
		"\u00cf\3\2\2\2\u00de\u00d2\3\2\2\2\u00de\u00d5\3\2\2\2\u00de\u00d8\3\2"+
		"\2\2\u00de\u00db\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0"+
		"\u00e1\3\2\2\2\u00e1\25\3\2\2\2\u00e2\u00e0\3\2\2\2\26\35=B`mwz\u0082"+
		"\u008b\u008d\u0099\u00a2\u00a4\u00a6\u00ae\u00b1\u00c1\u00ca\u00de\u00e0";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}