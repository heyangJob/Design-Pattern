package demo.dhcc.com.iterator;

/**
 * 工资组成bean
 *
 * @author 512573717@qq.com
 * @created 2018/7/20  下午4:08.
 */
public class Salary {
    private String name;
    private String pay;
    private String month;

    public Salary(String name, String pay, String month) {
        this.name = name;
        this.pay = pay;
        this.month = month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "name='" + name + '\'' +
                ", pay='" + pay + '\'' +
                ", month='" + month + '\'' +
                '}';
    }
}
