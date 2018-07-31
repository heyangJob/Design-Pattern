package demo.dhcc.com.mediator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 房产中介
        FangChanMediator fangChanMediator = new FangChanMediator();
        //小明想租房
        XiaoMing xiaoMing = new XiaoMing(fangChanMediator);
        //王大爷想出租自己的房子
        WangDaYe wangDaYe = new WangDaYe(fangChanMediator);


        fangChanMediator.setBuyer(xiaoMing);
        fangChanMediator.setSeller(wangDaYe);

        xiaoMing.sendMessage("我要租一个一室一厅的房子");
        System.out.println("======================");
        wangDaYe.sendMessage("我要出租我这个一室一厅的房子");


    }
}
