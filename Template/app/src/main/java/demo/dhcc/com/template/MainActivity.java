package demo.dhcc.com.template;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("小明春节回家");
        BaseGoHome xiaoming = new XiaoMing();
        xiaoming.travelWay();
        xiaoming.buyTicket();
        xiaoming.shangche();
        xiaoming.xiache();

        System.out.println("老王春节回家");
        BaseGoHome laowang = new XiaoMing();
        laowang.travelWay();
        laowang.buyTicket();
        laowang.shangche();
        laowang.xiache();


    }
}
