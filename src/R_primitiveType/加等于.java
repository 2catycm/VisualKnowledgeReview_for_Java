package R_primitiveType;

public class 加等于 {
    public static void main(String[] args) {
        int a = 1;
        a+=12.999F;
        a = (int)((float)a/*widening cast*/ + 12.999F) /*narrowing cast*/;
        System.out.println(a/9);
    }
}
