package java;

/**
 * Created by AnLu on
 * 2017/5/13 08:35.
 * Question
 */
// 使用 Thread 类实现多线程
public class Thread1 extends Thread{
    public static void main(String[] args) {
        Thread thread = new Thread(new Thread1());
        thread.start();
        System.out.println("thread1 is running.");
    }

    @Override
    public void run() {
        System.out.println("thread is running...");
    }
}
