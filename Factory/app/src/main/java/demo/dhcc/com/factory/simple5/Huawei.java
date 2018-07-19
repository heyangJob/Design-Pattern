package demo.dhcc.com.factory.simple5;

import demo.dhcc.com.factory.simple5.bracelet.HuaweiBracelet;
import demo.dhcc.com.factory.simple5.bracelet.IBracelet;
import demo.dhcc.com.factory.simple5.computer.HuaweiComputer;
import demo.dhcc.com.factory.simple5.computer.IComputer;
import demo.dhcc.com.factory.simple5.phone.HuaweiPhone;
import demo.dhcc.com.factory.simple5.phone.IPhone;

/**
 * 华为
 *
 * @author 512573717@qq.com
 * @created 2018/7/9  上午11:03.
 */
public class Huawei extends ProductFactory {

    @Override
    public IPhone createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public IComputer createComputer() {
        return new HuaweiComputer();
    }

    @Override
    public IBracelet createBracelet() {
        return new HuaweiBracelet();
    }
}
