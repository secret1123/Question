package java;

/**
 * Created by AnLu on
 * 2017/4/9 19:37.
 * JavaSE_20171
 */
public class Scientist implements People {

    private double montherSalary;
    private double projectSalary;

    public Scientist(double montherSalary,double projectSalary) {
        super();
        this.montherSalary = montherSalary;
        this.projectSalary = projectSalary;
    }

    @Override
    public double num() {
        return getMontherSalary()*12+getProjectSalary();
    }

    public double getMontherSalary() {
        return montherSalary;
    }

    public void setMontherSalary(double montherSalary) {
        this.montherSalary = montherSalary;
    }

    public double getProjectSalary() {
        return projectSalary;
    }

    public void setProjectSalary(double projectSalary) {
        this.projectSalary = projectSalary;
    }
}
