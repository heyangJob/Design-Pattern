package demo.dhcc.com.mvpdemo.eventbus;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;

import demo.dhcc.com.mvpdemo.R;

public class Main2Activity extends AppCompatActivity {

    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mButton=findViewById(R.id.btn);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"跳转到1",Toast.LENGTH_SHORT);
                EventBus.getDefault().post(new MessageEvent("从2跳转过来的"));

                finish();
            }
        });

    }

}
