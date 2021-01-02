package R_primitiveType;

public class 进制问题 {
    public static void main(String[] args) {
        int a = 127;
        int b = 0177;//Octal integer '0177'
        int c = 0x7F;
        c = 0x000000007F;
//        b = 018;//No,0 represents 8进制/
        int d = 0b100;
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(b==c);

        d= d<<3;//*2^n 就是 <<3
        d= d>>2;
        int e = 8;
        int f = 9;
        System.out.println(9|10);
        System.out.println(9&10);
        System.out.println(8|10);
        System.out.println(8|10);
        System.out.println(~d);//8=0b1000
        System.out.println(0b1000);//8=0b1000
        System.out.println(0b11110001);
        System.out.println(0b11111111111111111111111111110111);
        System.out.println(~0);//i + ~i = -1
        System.out.println(2^1);
        System.out.println(2^3);
        System.out.println(8^1);
        System.out.println(9^1);
    }
}
