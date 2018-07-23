package demo.dhcc.com.iterator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        System.out.println("数组迭代器=======");
        ArrayManager arrayManager = new ArrayManager();
        Salary[] salary = new Salary[3];
        salary[0] = new Salary("001", "10K", "7");
        salary[1] = new Salary("002", "20K", "7");
        salary[2] = new Salary("003", "30K", "7");
        arrayManager.setSalaries(salary);
        bianLi(arrayManager.createIterator());

        System.out.println("集合迭代器=======");
        CollectionManager collectionManager = new CollectionManager();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            Salary salary1 = new Salary("00" + (i+1), (i + 1) * 10 + "K", "7");
            arrayList.add(salary1);
        }
        collectionManager.setList(arrayList);
        bianLi(collectionManager.createIterator());

    }

    /**
     * 迭代器遍历
     *
     * @param iterator
     */
    private void bianLi(Iterator iterator) {
        iterator.first();
        while (iterator.hasNext()) {
            Object object = iterator.getCurrentObj();
            System.out.println(object.toString());
            iterator.next();
        }
    }
}
