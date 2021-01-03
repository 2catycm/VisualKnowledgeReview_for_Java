package R_primitiveType;

public class double精度问题 {
    public static void main(String[] args) {
        double t = 0.2;
        for (int i = 0; i < 50; i++) {
            System.out.println(t);
            double error =  (Math.abs(t-0.2)/0.2) ;
            System.out.println("当前相对误差："+ error );//out和err的频道不一样
            System.err.println("当前相对误差："+ error );//out和err的频道不一样
            System.out.println();
            t = 1 - 4*t;

            //根本原因：0.2的二进制数是无限循环小数，计算机只能处理二进制，所以计算十进制正常小数可能就会不准。
        }
    }
}
