package demo.dhcc.com.observer.la;


/**
 * 烟感应器
 *
 * @author 512573717@qq.com
 * @created 2018/7/18  上午11:05.
 */
public class YanObserver implements IObserver {

    @Override
    public void updateMessage(IObservable observable) {
        String message=((ZhaoHuo)observable).getMessage();
        System.out.println(message + "烟感应器 感应到了火情，立刻鸣警");
    }
}
