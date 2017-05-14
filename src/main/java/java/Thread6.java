package java;

/**
 * Created by AnLu on
 * 2017/5/13 08:35.
 * Question
 */
//编写一个程序，子线程循环 10 次，接着主线程循环 100 次，
// 接着又回到子线程循环 10 次，接着再回到主线程又循环 100 次，如此循环50次
public class Thread6 {

        synchronized void main() {
            while (true) {
            for (int i = 0; i <= 100; i++) {
                System.out.println("super" + i);
            }
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.notifyAll();
            }
        }

        synchronized void sub() {
            while (true) {
            for (int i = 0; i <= 10; i++) {
                System.out.println("sub" + i);
            }
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.notifyAll();
            }
        }
    }

    class ThreadTest implements Runnable{
    private static Thread6 thread6 = new Thread6();

    public static void main(String[] args) {

        ThreadTest th = new ThreadTest();
        for (int i = 0; i <= 50; i++) {
            Thread thread = new Thread(th,"thread"+i);
        thread.start();
        }
    }
    @Override
    public void run() {
        thread6.main();
        thread6.sub();
    }
}
