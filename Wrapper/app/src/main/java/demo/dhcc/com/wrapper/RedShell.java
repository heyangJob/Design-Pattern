package demo.dhcc.com.wrapper;

/**
 * 红色的外壳
 *
 * @author 512573717@qq.com
 * @created 2018/7/26  下午2:05.
 */
public class RedShell extends Shell {

    public RedShell(IPhone huaWeiPhone) {
        super(huaWeiPhone);
    }

    public void shell() {
        System.out.println("粉红色外壳");
    }

    public void pendant() {
        System.out.println("小猪佩奇挂件");
    }

    @Override
    public void decorate() {
        super.decorate();
        shell();
        pendant();
    }
}
