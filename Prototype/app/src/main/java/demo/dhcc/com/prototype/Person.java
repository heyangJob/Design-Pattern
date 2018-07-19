package demo.dhcc.com.prototype;

/**
 * 1.浅拷贝拷贝外层对象，对象里面的引用对象不进行拷贝。
 * 2.深拷贝需要进行内部的拷贝（人为进行拷贝）。
 *
 * @author 512573717@qq.com
 * @created 2018/7/13  下午4:53.
 */
public class Person implements Cloneable {

    private String name;


    private Son mSon;

    public Person(String name) {
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
    protected Object clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", mSon=" + mSon +
                '}';
    }
}
