package demo.dhcc.com.visitor.simple2;

/**
 * Visitor
 *
 * @author 512573717@qq.com
 * @created 2018/8/20  下午12:46.
 */
public interface AccountBookViewer {

    //查看消费的单子
    void view(ConsumeBill bill);

    //查看收入的单子
    void view(IncomeBill bill);
}
