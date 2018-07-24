package demo.dhcc.com.adapter.simple2;

import demo.dhcc.com.adapter.IMoneyDollar;
import demo.dhcc.com.adapter.MoneyRMB;

/**
 * 美元转换人民币的适配器
 *
 * @author 512573717@qq.com
 * @created 2018/7/23  下午5:07.
 */
public class MoneyAdapter implements IMoneyDollar {

    private MoneyRMB mMoneyRMB;


    public MoneyAdapter(MoneyRMB moneyRMB) {
        mMoneyRMB = moneyRMB;
    }

    @Override
    public double getDollar(int money) {
        System.out.println("人民币转换美元");
        return money / 6.8;
    }

    public void getRMB(int money) {
        mMoneyRMB.getRMB(money);
    }
}
