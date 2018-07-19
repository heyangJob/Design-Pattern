package demo.dhcc.com.observer.tui;

/**
 * 烟感应器
 *
 * @author 512573717@qq.com
 * @created 2018/7/18  上午11:05.
 */
public class YanObserver implements IObserver {

    @Override
    public void updateMessage(String message) {
        System.out.println(message + "烟感应器 感应到了火情，立刻鸣警");
    }
}
