package demo.dhcc.com.memento.simple3;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义备忘录
 *
 * @author 512573717@qq.com
 * @created 2018/8/9  上午11:23.
 */
public class Memento {
    private List<String> states;

    /**
     * 构造函数
     */
    public Memento(List<String> states) {
        //每次存放新的
        this.states = new ArrayList<String>(states);
    }

    public List<String> getStates() {
        return states;
    }
}
