package demo.dhcc.com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义集合类
 *
 * @author 512573717@qq.com
 * @created 2018/7/20  下午4:37.
 */
public class CollectionManager implements IManager {

    private List list = new ArrayList();

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public Iterator createIterator() {
        return new CollectionIterator(this);
    }


    public Object get(int index) {
        Object retObj = null;
        if (index < this.list.size()) {
            retObj = this.list.get(index);
        }
        return retObj;
    }

    public int size() {
        return this.list.size();
    }
}