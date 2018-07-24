package demo.dhcc.com.adapter.simple3;

/**
 * 聊天适配器
 *
 * @author 512573717@qq.com
 * @created 2018/7/24  下午2:06.
 */
public class ChatAdapter extends PortAdapter {
    @Override
    public void NET() {
        System.out.println("HTTP ://Hello world!");
    }

    @Override
    public void FTP() {
        System.out.println("FTP:// File upload succeddful!");
    }
}
