package java;

/**
 * Created by AnLu on
 * 2017/4/7 10:05.
 * JavaSE_20171
 */
public class Main {
    public static void main(String[] args) {
        Foo f = new Foo("f");
        System.out.println(f.getS());//"f"
//        changeReference(f);
        modifyReference(f);
        System.out.println(f.getS());//"f"
    }

    private static void changeReference(Foo a){
//        System.out.println(a.getS());//"f"
        Foo b = new Foo("b");
        a = b;
    }

    private static void modifyReference(Foo c) {
        c.setAttribute("c");
    }
}

class Foo {
    private String s;

    public Foo(String s) {
        this.s = s;
    }

    public void setAttribute(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }
}