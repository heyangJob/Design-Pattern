package demo.dhcc.com.observer.tui;

/**
 * 水银感应器
 *
 * @author 512573717@qq.com
 * @created 2018/7/18  上午11:08.
 */
public class ShuiYinObserver implements IObserver {
    @Override
    public void updateMessage(String message) {
        System.out.println(message + "水银感应器 感应到了火情，立刻自毁水银，开始喷水");
    }
}
