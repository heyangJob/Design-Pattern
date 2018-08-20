package demo.dhcc.com.visitor.simple1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 512573717@qq.com
 * @created 2018/8/20  上午10:39.
 */
public class ObjectStructure {
    private List<Element> mElements = new ArrayList<>();

    public void addElement(Element e) {
        mElements.add(e);
    }

    public void removeElement(Element e) {
        mElements.remove(e);
    }

    public void accpet(Visitor visitor) {
        for (Element e : mElements) {
            e.accept(visitor);
        }
    }
}
