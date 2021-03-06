package org.boris.expr.function.excel;

import java.util.Date;

import org.boris.expr.Expr;
import org.boris.expr.ExprDecimal;
import org.boris.expr.ExprException;
import org.boris.expr.IEvaluationContext;
import org.boris.expr.function.AbstractFunction;
import org.boris.expr.util.ExcelDate;

public class TODAY extends AbstractFunction
{
    public Expr evaluate(IEvaluationContext context, Expr[] args) throws ExprException {
        assertArgCount(args, 0);
        return new ExprDecimal(ExcelDate.toExcelDate(new Date().getTime(), 0));
    }

    public boolean isVolatile() {
        return true;
    }
}
