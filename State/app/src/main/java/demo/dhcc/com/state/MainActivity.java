package demo.dhcc.com.state;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 默认是固态的水
        ClientContext.getInstance().use();


        //液态的水
        ClientContext.getInstance().setIState(new FluidState());
        ClientContext.getInstance().use();

        // 气态
        ClientContext.getInstance().setIState(new GasState());
        ClientContext.getInstance().use();
    }
}
