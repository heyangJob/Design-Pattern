package demo.dhcc.com.builder;

/**
 * 具体建造者类
 *
 * @author 512573717@qq.com
 * @created 2018/7/16  下午4:52.
 */
public class SimpleBuilder extends Buildler {

    private News mNews;

    public SimpleBuilder() {
        mNews = new News();
    }

    @Override
    public Buildler setId(int id) {
        mNews.setId(id);
        return this;
    }

    @Override
    public Buildler setTitle(String title) {
        mNews.setTitle(title);
        return this;
    }

    @Override
    public Buildler setSubTitle(String subTitle) {
        mNews.setSubTitle(subTitle);
        return this;
    }

    @Override
    public Buildler setCreateTime(String createTime) {
        mNews.setCreateTime(createTime);
        return null;
    }

    @Override
    public Buildler setLookCount(String lookCount) {
        mNews.setLookCount(lookCount);
        return this;
    }

    @Override
    public Buildler setType(String type) {
        mNews.setType(type);
        return this;
    }

    @Override
    public News build() {
        return mNews;
    }
}
