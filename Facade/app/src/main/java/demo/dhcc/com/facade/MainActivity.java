package demo.dhcc.com.facade;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("老王去窗口注册企业，提交相关材料");
        FacadeCertificate facadeCertificate=new FacadeCertificate();
        facadeCertificate.transact();
        System.out.println("15个工作日 出证");
    }
}
