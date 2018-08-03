package demo.dhcc.com.combination.simple1;

/**
 * 子节点
 *
 * @author 512573717@qq.com
 * @created 2018/8/2  上午11:43.
 */
public class ChildNode {

    private String nodeName;

    public ChildNode(String nodeName) {
        this.nodeName = nodeName;
    }

    public void getNickname(String pre) {
        System.out.println(pre + "-" + nodeName);

    }
}
