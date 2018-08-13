package demo.dhcc.com.command;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.command.simple2.ExhaustCommand;
import demo.dhcc.com.command.simple2.ExhaustReceiver;
import demo.dhcc.com.command.simple2.Invoker;
import demo.dhcc.com.command.simple2.LightCommand;
import demo.dhcc.com.command.simple2.LightReceiver;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //经典示例
//        ConcreteCommand concreteCommand = new ConcreteCommand(new Receiver());
//
//        Invoker invoker = new Invoker();
//        invoker.setCommand(concreteCommand);
//        invoker.runCommand();

        //开关案例
        Invoker invoker=new Invoker();

        LightCommand lightCommand = new LightCommand(new LightReceiver());
        ExhaustCommand exhaustCommand = new ExhaustCommand(new ExhaustReceiver());

        // 请求
        System.out.println("开灯 关灯命令=============");
        invoker.setCommand(lightCommand);
        invoker.runCommand();

        System.out.println("开油烟机  关油烟机命令=============");
        invoker.setCommand(exhaustCommand);
        invoker.runCommand();



    }
}
