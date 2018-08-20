package demo.dhcc.com.visitor.simple2;

/**
 * 消费
 *
 * @author 512573717@qq.com
 * @created 2018/8/20  下午12:50.
 */
public class ConsumeBill implements Bill {

    private double amount;

    private String item;

    public ConsumeBill(double amount, String item) {
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
