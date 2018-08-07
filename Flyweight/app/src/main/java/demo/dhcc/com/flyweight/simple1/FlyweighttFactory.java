package demo.dhcc.com.flyweight.simple1;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元角色工厂
 *
 * @author 512573717@qq.com
 * @created 2018/8/6  下午3:54.
 */
public class FlyweighttFactory {
    private Map<String, Flyweight> mFlyweightMap = new HashMap<>();

    public Flyweight factory(String state) {
        //先从已有的缓存列表中查询对象是否已存在
        Flyweight flyweight = mFlyweightMap.get(state);
        if (flyweight == null) {
            //如果对象不存在，则重新创建一个新的Flyweight对象
            flyweight = new ConcreteFlyweight(state);
            //将新生成的对象放入缓存列表中
            mFlyweightMap.put(state, flyweight);
        }
        //返回对象
        return flyweight;
    }
}
