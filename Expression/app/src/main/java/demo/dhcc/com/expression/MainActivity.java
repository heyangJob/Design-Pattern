package demo.dhcc.com.expression;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.InputStream;

import demo.dhcc.com.expression.simple1.Calculator;
import demo.dhcc.com.expression.simple2.Context;
import demo.dhcc.com.expression.simple2.ElementExpression;
import demo.dhcc.com.expression.simple2.ElementTerminalExpression;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calculator = new Calculator("1 + 2 + 3 – 4 + 1");
        System.out.println(calculator.calculate(new demo.dhcc.com.expression.simple1.Context()));


        Context c = null;
        try {
            InputStream is = getAssets().open("test.xml");

            c = new Context(is);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //想要获取c元素的值，也就是如下表达式的值："root/a/b/c"
        //首先要构建解释器的抽象语法树
        ElementExpression root = new ElementExpression("root");
        ElementExpression aEle = new ElementExpression("a");
        ElementExpression bEle = new ElementExpression("b");
        ElementTerminalExpression cEle = new ElementTerminalExpression("c");
        //组合起来
        root.addEle(aEle);
        aEle.addEle(bEle);
        bEle.addEle(cEle);
        //调用
        String ss[] = root.interpret(c);
        System.out.println("c的值是=" + ss[0]);


    }
}