package demo.dhcc.com.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.factory.simple1.FactoryZhuShi;
import demo.dhcc.com.factory.simple5.Huawei;
import demo.dhcc.com.factory.simple5.ProductFactory;
import demo.dhcc.com.factory.simple5.Xiaomi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IZhuShi south = FactoryZhuShi.createZhuShi(FactoryZhuShi.SOUTH);
        south.eat();

        IZhuShi north = FactoryZhuShi.createZhuShi(FactoryZhuShi.NORTH);
        north.eat();


//        IZhuShi south = ReflectFactoryZhuShi.createZhuShi(Rice.class);
//        south.eat();
//
//        IZhuShi north = ReflectFactoryZhuShi.createZhuShi(Flour.class);
//        north.eat();

//        IZhuShi south = MethodFactoryZhuShi.getRice();
//        south.eat();
//
//        IZhuShi north = MethodFactoryZhuShi.getFlour();
//        north.eat();

//        IFactory northFactory = new FlourFactory();
//        IZhuShi north = northFactory.create();
//        north.eat();
//
//        IFactory southFactory = new RiceFactory();
//        IZhuShi south = southFactory.create();
//        south.eat();


        //华为系列
        System.out.println("华为");
        ProductFactory huawei = new Huawei();
        huawei.createPhone().phone();
        huawei.createComputer().computer();
        huawei.createBracelet().bracelet();

        //小米系列
        System.out.println("小米");
        ProductFactory xiaomi=new Xiaomi();
        xiaomi.createPhone().phone();
        xiaomi.createComputer().computer();
        xiaomi.createBracelet().bracelet();


    }
}
