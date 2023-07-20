// Generated from br\dc\compiladores\alguma\semantico\Alguma.g4 by ANTLR 4.12.0
package br.dc.compiladores.alguma.semantico;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		NUM_INT=60, NUM_REAL=61, IDENT=62, CADEIA=63, COMENTARIO=64, WS=65;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_declaracao_local = 2, RULE_variavel = 3, 
		RULE_identificador = 4, RULE_dimensao = 5, RULE_tipo = 6, RULE_tipo_basico = 7, 
		RULE_tipo_basico_ident = 8, RULE_tipo_estendido = 9, RULE_valor_constante = 10, 
		RULE_registro = 11, RULE_declaracao_global = 12, RULE_parametro = 13, 
		RULE_parametros = 14, RULE_corpo = 15, RULE_cmd = 16, RULE_cmdLeia = 17, 
		RULE_cmdEscreva = 18, RULE_cmdSe = 19, RULE_cmdCaso = 20, RULE_cmdPara = 21, 
		RULE_cmdEnquanto = 22, RULE_cmdFaca = 23, RULE_cmdAtribuicao = 24, RULE_cmdChamada = 25, 
		RULE_cmdRetorne = 26, RULE_selecao = 27, RULE_item_selecao = 28, RULE_constantes = 29, 
		RULE_numero_intervalo = 30, RULE_op_unario = 31, RULE_exp_aritmetica = 32, 
		RULE_termo = 33, RULE_fator = 34, RULE_op1 = 35, RULE_op2 = 36, RULE_op3 = 37, 
		RULE_parcela = 38, RULE_parcela_unario = 39, RULE_parcela_nao_unario = 40, 
		RULE_exp_relacional = 41, RULE_op_relacional = 42, RULE_expressao = 43, 
		RULE_termo_logico = 44, RULE_fator_logico = 45, RULE_parcela_logica = 46, 
		RULE_op_logico_1 = 47, RULE_op_logico_2 = 48;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "declaracoes", "declaracao_local", "variavel", "identificador", 
			"dimensao", "tipo", "tipo_basico", "tipo_basico_ident", "tipo_estendido", 
			"valor_constante", "registro", "declaracao_global", "parametro", "parametros", 
			"corpo", "cmd", "cmdLeia", "cmdEscreva", "cmdSe", "cmdCaso", "cmdPara", 
			"cmdEnquanto", "cmdFaca", "cmdAtribuicao", "cmdChamada", "cmdRetorne", 
			"selecao", "item_selecao", "constantes", "numero_intervalo", "op_unario", 
			"exp_aritmetica", "termo", "fator", "op1", "op2", "op3", "parcela", "parcela_unario", 
			"parcela_nao_unario", "exp_relacional", "op_relacional", "expressao", 
			"termo_logico", "fator_logico", "parcela_logica", "op_logico_1", "op_logico_2"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
			"'='", "'tipo'", "','", "'.'", "'['", "']'", "'literal'", "'inteiro'", 
			"'real'", "'logico'", "'^'", "'verdadeiro'", "'falso'", "'registro'", 
			"'fim_registro'", "'procedimento'", "'('", "')'", "'fim_procedimento'", 
			"'funcao'", "'fim_funcao'", "'var'", "'leia'", "'escreva'", "'se'", "'entao'", 
			"'senao'", "'fim_se'", "'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", 
			"'ate'", "'faca'", "'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", 
			"'..'", "'-'", "'+'", "'*'", "'/'", "'%'", "'&'", "'<>'", "'>='", "'<='", 
			"'>'", "'<'", "'nao'", "'ou'", "'e'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NUM_INT", "NUM_REAL", "IDENT", "CADEIA", "COMENTARIO", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Alguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public List<DeclaracoesContext> declaracoes() {
			return getRuleContexts(DeclaracoesContext.class);
		}
		public DeclaracoesContext declaracoes(int i) {
			return getRuleContext(DeclaracoesContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 35651736L) != 0)) {
				{
				{
				setState(98);
				declaracoes();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(T__0);
			setState(105);
			corpo();
			setState(106);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracoesContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				declaracao_local();
				}
				break;
			case T__20:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				declaracao_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_localContext extends ParserRuleContext {
		public VariavelContext v1;
		public Token v2;
		public Token v3;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracao_local);
		try {
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__2);
				setState(113);
				((Declaracao_localContext)_localctx).v1 = variavel();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(114);
				match(T__3);
				setState(115);
				((Declaracao_localContext)_localctx).v2 = match(IDENT);
				setState(116);
				match(T__4);
				setState(117);
				tipo_basico();
				setState(118);
				match(T__5);
				setState(119);
				valor_constante();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
				match(T__6);
				setState(122);
				((Declaracao_localContext)_localctx).v3 = match(IDENT);
				setState(123);
				match(T__4);
				setState(124);
				tipo();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class VariavelContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			identificador();
			setState(132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(128);
				match(T__7);
				setState(129);
				identificador();
				}
				}
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(135);
			match(T__4);
			setState(136);
			tipo();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public List<TerminalNode> IDENT() { return getTokens(AlgumaParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(AlgumaParser.IDENT, i);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(IDENT);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(139);
				match(T__8);
				setState(140);
				match(IDENT);
				}
				}
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(146);
			dimensao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DimensaoContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dimensao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__9) {
				{
				{
				setState(148);
				match(T__9);
				setState(149);
				exp_aritmetica();
				setState(150);
				match(T__10);
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public RegistroContext reg;
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				((TipoContext)_localctx).reg = registro();
				}
				break;
			case T__11:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				tipo_estendido();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basicoContext extends ParserRuleContext {
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tipo_basico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 61440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_basico_identContext extends ParserRuleContext {
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tipo_basico_ident);
		try {
			setState(165);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__13:
			case T__14:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				tipo_basico();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_estendidoContext extends ParserRuleContext {
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipo_estendido);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(167);
				match(T__15);
				}
			}

			setState(170);
			tipo_basico_ident();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(AlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlgumaParser.NUM_REAL, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -5764607523033841664L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class RegistroContext extends ParserRuleContext {
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_registro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(T__18);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(175);
				variavel();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			match(T__19);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracao_globalContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracao_global);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(T__20);
				setState(184);
				match(IDENT);
				setState(185);
				match(T__21);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==IDENT) {
					{
					setState(186);
					parametros();
					}
				}

				setState(189);
				match(T__22);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 152L) != 0)) {
					{
					{
					setState(190);
					declaracao_local();
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
					{
					{
					setState(196);
					cmd();
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(T__23);
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				match(T__24);
				setState(204);
				match(IDENT);
				setState(205);
				match(T__21);
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__26 || _la==IDENT) {
					{
					setState(206);
					parametros();
					}
				}

				setState(209);
				match(T__22);
				setState(210);
				match(T__4);
				setState(211);
				tipo_estendido();
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 152L) != 0)) {
					{
					{
					setState(212);
					declaracao_local();
					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
					{
					{
					setState(218);
					cmd();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(224);
				match(T__25);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametroContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(228);
				match(T__26);
				}
			}

			setState(231);
			identificador();
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(232);
				match(T__7);
				setState(233);
				identificador();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(T__4);
			setState(240);
			tipo_estendido();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			parametro();
			setState(247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(243);
				match(T__7);
				setState(244);
				parametro();
				}
				}
				setState(249);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CorpoContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_corpo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 152L) != 0)) {
				{
				{
				setState(250);
				declaracao_local();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
				{
				{
				setState(256);
				cmd();
				}
				}
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdContext extends ParserRuleContext {
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdEscrevaContext cmdEscreva() {
			return getRuleContext(CmdEscrevaContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdCasoContext cmdCaso() {
			return getRuleContext(CmdCasoContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdFacaContext cmdFaca() {
			return getRuleContext(CmdFacaContext.class,0);
		}
		public CmdAtribuicaoContext cmdAtribuicao() {
			return getRuleContext(CmdAtribuicaoContext.class,0);
		}
		public CmdChamadaContext cmdChamada() {
			return getRuleContext(CmdChamadaContext.class,0);
		}
		public CmdRetorneContext cmdRetorne() {
			return getRuleContext(CmdRetorneContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_cmd);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				cmdLeia();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				cmdEscreva();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(264);
				cmdSe();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(265);
				cmdCaso();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(266);
				cmdPara();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(267);
				cmdEnquanto();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(268);
				cmdFaca();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(269);
				cmdAtribuicao();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(270);
				cmdChamada();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(271);
				cmdRetorne();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdLeiaContext extends ParserRuleContext {
		public List<IdentificadorContext> identificador() {
			return getRuleContexts(IdentificadorContext.class);
		}
		public IdentificadorContext identificador(int i) {
			return getRuleContext(IdentificadorContext.class,i);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdLeia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdLeia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_cmdLeia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(T__27);
			setState(275);
			match(T__21);
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(276);
				match(T__15);
				}
			}

			setState(279);
			identificador();
			setState(287);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(280);
				match(T__7);
				setState(282);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(281);
					match(T__15);
					}
				}

				setState(284);
				identificador();
				}
				}
				setState(289);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(290);
			match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEscrevaContext extends ParserRuleContext {
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CmdEscrevaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEscreva; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdEscreva(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdEscreva(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdEscreva(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEscrevaContext cmdEscreva() throws RecognitionException {
		CmdEscrevaContext _localctx = new CmdEscrevaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cmdEscreva);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__28);
			setState(293);
			match(T__21);
			setState(294);
			expressao();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(295);
				match(T__7);
				setState(296);
				expressao();
				}
				}
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(302);
			match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSeContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdSe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdSe(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			match(T__29);
			setState(305);
			expressao();
			setState(306);
			match(T__30);
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
				{
				{
				setState(307);
				cmd();
				}
				}
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(313);
				match(T__31);
				setState(317);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
					{
					{
					setState(314);
					cmd();
					}
					}
					setState(319);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(322);
			match(T__32);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdCasoContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdCasoContext cmdCaso() throws RecognitionException {
		CmdCasoContext _localctx = new CmdCasoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_cmdCaso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__33);
			setState(325);
			exp_aritmetica();
			setState(326);
			match(T__34);
			setState(327);
			selecao();
			setState(335);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__31) {
				{
				setState(328);
				match(T__31);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
					{
					{
					setState(329);
					cmd();
					}
					}
					setState(334);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(337);
			match(T__35);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdParaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdPara(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdPara(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(T__36);
			setState(340);
			match(IDENT);
			setState(341);
			match(T__37);
			setState(342);
			exp_aritmetica();
			setState(343);
			match(T__38);
			setState(344);
			exp_aritmetica();
			setState(345);
			match(T__39);
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
				{
				{
				setState(346);
				cmd();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(T__40);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdEnquantoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdEnquanto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdEnquanto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__41);
			setState(355);
			expressao();
			setState(356);
			match(T__39);
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
				{
				{
				setState(357);
				cmd();
				}
				}
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(363);
			match(T__42);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdFacaContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdFacaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdFaca; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdFaca(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdFaca(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdFaca(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdFacaContext cmdFaca() throws RecognitionException {
		CmdFacaContext _localctx = new CmdFacaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_cmdFaca);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			match(T__39);
			setState(369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
				{
				{
				setState(366);
				cmd();
				}
				}
				setState(371);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(372);
			match(T__38);
			setState(373);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAtribuicaoContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdAtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdAtribuicaoContext cmdAtribuicao() throws RecognitionException {
		CmdAtribuicaoContext _localctx = new CmdAtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_cmdAtribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(375);
				match(T__15);
				}
			}

			setState(378);
			identificador();
			setState(379);
			match(T__37);
			setState(380);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdChamadaContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public CmdChamadaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdChamada; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdChamada(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdChamada(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdChamada(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdChamadaContext cmdChamada() throws RecognitionException {
		CmdChamadaContext _localctx = new CmdChamadaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_cmdChamada);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(IDENT);
			setState(383);
			match(T__21);
			setState(384);
			expressao();
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(385);
				match(T__7);
				setState(386);
				expressao();
				}
				}
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(392);
			match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdRetorneContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public CmdRetorneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdRetorne; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterCmdRetorne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitCmdRetorne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitCmdRetorne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdRetorneContext cmdRetorne() throws RecognitionException {
		CmdRetorneContext _localctx = new CmdRetorneContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmdRetorne);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			match(T__43);
			setState(395);
			expressao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelecaoContext extends ParserRuleContext {
		public List<Item_selecaoContext> item_selecao() {
			return getRuleContexts(Item_selecaoContext.class);
		}
		public Item_selecaoContext item_selecao(int i) {
			return getRuleContext(Item_selecaoContext.class,i);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__45 || _la==NUM_INT) {
				{
				{
				setState(397);
				item_selecao();
				}
				}
				setState(402);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Item_selecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public Item_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_item_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterItem_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitItem_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitItem_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Item_selecaoContext item_selecao() throws RecognitionException {
		Item_selecaoContext _localctx = new Item_selecaoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_item_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			constantes();
			setState(404);
			match(T__4);
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4611709264669507584L) != 0)) {
				{
				{
				setState(405);
				cmd();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantesContext extends ParserRuleContext {
		public List<Numero_intervaloContext> numero_intervalo() {
			return getRuleContexts(Numero_intervaloContext.class);
		}
		public Numero_intervaloContext numero_intervalo(int i) {
			return getRuleContext(Numero_intervaloContext.class,i);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(411);
			numero_intervalo();
			setState(416);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(412);
				match(T__7);
				setState(413);
				numero_intervalo();
				}
				}
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Numero_intervaloContext extends ParserRuleContext {
		public List<TerminalNode> NUM_INT() { return getTokens(AlgumaParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(AlgumaParser.NUM_INT, i);
		}
		public List<Op_unarioContext> op_unario() {
			return getRuleContexts(Op_unarioContext.class);
		}
		public Op_unarioContext op_unario(int i) {
			return getRuleContext(Op_unarioContext.class,i);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_numero_intervalo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(419);
				op_unario();
				}
			}

			setState(422);
			match(NUM_INT);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(423);
				match(T__44);
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(424);
					op_unario();
					}
				}

				setState(427);
				match(NUM_INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_unarioContext extends ParserRuleContext {
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_op_unario);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			match(T__45);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public TermoContext termo;
		public List<TermoContext> termos = new ArrayList<TermoContext>();
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public List<Op1Context> op1() {
			return getRuleContexts(Op1Context.class);
		}
		public Op1Context op1(int i) {
			return getRuleContext(Op1Context.class,i);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_exp_aritmetica);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			((Exp_aritmeticaContext)_localctx).termo = termo();
			((Exp_aritmeticaContext)_localctx).termos.add(((Exp_aritmeticaContext)_localctx).termo);
			setState(438);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(433);
					op1();
					setState(434);
					((Exp_aritmeticaContext)_localctx).termo = termo();
					((Exp_aritmeticaContext)_localctx).termos.add(((Exp_aritmeticaContext)_localctx).termo);
					}
					} 
				}
				setState(440);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator;
		public List<FatorContext> fatores = new ArrayList<FatorContext>();
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<Op2Context> op2() {
			return getRuleContexts(Op2Context.class);
		}
		public Op2Context op2(int i) {
			return getRuleContext(Op2Context.class,i);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_termo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			((TermoContext)_localctx).fator = fator();
			((TermoContext)_localctx).fatores.add(((TermoContext)_localctx).fator);
			setState(447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__47 || _la==T__48) {
				{
				{
				setState(442);
				op2();
				setState(443);
				((TermoContext)_localctx).fator = fator();
				((TermoContext)_localctx).fatores.add(((TermoContext)_localctx).fator);
				}
				}
				setState(449);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public ParcelaContext parcela;
		public List<ParcelaContext> parcelas = new ArrayList<ParcelaContext>();
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<Op3Context> op3() {
			return getRuleContexts(Op3Context.class);
		}
		public Op3Context op3(int i) {
			return getRuleContext(Op3Context.class,i);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			((FatorContext)_localctx).parcela = parcela();
			((FatorContext)_localctx).parcelas.add(((FatorContext)_localctx).parcela);
			setState(456);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__49) {
				{
				{
				setState(451);
				op3();
				setState(452);
				((FatorContext)_localctx).parcela = parcela();
				((FatorContext)_localctx).parcelas.add(((FatorContext)_localctx).parcela);
				}
				}
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op1Context extends ParserRuleContext {
		public Op1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op1Context op1() throws RecognitionException {
		Op1Context _localctx = new Op1Context(_ctx, getState());
		enterRule(_localctx, 70, RULE_op1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__46) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op2Context extends ParserRuleContext {
		public Op2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op2Context op2() throws RecognitionException {
		Op2Context _localctx = new Op2Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_op2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(461);
			_la = _input.LA(1);
			if ( !(_la==T__47 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op3Context extends ParserRuleContext {
		public Op3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp3(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op3Context op3() throws RecognitionException {
		Op3Context _localctx = new Op3Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_op3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(T__49);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParcelaContext extends ParserRuleContext {
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_parcela);
		int _la;
		try {
			setState(470);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
			case T__21:
			case T__45:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(466);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(465);
					op_unario();
					}
				}

				setState(468);
				parcela_unario();
				}
				break;
			case T__50:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(469);
				parcela_nao_unario();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_unarioContext extends ParserRuleContext {
		public IdentificadorContext p1;
		public Token p2;
		public Token p3;
		public Token p4;
		public ExpressaoContext p5;
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public TerminalNode IDENT() { return getToken(AlgumaParser.IDENT, 0); }
		public TerminalNode NUM_INT() { return getToken(AlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(AlgumaParser.NUM_REAL, 0); }
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parcela_unario);
		int _la;
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__15) {
					{
					setState(472);
					match(T__15);
					}
				}

				setState(475);
				((Parcela_unarioContext)_localctx).p1 = identificador();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(476);
				((Parcela_unarioContext)_localctx).p2 = match(IDENT);
				setState(477);
				match(T__21);
				setState(478);
				expressao();
				setState(483);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__7) {
					{
					{
					setState(479);
					match(T__7);
					setState(480);
					expressao();
					}
					}
					setState(485);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(486);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(488);
				((Parcela_unarioContext)_localctx).p3 = match(NUM_INT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(489);
				((Parcela_unarioContext)_localctx).p4 = match(NUM_REAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(490);
				match(T__21);
				setState(491);
				((Parcela_unarioContext)_localctx).p5 = expressao();
				setState(492);
				match(T__22);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public IdentificadorContext pn1;
		public Token pn2;
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(AlgumaParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_parcela_nao_unario);
		try {
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__50:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				match(T__50);
				setState(497);
				((Parcela_nao_unarioContext)_localctx).pn1 = identificador();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(498);
				((Parcela_nao_unarioContext)_localctx).pn2 = match(CADEIA);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Exp_relacionalContext extends ParserRuleContext {
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_exp_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			exp_aritmetica();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588448485440L) != 0)) {
				{
				setState(502);
				op_relacional();
				setState(503);
				exp_aritmetica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 139611588448485440L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressaoContext extends ParserRuleContext {
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public List<Op_logico_1Context> op_logico_1() {
			return getRuleContexts(Op_logico_1Context.class);
		}
		public Op_logico_1Context op_logico_1(int i) {
			return getRuleContext(Op_logico_1Context.class,i);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			termo_logico();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__57) {
				{
				{
				setState(510);
				op_logico_1();
				setState(511);
				termo_logico();
				}
				}
				setState(517);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termo_logicoContext extends ParserRuleContext {
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public List<Op_logico_2Context> op_logico_2() {
			return getRuleContexts(Op_logico_2Context.class);
		}
		public Op_logico_2Context op_logico_2(int i) {
			return getRuleContext(Op_logico_2Context.class,i);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_termo_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			fator_logico();
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__58) {
				{
				{
				setState(519);
				op_logico_2();
				setState(520);
				fator_logico();
				}
				}
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Fator_logicoContext extends ParserRuleContext {
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_fator_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(528);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(527);
				match(T__56);
				}
			}

			setState(530);
			parcela_logica();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Parcela_logicaContext extends ParserRuleContext {
		public Token pl1;
		public Exp_relacionalContext pl2;
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_logica);
		int _la;
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__16:
			case T__17:
				enterOuterAlt(_localctx, 1);
				{
				setState(532);
				((Parcela_logicaContext)_localctx).pl1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
					((Parcela_logicaContext)_localctx).pl1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case T__15:
			case T__21:
			case T__45:
			case T__50:
			case NUM_INT:
			case NUM_REAL:
			case IDENT:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				((Parcela_logicaContext)_localctx).pl2 = exp_relacional();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logico_1Context extends ParserRuleContext {
		public Op_logico_1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp_logico_1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp_logico_1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp_logico_1(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_1Context op_logico_1() throws RecognitionException {
		Op_logico_1Context _localctx = new Op_logico_1Context(_ctx, getState());
		enterRule(_localctx, 94, RULE_op_logico_1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			match(T__57);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Op_logico_2Context extends ParserRuleContext {
		public Op_logico_2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico_2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).enterOp_logico_2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlgumaListener ) ((AlgumaListener)listener).exitOp_logico_2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlgumaVisitor ) return ((AlgumaVisitor<? extends T>)visitor).visitOp_logico_2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logico_2Context op_logico_2() throws RecognitionException {
		Op_logico_2Context _localctx = new Op_logico_2Context(_ctx, getState());
		enterRule(_localctx, 96, RULE_op_logico_2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			match(T__58);
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

	public static final String _serializedATN =
		"\u0004\u0001A\u021d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u0001\u0000\u0005\u0000"+
		"d\b\u0000\n\u0000\f\u0000g\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001o\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002~\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"\u0083\b\u0003\n\u0003\f\u0003\u0086\t\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008e\b\u0004\n"+
		"\u0004\f\u0004\u0091\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u0099\b\u0005\n\u0005\f\u0005"+
		"\u009c\t\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u00a0\b\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0003\b\u00a6\b\b\u0001\t\u0003\t\u00a9"+
		"\b\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00b1\b\u000b\n\u000b\f\u000b\u00b4\t\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00bc\b\f\u0001\f\u0001\f\u0005\f\u00c0"+
		"\b\f\n\f\f\f\u00c3\t\f\u0001\f\u0005\f\u00c6\b\f\n\f\f\f\u00c9\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u00d0\b\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u00d6\b\f\n\f\f\f\u00d9\t\f\u0001\f\u0005\f\u00dc\b"+
		"\f\n\f\f\f\u00df\t\f\u0001\f\u0001\f\u0003\f\u00e3\b\f\u0001\r\u0003\r"+
		"\u00e6\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u00eb\b\r\n\r\f\r\u00ee\t\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u00f6\b\u000e\n\u000e\f\u000e\u00f9\t\u000e\u0001\u000f\u0005\u000f\u00fc"+
		"\b\u000f\n\u000f\f\u000f\u00ff\t\u000f\u0001\u000f\u0005\u000f\u0102\b"+
		"\u000f\n\u000f\f\u000f\u0105\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0111\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u0116\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u011b\b\u0011\u0001\u0011\u0005\u0011\u011e\b\u0011\n\u0011\f\u0011\u0121"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u012a\b\u0012\n\u0012\f\u0012\u012d\t\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u0135\b\u0013\n\u0013\f\u0013\u0138\t\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u013c\b\u0013\n\u0013\f\u0013\u013f\t\u0013\u0003\u0013"+
		"\u0141\b\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u014b\b\u0014\n\u0014"+
		"\f\u0014\u014e\t\u0014\u0003\u0014\u0150\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u015c\b\u0015\n\u0015\f\u0015\u015f"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0167\b\u0016\n\u0016\f\u0016\u016a\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u0170\b\u0017\n\u0017"+
		"\f\u0017\u0173\t\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0003\u0018\u0179\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019"+
		"\u0184\b\u0019\n\u0019\f\u0019\u0187\t\u0019\u0001\u0019\u0001\u0019\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0005\u001b\u018f\b\u001b\n"+
		"\u001b\f\u001b\u0192\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0005"+
		"\u001c\u0197\b\u001c\n\u001c\f\u001c\u019a\t\u001c\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0005\u001d\u019f\b\u001d\n\u001d\f\u001d\u01a2\t\u001d\u0001"+
		"\u001e\u0003\u001e\u01a5\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003"+
		"\u001e\u01aa\b\u001e\u0001\u001e\u0003\u001e\u01ad\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005 \u01b5\b \n \f \u01b8\t"+
		" \u0001!\u0001!\u0001!\u0001!\u0005!\u01be\b!\n!\f!\u01c1\t!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u01c7\b\"\n\"\f\"\u01ca\t\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001%\u0001%\u0001&\u0003&\u01d3\b&\u0001&\u0001&\u0003&\u01d7"+
		"\b&\u0001\'\u0003\'\u01da\b\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'"+
		"\u0001\'\u0005\'\u01e2\b\'\n\'\f\'\u01e5\t\'\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0003\'\u01ef\b\'\u0001(\u0001(\u0001"+
		"(\u0003(\u01f4\b(\u0001)\u0001)\u0001)\u0001)\u0003)\u01fa\b)\u0001*\u0001"+
		"*\u0001+\u0001+\u0001+\u0001+\u0005+\u0202\b+\n+\f+\u0205\t+\u0001,\u0001"+
		",\u0001,\u0001,\u0005,\u020b\b,\n,\f,\u020e\t,\u0001-\u0003-\u0211\b-"+
		"\u0001-\u0001-\u0001.\u0001.\u0003.\u0217\b.\u0001/\u0001/\u00010\u0001"+
		"0\u00010\u0000\u00001\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\"+
		"^`\u0000\u0006\u0001\u0000\f\u000f\u0003\u0000\u0011\u0012<=??\u0001\u0000"+
		"./\u0001\u000001\u0002\u0000\u0006\u000648\u0001\u0000\u0011\u0012\u0230"+
		"\u0000e\u0001\u0000\u0000\u0000\u0002n\u0001\u0000\u0000\u0000\u0004}"+
		"\u0001\u0000\u0000\u0000\u0006\u007f\u0001\u0000\u0000\u0000\b\u008a\u0001"+
		"\u0000\u0000\u0000\n\u009a\u0001\u0000\u0000\u0000\f\u009f\u0001\u0000"+
		"\u0000\u0000\u000e\u00a1\u0001\u0000\u0000\u0000\u0010\u00a5\u0001\u0000"+
		"\u0000\u0000\u0012\u00a8\u0001\u0000\u0000\u0000\u0014\u00ac\u0001\u0000"+
		"\u0000\u0000\u0016\u00ae\u0001\u0000\u0000\u0000\u0018\u00e2\u0001\u0000"+
		"\u0000\u0000\u001a\u00e5\u0001\u0000\u0000\u0000\u001c\u00f2\u0001\u0000"+
		"\u0000\u0000\u001e\u00fd\u0001\u0000\u0000\u0000 \u0110\u0001\u0000\u0000"+
		"\u0000\"\u0112\u0001\u0000\u0000\u0000$\u0124\u0001\u0000\u0000\u0000"+
		"&\u0130\u0001\u0000\u0000\u0000(\u0144\u0001\u0000\u0000\u0000*\u0153"+
		"\u0001\u0000\u0000\u0000,\u0162\u0001\u0000\u0000\u0000.\u016d\u0001\u0000"+
		"\u0000\u00000\u0178\u0001\u0000\u0000\u00002\u017e\u0001\u0000\u0000\u0000"+
		"4\u018a\u0001\u0000\u0000\u00006\u0190\u0001\u0000\u0000\u00008\u0193"+
		"\u0001\u0000\u0000\u0000:\u019b\u0001\u0000\u0000\u0000<\u01a4\u0001\u0000"+
		"\u0000\u0000>\u01ae\u0001\u0000\u0000\u0000@\u01b0\u0001\u0000\u0000\u0000"+
		"B\u01b9\u0001\u0000\u0000\u0000D\u01c2\u0001\u0000\u0000\u0000F\u01cb"+
		"\u0001\u0000\u0000\u0000H\u01cd\u0001\u0000\u0000\u0000J\u01cf\u0001\u0000"+
		"\u0000\u0000L\u01d6\u0001\u0000\u0000\u0000N\u01ee\u0001\u0000\u0000\u0000"+
		"P\u01f3\u0001\u0000\u0000\u0000R\u01f5\u0001\u0000\u0000\u0000T\u01fb"+
		"\u0001\u0000\u0000\u0000V\u01fd\u0001\u0000\u0000\u0000X\u0206\u0001\u0000"+
		"\u0000\u0000Z\u0210\u0001\u0000\u0000\u0000\\\u0216\u0001\u0000\u0000"+
		"\u0000^\u0218\u0001\u0000\u0000\u0000`\u021a\u0001\u0000\u0000\u0000b"+
		"d\u0003\u0002\u0001\u0000cb\u0001\u0000\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fh\u0001\u0000"+
		"\u0000\u0000ge\u0001\u0000\u0000\u0000hi\u0005\u0001\u0000\u0000ij\u0003"+
		"\u001e\u000f\u0000jk\u0005\u0002\u0000\u0000k\u0001\u0001\u0000\u0000"+
		"\u0000lo\u0003\u0004\u0002\u0000mo\u0003\u0018\f\u0000nl\u0001\u0000\u0000"+
		"\u0000nm\u0001\u0000\u0000\u0000o\u0003\u0001\u0000\u0000\u0000pq\u0005"+
		"\u0003\u0000\u0000q~\u0003\u0006\u0003\u0000rs\u0005\u0004\u0000\u0000"+
		"st\u0005>\u0000\u0000tu\u0005\u0005\u0000\u0000uv\u0003\u000e\u0007\u0000"+
		"vw\u0005\u0006\u0000\u0000wx\u0003\u0014\n\u0000x~\u0001\u0000\u0000\u0000"+
		"yz\u0005\u0007\u0000\u0000z{\u0005>\u0000\u0000{|\u0005\u0005\u0000\u0000"+
		"|~\u0003\f\u0006\u0000}p\u0001\u0000\u0000\u0000}r\u0001\u0000\u0000\u0000"+
		"}y\u0001\u0000\u0000\u0000~\u0005\u0001\u0000\u0000\u0000\u007f\u0084"+
		"\u0003\b\u0004\u0000\u0080\u0081\u0005\b\u0000\u0000\u0081\u0083\u0003"+
		"\b\u0004\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0083\u0086\u0001\u0000"+
		"\u0000\u0000\u0084\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0087\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0005\u0005\u0000\u0000\u0088\u0089\u0003\f\u0006"+
		"\u0000\u0089\u0007\u0001\u0000\u0000\u0000\u008a\u008f\u0005>\u0000\u0000"+
		"\u008b\u008c\u0005\t\u0000\u0000\u008c\u008e\u0005>\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008e\u0091\u0001\u0000\u0000\u0000\u008f"+
		"\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090"+
		"\u0092\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0092"+
		"\u0093\u0003\n\u0005\u0000\u0093\t\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005\n\u0000\u0000\u0095\u0096\u0003@ \u0000\u0096\u0097\u0005\u000b"+
		"\u0000\u0000\u0097\u0099\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000"+
		"\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u000b\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u00a0\u0003\u0016"+
		"\u000b\u0000\u009e\u00a0\u0003\u0012\t\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u009e\u0001\u0000\u0000\u0000\u00a0\r\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0007\u0000\u0000\u0000\u00a2\u000f\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a6\u0003\u000e\u0007\u0000\u00a4\u00a6\u0005>\u0000\u0000\u00a5"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6"+
		"\u0011\u0001\u0000\u0000\u0000\u00a7\u00a9\u0005\u0010\u0000\u0000\u00a8"+
		"\u00a7\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9"+
		"\u00aa\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0010\b\u0000\u00ab\u0013"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0007\u0001\u0000\u0000\u00ad\u0015"+
		"\u0001\u0000\u0000\u0000\u00ae\u00b2\u0005\u0013\u0000\u0000\u00af\u00b1"+
		"\u0003\u0006\u0003\u0000\u00b0\u00af\u0001\u0000\u0000\u0000\u00b1\u00b4"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b0\u0001\u0000\u0000\u0000\u00b2\u00b3"+
		"\u0001\u0000\u0000\u0000\u00b3\u00b5\u0001\u0000\u0000\u0000\u00b4\u00b2"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u0014\u0000\u0000\u00b6\u0017"+
		"\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0015\u0000\u0000\u00b8\u00b9"+
		"\u0005>\u0000\u0000\u00b9\u00bb\u0005\u0016\u0000\u0000\u00ba\u00bc\u0003"+
		"\u001c\u000e\u0000\u00bb\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001"+
		"\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c1\u0005"+
		"\u0017\u0000\u0000\u00be\u00c0\u0003\u0004\u0002\u0000\u00bf\u00be\u0001"+
		"\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c7\u0001"+
		"\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c6\u0003"+
		" \u0010\u0000\u00c5\u00c4\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00e3\u0005\u0018\u0000\u0000\u00cb\u00cc\u0005\u0019"+
		"\u0000\u0000\u00cc\u00cd\u0005>\u0000\u0000\u00cd\u00cf\u0005\u0016\u0000"+
		"\u0000\u00ce\u00d0\u0003\u001c\u000e\u0000\u00cf\u00ce\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0\u00d1\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d2\u0005\u0017\u0000\u0000\u00d2\u00d3\u0005\u0005\u0000"+
		"\u0000\u00d3\u00d7\u0003\u0012\t\u0000\u00d4\u00d6\u0003\u0004\u0002\u0000"+
		"\u00d5\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000"+
		"\u00d7\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000"+
		"\u00d8\u00dd\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000"+
		"\u00da\u00dc\u0003 \u0010\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00df\u0001\u0000\u0000\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df"+
		"\u00dd\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005\u001a\u0000\u0000\u00e1"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e2\u00b7\u0001\u0000\u0000\u0000\u00e2"+
		"\u00cb\u0001\u0000\u0000\u0000\u00e3\u0019\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e6\u0005\u001b\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5"+
		"\u00e6\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7"+
		"\u00ec\u0003\b\u0004\u0000\u00e8\u00e9\u0005\b\u0000\u0000\u00e9\u00eb"+
		"\u0003\b\u0004\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005\u0005\u0000\u0000\u00f0\u00f1\u0003"+
		"\u0012\t\u0000\u00f1\u001b\u0001\u0000\u0000\u0000\u00f2\u00f7\u0003\u001a"+
		"\r\u0000\u00f3\u00f4\u0005\b\u0000\u0000\u00f4\u00f6\u0003\u001a\r\u0000"+
		"\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f6\u00f9\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f5\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000"+
		"\u00f8\u001d\u0001\u0000\u0000\u0000\u00f9\u00f7\u0001\u0000\u0000\u0000"+
		"\u00fa\u00fc\u0003\u0004\u0002\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fc\u00ff\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u0103\u0001\u0000\u0000\u0000"+
		"\u00ff\u00fd\u0001\u0000\u0000\u0000\u0100\u0102\u0003 \u0010\u0000\u0101"+
		"\u0100\u0001\u0000\u0000\u0000\u0102\u0105\u0001\u0000\u0000\u0000\u0103"+
		"\u0101\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000\u0000\u0000\u0104"+
		"\u001f\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u0111\u0003\"\u0011\u0000\u0107\u0111\u0003$\u0012\u0000\u0108\u0111"+
		"\u0003&\u0013\u0000\u0109\u0111\u0003(\u0014\u0000\u010a\u0111\u0003*"+
		"\u0015\u0000\u010b\u0111\u0003,\u0016\u0000\u010c\u0111\u0003.\u0017\u0000"+
		"\u010d\u0111\u00030\u0018\u0000\u010e\u0111\u00032\u0019\u0000\u010f\u0111"+
		"\u00034\u001a\u0000\u0110\u0106\u0001\u0000\u0000\u0000\u0110\u0107\u0001"+
		"\u0000\u0000\u0000\u0110\u0108\u0001\u0000\u0000\u0000\u0110\u0109\u0001"+
		"\u0000\u0000\u0000\u0110\u010a\u0001\u0000\u0000\u0000\u0110\u010b\u0001"+
		"\u0000\u0000\u0000\u0110\u010c\u0001\u0000\u0000\u0000\u0110\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001"+
		"\u0000\u0000\u0000\u0111!\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u001c"+
		"\u0000\u0000\u0113\u0115\u0005\u0016\u0000\u0000\u0114\u0116\u0005\u0010"+
		"\u0000\u0000\u0115\u0114\u0001\u0000\u0000\u0000\u0115\u0116\u0001\u0000"+
		"\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u011f\u0003\b\u0004"+
		"\u0000\u0118\u011a\u0005\b\u0000\u0000\u0119\u011b\u0005\u0010\u0000\u0000"+
		"\u011a\u0119\u0001\u0000\u0000\u0000\u011a\u011b\u0001\u0000\u0000\u0000"+
		"\u011b\u011c\u0001\u0000\u0000\u0000\u011c\u011e\u0003\b\u0004\u0000\u011d"+
		"\u0118\u0001\u0000\u0000\u0000\u011e\u0121\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u011f\u0120\u0001\u0000\u0000\u0000\u0120"+
		"\u0122\u0001\u0000\u0000\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0122"+
		"\u0123\u0005\u0017\u0000\u0000\u0123#\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0005\u001d\u0000\u0000\u0125\u0126\u0005\u0016\u0000\u0000\u0126\u012b"+
		"\u0003V+\u0000\u0127\u0128\u0005\b\u0000\u0000\u0128\u012a\u0003V+\u0000"+
		"\u0129\u0127\u0001\u0000\u0000\u0000\u012a\u012d\u0001\u0000\u0000\u0000"+
		"\u012b\u0129\u0001\u0000\u0000\u0000\u012b\u012c\u0001\u0000\u0000\u0000"+
		"\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u012b\u0001\u0000\u0000\u0000"+
		"\u012e\u012f\u0005\u0017\u0000\u0000\u012f%\u0001\u0000\u0000\u0000\u0130"+
		"\u0131\u0005\u001e\u0000\u0000\u0131\u0132\u0003V+\u0000\u0132\u0136\u0005"+
		"\u001f\u0000\u0000\u0133\u0135\u0003 \u0010\u0000\u0134\u0133\u0001\u0000"+
		"\u0000\u0000\u0135\u0138\u0001\u0000\u0000\u0000\u0136\u0134\u0001\u0000"+
		"\u0000\u0000\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0140\u0001\u0000"+
		"\u0000\u0000\u0138\u0136\u0001\u0000\u0000\u0000\u0139\u013d\u0005 \u0000"+
		"\u0000\u013a\u013c\u0003 \u0010\u0000\u013b\u013a\u0001\u0000\u0000\u0000"+
		"\u013c\u013f\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013d\u013e\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000"+
		"\u013f\u013d\u0001\u0000\u0000\u0000\u0140\u0139\u0001\u0000\u0000\u0000"+
		"\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000"+
		"\u0142\u0143\u0005!\u0000\u0000\u0143\'\u0001\u0000\u0000\u0000\u0144"+
		"\u0145\u0005\"\u0000\u0000\u0145\u0146\u0003@ \u0000\u0146\u0147\u0005"+
		"#\u0000\u0000\u0147\u014f\u00036\u001b\u0000\u0148\u014c\u0005 \u0000"+
		"\u0000\u0149\u014b\u0003 \u0010\u0000\u014a\u0149\u0001\u0000\u0000\u0000"+
		"\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000\u0000"+
		"\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0148\u0001\u0000\u0000\u0000"+
		"\u014f\u0150\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000\u0000\u0000"+
		"\u0151\u0152\u0005$\u0000\u0000\u0152)\u0001\u0000\u0000\u0000\u0153\u0154"+
		"\u0005%\u0000\u0000\u0154\u0155\u0005>\u0000\u0000\u0155\u0156\u0005&"+
		"\u0000\u0000\u0156\u0157\u0003@ \u0000\u0157\u0158\u0005\'\u0000\u0000"+
		"\u0158\u0159\u0003@ \u0000\u0159\u015d\u0005(\u0000\u0000\u015a\u015c"+
		"\u0003 \u0010\u0000\u015b\u015a\u0001\u0000\u0000\u0000\u015c\u015f\u0001"+
		"\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000\u0000\u015d\u015e\u0001"+
		"\u0000\u0000\u0000\u015e\u0160\u0001\u0000\u0000\u0000\u015f\u015d\u0001"+
		"\u0000\u0000\u0000\u0160\u0161\u0005)\u0000\u0000\u0161+\u0001\u0000\u0000"+
		"\u0000\u0162\u0163\u0005*\u0000\u0000\u0163\u0164\u0003V+\u0000\u0164"+
		"\u0168\u0005(\u0000\u0000\u0165\u0167\u0003 \u0010\u0000\u0166\u0165\u0001"+
		"\u0000\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001"+
		"\u0000\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u016b\u0001"+
		"\u0000\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u016c\u0005"+
		"+\u0000\u0000\u016c-\u0001\u0000\u0000\u0000\u016d\u0171\u0005(\u0000"+
		"\u0000\u016e\u0170\u0003 \u0010\u0000\u016f\u016e\u0001\u0000\u0000\u0000"+
		"\u0170\u0173\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0001\u0000\u0000\u0000\u0172\u0174\u0001\u0000\u0000\u0000"+
		"\u0173\u0171\u0001\u0000\u0000\u0000\u0174\u0175\u0005\'\u0000\u0000\u0175"+
		"\u0176\u0003V+\u0000\u0176/\u0001\u0000\u0000\u0000\u0177\u0179\u0005"+
		"\u0010\u0000\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179\u0001"+
		"\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017b\u0003"+
		"\b\u0004\u0000\u017b\u017c\u0005&\u0000\u0000\u017c\u017d\u0003V+\u0000"+
		"\u017d1\u0001\u0000\u0000\u0000\u017e\u017f\u0005>\u0000\u0000\u017f\u0180"+
		"\u0005\u0016\u0000\u0000\u0180\u0185\u0003V+\u0000\u0181\u0182\u0005\b"+
		"\u0000\u0000\u0182\u0184\u0003V+\u0000\u0183\u0181\u0001\u0000\u0000\u0000"+
		"\u0184\u0187\u0001\u0000\u0000\u0000\u0185\u0183\u0001\u0000\u0000\u0000"+
		"\u0185\u0186\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000"+
		"\u0187\u0185\u0001\u0000\u0000\u0000\u0188\u0189\u0005\u0017\u0000\u0000"+
		"\u01893\u0001\u0000\u0000\u0000\u018a\u018b\u0005,\u0000\u0000\u018b\u018c"+
		"\u0003V+\u0000\u018c5\u0001\u0000\u0000\u0000\u018d\u018f\u00038\u001c"+
		"\u0000\u018e\u018d\u0001\u0000\u0000\u0000\u018f\u0192\u0001\u0000\u0000"+
		"\u0000\u0190\u018e\u0001\u0000\u0000\u0000\u0190\u0191\u0001\u0000\u0000"+
		"\u0000\u01917\u0001\u0000\u0000\u0000\u0192\u0190\u0001\u0000\u0000\u0000"+
		"\u0193\u0194\u0003:\u001d\u0000\u0194\u0198\u0005\u0005\u0000\u0000\u0195"+
		"\u0197\u0003 \u0010\u0000\u0196\u0195\u0001\u0000\u0000\u0000\u0197\u019a"+
		"\u0001\u0000\u0000\u0000\u0198\u0196\u0001\u0000\u0000\u0000\u0198\u0199"+
		"\u0001\u0000\u0000\u0000\u01999\u0001\u0000\u0000\u0000\u019a\u0198\u0001"+
		"\u0000\u0000\u0000\u019b\u01a0\u0003<\u001e\u0000\u019c\u019d\u0005\b"+
		"\u0000\u0000\u019d\u019f\u0003<\u001e\u0000\u019e\u019c\u0001\u0000\u0000"+
		"\u0000\u019f\u01a2\u0001\u0000\u0000\u0000\u01a0\u019e\u0001\u0000\u0000"+
		"\u0000\u01a0\u01a1\u0001\u0000\u0000\u0000\u01a1;\u0001\u0000\u0000\u0000"+
		"\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a3\u01a5\u0003>\u001f\u0000\u01a4"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a4\u01a5\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01ac\u0005<\u0000\u0000\u01a7\u01a9"+
		"\u0005-\u0000\u0000\u01a8\u01aa\u0003>\u001f\u0000\u01a9\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a9\u01aa\u0001\u0000\u0000\u0000\u01aa\u01ab\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ad\u0005<\u0000\u0000\u01ac\u01a7\u0001\u0000\u0000"+
		"\u0000\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad=\u0001\u0000\u0000\u0000"+
		"\u01ae\u01af\u0005.\u0000\u0000\u01af?\u0001\u0000\u0000\u0000\u01b0\u01b6"+
		"\u0003B!\u0000\u01b1\u01b2\u0003F#\u0000\u01b2\u01b3\u0003B!\u0000\u01b3"+
		"\u01b5\u0001\u0000\u0000\u0000\u01b4\u01b1\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7A\u0001\u0000\u0000\u0000\u01b8\u01b6"+
		"\u0001\u0000\u0000\u0000\u01b9\u01bf\u0003D\"\u0000\u01ba\u01bb\u0003"+
		"H$\u0000\u01bb\u01bc\u0003D\"\u0000\u01bc\u01be\u0001\u0000\u0000\u0000"+
		"\u01bd\u01ba\u0001\u0000\u0000\u0000\u01be\u01c1\u0001\u0000\u0000\u0000"+
		"\u01bf\u01bd\u0001\u0000\u0000\u0000\u01bf\u01c0\u0001\u0000\u0000\u0000"+
		"\u01c0C\u0001\u0000\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c2"+
		"\u01c8\u0003L&\u0000\u01c3\u01c4\u0003J%\u0000\u01c4\u01c5\u0003L&\u0000"+
		"\u01c5\u01c7\u0001\u0000\u0000\u0000\u01c6\u01c3\u0001\u0000\u0000\u0000"+
		"\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000"+
		"\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9E\u0001\u0000\u0000\u0000\u01ca"+
		"\u01c8\u0001\u0000\u0000\u0000\u01cb\u01cc\u0007\u0002\u0000\u0000\u01cc"+
		"G\u0001\u0000\u0000\u0000\u01cd\u01ce\u0007\u0003\u0000\u0000\u01ceI\u0001"+
		"\u0000\u0000\u0000\u01cf\u01d0\u00052\u0000\u0000\u01d0K\u0001\u0000\u0000"+
		"\u0000\u01d1\u01d3\u0003>\u001f\u0000\u01d2\u01d1\u0001\u0000\u0000\u0000"+
		"\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d4\u0001\u0000\u0000\u0000"+
		"\u01d4\u01d7\u0003N\'\u0000\u01d5\u01d7\u0003P(\u0000\u01d6\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d6\u01d5\u0001\u0000\u0000\u0000\u01d7M\u0001\u0000"+
		"\u0000\u0000\u01d8\u01da\u0005\u0010\u0000\u0000\u01d9\u01d8\u0001\u0000"+
		"\u0000\u0000\u01d9\u01da\u0001\u0000\u0000\u0000\u01da\u01db\u0001\u0000"+
		"\u0000\u0000\u01db\u01ef\u0003\b\u0004\u0000\u01dc\u01dd\u0005>\u0000"+
		"\u0000\u01dd\u01de\u0005\u0016\u0000\u0000\u01de\u01e3\u0003V+\u0000\u01df"+
		"\u01e0\u0005\b\u0000\u0000\u01e0\u01e2\u0003V+\u0000\u01e1\u01df\u0001"+
		"\u0000\u0000\u0000\u01e2\u01e5\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001"+
		"\u0000\u0000\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e4\u01e6\u0001"+
		"\u0000\u0000\u0000\u01e5\u01e3\u0001\u0000\u0000\u0000\u01e6\u01e7\u0005"+
		"\u0017\u0000\u0000\u01e7\u01ef\u0001\u0000\u0000\u0000\u01e8\u01ef\u0005"+
		"<\u0000\u0000\u01e9\u01ef\u0005=\u0000\u0000\u01ea\u01eb\u0005\u0016\u0000"+
		"\u0000\u01eb\u01ec\u0003V+\u0000\u01ec\u01ed\u0005\u0017\u0000\u0000\u01ed"+
		"\u01ef\u0001\u0000\u0000\u0000\u01ee\u01d9\u0001\u0000\u0000\u0000\u01ee"+
		"\u01dc\u0001\u0000\u0000\u0000\u01ee\u01e8\u0001\u0000\u0000\u0000\u01ee"+
		"\u01e9\u0001\u0000\u0000\u0000\u01ee\u01ea\u0001\u0000\u0000\u0000\u01ef"+
		"O\u0001\u0000\u0000\u0000\u01f0\u01f1\u00053\u0000\u0000\u01f1\u01f4\u0003"+
		"\b\u0004\u0000\u01f2\u01f4\u0005?\u0000\u0000\u01f3\u01f0\u0001\u0000"+
		"\u0000\u0000\u01f3\u01f2\u0001\u0000\u0000\u0000\u01f4Q\u0001\u0000\u0000"+
		"\u0000\u01f5\u01f9\u0003@ \u0000\u01f6\u01f7\u0003T*\u0000\u01f7\u01f8"+
		"\u0003@ \u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01f6\u0001\u0000"+
		"\u0000\u0000\u01f9\u01fa\u0001\u0000\u0000\u0000\u01faS\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0007\u0004\u0000\u0000\u01fcU\u0001\u0000\u0000\u0000"+
		"\u01fd\u0203\u0003X,\u0000\u01fe\u01ff\u0003^/\u0000\u01ff\u0200\u0003"+
		"X,\u0000\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u01fe\u0001\u0000\u0000"+
		"\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204W\u0001\u0000\u0000\u0000"+
		"\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u020c\u0003Z-\u0000\u0207\u0208"+
		"\u0003`0\u0000\u0208\u0209\u0003Z-\u0000\u0209\u020b\u0001\u0000\u0000"+
		"\u0000\u020a\u0207\u0001\u0000\u0000\u0000\u020b\u020e\u0001\u0000\u0000"+
		"\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020c\u020d\u0001\u0000\u0000"+
		"\u0000\u020dY\u0001\u0000\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000"+
		"\u020f\u0211\u00059\u0000\u0000\u0210\u020f\u0001\u0000\u0000\u0000\u0210"+
		"\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212"+
		"\u0213\u0003\\.\u0000\u0213[\u0001\u0000\u0000\u0000\u0214\u0217\u0007"+
		"\u0005\u0000\u0000\u0215\u0217\u0003R)\u0000\u0216\u0214\u0001\u0000\u0000"+
		"\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u0217]\u0001\u0000\u0000\u0000"+
		"\u0218\u0219\u0005:\u0000\u0000\u0219_\u0001\u0000\u0000\u0000\u021a\u021b"+
		"\u0005;\u0000\u0000\u021ba\u0001\u0000\u0000\u00009en}\u0084\u008f\u009a"+
		"\u009f\u00a5\u00a8\u00b2\u00bb\u00c1\u00c7\u00cf\u00d7\u00dd\u00e2\u00e5"+
		"\u00ec\u00f7\u00fd\u0103\u0110\u0115\u011a\u011f\u012b\u0136\u013d\u0140"+
		"\u014c\u014f\u015d\u0168\u0171\u0178\u0185\u0190\u0198\u01a0\u01a4\u01a9"+
		"\u01ac\u01b6\u01bf\u01c8\u01d2\u01d6\u01d9\u01e3\u01ee\u01f3\u01f9\u0203"+
		"\u020c\u0210\u0216";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}