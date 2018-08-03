package demo.dhcc.com.combination.simple2;

import java.util.ArrayList;
import java.util.List;

/**
 * 父节点
 *
 * @author 512573717@qq.com
 * @created 2018/8/2  下午2:43.
 */
public class ParentNode extends Node {

    private List<Node> mParents = null;

    public ParentNode(String nodeName) {
        super(nodeName);
    }


    @Override
    public void getNodeName(String prefix) {

        System.out.println(prefix+nodeName);

        if (this.mParents != null) {
            prefix +=" ";
            for (Node c : mParents) {
                //递归输出每个子对象
                c.getNodeName(prefix);
            }
        }
    }

    @Override
    public void addNode(Node parent) {
        if (mParents == null) {
            mParents = new ArrayList<Node>();
        }
        mParents.add(parent);
    }
}
