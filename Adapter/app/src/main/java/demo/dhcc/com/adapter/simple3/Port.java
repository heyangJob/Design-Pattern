package demo.dhcc.com.adapter.simple3;

/**
 * 接口
 *
 * @author 512573717@qq.com
 * @created 2018/7/24  下午2:05.
 */
public interface Port {

    // 网络端口80
    void NET();

    // Tomcat容器端口8080
    void Tomcat();

    // Oracle数据库端口1521
    void Oracle();

    // 文件传输FTP端口21
    void FTP();
}
