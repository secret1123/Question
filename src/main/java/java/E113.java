package java;

/**
 * Created by AnLu on
 * 2017/4/8 14:14.
 * JavaSE_20171
 */
//编写一个java应用程序，要求如下：
//        　　（1）声明一个String类的变量并初始化值“Hello World”。
//        　　（2）用字符串类的一个方法将上面变量的值拆分成” Hello” 和“World”两个字符串并打印输出。
//        　　（3）将” Hello”这个变量转换成大写、“World”转换成 小写并打印输出。
//        　　（4）声明一个String类的变量并初始化值“20100110”。
//        　　（5）将上面变量的值转换成2010年1月10日的形式打印输出
public class E113 {
    public static void main(String[] args) {

        String s = "Hello world";

        System.out.println(s.substring(0,5).toUpperCase());
        System.out.println(s.substring(6).toLowerCase());

        String one = "20100110";
        System.out.println(one.substring(0,4)+"年"+one.substring(6,7)+"月"+one.substring(6,8)+"日");
    }
}
