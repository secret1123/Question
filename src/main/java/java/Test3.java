package java;

import java.io.*;

/**
 * Created by AnLu on
 * 2017/4/22 09:21.
 * JavaSE_20171
 */
public class Test3 {
    public static void main(String[] args) {
        try (
                InputStream inputStream = new FileInputStream("1.txt");
                InputStream inputStream1 = new FileInputStream("2.txt");
                OutputStream outputStream = new FileOutputStream("3.txt")
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
            {
                int j;
                while ((j = inputStream1.read()) != -1) {
                    outputStream.write(j);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
