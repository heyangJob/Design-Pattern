package demo.dhcc.com.factory.simple1;

import demo.dhcc.com.factory.Flour;
import demo.dhcc.com.factory.IZhushi;
import demo.dhcc.com.factory.Rice;

/**
 * 主食工厂
 *
 * @author 512573717@qq.com
 * @created 2018/7/6  下午2:48.
 */
public class FactoryZhuShi {
    //南方人
    public static final int SOUTH = 1;
    //北方人
    public static final int NORTH = 2;

    public  static IZhushi createZhushi(int type) {
        switch (type) {
            case SOUTH:
                return new Rice();
            case NORTH:
                return new Flour();
            default:
                return new Rice();
        }
    }
}
