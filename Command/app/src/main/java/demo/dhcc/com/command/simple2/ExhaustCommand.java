package demo.dhcc.com.command.simple2;

/**
 * 开 关 吸油烟机命令
 *
 * @author 512573717@qq.com
 * @created 2018/8/13  下午4:51.
 */
public class ExhaustCommand implements ICommand {
    private ExhaustReceiver mExhaustReceiver;

    public ExhaustCommand(ExhaustReceiver exhaustReceiver) {
        mExhaustReceiver = exhaustReceiver;
    }

    @Override
    public void execute() {
        mExhaustReceiver.on();
        mExhaustReceiver.off();
    }
}
