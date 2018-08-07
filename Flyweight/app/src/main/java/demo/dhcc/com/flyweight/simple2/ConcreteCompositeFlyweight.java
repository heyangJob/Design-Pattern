package demo.dhcc.com.flyweight.simple2;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元角色类
 *
 * @author 512573717@qq.com
 * @created 2018/8/6  下午4:54.
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    private Map<String, Flyweight> mStringFlyweightMap = new HashMap<>();


    public void add(String key, Flyweight flyweight) {
        mStringFlyweightMap.put(key, flyweight);
    }


    @Override
    public void operation(String state) {
        Flyweight flyweight = null;
        for (Object o : mStringFlyweightMap.keySet()) {
            flyweight = mStringFlyweightMap.get(o);
            flyweight.operation(state);
            System.out.println(flyweight);
        }

    }
}
