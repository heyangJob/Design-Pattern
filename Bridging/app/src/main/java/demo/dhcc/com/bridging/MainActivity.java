package demo.dhcc.com.bridging;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.bridging.simple1.WhiteCircle;
import demo.dhcc.com.bridging.simple1.WhiteSquare;
import demo.dhcc.com.bridging.simple2.Circle;
import demo.dhcc.com.bridging.simple2.IColor;
import demo.dhcc.com.bridging.simple2.Shape;
import demo.dhcc.com.bridging.simple2.Square;
import demo.dhcc.com.bridging.simple2.WhiteColor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 方式一 通过继承
        WhiteSquare whiteSquare = new WhiteSquare();
        whiteSquare.draw();

        WhiteCircle whiteCircle = new WhiteCircle();
        whiteCircle.draw();

        //方式二：桥接模式
        //白色
        IColor white = new WhiteColor();

        //白色的正方形
        Shape square = new Square();
        square.setIColor(white);
        square.draw();

        //白色的圆形
        Shape circle = new Circle();
        circle.setIColor(white);
        circle.draw();


    }
}
