package demo;

/**
 * Created by Administrator on 2016/4/13.
 */
public class SuperClass {
    private int i;
    private double d;

    public SuperClass() {
    }

    public SuperClass(int i, double d) {
        this.i = i;
        this.d = d;
        m();
    }

    void m(String s) {
//        ...
    }

    public String m() {
        return null;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
//        ...
        this.i = i;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }
}

class SubClass extends SuperClass {

    private String s;

    public SubClass(int i, double d, String s) {
        super(i, d);
        this.s = s;
    }

    @Override
    public void m(String s) {
//        ...
        super.m(s);
    }
}
