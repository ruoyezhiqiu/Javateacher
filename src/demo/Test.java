package demo;

/**
 * Created by Administrator on 2016/4/13.
 */
public class Test {

    private int x;
    private int y;

    public void m() {

        if (x + y > 0) {
//            ...
            return;
        }

//        ...


    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println(Math.max(x, y));
    }

    public void recursive() { // 递归算法
//        ...\
        recursive();
//        ...
    }

}
