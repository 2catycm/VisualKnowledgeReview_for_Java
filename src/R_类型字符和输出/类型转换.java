package R_类型字符和输出;

public class 类型转换 {
    public static void main(String[] args) {
        int a = 1;
        long b = a;
        // 没有精度损失的时候，可以自动转换

        long c = 1L;
        int d = (int)c;
        // 有精度损失的时候，需要强制转换

        father f = new father();
        son s = new son();

        father f2 = s;
        son s2 = (son)f2;

        int[] e = {};
        int z[] = new int[1];

        int t = (int) 2e32;
        int t2 = (int)(long) 2e32;
        System.out.println(t);
        System.out.println(t2);


    }
}

class father {}
class son extends father{}
