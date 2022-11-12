package expression;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import antlr.YaulBaseVisitor;
import antlr.YaulParser.AlreadyDeclaredIntContext;
import antlr.YaulParser.AlreadyDeclaredMatrixContext;
import antlr.YaulParser.DeclarationEmptyMatrixContext;
import antlr.YaulParser.DeclarationEmptyIntContext;
import antlr.YaulParser.ProgramContext;

public class AntlrToProgram extends YaulBaseVisitor<Program>{

	public List<String> semanticErrors;
	
	@Override
	public Program visitProgram(ProgramContext ctx) {
		Program prog = new Program();
		
		ExpressionToJava fileManipulator = new ExpressionToJava();
		semanticErrors = new ArrayList<>();
		AntlrToExpression exprVisitor = new AntlrToExpression(semanticErrors, fileManipulator);
		
		for(int i=2; i < ctx.getChild(0).getChildCount()-1; i++) {
			if(i == ctx.getChildCount() - 1) {
			} else {
				if(ctx.getChild(0).getChild(i) instanceof DeclarationEmptyMatrixContext) {
					MultipleEmptyMatrixDeclaration e = (MultipleEmptyMatrixDeclaration) exprVisitor.visit(ctx.getChild(0).getChild(i));
					for(int j = 0; j < e.variablelist.size(); j++) {
						prog.addExpression(e.variablelist.get(j));
					}
				} else if(ctx.getChild(0).getChild(i) instanceof DeclarationEmptyIntContext) {
					exprVisitor.visit(ctx.getChild(0).getChild(i));
				} else if(ctx.getChild(0).getChild(i) instanceof AlreadyDeclaredMatrixContext) {
					exprVisitor.visit(ctx.getChild(0).getChild(i));
				} else if(ctx.getChild(0).getChild(i) instanceof AlreadyDeclaredIntContext) {
					List<Expression> listExpressions = prog.expressions;
					for(int j = 0; j < listExpressions.size(); j++) {
						if(listExpressions.get(j) instanceof VariableDeclaration) {
							Expression noValueDeclaratedExpr = (Expression) listExpressions.get(j);
							Expression overrideValueExpr = (Expression) exprVisitor.visit(ctx.getChild(0).getChild(i));
							VariableDeclaration<?> noValueDeclarated = (VariableDeclaration<?>) listExpressions.get(j);
							VariableDeclaration<?> overrideValue = (VariableDeclaration<?>) exprVisitor.visit(ctx.getChild(0).getChild(i));
							if(overrideValue.id.equals(noValueDeclarated.id)) {
								prog.removeExpression(noValueDeclaratedExpr);
								prog.addExpression(overrideValueExpr);
								break;
							}
						}
					}
				} else {
					prog.addExpression(exprVisitor.visit(ctx.getChild(0).getChild(i)));
				}
			}
		}
		
		if(semanticErrors.isEmpty()) {
			fileManipulator.endFile();
			//fileManipulator.printGeneratedString();
			try {
				fileManipulator.createFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			fileManipulator.writeFile();
		} else {
			for(String err: semanticErrors) {
				System.err.println(err);
			}
		}
		return prog;
	}
	
}
