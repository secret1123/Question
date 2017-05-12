package java;

import java.util.ArrayList;

/**
 * Created by AnLu on
 * 2017/4/1 13:47.
 * JavaSE_20171
 */
//5. 定义一个方法，实现数组的转置输出.例如： 源数组，1 2 3 4 5 6 转置之后的数组，6 5 4 3 2 1
public class E10 {
    public static void main(String[] args) {

        String[] array_old = {"1", "2", "3", "4", "5", "6"};
        ArrayList<String> array_new_list = new ArrayList<String>();
        String[] array_new = new String[array_old.length];
        for (int i = 1; i <= array_old.length; i++) {
            array_new_list.add(array_old[array_old.length - i]);
        }
        array_new = array_new_list.toArray(array_new);
        for (int j = 0; j < array_new.length; j++) {
            System.out.print(" ");
            System.out.print(array_new[j]);
        }
    }
}
