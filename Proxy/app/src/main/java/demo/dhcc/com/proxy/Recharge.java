package demo.dhcc.com.proxy;

/**
 * 充值
 *
 * @author 512573717@qq.com
 * @created 2018/7/19  上午11:12.
 */
public class Recharge implements IHuaFei {
    @Override
    public void recharge() {
        System.out.println("充值100元话费");
    }
}
