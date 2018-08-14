package demo.dhcc.com.expression;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String expression = "100 + 30 + 5";
        String[] elements = expression.split(" ");
        for (int i = 0; i < elements.length; ++i) {
            Log.e("TAG",elements[i].charAt(0)+"");
        }
    }
}