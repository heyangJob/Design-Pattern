package demo.dhcc.com.adapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.adapter.simple2.MoneyAdapter;
import demo.dhcc.com.adapter.simple3.ChatAdapter;
import demo.dhcc.com.adapter.simple3.Port;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //类适配器
//        System.out.println("老王去银行兑换美元");
//        MoneyAdapter adapter = new MoneyAdapter();
//        double result=adapter.getDollar(100);
//        System.out.println("兑换了"+result+"$");

//        对象适配器
        System.out.println("老王去银行兑换美元");
        MoneyAdapter adapter = new MoneyAdapter(new MoneyRMB());
        double result = adapter.getDollar(100);
        System.out.println("兑换了" + result + "$");

        //接口适配器
        Port port = new ChatAdapter();
        port.FTP();
        port.NET();

    }
}
