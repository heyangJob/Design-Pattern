package demo.dhcc.com.bridging.simple1;

/**
 * 红色的正方形
 *
 * @author 512573717@qq.com
 * @created 2018/7/27  下午4:11.
 */
public class RedSquare extends Square {
    @Override
    public void draw() {
        System.out.print("红色的");
        super.draw();
    }
}
