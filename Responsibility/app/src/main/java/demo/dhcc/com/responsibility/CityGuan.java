package demo.dhcc.com.responsibility;

/**
 * 知府
 *
 * @author 512573717@qq.com
 * @created 2018/7/19  下午4:43.
 */
public class CityGuan extends DangGuan {
    @Override
    void anQing(String desc) {
        if (desc.equals("知府")) {
            System.out.println("知府处理了此案情");
        } else {
            System.out.println("知府：这案情我处理不了，我先上报");
            getNextDangGuan().anQing(desc);
        }
    }
}
