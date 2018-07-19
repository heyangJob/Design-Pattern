package demo.dhcc.com.responsibility;

/**
 * 知县
 *
 * @author 512573717@qq.com
 * @created 2018/7/19  下午4:39.
 */
public class CountyGuan extends DangGuan {
    @Override
    void anQing(String desc) {
        if (desc.equals("知县")) {
            System.out.println("知县处理了此案情");
        } else {
            System.out.println("知县：这案情我处理不了，我先上报");
            getNextDangGuan().anQing(desc);
        }
    }
}
