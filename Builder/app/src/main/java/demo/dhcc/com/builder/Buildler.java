package demo.dhcc.com.builder;

/**
 * 抽象建造者类
 *
 * @author 512573717@qq.com
 * @created 2018/7/16  下午4:36.
 */
public abstract class Buildler {

    public abstract Buildler setId(int id);

    public abstract Buildler setTitle(String title);

    public abstract Buildler setSubTitle(String subTitle);

    public abstract Buildler setCreateTime(String createTime);

    public abstract Buildler setLookCount(String lookCount);

    public abstract Buildler setType(String type);

    public abstract News build();

}
