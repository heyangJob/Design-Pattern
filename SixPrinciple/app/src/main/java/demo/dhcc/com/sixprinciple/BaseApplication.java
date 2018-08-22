package demo.dhcc.com.sixprinciple;

import android.app.Application;

import demo.dhcc.com.sixprinciple.simple4.PreferencesUtil;
import demo.dhcc.com.sixprinciple.simple4.HttpUtils;
import demo.dhcc.com.sixprinciple.simple4.OKHttpRequest;
import demo.dhcc.com.sixprinciple.simple4.XUtilsRequest;


/**
 * description:
 * author: Darren on 2017/8/21 15:05
 * email: 240336124@qq.com
 * version: 1.0
 */
public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferencesUtil.getInstance().init(this);
        HttpUtils.initHttpRequest(new OKHttpRequest());
    }
}
