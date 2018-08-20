package demo.dhcc.com.expression.simple1;

/**
 * 加法运算抽象解释器
 *
 * @author 512573717@qq.com
 * @created 2018/8/15  下午11:10.
 */
public class AddExpression extends OperationExpression {
    public AddExpression(AbstractExpression exp1, AbstractExpression exp2) {
        super(exp1, exp2);
    }

    @Override
    public int interpret(Context c) {
        return exp1.interpret( c) + exp2.interpret( c);
    }
}
