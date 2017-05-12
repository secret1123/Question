package java;

import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by AnLu on
 * 2017/4/1 13:46.
 * JavaSE_20171
 */
//3. 使用键盘录入一个字符串，获取字符串中每一个字符出现的次数，要求统计结果格式为：a(5),b(4),c(3),d(2),e(1)
public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input string:  ");
        String s = scanner.nextLine();
        Hashtable<Character, Integer> hashtable = new Hashtable<>();
        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            hashtable.put(chars[i], 0);
        }
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            hashtable.put(aChar, hashtable.get(aChar) + 1);
        }
        for (Character character : hashtable.keySet()) {
            System.out.println(character + "出现次数为: " + "\t"  + "\t" + hashtable.get(character)+"次");
        }
        System.out.println("----------------");
    }
}