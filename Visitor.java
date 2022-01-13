public class Visitor extends compiler1BaseVisitor<Void>{
    @Override
    public Void visitBlock(compiler1Parser.BlockContext ctx) {
        System.out.println("{");
        visit(ctx.stmt());
        System.out.println("\n}");
        return null;
    }

    @Override
    public Void visitCompUnit(compiler1Parser.CompUnitContext ctx) {
        return super.visitCompUnit(ctx);
    }

    @Override
    public Void visitFuncDef(compiler1Parser.FuncDefContext ctx) {
        System.out.printf("define dso_local i32 @main()");
        return super.visitFuncDef(ctx);
    }

    @Override
    public Void visitNumber(compiler1Parser.NumberContext ctx) {
        int number = 0;
        if (ctx.Decimal_const() != null) {
            number = Integer.parseInt(ctx.Decimal_const().toString());
        }
        else if (ctx.Octal_const() != null) {
            String oct = ctx.Octal_const().toString();
            number = Integer.valueOf(oct,8);
        }
        else {
            String hex = ctx.Hexadecimal_const().toString().substring(2);
            number = Integer.valueOf(hex,16);
        }
        System.out.print("i32 " + number);
        return super.visitNumber(ctx);
    }

    @Override
    public Void visitStmt(compiler1Parser.StmtContext ctx) {
        System.out.print("\tret ");
        return super.visitStmt(ctx);
    }
}
