package demo.dhcc.com.prototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            PersonTwo p = new PersonTwo("zhang");
            Son son = new Son("实验二小");
            p.setSon(son);
            PersonTwo p1 = null;
            p1 = (PersonTwo) p.clone();
            p1.setName("yang");
            son.setSchoolName("希望小学");
            System.out.println("----" + p.toString());
            System.out.println("----" + p1.toString());

//        Person p = new Person("zhang");
//        Son son = new Son("实验二小");
//        p.setSon(son);
//        Person p1 = null;
//        try {
//            p1 = (Person) p.clone();
//            p1.setName("yang");
//            son.setSchoolName("希望小学");
//            System.out.println("----" + p.toString());
//            System.out.println("----" + p1.toString());
//        } catch (CloneNotSupportedException e) {
//            e.printStackTrace();
//        }



         /* 发送邮件 */
//        final Mail mail = new Mail();
//        mail.setTail("xxx银行的所有版权");

//        for (int i = 0; i < 100; i++) {
//            mail.setSub("i" + " 先生（女士） ");
//            mail.setReceiver("i0001122" + "@qq.com");
//            sendMail(mail);
//
//        }


//        for (int i = 0; i < 100; i++) {
//            Mail cloneMail;
//            try {
//                cloneMail = mail.clone();
//                cloneMail.setSub("i" + " 先生（女士） ");
//                cloneMail.setReceiver("i0001122" + "@qq.com");
//                sendMail(cloneMail);
//            } catch (CloneNotSupportedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//        }
    }


    public static void sendMail(Mail mail) {
        System.out.println("标题： " + mail.getSub() + "\t收件人"
                + mail.getReceiver() + "\t....发送成功！ ");
    }
}
