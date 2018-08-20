package demo.dhcc.com.visitor.simple2;

import java.util.ArrayList;
import java.util.List;

/**
 * ObjectStruture
 *
 * @author 512573717@qq.com
 * @created 2018/8/20  下午12:52.
 */
public class AccountBook {

    //单子列表
    private List<Bill> billList = new ArrayList<Bill>();

    //添加单子
    public void addBill(Bill bill) {
        billList.add(bill);
    }

    //供账本的查看者查看账本
    public void show(AccountBookViewer viewer) {
        for (Bill bill : billList) {
            bill.accept(viewer);
        }
    }
}
