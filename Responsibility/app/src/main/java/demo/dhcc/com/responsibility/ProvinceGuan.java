package demo.dhcc.com.responsibility;

/**
 * 巡抚
 *
 * @author 512573717@qq.com
 * @created 2018/7/19  下午4:44.
 */
public class ProvinceGuan extends DangGuan {
    @Override
    void anQing(String desc) {
        if (desc.equals("巡抚")) {
            System.out.println("巡抚处理了此案情");
        } else {
            getNextDangGuan().anQing(desc);
        }
    }
}