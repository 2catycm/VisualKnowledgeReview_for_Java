package R_primitiveType;

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
    }
}
