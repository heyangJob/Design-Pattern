package demo.dhcc.com.flyweight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import demo.dhcc.com.flyweight.simple2.Flyweight;
import demo.dhcc.com.flyweight.simple2.FlyweightFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        FlyweighttFactory  factory=new FlyweighttFactory();
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


    }
}
