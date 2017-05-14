package java;

/**
 * Created by AnLu on
 * 2017/5/13 08:35.
 * Question
 */
//使用 Runnable 接口实现多线程
public class Thread2 implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread2());
        thread.start();
        System.out.println("Thread2 is running...");
    }


    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
