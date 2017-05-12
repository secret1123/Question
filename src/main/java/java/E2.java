package java;

import java.util.Scanner;

/**
 * Created by an lu on 2017/3/18.
 */
//编写一个 Java Application 类型的程序,定义一个 byte 类型的变量 b,并从键盘上给它赋 值为-100 和 100 时,输出该变量的值。
public class E2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input :  ");
        byte b = scanner.nextByte();
        E2 e2 = new E2();
        e2.B(b);
    }

    public void B (byte b) {
        if (b==100) {
            System.out.println(b);
        }
    }
}


