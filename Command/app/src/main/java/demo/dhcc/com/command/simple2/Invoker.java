package demo.dhcc.com.command.simple2;


/**
 * 调用者
 *
 * @author 512573717@qq.com
 * @created 2018/8/13  下午3:21.
 */
public class Invoker {
    /**
     * 持有命令对象
     */
    private ICommand command = null;

    /**
     * 设置调用者持有的命令对象
     *
     * @param command 命令对象
     */
    public void setCommand(ICommand command) {
        this.command = command;
    }

    /**
     * 示意方法，要求命令执行请求
     */
    public void runCommand() {
        //调用命令对象的执行方法
        command.execute();
    }

}
