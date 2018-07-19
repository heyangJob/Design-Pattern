package simple5;

/**
 * 单例 其他提现形式
 *
 @author 512573717@qq.com
 * @created 2018/7/2 下午1:59.
 */
public class Singleton {

    private static Singleton mInstance;

    private Singleton() {
    }

    static {
        mInstance = new Singleton();
    }

    public static Object getInstance() {
        return mInstance;
    }
}
