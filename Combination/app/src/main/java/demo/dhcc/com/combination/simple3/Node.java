package demo.dhcc.com.combination.simple3;

import java.util.List;

/**
 * 节点抽象类
 *
 * @author 512573717@qq.com
 * @created 2018/8/2  下午2:17.
 */
public abstract class Node {

    /**
     * 记录父组件对象
     */
    private Node parent = null;

    /**
     * 获取一个组件的父组件对象
     *
     * @return 一个组件的父组件对象
     */
    public Node getParent() {
        return parent;
    }

    /**
     * 设置一个组件的父组件对象
     *
     * @param parent 一个组件的父组件对象
     */
    public void setParent(Node parent) {
        this.parent = parent;
    }

    /**
     * 返回某个组件的子组件对象
     *
     * @return 某个组件的子组件对象
     */
    public List<Node> getChildren() {
        throw new UnsupportedOperationException("对象不支持这个功能");
    }


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
