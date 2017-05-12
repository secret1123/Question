package java;

/**
 * Created by AnLu on
 * 2017/4/9 19:41.
 * JavaSE_20171
 */
public class PeopleTest {

    public static void main(String[] args) {
        PeopleTest peopleTest = new PeopleTest();
        Worker w = new Worker(1000);
        System.out.println("工人的年薪为："+w.num()+"元");
        Peasant p = new Peasant(2500);
        System.out.println("农民的年薪为："+p.num()+"元");
        Teather t = new Teather(4500,50);
        System.out.println("教师的年薪为："+t.num()+"元");
        Scientist s = new Scientist(10500,3000);
        System.out.println("科学家的年薪为："+s.num()+"元");
        Waiter r = new Waiter(3000);
        System.out.println("服务生的年薪为："+r.num()+"元");
    }
}
