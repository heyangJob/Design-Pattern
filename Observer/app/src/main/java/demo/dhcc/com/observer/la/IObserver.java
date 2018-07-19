package demo.dhcc.com.observer.la;

/**
 * 观察者接口
 *
 * @author 512573717@qq.com
 * @created 2018/7/18  上午10:38.
 */
public interface IObserver {
    //更新消息
    void updateMessage(IObservable observable);
}
