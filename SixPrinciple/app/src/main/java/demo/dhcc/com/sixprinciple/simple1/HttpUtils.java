package demo.dhcc.com.sixprinciple.simple1;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.util.Map;

import demo.dhcc.com.sixprinciple.Utils;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * @author 512573717@qq.com
 * @created 2018/8/22  上午9:07.
 */
public class HttpUtils {
    private HttpUtils() {
    }

    public static void get(Context context, String url, Map<String, Object> params, final Callback callback) {
        OkHttpClient mOkHttpClient = new OkHttpClient();
        // 公共参数
        params.put("app_name", "joke_essay");
        params.put("version_name", "5.7.0");
        params.put("ac", "wifi");
        params.put("device_id", "30036118478");
        params.put("device_brand", "Xiaomi");
        params.put("update_version_code", "5701");
        params.put("manifest_version_code", "570");
        params.put("longitude", "113.000366");
        params.put("latitude", "28.171377");
        params.put("device_platform", "android");

        final String jointUrl = Utils.jointParams(url, params);  //打印
        Log.e("Post请求路径：", jointUrl);

        Request.Builder requestBuilder = new Request.Builder().url(jointUrl).tag(context);
        //可以省略，默认是GET请求
        Request request = requestBuilder.build();

        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                // 失败
                callback.onFailure(call, e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                // 1.JSON解析转换
                // 2.显示列表数据
                // 3.缓存数据
                callback.onResponse(call, response);
            }
        });
    }
}
