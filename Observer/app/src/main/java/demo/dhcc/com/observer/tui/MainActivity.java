package demo.dhcc.com.observer.tui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.observer.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ZhaoHuo zhaoHuo = new ZhaoHuo();

        //烟感设备
        IObserver yanObserver = new YanObserver();
        IObserver shuiYinObserver = new ShuiYinObserver();

        //添加观察者
        zhaoHuo.addObserver(yanObserver);
        zhaoHuo.addObserver(shuiYinObserver);

        //通知
        zhaoHuo.change("着火了 ！");

    }
}
