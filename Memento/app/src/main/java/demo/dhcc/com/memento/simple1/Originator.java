package demo.dhcc.com.memento.simple1;

/**
 * 创建发起人角色
 *
 * @author 512573717@qq.com
 * @created 2018/8/9  上午10:59.
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("当前状态：" + this.state);
    }

    /**
     * 工厂方法，返回一个新的备忘录对象
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(state);
    }

    /**
     * 将发起人的状态恢复到备忘录对象所记录的状态
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
