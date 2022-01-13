// Generated from compiler1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link compiler1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface compiler1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link compiler1Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(compiler1Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler1Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(compiler1Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler1Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(compiler1Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler1Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(compiler1Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link compiler1Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(compiler1Parser.NumberContext ctx);
}