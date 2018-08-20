package demo.dhcc.com.visitor.simple2;

/**
 * Element
 *
 * @author 512573717@qq.com
 * @created 2018/8/20  下午12:49.
 */
public interface Bill {
    void accept(AccountBookViewer viewer);
}
