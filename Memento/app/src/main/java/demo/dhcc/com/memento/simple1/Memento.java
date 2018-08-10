package demo.dhcc.com.memento.simple1;

/**
 * 定义备忘录
 *
 * @author 512573717@qq.com
 * @created 2018/8/9  上午11:23.
 */
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
