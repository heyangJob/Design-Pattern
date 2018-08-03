package demo.dhcc.com.combination.simple3;

import java.util.ArrayList;
import java.util.List;

/**
 * 父节点
 *
 * @author 512573717@qq.com
 * @created 2018/8/2  下午2:43.
 */
public class ParentNode extends Node {

    @Override
    public void addNode(Node node) {
        if (mParents == null) {
            mParents = new ArrayList<Node>();
        }
        mParents.add(node);

        //添加对父组件的引用
        node.setParent(this);
    }

    public List<Node> getChildren() {
        return mParents;
    }

    @Override
    public void removeNode(Node child) {
        if (mParents != null) {
            //查找到要删除的组件在集合中的索引位置
            int idx = mParents.indexOf(child);
            if (idx != -1) {
                //先把被删除的商品类别对象的父商品类别，
                //设置成为被删除的商品类别的子类别的父商品类别
                for (Node c : child.getChildren()) {
                    //删除的组件对象是本实例的一个子组件对象
                    c.setParent(this);
                    //把被删除的商品类别对象的子组件对象添加到当前实例中
                    mParents.add(c);
                }

                //真的删除
                mParents.remove(idx);
            }
        }
    }


    private List<Node> mParents = null;

    public ParentNode(String nodeName) {
        super(nodeName);
    }

    @Override
    public void getNodeName(String prefix) {

        System.out.println(prefix + nodeName);

        if (this.mParents != null) {
            prefix += " ";
            for (Node c : mParents) {
                //递归输出每个子对象
                c.getNodeName(prefix);
            }
        }
    }


}
