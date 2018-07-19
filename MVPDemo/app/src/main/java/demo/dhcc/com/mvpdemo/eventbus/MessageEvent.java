package demo.dhcc.com.mvpdemo.eventbus;

/**
 * ${title}
 *
 * @author zongsw
 * @created 2018/7/5 上午10:54.
 */
public class MessageEvent {

    private  String messgae;

    public MessageEvent(String messgae) {
        this.messgae = messgae;
    }

    public String getMessgae() {
        return messgae;
    }

    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }
}
