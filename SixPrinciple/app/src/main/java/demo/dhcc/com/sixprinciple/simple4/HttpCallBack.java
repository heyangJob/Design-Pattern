package demo.dhcc.com.sixprinciple.simple4;

/**
 * @author 512573717@qq.com
 * @created 2018/8/22  上午9:25.
 */
public abstract class HttpCallBack<T> {

    // 返回可以直接操作的对象
    public abstract void onSuccess(T result);

    public abstract void onFailure(Exception e);
}
