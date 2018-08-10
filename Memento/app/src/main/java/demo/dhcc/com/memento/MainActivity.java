package demo.dhcc.com.memento;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.memento.simple3.Caretaker;
import demo.dhcc.com.memento.simple3.Originator;
import demo.dhcc.com.memento.simple5.GameManager;
import demo.dhcc.com.memento.simple5.WangZheRongYao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//    白箱模式
//        Originator originator = new Originator();
//        originator.setState("state1");
//        System.out.println(originator);
//
//        Caretaker caretaker = new Caretaker();
//        caretaker.setMemento(originator.createMemento());
//        originator.setState("state2");
//        System.out.println(originator);
//
//        originator.restoreMemento(caretaker.getMemento());
//        System.out.println(originator);


//        黑箱模式
//        Originator o = new Originator();
//        Caretaker c = new Caretaker();
//        //改变负责人对象的状态
//        o.setState("state1");
//        System.out.println("保存中"+o);
//        //创建备忘录对象，并将发起人对象的状态存储起来
//        c.saveMemento(o.createMemento());
//        //修改发起人对象的状态
//        o.setState("state2");
//        System.out.println("设置新的值"+o);
//        //恢复发起人对象的状态
//        o.restoreMemento(c.retrieveMemento());
//        System.out.println("恢复上次的值"+o);

        //多重点检查
        Originator o = new Originator();
        Caretaker c = new Caretaker(o);
        //改变状态
        o.setState("state 0");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 1");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 2");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 3");
        //建立一个检查点
        c.createMemento();
        //改变状态
        o.setState("state 4");
        //建立一个检查点
        c.createMemento();
        //打印出所有检查点
        o.printStates();
        System.out.println("-----------------恢复检查点-----------------");
        //恢复到第二个检查点
        c.restoreMemento(2);
        //打印出所有检查点
        o.printStates();


        //自检模式
//        Originator o = new Originator();
//        //修改状态
//        o.setState("state 0");
//        //创建备忘录
//        MementoIF memento = o.createMemento();
//        //修改状态
//        o.setState("state 1");
//        //按照备忘录恢复对象的状态
//        o.restoreMemento(memento);




        WangZheRongYao wzry = new WangZheRongYao();
        wzry.playGame();
        try {
            //玩了一会
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //暂停游戏
        wzry.exitGame();
        GameManager.getGameManager().saveGameInfo(wzry.saveGameInfo());

        //恢复游戏
        wzry.resetGame(GameManager.getGameManager().getGameInfo());


    }
}
