package demo.dhcc.com.bridging.simple1;

/**
 * 红色的圆形
 *
 * @author 512573717@qq.com
 * @created 2018/7/27  下午4:09.
 */
public class RedCircle extends  Circle {
    @Override
    public void draw() {
        System.out.print("红色的");
        super.draw();
    }
}
