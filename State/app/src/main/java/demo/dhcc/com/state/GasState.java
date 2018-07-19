package demo.dhcc.com.state;

/**
 * 气体
 *
 * @author 512573717@qq.com
 * @created 2018/7/12  下午5:10.
 */
public class GasState implements IState {

    @Override
    public void shape() {
        System.out.println("这是100度以上的水 气体的");
    }

    @Override
    public void use() {
        System.out.println("当前用途：用来真桑拿、食品等");
    }
}
