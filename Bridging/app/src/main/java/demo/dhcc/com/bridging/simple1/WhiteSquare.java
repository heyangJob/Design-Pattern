package demo.dhcc.com.bridging.simple1;

/**
 * 白色的正方形
 *
 * @author 512573717@qq.com
 * @created 2018/7/27  下午4:10.
 */
public class WhiteSquare extends Square {
    @Override
    public void draw() {
        System.out.print("白色的");
        super.draw();
    }
}
