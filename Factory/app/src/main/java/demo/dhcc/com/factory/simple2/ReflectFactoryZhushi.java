package demo.dhcc.com.factory.simple2;

import demo.dhcc.com.factory.IZhuShi;

/**
 * 通过反射获取主食
 *
 * @author 512573717@qq.com
 * @created 2018/7/6  下午3:11.
 */
public class ReflectFactoryZhuShi {

    public static <T extends IZhuShi> T createZhuShi(Class<T> cls) {
        T object = null;
        try {
            object = (T) (Class.forName(cls.getName())).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }
}
