package demo.dhcc.com.memento.simple3;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义负责人角色
 *
 * @author 512573717@qq.com
 * @created 2018/8/9  上午11:28.
 */
public class Caretaker {

    private Originator o;
    private List<Memento> mementos = new ArrayList<Memento>();
    /**
     * 构造函数
     */
    public Caretaker(Originator o){
        this.o = o;
    }
    /**
     * 创建一个新的检查点
     */
    public void createMemento(){
        Memento memento = o.createMemento();
        mementos.add(memento);
    }
    /**
     * 将发起人恢复到某个检查点
     */
    public void restoreMemento(int index){
        Memento memento = mementos.get(index);
        o.restoreMemento(memento);
    }
    /**
     * 将某个检查点删除
     */
    public void removeMemento(int index){
        mementos.remove(index);
    }
}
