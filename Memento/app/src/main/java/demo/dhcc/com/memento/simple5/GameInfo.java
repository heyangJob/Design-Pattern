package demo.dhcc.com.memento.simple5;

/**
 * 创建备忘录
 *
 * @author 512573717@qq.com
 * @created 2018/8/9  下午1:57.
 */
public class GameInfo {
    //开始的总时长
    private int time;
    // 当前的等级
    private int level;

    public GameInfo(int time, int level) {
        this.time = time;
        this.level = level;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
