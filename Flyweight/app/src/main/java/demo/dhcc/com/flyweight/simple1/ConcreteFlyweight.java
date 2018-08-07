package demo.dhcc.com.flyweight.simple1;

/**
 * 享元角色的实现类
 *
 * @author 512573717@qq.com
 * @created 2018/8/6  下午3:50.
 */
public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState = null;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String state) {
        // 内部状态
        System.out.println("Intrinsic State = " + this.intrinsicState);
        // 外部状态
        System.out.println("Extrinsic State = " + state);
    }
}
