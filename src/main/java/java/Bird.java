package java;

/**
 * Created by AnLu on
 * 2017/4/8 15:15.
 * JavaSE_20171
 */
public class Bird implements Animal {

    public void flying() {

        System.out.println("Bird do flying.");
    }

    @Override
    public void eat() {

        System.out.println("Bird do eat.");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.flying();
        System.out.println();
    }
}