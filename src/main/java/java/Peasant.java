package java;

/**
 * Created by AnLu on
 * 2017/4/9 19:31.
 * JavaSE_20171
 */
public class Peasant implements People {

    private double montherSarlary;

    public Peasant(double montherSarlary) {
        super();
        this.montherSarlary= montherSarlary;
    }

    @Override
    public double num() {
        return getMontherSarlary()*12;
    }

    public double getMontherSarlary() {
        return montherSarlary;
    }

    public void setMontherSarlary(double montherSarlary) {
        this.montherSarlary = montherSarlary;
    }
}
