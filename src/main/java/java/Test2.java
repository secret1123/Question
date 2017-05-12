package java;

/**
 * Created by AnLu on
 * 2017/4/22 09:12.
 * JavaSE_20171
 */
public class Test2 {
    public static void main(String[] args) {
        int[] ints = null;
        try {
            ints = new int[10];
            for (int i = 0; i < ints.length; i++) {
                System.out.println(i);
            }
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        System.out.println(ints.length);
    }
}
