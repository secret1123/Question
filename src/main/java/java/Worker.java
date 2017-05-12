package java;

/**
 * Created by AnLu on
 * 2017/4/8 16:27.
 * JavaSE_20171
 */
//工人类
public class Worker implements People {

    private double montherSalary;

    public Worker(double montherSalary) {
        super();
        this.montherSalary = montherSalary;
    }

    @Override
    public double num() {
        return getMontherSalary()*12;
    }

    public double getMontherSalary() {
        return montherSalary;
    }

    public void setMontherSalary(double montherSalary) {
        this.montherSalary = montherSalary;
    }
}