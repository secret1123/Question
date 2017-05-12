package java;

import java.util.Scanner;

/**
 * Created by anlu on 2017/3/18.
 */
//编写一个 Java Application 类型的程序,从键盘上输入三角形的三条边的长度,计算三角形的面积和周长并输出。
//根据三角形边长求面积公式如下:
//area = s * √(s − a) * (s − b) * (s − c) ,其中 a、b、c 为三角形的三条边,s=(a+b+c)/2。
public class E3 {
    public static void  main(String[] args) {
        E3 e3 = new E3();
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入边长：");
        double a = scanner.nextDouble();
        System.out.println("输入边长：");
        double b = scanner.nextDouble();
        System.out.println("输入边长：");
        double c = scanner.nextDouble();

        if (a + b > c || a + c > b || b + c > a) {
            System.out.println(e3.getC(a, b, c));
            System.out.println(e3.getArea(a, b, c));
        } else {
            System.out.println("不符合规则");
        }
    }

    public double getC(double a, double b, double c) {
        return a + b + c;
    }

    public double getArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt((s - a) * (s - b) * (s - c));
    }
}