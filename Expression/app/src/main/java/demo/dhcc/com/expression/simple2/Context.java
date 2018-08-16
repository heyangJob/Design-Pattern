package demo.dhcc.com.expression.simple2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.io.InputStream;

/**
 * @author 512573717@qq.com
 * @created 2018/8/16  上午10:34.
 */
public class Context {
    /**
     * 上一个被处理的元素
     */
    private Element preEle = null;
    /**
     * Dom解析Xml的Document对象
     */
    private Document document = null;

    public Context(InputStream inputStream) throws Exception {
        //通过辅助的Xml工具类来获取被解析的xml对应的Document对象
        this.document = XmlUtil.getRoot(inputStream);
    }


    /**
     * 各个Expression公共使用的方法,
     * 根据父元素和当前元素的名称来获取当前的元素
     *
     * @param pEle    父元素
     * @param eleName 当前元素的名称
     * @return 找到的当前元素
     */
    public Element getNowEle(Element pEle, String eleName) {
        NodeList tempNodeList = pEle.getChildNodes();
        for (int i = 0; i < tempNodeList.getLength(); i++) {
            if (tempNodeList.item(i) instanceof Element) {
                Element nowEle = (Element) tempNodeList.item(i);
                if (nowEle.getTagName().equals(eleName)) {
                    return nowEle;
                }
            }
        }
        return null;
    }

    public Element getPreEle() {
        return preEle;
    }

    public void setPreEle(Element preEle) {
        this.preEle = preEle;
    }

    public Document getDocument() {
        return document;
    }

}
