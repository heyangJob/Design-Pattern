package demo.dhcc.com.factory.simple5;

import demo.dhcc.com.factory.simple5.phone.IPhone;
import demo.dhcc.com.factory.simple5.bracelet.IBracelet;
import demo.dhcc.com.factory.simple5.computer.IComputer;

/**
 *  抽象工厂
 * @author 512573717@qq.com
 * @created 2018/7/9  上午10:16.
 */
public abstract class ProductFactory {
    // 创建手机
    public abstract IPhone createPhone();

    // 创建笔记本
    public abstract IComputer createComputer();

    // 创建手环
    public  abstract IBracelet createBracelet();


}
