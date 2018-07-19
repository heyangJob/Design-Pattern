package demo.dhcc.com.strategy;

/**
 * 总收益计算器
 *
 * @author 512573717@qq.com
 * @created 2018/7/12  下午2:01.
 */
public class TotalMoney {

    private IFinanceStrategy mFinanceStrategy;

    public void setFinanceStrategy(IFinanceStrategy financeStrategy) {
        mFinanceStrategy = financeStrategy;
    }

    public double totalMoney(int total) {
        return mFinanceStrategy.earnings(total);
    }
}
