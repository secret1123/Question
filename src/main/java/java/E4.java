package java;

import java.util.Scanner;

/**
 * Created by anlu on 2017/3/18.
 */
//编写一个 Java Application 类型的程序,从键盘上输入摄氏温度 C,计算华氏温度 F 的值 并输出。
//其转换公式如下:F = (9 / 5) * C + 32
public class E4 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("输入摄氏度：");
        double c = scanner.nextDouble();
        E4 e4 = new E4();
        System.out.println(e4.getHua(c));
    }
    public double getHua(double c) {
        return (9 / 5) * c + 32;
    }

}
