// Generated from Yaul.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link YaulParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface YaulVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link YaulParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(YaulParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link YaulParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(YaulParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(YaulParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationMatrix(YaulParser.DeclarationMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationEmptyMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationEmptyMatrix(YaulParser.DeclarationEmptyMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlreadyDeclaredMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlreadyDeclaredMatrix(YaulParser.AlreadyDeclaredMatrixContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DeclarationEmptyInt}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationEmptyInt(YaulParser.DeclarationEmptyIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlreadyDeclaredInt}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlreadyDeclaredInt(YaulParser.AlreadyDeclaredIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TransposedMatrixDeclaration}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransposedMatrixDeclaration(YaulParser.TransposedMatrixDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationExprMult}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExprMult(YaulParser.VariableDeclarationExprMultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationExprivision}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExprivision(YaulParser.VariableDeclarationExprivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationExprAddition}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExprAddition(YaulParser.VariableDeclarationExprAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableDeclarationExprSubtraction}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarationExprSubtraction(YaulParser.VariableDeclarationExprSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication(YaulParser.MultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition(YaulParser.AdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(YaulParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubtraction(YaulParser.SubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(YaulParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(YaulParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteMultiplication}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteMultiplication(YaulParser.WriteMultiplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteDivision}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteDivision(YaulParser.WriteDivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteAddition}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAddition(YaulParser.WriteAdditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteSubtraction}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteSubtraction(YaulParser.WriteSubtractionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteMultiplicationTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteMultiplicationTransposed(YaulParser.WriteMultiplicationTransposedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteDivisionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteDivisionTransposed(YaulParser.WriteDivisionTransposedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteAdditionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteAdditionTransposed(YaulParser.WriteAdditionTransposedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteSubtractionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteSubtractionTransposed(YaulParser.WriteSubtractionTransposedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteVariable}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteVariable(YaulParser.WriteVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteNumber}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteNumber(YaulParser.WriteNumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WriteTransposedMatrix}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteTransposedMatrix(YaulParser.WriteTransposedMatrixContext ctx);
}