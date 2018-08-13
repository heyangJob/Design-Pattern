package demo.dhcc.com.command.simple1;

/**
 * 命令接口的实现
 *
 * @author 512573717@qq.com
 * @created 2018/8/13  下午3:14.
 */
public class ConcreteCommand implements ICommand {
    private Receiver mReceiver;

    public ConcreteCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.action();
    }
}
