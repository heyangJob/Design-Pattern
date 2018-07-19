package demo.dhcc.com.factory.simple4;

import demo.dhcc.com.factory.Rice;

/**
 *  米饭工厂
 * 
 * @author 512573717@qq.com
 * @created 2018/7/8  下午11:11.
 * 
 */
public class RiceFactory implements IFactory<Rice> {
    @Override
    public Rice create() {
        return new Rice();
    }
}
