package demo.dhcc.com.prototype;

/**
 * 深拷贝
 *
 * @author 512573717@qq.com
 * @created 2018/7/13  下午4:53.
 */
public class PersonTwo implements Cloneable {

    private String name;

    private Son mSon;

    public PersonTwo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Son getSon() {
        return mSon;
    }

    public void setSon(Son son) {
        mSon = son;
    }

    @Override
    protected Object clone() {
        PersonTwo clone = null;
        try {
            clone = (PersonTwo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e); // won't happen
        }
        clone.mSon = mSon.clone();
        return clone;

    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mSon=" + mSon +
                '}';
    }
}
