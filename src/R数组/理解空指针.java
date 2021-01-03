package R数组;

public class 理解空指针 {
    public static void main(String[] args) {
        int[] a;
        a = new int[5];
//        a[0] = new int[1];//NO
        if (a!=null)
            System.out.println("YES");
//        if (a[0] ==null)//compile error : a[0] is an integer
//            System.out.println("YES");
        System.out.println(a[0]);//自动是0

        int[][] b;
        b = new int[5][];

        int[] c;
//        System.out.println(c);//compile error 无法自动初始化
        test2();

    }
    private static int[] d;
    private static void test2() {
        System.out.println(d);//null
    }
}
