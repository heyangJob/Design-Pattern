package demo.dhcc.com.mvpdemo.mvc;

import demo.dhcc.com.mvpdemo.Callback;

/**
 * ${title}
 *
 * @author zongsw
 * @created 2018/7/4 下午4:36.
 */
public class SimpleControl implements BaseControl {

    @Override
    public void getDate(Callback callback) {
        callback.onCallBack("get mvc");
    }

    @Override
    public void postDate(Callback callback) {
        callback.onCallBack("post mvc");
    }
}
