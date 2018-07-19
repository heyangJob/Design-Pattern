package demo.dhcc.com.builder;

/**
 * 指挥者类
 *
 * @author 512573717@qq.com
 * @created 2018/7/16  下午4:57.
 */
public class Director {

    // 组装产品
    public static News create(String type) {
        return new SimpleBuilder().setType(type)
                .setId(1)
                .setTitle("历史上的今天")
                .build();

    }
}
