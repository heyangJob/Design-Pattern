package simple1;

/**
 * 单例 饿汉式
 *
 * @author 512573717@qq.com
 * @created 2018/7/2 下午1:59.
 */
public class Singleton {

    private static Singleton mInstance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return mInstance;
    }
}
