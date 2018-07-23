package demo.dhcc.com.iterator;

/**
 * 自定义数组
 *
 * @author 512573717@qq.com
 * @created 2018/7/20  下午4:32.
 */
public class ArrayManager implements IManager {

    private Salary[] mSalaries = null;

    public void setSalaries(Salary[] salaries) {
        mSalaries = salaries;
    }

    @Override
    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public Object get(int index) {
        Object retObj = null;
        if (index < mSalaries.length) {
            retObj = mSalaries[index];
        }
        return retObj;
    }

    public int size() {
        return this.mSalaries.length;
    }
}
