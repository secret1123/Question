package java;

/**
 * Created by AnLu on
 * 2017/4/9 19:40.
 * JavaSE_20171
 */
public class Waiter implements People {

    private double montherSalary;

    public Waiter(double montherSalary) {
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
