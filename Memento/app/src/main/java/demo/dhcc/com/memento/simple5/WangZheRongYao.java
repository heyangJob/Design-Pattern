package demo.dhcc.com.memento.simple5;

/**
 * 王者荣耀 游戏
 *
 * @author 512573717@qq.com
 * @created 2018/8/9  上午11:53.
 */
public class WangZheRongYao {

    //开始的总时长
    private int time;


    // 当前的等级
    private int level;

    // 是否退出
    private boolean isExit = false;

    /**
     * 开始一把排位
     */
    public void playGame() {
        new Thread(new Runnable() {

            @Override
            public void run() {
                while (!isExit) {
                    System.out.println("游戏开始了：" + time + "分钟，等级：" + level);
                    time++;
                    level++;
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    /**
     * 来电话了，退出当前游戏
     */
    public void exitGame() {
        isExit = true;
        System.out.println("=====来电话了，退出当前游戏=====");
        System.out.println("游戏开始了：" + time + "分钟，等级：" + level);
    }

    /**
     * 保存获取当前游戏信息
     *
     * @return
     */
    public GameInfo saveGameInfo() {
        return new GameInfo(time, level);
    }

    /**
     * 重新加载游戏
     *
     * @param gameInfo
     */
    public void resetGame(GameInfo gameInfo) {
        time = gameInfo.getTime();
        level = gameInfo.getLevel();
        System.out.println("=====恢复游戏=====");
        System.out.println("游戏开始了：" + time + "分钟，等级：" + level);
//        isExit = false;
    }
}
