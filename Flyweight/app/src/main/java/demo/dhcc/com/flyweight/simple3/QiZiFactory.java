package demo.dhcc.com.flyweight.simple3;

import java.util.Hashtable;

/**
 * 生产棋子的工厂
 * 
 * @author 512573717@qq.com
 
 * @created 2018/8/7  下午4:02.
 * 
 */
public class QiZiFactory {

    private static QiZiFactory instance = new QiZiFactory();
    private static Hashtable ht; //使用Hashtable来存储享元对象，充当享元池
    private QiZi black,white;

    private QiZiFactory() {
        ht = new Hashtable();
        black = new BlackQiZi();
        ht.put("b",black);
        white = new WhiteQiZi();
        ht.put("w",white);
    }


    //返回享元工厂类的唯一实例
    public static QiZiFactory getInstance() {
        return instance;
    }

    //通过key来获取存储在Hashtable中的享元对象
    public static QiZi getIgoChessman(String color) {
        return (QiZi)ht.get(color);
    }

}
