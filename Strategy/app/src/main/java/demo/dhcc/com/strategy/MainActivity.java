package demo.dhcc.com.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TotalMoney money=new TotalMoney();

        System.out.println("三个月的收益");
        money.setFinanceStrategy(new ThreeStrategy());
        System.out.println(money.totalMoney(50000));

        System.out.println("半年的收益");
        money.setFinanceStrategy(new HalfYearStrategy());
        System.out.println(money.totalMoney(50000));

        System.out.println("一年的收益");
        money.setFinanceStrategy(new OneYearStrategy());
        System.out.println(money.totalMoney(50000));

    }
}
