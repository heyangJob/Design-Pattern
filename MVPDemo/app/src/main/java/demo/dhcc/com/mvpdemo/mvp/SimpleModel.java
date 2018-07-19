package demo.dhcc.com.mvpdemo.mvp;

import demo.dhcc.com.mvpdemo.Callback;

/**
 * ${title}
 *
 * @author zongsw
 * @created 2018/7/4 下午4:07.
 */
public class SimpleModel implements IBaseModel {


    public void getGetHttp(Callback callback) {
        callback.onCallBack("hello mvp get");

    }


    public void getPostHttp(Callback callback) {
        callback.onCallBack("hello mvp post");

    }

}
