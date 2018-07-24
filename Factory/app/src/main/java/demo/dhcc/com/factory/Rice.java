package demo.dhcc.com.factory;

/**
 *  主食米饭
 *
 * @author 512573717@qq.com
 * @created 2018/7/6  下午2:37.
 *
 */
public class Rice implements IZhuShi {
    @Override
    public void eat() {
      System.out.println("主食米饭上来了。");
    }
}
