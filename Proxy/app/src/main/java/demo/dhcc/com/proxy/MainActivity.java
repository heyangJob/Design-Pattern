package demo.dhcc.com.proxy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Recharge mRecharge = new Recharge();
        ZhiFuBaoProxy mZhiFuBao = new ZhiFuBaoProxy(mRecharge);
        mZhiFuBao.recharge();

        IHuaFei mIHuaFei = new Recharge();
        DynamicProxy proxy = new DynamicProxy(mIHuaFei);
        ClassLoader classLoader = mIHuaFei.getClass().getClassLoader();
        IHuaFei huaFei = (IHuaFei) Proxy.newProxyInstance(classLoader, new Class[]{IHuaFei.class}, proxy);
        huaFei.recharge();
    }
}
