package demo.dhcc.com.combination.simple2;

/**
 * 节点抽象类
 *
 * @author 512573717@qq.com
 * @created 2018/8/2  下午2:17.
 */
public abstract class Node {
    //节点名字
    protected String nodeName;

    public Node(String nodeName) {
        this.nodeName = nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    // 打印节点名字
    public abstract void getNodeName(String prefix);

    //添加节点
    public void addNode(Node node) {

    }

    //删除节点
    public void removeNode(Node node) {

    }

    //查找节点
    public void getIndexNode(int index) {

    }

}
