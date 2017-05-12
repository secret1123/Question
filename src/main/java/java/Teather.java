package java;

/**
 * Created by AnLu on
 * 2017/4/9 19:34.
 * JavaSE_20171
 */
public class Teather implements People {

    private double montherSalary;
    private double daySalary;

    public Teather(double montherSalary,double daySalary) {
        super();
        this.montherSalary=montherSalary;
        this.daySalary = daySalary;
    }

    @Override
    public double num() {
        return getMontherSalary()*12+getDaySalary()*365;
    }

    public double getMontherSalary() {
        return montherSalary;
    }

    public void setMontherSalary(double montherSalary) {
        this.montherSalary = montherSalary;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }
}
