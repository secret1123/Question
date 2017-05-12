package java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by AnLu on
 * 2017/5/6 15:50.
 * JavaSE_20171
 */
//编写一个程序，下载 baidu 首页 logo 图片保存到本地
public class T5 {

    private static final String IMAGE_URL = "http://www.baidu.com/img/bd_logo1.png";

    public static void main(String[] args) {
        try {
            URL url = new URL(IMAGE_URL);
            try (
                    InputStream in = url.openStream();
                    OutputStream out = new FileOutputStream("img.jpg")
            ) {
                System.out.println(in.available());
                int i;
                while ((i = in.read()) != -1) {
                    out.write(i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
