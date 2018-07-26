package demo.dhcc.com.wrapper;

/**
 * 手机贴膜
 *
 * @author 512573717@qq.com
 * @created 2018/7/26  下午2:17.
 */
public abstract class Membrane implements IPhone {

    private IPhone mHuaWeiPhone;

    public Membrane(IPhone huaWeiPhone) {
        mHuaWeiPhone = huaWeiPhone;
    }

    @Override
    public void decorate() {
        mHuaWeiPhone.decorate();
    }
}
