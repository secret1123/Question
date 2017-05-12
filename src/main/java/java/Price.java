package java;

/**
 * Created by AnLu on
 * 2017/3/25 10:05.
 * JavaSE_20171
 */
//编写一个程序，演示基本数据类型作为参数时，Java 采用的是值传递
public class Price {
    int i;

    public Price(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        int i = 1;
        System.out.println();
        price(2);
    }

    public static void price(int i) {

        System.out.println(i);
         i++;
        System.out.println(i);
    }
}
