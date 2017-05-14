package java;

/**
 * Created by AnLu on
 * 2017/5/13 08:35.
 * Question
 */
//使用 wait 方法实现一次阻塞
public class Thread5 implements Runnable{
    public static void main(String[] args) {
        Thread5 th5 = new Thread5();
        Thread thread = new Thread(new Thread5(),"th5");
        thread.start();
        th5.waitTest();


        System.out.println("thread5 is running...");
    }

    synchronized void waitTest(){
        System.out.println(Thread.currentThread().getName()+"start...");

        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName()+"end...");
    }



    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
