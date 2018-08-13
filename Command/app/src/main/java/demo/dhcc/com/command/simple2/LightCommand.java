package demo.dhcc.com.command.simple2;

/**
 * 开灯 关灯命令
 *
 * @author 512573717@qq.com
 * @created 2018/8/13  下午4:48.
 */
public class LightCommand implements ICommand {

    private LightReceiver mLightReceiver;

    public LightCommand(LightReceiver lightReceiver) {
        mLightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        mLightReceiver.on();
        mLightReceiver.off();
    }
}
