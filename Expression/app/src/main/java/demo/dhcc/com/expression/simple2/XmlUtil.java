package demo.dhcc.com.expression.simple2;

import org.w3c.dom.Document;

import java.io.InputStream;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

/**
 * @author 512573717@qq.com
 * @created 2018/8/16  上午10:35.
 */
public class XmlUtil {
    public static Document getRoot(InputStream inputStream) throws Exception {
        Document doc = null;

        //建立一个解析器工厂
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        //获得一个DocumentBuilder对象，这个对象代表了具体的DOM解析器
        DocumentBuilder builder = factory.newDocumentBuilder();
        //得到一个表示XML文档的Document对象
        doc = builder.parse(inputStream);
        //去掉XML文档中作为格式化内容的空白而映射在DOM树中的TextNode对象
        doc.normalize();

        return doc;
    }

}
