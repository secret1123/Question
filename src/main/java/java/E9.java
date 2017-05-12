package java;

import java.util.ArrayList;

/**
 * Created by AnLu on
 * 2017/4/1 13:46.
 * JavaSE_20171
 */
//4. 将如下两个数组中重复的元素存入一个新的数组
//        [89,90,77,87,66,54,328,890,99]
//        [65,72,12,77,2,96,54,27,89]
public class E9 {
    public static void main(String[] args) {
        int[] ints = {89, 90, 77, 87, 66, 54, 328, 890, 99};
        int[] ints1 = {65, 72, 12, 77, 2, 96, 54, 27, 89};


        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints1.length; j++) {
                if (ints[i] == ints1[j]) {
                    arrayList.add(ints[i]);
                }

            }
        }
                System.out.println("新的数组： " + arrayList);
    }
}
