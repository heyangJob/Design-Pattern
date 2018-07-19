package demo.dhcc.com.template;

/**
 * 老王回家
 *
 * @author 512573717@qq.com
 * @created 2018/7/10  下午3:11.
 */
public class LaoWang extends BaseGoHome {
    @Override
    public void travelWay() {
        System.out.println("选择做火车回家");
    }

    @Override
    public void buyTicket() {
        System.out.println("去火车站买票");
    }

    @Override
    public void shangche() {
        System.out.println("在候车室检票进站");
    }

    @Override
    public void xiache() {
        System.out.println("下车 做公交回家");
    }
}
