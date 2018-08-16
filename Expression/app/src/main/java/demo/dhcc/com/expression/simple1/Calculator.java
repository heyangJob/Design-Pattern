package demo.dhcc.com.expression.simple1;

import java.util.Stack;

/**
 * 处理与解释相关的一些业务
 * 
 * @author 512573717@qq.com
 
 * @created 2018/8/15  下午11:12.
 * 
 */
public class Calculator {
    //声明一个Stack栈存储并操作所有相关的解释器
    private Stack<AbstractExpression> expressions = new Stack<AbstractExpression>();

    public Calculator(String expression) {
        //声明两个ArithmeticExpressioin类型的临时变量，存储运算符左右两边的数字解释器
        AbstractExpression exp1, exp2;

        String[] elements = expression.split(" ");

        for (int i = 0; i < elements.length; i++) {
            switch (elements[i].charAt(0)) {
                case '+':
                    //将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = expressions.pop();
                    //同时将运算符号数组角标下一个元素构成
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //通过上面两个数字解释器构造加法运算解释器
                    expressions.push(new AddExpression(exp1, exp2));
                    break;
                case '–':
                    //将栈中的解释器弹出作为运算符号左边的解释器
                    exp1 = expressions.pop();
                    //同时将运算符号数组角标下一个元素构成
                    exp2 = new NumExpression(Integer.valueOf(elements[++i]));
                    //通过上面两个数字解释器构造加法运算解释器
                    expressions.push(new SubExpression(exp1, exp2));
                    break;
                default://如果为数字
                    /**
                     * 如果不是运算符则数字
                     * 则是数字，直接构造数字解释器并压入栈
                     */
                    expressions.push(new NumExpression(Integer.valueOf(elements[i])));
                    break;
            }
        }
    }

    /**
     * 计算
     * @return
     */
    public int calculate() {
        return expressions.pop().interpret();
    }

}
