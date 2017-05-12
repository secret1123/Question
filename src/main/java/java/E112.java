package java;

import java.util.ArrayList;

/**
 * Created by AnLu on
 * 2017/4/8 14:14.
 * JavaSE_20171
 */
//将一个数组中值为0的项去掉,将不为0的值存入一个新的数组,比如:
//        　　int a[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
//        　　生成的新数组为:
//        　　int b[]={1,3,4,5,6,6,5,4,7,6,7,5}
public class E112 {
    public static void main(String[] args) {
        int[] a = {1,3,4,5,0,0,6,6,0,5,4,7,6,0,5};

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                list.add(a[i]);
            }
        }
        System.out.println(list);
    }
}
