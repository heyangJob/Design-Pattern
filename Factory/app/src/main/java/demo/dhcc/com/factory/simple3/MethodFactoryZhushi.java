package demo.dhcc.com.factory.simple3;

import demo.dhcc.com.factory.Flour;
import demo.dhcc.com.factory.Rice;

/**
 * 简单工厂
 *
 * @author 512573717@qq.com
 * @created 2018/7/6  下午3:37.
 */
public class MethodFactoryZhushi {

    public static Rice getRice() {
        return new Rice();
    }

    public static Flour getFlour() {
        return new Flour();
    }
}
