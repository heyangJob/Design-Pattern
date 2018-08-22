package demo.dhcc.com.sixprinciple.simple4;

import android.content.Context;

import java.util.Map;

/**
 * @author 512573717@qq.com
 * @created 2018/8/22  上午10:49.
 */

public interface IHttpRequest {
    <T> void get(Context context, String url, Map<String, Object> params,
                 final HttpCallBack<T> callback, final boolean cache);

    <T> void post(Context context, String url, Map<String, Object> params,
                  final HttpCallBack<T> callback, final boolean cache);

    <T> void download(Context context, String url, Map<String, Object> params,
                      final HttpCallBack<T> callback);

    <T> void upload(Context context, String url, Map<String, Object> params,
                    final HttpCallBack<T> callback);
}
