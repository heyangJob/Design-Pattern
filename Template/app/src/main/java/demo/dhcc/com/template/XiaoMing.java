package demo.dhcc.com.template;

/**
 * 小明回家
 *
 * @author 512573717@qq.com
 * @created 2018/7/10  下午3:10.
 */
public class XiaoMing extends BaseGoHome {
    @Override
    public void travelWay() {
        System.out.println("选择做飞机回家");
    }

    @Override
    public void buyTicket() {
        System.out.println("在网上买提前订票");
    }

    @Override
    public void shangche() {
        System.out.println("换登记牌 登机");
    }

    @Override
    public void xiache() {
        System.out.println("打车回家");
    }
}
