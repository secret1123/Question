package java;

/**
 * Created by AnLu on
 * 2017/5/13 08:36.
 * Question
 */
//编写一个程序，开启3个线程，这3个线程的 Name 分别为 A、B、C，
// 每个线程将自己的 Name 在屏幕上打印10遍，要求输出结果必须按
//ABC 的顺序显示；如：ABCABC….依次递推
public class Thread7 {
    public synchronized void test() {
        System.out.println(Thread.currentThread().getName() + "A");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "B");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "C");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Thread7Test implements Runnable {

    private static Thread7 thread7 = new Thread7();

    @Override
    public void run() {
        thread7.test();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Thread7Test(), "thread");
            thread.start();
        }
    }
}