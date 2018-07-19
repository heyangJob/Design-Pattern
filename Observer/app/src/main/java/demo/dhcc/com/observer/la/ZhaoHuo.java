package demo.dhcc.com.observer.la;

import java.util.ArrayList;
import java.util.List;


/**
 * 发生火情
 *
 * @author 512573717@qq.com
 * @created 2018/7/18  上午11:23.
 */
public class ZhaoHuo implements IObservable {

    private String message;

    private List<IObserver> mIObservers = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        if (!mIObservers.contains(observer)) {
            mIObservers.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        if (mIObservers.contains(observer)) {
            mIObservers.remove(observer);
        }
    }

    @Override
    public void noticeObserver() {
        for (IObserver observer : mIObservers) {
            observer.updateMessage(this);
        }
    }

    public void change(String message) {
        message = message;
        System.out.println(" 拉模型：" + message);
        //状态发生改变，通知各个观察者
        this.noticeObserver();
    }


    public String getMessage() {
        return message;
    }
}
