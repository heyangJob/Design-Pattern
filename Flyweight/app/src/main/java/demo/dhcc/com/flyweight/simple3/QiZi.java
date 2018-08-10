package demo.dhcc.com.flyweight.simple3;

/**
 *  棋子接口
 *
 * @author 512573717@qq.com

 * @created 2018/8/7  下午3:55.
 *
 */
public abstract class QiZi {
    public abstract String getColor();

    public void display(Coordinates coordinates) {
        System.out.println("棋子颜色：" + this.getColor() + "，棋子位置：" + coordinates.getX() + "，" + coordinates.getY() );
    }
}
