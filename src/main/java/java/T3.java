package java;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by AnLu on
 * 2017/5/6 15:28.
 * JavaSE_20171
 */
//用输入/输出写一个程序,让用户输入一些姓名和电话号码。
// 每一个姓名和号码将加在文件 里。用户通过点”Done”按钮来告诉系统整个列表已输入完毕。
// 如果用户输入完整个列表, 程序将创建一个输出文件并显示或打印出来。格式如:
//        Tom
//        123-456-7890
//        Jerry
//        987-654-3210
public class T3 {

    static FileOutputStream fos;
    public static final int lineLength = 81;

    public static void main(String[] args) throws IOException {

        byte[] phone = new byte[lineLength];
        byte[] name = new byte[lineLength];
        int I;
        try {
            fos = new FileOutputStream("phone.numbers");
        } catch (FileNotFoundException e) {
        }
        while (true) {
            System.err.println("Enter a name(enter'done'to quit)");
            readLine(name);
            if ("done".equalsIgnoreCase(new String(name, 0, 0, 4))) {
                break;
            }
            System.err.println("Enter the phone number");
            readLine(phone);
            for (int i = 0; phone[i] != 0; i++) {
                fos.write(phone[i]);
            }
            fos.write(',');
            for (int i = 0; name[i] != 0; i++) {
                fos.write(name[i]);
            }
            fos.write('\n');
        }
        fos.close();
    }

    private static void readLine(byte line[]) throws IOException {
        int i = 0, b = 0;
        while ((i < lineLength - 1) && ((b = System.in.read()) != '\n')) {
            line[i++] = (byte) b;
        }
        line[i] = (byte) 0;
    }
}
