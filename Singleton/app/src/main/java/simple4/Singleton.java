package simple4;

import java.util.HashMap;
import java.util.Map;

/**
 * 单例  容器管理
 *
 * @author 512573717@qq.com
 * @created 2018/7/2 下午1:59.
 */
public class Singleton {

    private static Map<String, Object> mSingleMap = new HashMap<>();

    private Singleton(){
    }

    static {
        mSingleMap.put("service", new Singleton());
    }

    public static Object getServiceForName(String name) {
        return mSingleMap.get(name);
    }
}
