package java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/4/8 14:13.
 * JavaSE_20171
 */
//接受用户输入的一个字符串，将其每个字节的数据相加求和输出

public class E111 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("input:  ");
        String s = scanner.nextLine();
//
        int sum = 0;
        byte[] bytes = s.getBytes();
        for (byte b : bytes) {
            sum = sum+b;
        }
        System.out.println("byte:"+Arrays.toString(bytes));
        System.out.println(sum);
        }
    }

//    int sum = 0;
//    String str = "This is my Basic"
//    char[] c = s.toCharArray();
//        for (int i = 0; i < c.length; i++) {
//            String s1 = String.valueOf(c[i]);
//            sum = sum + s1.hashCode();
//        }
//        System.out.println("和为："+sum);