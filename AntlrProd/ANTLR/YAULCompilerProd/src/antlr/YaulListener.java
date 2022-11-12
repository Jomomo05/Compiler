// Generated from Yaul.g4 by ANTLR 4.10.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link YaulParser}.
 */
public interface YaulListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code Program}
	 * labeled alternative in {@link YaulParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProgram(YaulParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Program}
	 * labeled alternative in {@link YaulParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProgram(YaulParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link YaulParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(YaulParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionDeclaration}
	 * labeled alternative in {@link YaulParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(YaulParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(YaulParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Declaration}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(YaulParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationMatrix(YaulParser.DeclarationMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationMatrix(YaulParser.DeclarationMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationEmptyMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationEmptyMatrix(YaulParser.DeclarationEmptyMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationEmptyMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationEmptyMatrix(YaulParser.DeclarationEmptyMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlreadyDeclaredMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterAlreadyDeclaredMatrix(YaulParser.AlreadyDeclaredMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlreadyDeclaredMatrix}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitAlreadyDeclaredMatrix(YaulParser.AlreadyDeclaredMatrixContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DeclarationEmptyInt}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationEmptyInt(YaulParser.DeclarationEmptyIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DeclarationEmptyInt}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationEmptyInt(YaulParser.DeclarationEmptyIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlreadyDeclaredInt}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterAlreadyDeclaredInt(YaulParser.AlreadyDeclaredIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlreadyDeclaredInt}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitAlreadyDeclaredInt(YaulParser.AlreadyDeclaredIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TransposedMatrixDeclaration}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterTransposedMatrixDeclaration(YaulParser.TransposedMatrixDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TransposedMatrixDeclaration}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitTransposedMatrixDeclaration(YaulParser.TransposedMatrixDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationExprMult}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExprMult(YaulParser.VariableDeclarationExprMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationExprMult}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExprMult(YaulParser.VariableDeclarationExprMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationExprivision}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExprivision(YaulParser.VariableDeclarationExprivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationExprivision}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExprivision(YaulParser.VariableDeclarationExprivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationExprAddition}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExprAddition(YaulParser.VariableDeclarationExprAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationExprAddition}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExprAddition(YaulParser.VariableDeclarationExprAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableDeclarationExprSubtraction}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationExprSubtraction(YaulParser.VariableDeclarationExprSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableDeclarationExprSubtraction}
	 * labeled alternative in {@link YaulParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationExprSubtraction(YaulParser.VariableDeclarationExprSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplication(YaulParser.MultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multiplication}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplication(YaulParser.MultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddition(YaulParser.AdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Addition}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddition(YaulParser.AdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(YaulParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(YaulParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSubtraction(YaulParser.SubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Subtraction}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSubtraction(YaulParser.SubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(YaulParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(YaulParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDivision(YaulParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link YaulParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDivision(YaulParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteMultiplication}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterWriteMultiplication(YaulParser.WriteMultiplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteMultiplication}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitWriteMultiplication(YaulParser.WriteMultiplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteDivision}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterWriteDivision(YaulParser.WriteDivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteDivision}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitWriteDivision(YaulParser.WriteDivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteAddition}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterWriteAddition(YaulParser.WriteAdditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteAddition}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitWriteAddition(YaulParser.WriteAdditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteSubtraction}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterWriteSubtraction(YaulParser.WriteSubtractionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteSubtraction}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitWriteSubtraction(YaulParser.WriteSubtractionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteMultiplicationTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterWriteMultiplicationTransposed(YaulParser.WriteMultiplicationTransposedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteMultiplicationTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitWriteMultiplicationTransposed(YaulParser.WriteMultiplicationTransposedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteDivisionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterWriteDivisionTransposed(YaulParser.WriteDivisionTransposedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteDivisionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitWriteDivisionTransposed(YaulParser.WriteDivisionTransposedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteAdditionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterWriteAdditionTransposed(YaulParser.WriteAdditionTransposedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteAdditionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitWriteAdditionTransposed(YaulParser.WriteAdditionTransposedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteSubtractionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void enterWriteSubtractionTransposed(YaulParser.WriteSubtractionTransposedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteSubtractionTransposed}
	 * labeled alternative in {@link YaulParser#writeExpressions}.
	 * @param ctx the parse tree
	 */
	void exitWriteSubtractionTransposed(YaulParser.WriteSubtractionTransposedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteVariable}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 */
	void enterWriteVariable(YaulParser.WriteVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteVariable}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 */
	void exitWriteVariable(YaulParser.WriteVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteNumber}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 */
	void enterWriteNumber(YaulParser.WriteNumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteNumber}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 */
	void exitWriteNumber(YaulParser.WriteNumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code WriteTransposedMatrix}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 */
	void enterWriteTransposedMatrix(YaulParser.WriteTransposedMatrixContext ctx);
	/**
	 * Exit a parse tree produced by the {@code WriteTransposedMatrix}
	 * labeled alternative in {@link YaulParser#writeNormals}.
	 * @param ctx the parse tree
	 */
	void exitWriteTransposedMatrix(YaulParser.WriteTransposedMatrixContext ctx);
}