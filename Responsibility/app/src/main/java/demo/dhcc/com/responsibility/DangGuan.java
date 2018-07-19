package demo.dhcc.com.responsibility;

/**
 * 有权利的人
 *
 * @author 512573717@qq.com
 * @created 2018/7/19  下午4:11.
 */
public abstract class DangGuan {
    private DangGuan nextDangGuan;

    public DangGuan getNextDangGuan() {
        return nextDangGuan;
    }

    public void setNextDangGuan(DangGuan nextDangGuan) {
        this.nextDangGuan = nextDangGuan;
    }

    //案情
    abstract void anQing(String desc);
}
