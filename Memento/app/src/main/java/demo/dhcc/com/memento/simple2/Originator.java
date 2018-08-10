package demo.dhcc.com.memento.simple2;

/**
 *  创建发起人角色
 *
 * @author 512573717@qq.com

 * @created 2018/8/10  下午2:04.
 *
 */
public class Originator {

    public String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        System.out.println("赋值状态：" + state);
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
        this.state = ((Memento) memento).getState();
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
