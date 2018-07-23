package demo.dhcc.com.iterator;

/**
 * 数组迭代器
 *
 * @author 512573717@qq.com
 * @created 2018/7/20  下午4:17.
 */
public class ArrayIterator implements Iterator {

    private ArrayManager mArrayManager;

    private int cursor;//定义一个迭代器游标

    public ArrayIterator(ArrayManager arrayManager) {
        mArrayManager = arrayManager;
    }

    @Override
    public void first() {
        cursor = 0;
    }

    @Override
    public void next() {
        if (cursor < mArrayManager.size()) {
            cursor++;
        }
    }

    @Override
    public boolean hasNext() {
        //如果游标<list的大小，则说明还有下一个
        if (cursor < mArrayManager.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object getCurrentObj() {
        return mArrayManager.get(cursor);//获取当前游标指向的元素
    }
}

