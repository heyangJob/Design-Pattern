package simple3;

/**
 * 单例 静态内部类
 *
 * @author 512573717@qq.com
 * @created 2018/7/2 下午1:59.
 */
public class Singleton {

    private Singleton() {
    }

    public static  class  SingletonHolder{
        private  static volatile Singleton mInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.mInstance;
    }
}
