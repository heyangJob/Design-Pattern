package demo.dhcc.com.observer.tui;

/**
 * 被观察者接口
 *
 * @author 512573717@qq.com
 * @created 2018/7/18  上午10:39.
 */
public interface IObservable {
    //添加
    void addObserver(IObserver observer);

    //移除
    void removeObserver(IObserver observer);

    //通知
    void noticeObserver(String messgae);
}
