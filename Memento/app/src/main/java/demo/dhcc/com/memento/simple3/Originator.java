package demo.dhcc.com.memento.simple3;

import java.util.ArrayList;
import java.util.List;


/**
 *  创建发起人角色
 *
 * @author 512573717@qq.com

 * @created 2018/8/10  下午2:04.
 *
 */
public class Originator {
    private List<String> states;
    /**
     * 构造函数
     */
    public Originator(){
        states = new ArrayList<String>();
    }
    /**
     * 工厂方法，返还一个新的备忘录对象
     */
    public Memento createMemento(){
        return new Memento(states );
    }
    /**
     * 将发起人恢复到备忘录对象记录的状态上
     */
    public void restoreMemento(Memento memento){
        states = memento.getStates();
    }
    /**
     * 状态的赋值方法
     */
    public void setState(String state){
        states.add(state);
    }
    /**
     * 辅助方法，打印所有状态
     */
    public void printStates(){

        for(String state : states){
            System.out.println(state);
        }
    }
}
