package demo.dhcc.com.factory.simple4;

import demo.dhcc.com.factory.Flour;

/**
 *  面食工厂
 *
 * @author 512573717@qq.com
 * @created 2018/7/8  下午11:11.
 *
 */
public class FlourFactory implements IFactory<Flour> {
    @Override
    public Flour create() {
        return new Flour();
    }
}
