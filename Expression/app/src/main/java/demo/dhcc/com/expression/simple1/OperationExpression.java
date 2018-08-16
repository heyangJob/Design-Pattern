package demo.dhcc.com.expression.simple1;

/**
 * 运算符号抽象解释器
 *
 * @author 512573717@qq.com
 * @created 2018/8/15  上午11:47.
 */
public class OperationExpression extends AbstractExpression {
    //声明两个成员变量存储运算符号两边的数字解释器
    protected AbstractExpression exp1, exp2;

    public OperationExpression(AbstractExpression exp1, AbstractExpression exp2) {
        this.exp1 = exp1;
        this.exp2 = exp2;
    }

    @Override
    public int interpret() {
        return 0;
    }
}
