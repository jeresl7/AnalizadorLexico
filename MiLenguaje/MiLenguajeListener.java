// Generated from MiLenguaje.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiLenguajeParser}.
 */
public interface MiLenguajeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(MiLenguajeParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(MiLenguajeParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(MiLenguajeParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(MiLenguajeParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(MiLenguajeParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(MiLenguajeParser.ImpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(MiLenguajeParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(MiLenguajeParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#accionRobot}.
	 * @param ctx the parse tree
	 */
	void enterAccionRobot(MiLenguajeParser.AccionRobotContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#accionRobot}.
	 * @param ctx the parse tree
	 */
	void exitAccionRobot(MiLenguajeParser.AccionRobotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Comparacion}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(MiLenguajeParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Comparacion}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(MiLenguajeParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(MiLenguajeParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(MiLenguajeParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(MiLenguajeParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(MiLenguajeParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParentesis(MiLenguajeParser.ParentesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentesis}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParentesis(MiLenguajeParser.ParentesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(MiLenguajeParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(MiLenguajeParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIntLiteral(MiLenguajeParser.IntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntLiteral}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIntLiteral(MiLenguajeParser.IntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identificador}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(MiLenguajeParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identificador}
	 * labeled alternative in {@link MiLenguajeParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(MiLenguajeParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#entero}.
	 * @param ctx the parse tree
	 */
	void enterEntero(MiLenguajeParser.EnteroContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#entero}.
	 * @param ctx the parse tree
	 */
	void exitEntero(MiLenguajeParser.EnteroContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#decimal}.
	 * @param ctx the parse tree
	 */
	void enterDecimal(MiLenguajeParser.DecimalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#decimal}.
	 * @param ctx the parse tree
	 */
	void exitDecimal(MiLenguajeParser.DecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void enterMostrar(MiLenguajeParser.MostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#mostrar}.
	 * @param ctx the parse tree
	 */
	void exitMostrar(MiLenguajeParser.MostrarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#si}.
	 * @param ctx the parse tree
	 */
	void enterSi(MiLenguajeParser.SiContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#si}.
	 * @param ctx the parse tree
	 */
	void exitSi(MiLenguajeParser.SiContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void enterAvanzar(MiLenguajeParser.AvanzarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#avanzar}.
	 * @param ctx the parse tree
	 */
	void exitAvanzar(MiLenguajeParser.AvanzarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#girar}.
	 * @param ctx the parse tree
	 */
	void enterGirar(MiLenguajeParser.GirarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#girar}.
	 * @param ctx the parse tree
	 */
	void exitGirar(MiLenguajeParser.GirarContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#detener}.
	 * @param ctx the parse tree
	 */
	void enterDetener(MiLenguajeParser.DetenerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#detener}.
	 * @param ctx the parse tree
	 */
	void exitDetener(MiLenguajeParser.DetenerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiLenguajeParser#esperar}.
	 * @param ctx the parse tree
	 */
	void enterEsperar(MiLenguajeParser.EsperarContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiLenguajeParser#esperar}.
	 * @param ctx the parse tree
	 */
	void exitEsperar(MiLenguajeParser.EsperarContext ctx);
}