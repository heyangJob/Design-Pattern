package demo.dhcc.com.expression.simple1;

/**
 * 数字解释器
 *
 * @author 512573717@qq.com
 * @created 2018/8/14  下午5:16.
 */
public class NumExpression extends AbstractExpression {
    private int num;

    public NumExpression(int num) {
        this.num = num;
    }

    @Override
    public int interpret() {
        return num;
    }
}
