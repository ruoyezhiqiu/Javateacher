package demo;

/**
 * Created by Administrator on 2016/4/13.
 */
//class = fields + methods
public interface InterfaceTest extends A, B, C, D {
    int ONE_TWO_THREE = 123;
    void method();
}

interface A {

}

interface B {

}

interface C {

}

interface D {

}

class ClassTest {
    private int i;
    public void method() {
        D d = new D() {
            @Override
            public String toString() {
                return super.toString();
            }
        };
    }

    static  { // static block
//        ...
    }

    class InnerClass{}

}
