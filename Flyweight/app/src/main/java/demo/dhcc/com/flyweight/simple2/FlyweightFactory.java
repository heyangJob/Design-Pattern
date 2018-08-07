package demo.dhcc.com.flyweight.simple2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 享元模式 工厂
 *
 * @author 512573717@qq.com
 * @created 2018/8/6  下午5:34.
 */
public class FlyweightFactory {

    private Map<String, Flyweight> mStringFlyweightMap = new HashMap<String, Flyweight>();

    /**
     * 复合享元工厂方法
     *
     * @param compositeState
     * @return
     */
    public Flyweight factory(List<String> compositeState) {
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();

        for (String state : compositeState) {
            concreteCompositeFlyweight.add(state, this.factory(state));
        }

        return concreteCompositeFlyweight;
    }

    /**
     * 单纯享元工厂方法
     *
     * @param state
     * @return
     */
    public Flyweight factory(String state) {
        //先从已有的缓存列表中查询对象是否已存在
        Flyweight flyweight = mStringFlyweightMap.get(state);
        if (flyweight == null) {
            //如果对象不存在，则重新创建一个新的Flyweight对象
            flyweight = new ConcreteFlyweight(state);
            //将新生成的对象放入缓存列表中
            mStringFlyweightMap.put(state, flyweight);
        }
        //返回对象
        return flyweight;
    }


}
