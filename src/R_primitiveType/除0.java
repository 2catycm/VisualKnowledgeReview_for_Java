package R_primitiveType;

public class 除0 {
    public static void main(String[] args) {
        int x = 0;
        int y = 8 / x;
        System.out.println(y);

        System.out.println(2.0/0.0);
        System.out.println(0.0/0.0);
        //浮点数运算/0不会报错，0.0/0.0=NaN  非零数/0.0 = INFINITY
    }
}
