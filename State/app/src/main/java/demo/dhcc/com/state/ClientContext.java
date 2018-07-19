package demo.dhcc.com.state;

/**
 * 状态管理类
 *
 * @author 512573717@qq.com
 * @created 2018/7/12  下午5:12.
 */
public class ClientContext {

    private IState mIState = new IceState();

    private static volatile ClientContext mClientContext;

    private ClientContext() {
    }

    public static ClientContext getInstance() {
        if (null == mClientContext) {
            synchronized (ClientContext.class) {
                if (null == mClientContext) {
                    mClientContext = new ClientContext();
                }
            }
        }
        return mClientContext;
    }

    public void setIState(IState IState) {
        mIState = IState;
    }

    public void use() {
        mIState.use();
    }

    public void shape() {
        mIState.shape();
    }
}
