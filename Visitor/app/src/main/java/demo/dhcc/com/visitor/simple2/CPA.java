package demo.dhcc.com.visitor.simple2;

/**
 * visitor 会计
 *
 * @author 512573717@qq.com
 * @created 2018/8/20  下午12:47.
 */
public class CPA implements AccountBookViewer {

    //注会在看账本时，如果是支出，则如果支出是工资，则需要看应该交的税交了没
    public void view(ConsumeBill bill) {
        if (bill.getItem().equals("工资")) {
            System.out.println("注会查看工资是否交个人所得税。");
        }
    }

    //如果是收入，则所有的收入都要交税
    public void view(IncomeBill bill) {
        System.out.println("注会查看收入交税了没。");
    }
}