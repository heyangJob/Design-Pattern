package demo.dhcc.com.sixprinciple.simple3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.sixprinciple.ConstantValue;
import demo.dhcc.com.sixprinciple.R;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /********************访问网络开始*******************/

        HttpUtils.with(this).cache(true).get().url(ConstantValue.UrlConstant.HOME_DISCOVERY_URL).param("iid", 6152551759L).param("aid", 7).request(
                new HttpCallBack<DiscoverListResult>() {

            @Override
            public void onFailure(Exception e) {
                // 失败
            }

            @Override
            public void onSuccess(DiscoverListResult result){
                if (result.isOK()) {
                    // 没有列表数据的情况, 打印 Toast 或者做一些其他处理
                } else {
                    // 有数据列表的情况，显示列表
                    showListData(result);
                }
            }

        });

        /********************访问网络结束*******************/
    }

    private void showListData(DiscoverListResult discoverListResult) {

    }
}
