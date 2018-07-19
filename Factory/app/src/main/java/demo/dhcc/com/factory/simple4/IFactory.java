package demo.dhcc.com.factory.simple4;


import demo.dhcc.com.factory.IZhushi;

/**
 * 主食创建工厂
 *
 * @author 512573717@qq.com
 * @created 2018/7/6  下午4:08.
 */
public interface IFactory<T extends IZhushi> {
    T create();
}
