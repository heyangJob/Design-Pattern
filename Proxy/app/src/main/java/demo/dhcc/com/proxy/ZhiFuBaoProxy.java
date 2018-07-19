package demo.dhcc.com.proxy;

/**
 * 支付宝代缴话费
 *
 * @author 512573717@qq.com
 * @created 2018/7/19  上午11:12.
 */
public class ZhiFuBaoProxy implements IHuaFei {
    private Recharge mRecharge;

    public ZhiFuBaoProxy(Recharge recharge) {
        mRecharge = recharge;
    }

    @Override
    public void recharge() {
        mRecharge.recharge();
    }
}
