package demo.dhcc.com.iterator;

/**
 * 集合的迭代器
 *
 * @author 512573717@qq.com
 * @created 2018/7/20  下午4:34.
 */
public class CollectionIterator implements Iterator {

    private CollectionManager aggregate = null;

    private int cursor;//定义一个迭代器游标

    public CollectionIterator(CollectionManager aggregate) {
        this.aggregate = aggregate;
    }

    public void first() {
        cursor = 0;
    }

    @Override
    public void next() {
        if (cursor < aggregate.size()) {
            cursor++;
        }
    }

    @Override
    public boolean hasNext() {
        //如果游标<list的大小，则说明还有下一个
        if (cursor < aggregate.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object getCurrentObj() {
        return aggregate.get(cursor);//获取当前游标指向的元素
    }
}
