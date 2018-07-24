package demo.dhcc.com.adapter.simple1;

import demo.dhcc.com.adapter.IMoneyDollar;
import demo.dhcc.com.adapter.MoneyRMB;

/**
 * 美元转换人民币的适配器
 *
 * @author 512573717@qq.com
 * @created 2018/7/23  下午4:01.
 */
public class MoneyAdapter extends MoneyRMB implements IMoneyDollar {
    @Override
    public double getDollar(int money) {
        System.out.println("人民币转换美元");
        return money / 6.8;
    }
}
