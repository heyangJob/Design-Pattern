package demo.dhcc.com.mvpdemo.eventbus;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import demo.dhcc.com.mvpdemo.Callback;
import demo.dhcc.com.mvpdemo.R;
import demo.dhcc.com.mvpdemo.mvc.SimpleControl;

public class MainActivity extends AppCompatActivity  {

    private TextView mTextView;

    private SimpleControl mSimpleControl=new SimpleControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=findViewById(R.id.text);

        EventBus.getDefault().register(this);



        mSimpleControl.postDate(new Callback<String>() {
            @Override
            public void onCallBack(String o) {
                mTextView.setText(o);
            }
        });

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        },500);



    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onMessageEvent(MessageEvent event) {

        mTextView.setText(event.getMessgae()+"--------");

    };


    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }


}
