package demo.dhcc.com.strategy;

/**
 * 一年的收益
 *
 * @author 512573717@qq.com
 * @created 2018/7/12  下午1:56.
 */
public class OneYearStrategy implements IFinanceStrategy {

    @Override
    public double earnings(int total) {
        // 1年后可提现 年利率10.2%
        return 0.102 * total;
    }
}
