package R_primitiveType;

import R数组.ArrayList转换为Array;

public class 加等于 {
    public static void main(String[] args) {
        int a = 1;
        a+=12.999F;
        a = (int)((float)a/*widening cast*/ + 12.999F) /*narrowing cast*/;
        System.out.println(a/9);

        //乘等于
        int b = 2;
        b*=20.6D;//(int)((double)b * 20.6D完全类似的
        System.out.println(b);

        int c = 4;
        c%=3.34;
        System.out.println(c);

        double e = 4.4;
        e%=2.0;
        System.out.println(e);
    }
}
