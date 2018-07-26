package demo.dhcc.com.wrapper;

/**
 * 钢化膜
 *
 * @author 512573717@qq.com
 * @created 2018/7/26  下午2:22.
 */
public class TemperingMembrane extends Membrane {

    public TemperingMembrane(IPhone huaWeiPhone) {
        super(huaWeiPhone);
    }

    public void pasting() {
        System.out.println("蓝光钢化膜");
    }

    @Override
    public void decorate() {
        super.decorate();
        pasting();
    }
}
