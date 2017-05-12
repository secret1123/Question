package java;

/**
 * Created by anlu on 2017/3/18.
 */
//已知圆球的体积公式为 4/3 * π * r^3,编一程序,输入圆球半径,计算并输出球的体积。
public class E5 {
    public static void main(String[] args) {
        Circle circle = new Circle(4/3,1.2,3);
        System.out.println(circle.getRadius());
    }
}

class Circle {
    double p;
    double radius;
    double r;

    public Circle(double p, double radius,double r) {
        this.p = p;
        this.radius = radius;
        this.r = r;
    }

    public double getRadius() {
        return p * radius * r;
    }
}