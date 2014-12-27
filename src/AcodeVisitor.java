// Generated from Acode.g4 by ANTLR 4.1
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AcodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AcodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AcodeParser#own_assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwn_assign(@NotNull AcodeParser.Own_assignContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#alloc_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlloc_array(@NotNull AcodeParser.Alloc_arrayContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgs(@NotNull AcodeParser.ArgsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#FunctionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(@NotNull AcodeParser.FunctionDefContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Una}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUna(@NotNull AcodeParser.UnaContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(@NotNull AcodeParser.Param_callContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(@NotNull AcodeParser.ExpContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Mul}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMul(@NotNull AcodeParser.MulContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#AssignVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignVar(@NotNull AcodeParser.AssignVarContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Emp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmp(@NotNull AcodeParser.EmpContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#While}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(@NotNull AcodeParser.WhileContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatements(@NotNull AcodeParser.StatementsContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(@NotNull AcodeParser.NameContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(@NotNull AcodeParser.AddContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#For}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(@NotNull AcodeParser.ForContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull AcodeParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#OwnAssing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnAssing(@NotNull AcodeParser.OwnAssingContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Ret}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRet(@NotNull AcodeParser.RetContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull AcodeParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Assign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(@NotNull AcodeParser.AssignContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Break}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak(@NotNull AcodeParser.BreakContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#FuncCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(@NotNull AcodeParser.FuncCallContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(@NotNull AcodeParser.InitContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Par}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPar(@NotNull AcodeParser.ParContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(@NotNull AcodeParser.PrintContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(@NotNull AcodeParser.NotContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Extern}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtern(@NotNull AcodeParser.ExternContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#lvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLvalue(@NotNull AcodeParser.LvalueContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Cmp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmp(@NotNull AcodeParser.CmpContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Or}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(@NotNull AcodeParser.OrContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Val}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVal(@NotNull AcodeParser.ValContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#Var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(@NotNull AcodeParser.VarContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#If}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(@NotNull AcodeParser.IfContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#basicType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicType(@NotNull AcodeParser.BasicTypeContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#And}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(@NotNull AcodeParser.AndContext ctx);

	/**
	 * Visit a parse tree produced by {@link AcodeParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(@NotNull AcodeParser.ArrayContext ctx);
}