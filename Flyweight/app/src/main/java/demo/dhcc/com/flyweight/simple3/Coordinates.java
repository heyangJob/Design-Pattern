package demo.dhcc.com.flyweight.simple3;

/**
 * 外部状态
 * 
 * @author 512573717@qq.com
 
 * @created 2018/8/7  下午4:26.
 * 
 */
public class Coordinates {

    private int x;
    private int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
