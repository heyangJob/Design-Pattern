package demo.dhcc.com.mediator;

/**
 * 交易的接口
 *
 * @author 512573717@qq.com
 * @created 2018/7/30  下午3:40.
 */
public abstract class Deal {
    protected IMediator mMediator;

    public Deal(IMediator mediator) {
        mMediator = mediator;
    }

    protected abstract void sendMessage(String message);

    protected abstract void receiveMessage(String message);

}
