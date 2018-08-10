package demo.dhcc.com.memento.simple2;

/**
 * 定义负责人角色
 *
 * @author 512573717@qq.com
 * @created 2018/8/10  下午2:04.
 */
public class Caretaker {

    private MementoIF memento;

    /**
     * 备忘录取值方法
     */
    public MementoIF retrieveMemento() {
        return memento;
    }

    /**
     * 备忘录赋值方法
     */
    public void saveMemento(MementoIF memento) {
        this.memento = memento;
    }
}
