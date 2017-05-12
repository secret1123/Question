package java;

/**
 * Created by AnLu on
 * 2017/3/25 09:34.
 * JavaSE_20171
 */
//定义一个 Animal 类的子类 Cat，新增两个域和两个方法
//在 Cat 类中重写父类 Animal 的三个方法
public class Cat extends Animal1 {

    String paws;//爪子
    String ear;//耳朵


    public void snap() {//捕捉

    }

    public void jump() {//跳

    }

    @Override
    public void reptile() {
        super.reptile();
    }

    @Override
    public void cry() {
        super.cry();
    }

    @Override
    public void bite() {
        super.bite();
    }
}


