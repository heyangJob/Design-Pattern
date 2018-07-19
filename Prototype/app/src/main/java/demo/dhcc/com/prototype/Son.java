package demo.dhcc.com.prototype;

/**
 * @author 512573717@qq.com
 * @created 2018/7/13  下午4:54.
 */
public class Son implements Cloneable {
    public Son(String schoolName) {
        this.schoolName = schoolName;
    }

    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    protected Son clone() {
        Son clone = null;
        try {
            clone = (Son) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e); // won't happen
        }

        return clone;
    }

    @Override
    public String toString() {
        return "Son{" +
                "schoolName='" + schoolName + '\'' +
                '}';
    }
}
