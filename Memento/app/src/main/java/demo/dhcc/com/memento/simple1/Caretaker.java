package demo.dhcc.com.memento.simple1;

/**
 * 定义负责人角色
 *
 * @author 512573717@qq.com
 * @created 2018/8/9  上午11:28.
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

}
