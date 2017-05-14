package java;

/**
 * Created by AnLu on
 * 2017/5/13 08:35.
 * Question
 */
//使用 sleep 方法实现一次阻塞
public class Thread3 implements Runnable{
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread3());

        thread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("thread3 is running...");
    }



    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
