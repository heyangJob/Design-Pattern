package demo.dhcc.com.combination.simple3;

/**
 * 子节点
 *
 * @author 512573717@qq.com
 * @created 2018/8/2  下午2:25.
 */
public class ChildNode extends Node {

    public ChildNode(String nodeName) {
        super(nodeName);
    }

    @Override
    public void getNodeName(String prefix) {
        System.out.println(prefix+"-"+ nodeName);
    }
}
