package demo.dhcc.com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理
 *
 * @author 512573717@qq.com
 * @created 2018/7/19  上午11:33.
 */
public class DynamicProxy  implements InvocationHandler {
    private Object object;
    public DynamicProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(object, args);
        return result;
    }
}
