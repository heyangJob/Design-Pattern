package demo.dhcc.com.factory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.factory.simple5.Huawei;
import demo.dhcc.com.factory.simple5.ProductFactory;
import demo.dhcc.com.factory.simple5.Xiaomi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        IZhushi south = FactoryZhuShi.createZhushi(FactoryZhuShi.SOUTH);
//        south.eat();
//
//        IZhushi north = FactoryZhuShi.createZhushi(FactoryZhuShi.NORTH);
//        north.eat();


//        IZhushi south = ReflectFactoryZhushi.createZhushi(Rice.class);
//        south.eat();
//
//        IZhushi north = ReflectFactoryZhushi.createZhushi(Flour.class);
//        north.eat();

//        IZhushi south = MethodFactoryZhushi.getRice();
//        south.eat();
//
//        IZhushi north = MethodFactoryZhushi.getFlour();
//        north.eat();

//        IFactory northFactory = new FlourFactory();
//        IZhushi north = northFactory.create();
//        north.eat();
//
//        IFactory southFactory = new RiceFactory();
//        IZhushi south = southFactory.create();
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
