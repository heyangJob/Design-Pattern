package demo.dhcc.com.factory.simple5;

import demo.dhcc.com.factory.simple5.bracelet.IBracelet;
import demo.dhcc.com.factory.simple5.bracelet.XiaomiBracelet;
import demo.dhcc.com.factory.simple5.computer.IComputer;
import demo.dhcc.com.factory.simple5.computer.XiaomiComputer;
import demo.dhcc.com.factory.simple5.phone.IPhone;
import demo.dhcc.com.factory.simple5.phone.XiaomiPhone;

/**
 * 小米
 *
 * @author 512573717@qq.com
 * @created 2018/7/9  上午11:09.
 */
public class Xiaomi extends ProductFactory {

    @Override
    public IPhone createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public IComputer createComputer() {
        return new XiaomiComputer();
    }

    @Override
    public IBracelet createBracelet() {
        return new XiaomiBracelet();
    }
}
