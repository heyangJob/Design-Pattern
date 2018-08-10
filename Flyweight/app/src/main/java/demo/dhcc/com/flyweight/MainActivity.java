package demo.dhcc.com.flyweight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import demo.dhcc.com.flyweight.simple2.Flyweight;
import demo.dhcc.com.flyweight.simple2.FlyweightFactory;
import demo.dhcc.com.flyweight.simple3.Coordinates;
import demo.dhcc.com.flyweight.simple3.QiZi;
import demo.dhcc.com.flyweight.simple3.QiZiFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        FlyweighttFactory factory=new FlyweighttFactory();
//
//        Flyweight flyweightA = factory.factory("A");
//        flyweightA.operation("First Call , A State");
//        System.out.println(flyweightA);
//
//        Flyweight flyweightB = factory.factory("B");
//        flyweightA.operation("Second Call , B State");
//        System.out.println(flyweightB);
//
//
//        Flyweight flyweightC = factory.factory("C");
//        flyweightA.operation("Third Call , C State");
//        System.out.println(flyweightC);


        List<String> compositeState = new ArrayList<String>();

        compositeState.add("A");
        compositeState.add("B");
        compositeState.add("C");
        compositeState.add("B");
        compositeState.add("A");

        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight compositeFly1 = flyweightFactory.factory(compositeState);
        Flyweight compositeFly2 = flyweightFactory.factory(compositeState);

        compositeFly1.operation("Composite1 Call");
        compositeFly2.operation("Composite2 Call");

        System.out.println("---------------------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (compositeFly1 == compositeFly2));
        System.out.println(compositeFly1);
        System.out.println(compositeFly2);


        QiZi black1,black2,white1,white2;
        QiZiFactory factory = QiZiFactory.getInstance();

        //通过享元工厂获取三颗黑子
        black1 = factory.getIgoChessman("b");
        black2 = factory.getIgoChessman("b");
        System.out.println("判断两颗黑子是否相同：" + (black1==black2));

        //通过享元工厂获取两颗白子
        white1 = factory.getIgoChessman("w");
        white2 = factory.getIgoChessman("w");
        System.out.println("判断两颗白子是否相同：" + (white1==white2));

        //显示棋子，同时设置棋子的坐标位置
        black1.display(new Coordinates(1,2));
        black2.display(new Coordinates(3,4));
        white1.display(new Coordinates(2,5));
        white2.display(new Coordinates(2,4));


 }
}
