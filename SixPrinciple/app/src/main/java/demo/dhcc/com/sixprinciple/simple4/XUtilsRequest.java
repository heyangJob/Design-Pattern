package demo.dhcc.com.sixprinciple.simple4;

import android.content.Context;

import org.xutils.http.RequestParams;
import org.xutils.x;

import java.util.Map;

/**
 * @author 512573717@qq.com
 * @created 2018/8/22  上午10:50.
 */
public class XUtilsRequest implements IHttpRequest {
    private SPHttpCache mHttpCache;

    public XUtilsRequest() {
        mHttpCache = new SPHttpCache();
    }

    // 参数还是很多
    public <T> void get(Context context, String url, Map<String, Object> params,
                        final HttpCallBack<T> callback, final boolean cache) {
        RequestParams requestParams = new RequestParams();
        x.http().get(requestParams, new org.xutils.common.Callback.CommonCallback<String>() {
            @Override
            public void onSuccess(String result) {

            }

            @Override
            public void onError(Throwable ex, boolean isOnCallback) {

            }

            @Override
            public void onCancelled(CancelledException cex) {

            }

            @Override
            public void onFinished() {

            }
        });
    }

    @Override
    public <T> void post(Context context, String url, Map<String, Object> params, HttpCallBack<T> callback, boolean
            cache) {

    }

    @Override
    public <T> void download(Context context, String url, Map<String, Object> params, HttpCallBack<T> callback) {

    }

    @Override
    public <T> void upload(Context context, String url, Map<String, Object> params, HttpCallBack<T> callback) {

    }
}
