package demo.dhcc.com.builder;

/**
 * 新闻实体类
 *
 * @author 512573717@qq.com
 * @created 2018/7/16  下午5:32.
 */
public class News {

    private int id;
    private String title;
    private String subTitle;
    private String createTime;
    private String lookCount;
    private String type;

    public News() {
    }

    public News(int id, String title, String subTitle, String createTime, String lookCount, String type) {
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.createTime = createTime;
        this.lookCount = lookCount;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getLookCount() {
        return lookCount;
    }

    public void setLookCount(String lookCount) {
        this.lookCount = lookCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subTitle='" + subTitle + '\'' +
                ", createTime='" + createTime + '\'' +
                ", lookCount='" + lookCount + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
