package demo.dhcc.com.wrapper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IPhone phone = new HuaWeiPhone();

        System.out.println("装饰外壳");
        RedShell redShell = new RedShell(phone);
        redShell.decorate();

        System.out.println("手机贴膜");
        TemperingMembrane temperingMembrane = new TemperingMembrane(redShell);
        temperingMembrane.decorate();

    }
}
