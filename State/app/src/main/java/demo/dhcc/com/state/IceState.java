package demo.dhcc.com.state;

/**
 * 固体
 *
 * @author 512573717@qq.com
 * @created 2018/7/12  下午5:07.
 */
public class IceState implements IState {
    @Override
    public void shape() {
        System.out.println("这是0度以下的水 固体的");
    }

    @Override
    public void use() {
        System.out.println("当前用途：可以用来存储蔬菜，保鲜的作用");
    }
}
