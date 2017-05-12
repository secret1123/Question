package java;

/**
 * Created by AnLu on
 * 2017/4/8 15:17.
 * JavaSE_20171
 */
public class Fish implements Animal {

    public void swimming() {

        System.out.println("Fish do swimming.");
    }

    @Override
    public void eat() {

        System.out.println("Fish do eat.");
    }

    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.eat();
        fish.swimming();
        System.out.println();
    }
}
