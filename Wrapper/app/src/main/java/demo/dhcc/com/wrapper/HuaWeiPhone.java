package demo.dhcc.com.wrapper;

/**
 * 华为手机
 *
 * @author 512573717@qq.com
 * @created 2018/7/26  下午1:59.
 */
public class HuaWeiPhone  implements  IPhone{
    @Override
    public void decorate() {
        System.out.println("华为手机");
    }
}
