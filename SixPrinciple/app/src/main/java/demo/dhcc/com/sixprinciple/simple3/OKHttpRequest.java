package demo.dhcc.com.sixprinciple.simple3;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;

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
 * @created 2018/8/22  上午10:22.
 */

public class OKHttpRequest {
    private HttpCache mHttpCache;

    public OKHttpRequest() {
        mHttpCache = new HttpCache();
    }

    // 参数还是很多
    public <T> void get(Context context, String url, Map<String, Object> params,
                        final HttpCallBack<T> callback, final boolean cache) {
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
        // 缓存问题
        Log.e("Post请求路径：", jointUrl);  // 缓存写到  SP 里面，多级缓存（内存中 30条,数据库 ，文件中 ）
        final String cacheJson = mHttpCache.getCache(jointUrl);
        // 写一大堆处理逻辑 ，内存怎么扩展等等
        if (cache && !TextUtils.isEmpty(cacheJson)) {
            Gson gson = new Gson();
            Log.e("TAG",  "从缓存中获取数据");
            // data:{"name","darren"}   data:"请求失败"
            T objResult = (T) gson.fromJson(cacheJson,
                    Utils.analysisClazzInfo(callback));
            callback.onSuccess(objResult);
            return;
        }

        Request.Builder requestBuilder = new Request.Builder().url(jointUrl).tag(context);
        //可以省略，默认是GET请求
        Request request = requestBuilder.build();

        mOkHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                // 失败
                callback.onFailure(e);
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String resultJson = response.body().string();

                Log.e("TAG", resultJson.equals(cacheJson) + "");
                Log.e("TAG", resultJson + "");
                if (cache && resultJson.equals(cacheJson)) {
                    return;
                }
                // 1.JSON解析转换
                // 2.显示列表数据
                // 3.缓存数据
                Gson gson = new Gson();
                // data:{"name","darren"}   data:"请求失败"
                T objResult = (T) gson.fromJson(resultJson,
                        Utils.analysisClazzInfo(callback));
                callback.onSuccess(objResult);

                if (cache) {
                    mHttpCache.saveCache(jointUrl, resultJson);
                }
            }
        });
    }
}
