package demo.dhcc.com.combination;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.combination.simple1.ChildNode;
import demo.dhcc.com.combination.simple1.ParentNode;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //定义所有的组合对象
        ParentNode root = new ParentNode("服装");
        ParentNode c1 = new ParentNode("男装");
        ParentNode c2 = new ParentNode("女装");

        //定义所有的叶子对象
        ChildNode leaf1 = new ChildNode("衬衣");
        ChildNode leaf2 = new ChildNode("夹克");
        ChildNode leaf3 = new ChildNode("裙子");
        ChildNode leaf4 = new ChildNode("套装");

        //按照树的结构来组合组合对象和叶子对象
        root.addParent(c1);
        root.addParent(c2);

        c1.addLeaf(leaf1);
        c1.addLeaf(leaf2);
        c2.addLeaf(leaf3);
        c2.addLeaf(leaf4);

        //调用根对象的输出功能来输出整棵树
        root.getNickname("");


//        Node root = new ParentNode("服装");
//        Node c1 = new ParentNode("男装");
//        Node c2 = new ParentNode("女装");
//
//        //定义所有的叶子对象
//        Node leaf1 = new ChildNode("衬衣");
//        Node leaf2 = new ChildNode("夹克");
//        Node leaf3 = new ChildNode("裙子");
//        Node leaf4 = new ChildNode("套装");
//
//        //按照树的结构来组合组合对象和叶子对象
//        root.addNode(c1);
//        root.addNode(c2);
//        c1.addNode(leaf1);
//        c1.addNode(leaf2);
//        c2.addNode(leaf3);
//        c2.addNode(leaf4);
//        //调用根对象的输出功能来输出整棵树
//        root.getNodeName("");
//
//
//        System.out.println("==========================");
//        //然后删除一个节点
//        root.removeNode(c1);
//        //重新输出整棵树
//        root.getNodeName("");



    }
}
