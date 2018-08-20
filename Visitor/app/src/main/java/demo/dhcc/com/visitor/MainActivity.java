package demo.dhcc.com.visitor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import demo.dhcc.com.visitor.simple1.ConcreteElementA;
import demo.dhcc.com.visitor.simple1.ConcreteElementB;
import demo.dhcc.com.visitor.simple1.ConcreteVisitorA;
import demo.dhcc.com.visitor.simple1.ObjectStructure;
import demo.dhcc.com.visitor.simple1.Visitor;
import demo.dhcc.com.visitor.simple2.AccountBook;
import demo.dhcc.com.visitor.simple2.AccountBookViewer;
import demo.dhcc.com.visitor.simple2.Boss;
import demo.dhcc.com.visitor.simple2.CPA;
import demo.dhcc.com.visitor.simple2.ConsumeBill;
import demo.dhcc.com.visitor.simple2.IncomeBill;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ObjectStructure os = new ObjectStructure();
        os.addElement(new ConcreteElementA());
        os.addElement(new ConcreteElementB());
        //创建一个访问者
        Visitor visitor = new ConcreteVisitorA();
        os.accpet(visitor);


        AccountBook accountBook = new AccountBook();
        //添加收入
        accountBook.addBill(new IncomeBill(10000, "卖商品"));
        //添加支出
        accountBook.addBill(new ConsumeBill(1000, "工资"));

        AccountBookViewer boss = new Boss();
        AccountBookViewer cpa = new CPA();

        //两个访问者分别访问账本
        accountBook.show(cpa);
        accountBook.show(boss);

        ((Boss) boss).getTotalConsume();
        ((Boss) boss).getTotalIncome();

    }
}
