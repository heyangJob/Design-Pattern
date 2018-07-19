package demo.dhcc.com.builder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        News history = Director.create("历史");
        News military = Director.create("军事");

        System.out.println(history.toString());
        System.out.println(military.toString());

        // 另外一种方式创建
        SimpleBuilder simpleBuilder = new SimpleBuilder();
        News science = simpleBuilder.setType("科技").setTitle("小米上市").build();
        System.out.println(science.toString());

        News news = new News(1, "今日快讯", "北京大暴雨",
                "2018-01-17", "200", "历史");
        System.out.println(news.toString());

        News newsBean = new News();
        newsBean.setId(1);
        newsBean.setTitle("今日快讯");
        newsBean.setSubTitle("北京大暴雨");
        newsBean.setCreateTime("2018-01-17");
        newsBean.setLookCount("200");
        newsBean.setType("历史");
        System.out.println(newsBean.toString());


    }
}
