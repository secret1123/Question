package java;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by AnLu on
 * 2017/4/22 10:02.
 * JavaSE_20171
 */
public class Test5 {

    private static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        try
                (RandomAccessFile raf = new RandomAccessFile("raf.txt", "rw")) {
            for (int i = 0; i < 20; i++) {
                raf.writeInt(fibonacci(i + 1));
            }
            raf.seek(0);
            for (int i = 0; i < 3; i++) {
                raf.readInt();
                try (RandomAccessFile file = new RandomAccessFile("output.txt", "rw")) {
                    int r = raf.readInt();
                    System.out.println(r);
                    file.writeInt(r);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}