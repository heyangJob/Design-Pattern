package demo.dhcc.com.combination.simple1;

import java.util.ArrayList;
import java.util.List;

/**
 * 父节点
 *
 * @author 512573717@qq.com
 * @created 2018/8/2  下午2:00.
 */
public class ParentNode {

    private List<ChildNode> mLeafList = new ArrayList<>();

    private List<ParentNode> mParentList = new ArrayList<>();

    private String nodeName;

    public ParentNode(String nodeName) {
        this.nodeName = nodeName;
    }

    public void addParent(ParentNode parent) {
        mParentList.add(parent);
    }

    public void addLeaf(ChildNode leaf) {
        mLeafList.add(leaf);
    }

    public void getNickname(String pre) {
        System.out.println(pre + nodeName);
        //然后添加一个空格，表示向后缩进一个空格，输出自己包含的叶子对象
        pre += " ";
        for (ChildNode leaf : mLeafList) {
            leaf.getNickname(pre);
        }
        //输出当前对象的子对象了
        for (ParentNode c : mParentList) {
            //递归输出每个子对象
            c.getNickname(pre);
        }
    }
}
