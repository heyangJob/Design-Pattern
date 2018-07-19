package demo.dhcc.com.observer.tui;

import java.util.ArrayList;
import java.util.List;

/**
 * 发生火情
 *
 * @author 512573717@qq.com
 * @created 2018/7/18  上午11:23.
 */
public class ZhaoHuo implements IObservable {

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
    public void noticeObserver(String messgae) {
        for (IObserver observer : mIObservers) {
            observer.updateMessage(messgae);
        }
    }

    public void change(String messgae) {
        System.out.println("推模型---------");
        noticeObserver(messgae);
    }
}
