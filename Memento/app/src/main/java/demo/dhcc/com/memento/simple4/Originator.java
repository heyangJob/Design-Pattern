package demo.dhcc.com.memento.simple4;

import demo.dhcc.com.memento.simple2.MementoIF;

/**
 * 创建发起人角色
 *
 * @author 512573717@qq.com
 * @created 2018/8/10  下午2:04.
 */
public class Originator {

    public String state;


    /**
     * 改变状态
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public Memento createMemento() {
        return new Memento(this);
    }

    /**
     * 将发起人恢复到备忘录对象所记录的状态上
     */
    public void restoreMemento(MementoIF memento) {
        Memento m = (Memento) memento;
        setState(m.state);
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }

    private class Memento implements MementoIF {

        private String state;

        /**
         * 构造方法
         */
        private Memento(Originator o) {
            this.state = o.state;
        }

        private String getState() {
            return state;
        }

    }
}
