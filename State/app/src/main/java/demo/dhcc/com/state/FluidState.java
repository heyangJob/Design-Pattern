package demo.dhcc.com.state;

/**
 * 液体
 *
 * @author 512573717@qq.com
 * @created 2018/7/12  下午5:11.
 */
public class FluidState implements IState {
    @Override
    public void shape() {
        System.out.println("这是0度到100之间的水 液体的");
    }

    @Override
    public void use() {
        System.out.println("当前用途：洗澡、浇树");
    }
}
