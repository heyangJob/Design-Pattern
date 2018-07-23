package demo.dhcc.com.iterator;

/**
 * 迭代器接口
 *
 * @author 512573717@qq.com
 * @created 2018/7/20  下午3:02.
 */
public interface Iterator<T> {
    void first();//将游标指向第一个元素

    void next();//将游标指向下一个元素

    boolean hasNext();//判断是否有下一个元素

    T getCurrentObj();//获取当前对象

}
