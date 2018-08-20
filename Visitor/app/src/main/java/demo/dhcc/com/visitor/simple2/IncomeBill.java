package demo.dhcc.com.visitor.simple2;

/**
 * 收入的单子
 *
 * @author 512573717@qq.com
 * @created 2018/8/20  下午12:51.
 */
public class IncomeBill  implements  Bill{

    private double amount;

    private String item;

    public IncomeBill(double amount, String item) {
        super();
        this.amount = amount;
        this.item = item;
    }

    public void accept(AccountBookViewer viewer) {
        viewer.view(this);
    }

    public double getAmount() {
        return amount;
    }

    public String getItem() {
        return item;
    }

}
