package demo.dhcc.com.strategy;

import java.math.BigDecimal;

/**
 * 90天的收益
 *
 * @author 512573717@qq.com
 * @created 2018/7/12  上午9:46.
 */
public class ThreeStrategy implements IFinanceStrategy {

    @Override
    public double earnings(int total) {
        // 90天后可提现 年利率4.7%
        BigDecimal b1 = new BigDecimal(0.047 * 90);
        BigDecimal b2 = new BigDecimal(365);
        double result = b1.divide(b2, 6, BigDecimal.ROUND_HALF_UP).doubleValue() * total;
        return result;
    }
}
