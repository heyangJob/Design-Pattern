package demo.dhcc.com.mvpdemo.mvc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import demo.dhcc.com.mvpdemo.Callback;
import demo.dhcc.com.mvpdemo.R;

public class MainActivity extends AppCompatActivity  {

    private TextView mTextView;

    private SimpleControl mSimpleControl=new SimpleControl();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=findViewById(R.id.text);
        mSimpleControl.postDate(new Callback<String>() {
            @Override
            public void onCallBack(String o) {
                mTextView.setText(o);
            }
        });

    }


}
