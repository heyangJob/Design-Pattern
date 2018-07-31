package demo.dhcc.com.mediator;

/**
 * 小明想租房子
 *
 * @author 512573717@qq.com
 * @created 2018/7/30  下午5:05.
 */
public class XiaoMing extends Deal {

    public XiaoMing(IMediator mediator) {
        super(mediator);
    }

    @Override
    protected void sendMessage(String message) {
        System.out.println("小明：告诉房产中介" + message);
        mMediator.notice(this, message);
    }

    @Override
    protected void receiveMessage(String message) {
        System.out.println("小明收到房产中介一条消息:" + message);
    }
}
