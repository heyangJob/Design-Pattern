package demo.dhcc.com.wrapper;

/**
 * 外壳
 *
 * @author 512573717@qq.com
 * @created 2018/7/26  下午2:01.
 */
public abstract class Shell implements IPhone {

    private IPhone mHuaWeiPhone;

    public Shell(IPhone huaWeiPhone) {
        mHuaWeiPhone = huaWeiPhone;
    }

    @Override
    public void decorate() {
        mHuaWeiPhone.decorate();
    }
}
