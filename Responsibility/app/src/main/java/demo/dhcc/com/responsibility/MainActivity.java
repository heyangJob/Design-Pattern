package demo.dhcc.com.responsibility;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CountyGuan countyGuan = new CountyGuan();
        CityGuan cityGuan = new CityGuan();
        ProvinceGuan provinceGuan = new ProvinceGuan();

        countyGuan.setNextDangGuan(cityGuan);
        cityGuan.setNextDangGuan(provinceGuan);

        System.out.println("老百姓开始告状了。");
        countyGuan.anQing("巡抚");
    }
}
