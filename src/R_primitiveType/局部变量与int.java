package R_primitiveType;

public class 局部变量与int {
    public static int Non_Local;
    public static void main(String[] args) {
        int local;
//        System.out.println(local);//compile error
        System.out.println(Non_Local);
    }
}
