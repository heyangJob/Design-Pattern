package demo.dhcc.com.mediator;

/**
 * 房产中介
 *
 * @author 512573717@qq.com
 * @created 2018/7/31  上午10:20.
 */
public class FangChanMediator implements IMediator {

    private XiaoMing mXiaoMing;

    private WangDaYe mWangDaYe;

    public void setBuyer(XiaoMing buyer) {
        mXiaoMing = buyer;
    }

    public void setSeller(WangDaYe seller) {
        mWangDaYe = seller;
    }

    @Override
    public void notice(Deal deal, String message) {
        System.out.println("中介收到消息 开始匹配");
        if (deal == mXiaoMing) {
            mWangDaYe.receiveMessage(message);
        } else {
            mXiaoMing.receiveMessage(message);
        }
    }
}
