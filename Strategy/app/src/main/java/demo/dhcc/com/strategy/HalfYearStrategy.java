package demo.dhcc.com.strategy;

import java.math.BigDecimal;

/**
 * 197天收益
 *
 * @author 512573717@qq.com
 * @created 2018/7/12  下午1:53.
 */
public class HalfYearStrategy implements IFinanceStrategy {
    @Override
    public double earnings(int total) {
        // 197天后可提现 年利率5.2%
        BigDecimal b1 = new BigDecimal(0.052 * 197);
        BigDecimal b2 = new BigDecimal(365);
        double result = b1.divide(b2, 6, BigDecimal.ROUND_HALF_UP).doubleValue() * total;
        return result;
    }
}
