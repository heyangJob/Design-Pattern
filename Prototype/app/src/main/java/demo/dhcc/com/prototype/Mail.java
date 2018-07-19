package demo.dhcc.com.prototype;

/**
 * 邮件模板Bean
 *
 * @author 512573717@qq.com
 * @created 2018/7/13  下午3:02.
 */
public class Mail implements Cloneable {
    public String receiver;// 接收者
    public String tail;// 结尾备注
    private String context; // 内容
    private String sub; // 标题

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    // 进行浅拷贝
    @Override
    protected Mail clone() throws CloneNotSupportedException {
        Mail mail = (Mail) super.clone();
        return mail;
    }
}
