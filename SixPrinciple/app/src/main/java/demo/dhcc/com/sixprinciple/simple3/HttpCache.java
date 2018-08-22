package demo.dhcc.com.sixprinciple.simple3;

/**
 * @author 512573717@qq.com
 * @created 2018/8/22  上午10:48.
 */

public class HttpCache {
    public void saveCache(String finalUrl, String resultJson) {
        PreferencesUtil.getInstance().saveParam(finalUrl, resultJson);
    }

    public String getCache(String finalUrl) {
        return (String) PreferencesUtil.getInstance().getParam(finalUrl, "");
    }
}
