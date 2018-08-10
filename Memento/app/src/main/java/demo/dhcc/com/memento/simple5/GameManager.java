package demo.dhcc.com.memento.simple5;

/**
 * 备忘录管理者
 *
 * @author 512573717@qq.com
 * @created 2018/8/9  下午1:59.
 */
public class GameManager {
    private GameInfo mGameInfo;

    private static volatile GameManager instance;

    private GameManager() {
    }

    public static GameManager getGameManager() {
        if (instance == null) {
            synchronized (GameManager.class) {
                if (instance == null) {
                    instance = new GameManager();
                }
            }
        }
        return instance;
    }

    /**
     * 保存游戏信息
     *
     * @param gameInfo
     */
    public void saveGameInfo(GameInfo gameInfo) {
        mGameInfo = gameInfo;
    }

    /**
     * 读取游戏信息
     *
     * @return
     */
    public GameInfo getGameInfo() {
        return mGameInfo;
    }


}
