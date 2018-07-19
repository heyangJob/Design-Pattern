package demo.dhcc.com.mvpdemo.mvp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import demo.dhcc.com.mvpdemo.R;

public class MainActivity extends AppCompatActivity implements IBaseView<String> {

    private TextView mTextView;

    private SimplePresenter mIBasePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView=findViewById(R.id.text);
        mIBasePresenter=new SimplePresenter(this);
//        mIBasePresenter.getDate("001");
        mIBasePresenter.postDate("001");
    }


    @Override
    public void update(String str) {
        mTextView.setText(str);
    }
}
