package demo.dhcc.com.mediator;

/**
 * 王大爷想出租自己的房子
 *
 * @author 512573717@qq.com
 * @created 2018/7/30  下午5:05.
 */
public class WangDaYe extends Deal {
    public WangDaYe(IMediator mediator) {
        super(mediator);
    }

    @Override
    protected void sendMessage(String message) {
        System.out.println("王大爷：告诉房产中介" + message);
        mMediator.notice(this, message);
    }

    @Override
    protected void receiveMessage(String message) {
        System.out.println("王大爷收到房产中介一条信息：" + message);
    }
}
