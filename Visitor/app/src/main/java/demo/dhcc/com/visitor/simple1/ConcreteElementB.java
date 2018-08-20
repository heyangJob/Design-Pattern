package demo.dhcc.com.visitor.simple1;

/**
 * @author 512573717@qq.com
 * @created 2018/8/20  上午10:37.
 */
public class ConcreteElementB implements Element {
    public void accept(Visitor visitor) {
        System.out.println(visitor.getClass().getCanonicalName() + "=======访问"+ "ConcreteElementB");
        visitor.visit(this);
    }
}
