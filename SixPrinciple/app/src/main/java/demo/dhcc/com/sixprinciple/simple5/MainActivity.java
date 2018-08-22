package demo.dhcc.com.sixprinciple.simple5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;

import demo.dhcc.com.sixprinciple.R;

public class MainActivity extends AppCompatActivity {
    private Socket mSocket;
    private FileInputStream mFileInputStream;
    private FileOutputStream mOutStream;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 关闭Socket
        if (mSocket != null) {
            try {
                mSocket.close();
                mSocket = null;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


            // 关闭输入流
            if (mFileInputStream != null) {
                try {
                    mFileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 关闭输出流
            if (mOutStream != null) {
                try {
                    mOutStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            // 关闭Socket
            if (mSocket != null) {
                try {
                    mSocket.close();
                    mSocket = null;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }


        close(mSocket);
        close(mOutStream);
        close(mFileInputStream);


    }

    /**
     * 关闭 Closeable
     * @param closeable
     */
    private void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
