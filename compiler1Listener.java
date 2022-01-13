// Generated from compiler1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link compiler1Parser}.
 */
public interface compiler1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link compiler1Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(compiler1Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler1Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(compiler1Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(compiler1Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(compiler1Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(compiler1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(compiler1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(compiler1Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(compiler1Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link compiler1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(compiler1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link compiler1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(compiler1Parser.NumberContext ctx);
}