package demo.dhcc.com.expression.simple2;

import org.w3c.dom.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 512573717@qq.com
 * @created 2018/8/16  上午10:35.
 */
public class ElementExpression extends ReadXmlExpression {
    /**
     * 用来记录组合的ReadXmlExpression元素
     */
    private List<ReadXmlExpression> eles = new ArrayList<ReadXmlExpression>();
    /**
     * 元素的名称
     */
    private String eleName = "";

    public ElementExpression(String eleName) {
        this.eleName = eleName;
    }

    public boolean addEle(ReadXmlExpression ele) {
        this.eles.add(ele);
        return true;
    }

    public boolean removeEle(ReadXmlExpression ele) {
        this.eles.remove(ele);
        return true;
    }


    @Override
    public String[] interpret(Context c) {
        //先取出上下文里的当前元素作为父级元素
        //查找到当前元素名称所对应的xml元素，并设置回到上下文中
        Element pEle = c.getPreEle();
        if (pEle == null) {
            //说明现在获取的是根元素
            c.setPreEle(c.getDocument().getDocumentElement());
        } else {
            //根据父级元素和要查找的元素的名称来获取当前的元素
            Element nowEle = c.getNowEle(pEle, eleName);
            //把当前获取的元素放到上下文里面
            c.setPreEle(nowEle);
        }

        //循环调用子元素的interpret方法
        String[] ss = null;
        for (ReadXmlExpression ele : eles) {
            ss = ele.interpret(c);
        }
        return ss;
    }


}

