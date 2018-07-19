package simple2;

/**
 * 单例  懒汉式
 *
 * @author 512573717@qq.com
 * @created 2018/7/2 下午1:59.
 */
public class Singleton {
    //synchronized虽然保证了原子性，但却没有保证指令重排序的正确性，会出现A线程执行初始化，
    // 但可能因为构造函数里面的操作太多了，所以A线程的uniqueInstance实例还没有造出来，但已经被赋值了。
    // 而B线程这时过来了，错以为uniqueInstance已经被实例化出来，一用才发现uniqueInstance尚未被初始化。
    // 要知道我们的线程虽然可以保证原子性，但程序可能是在多核CPU上执行。
    // volatile  http://www.cnblogs.com/dolphin0520/p/3920373.html
    private static volatile Singleton mInstance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (null == mInstance) {
            // 防止 多线程并发 创建多个实例
            synchronized (Singleton.class) {
                if (null == mInstance) {
                    mInstance = new Singleton();
                }
            }
        }
        return mInstance;
    }
}
