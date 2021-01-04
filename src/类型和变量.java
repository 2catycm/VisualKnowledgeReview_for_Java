public class 类型和变量 {
    public static void main(String[] args) {
        System.out.println("ab" + 7 + "cd");

        byte b = (byte)0x771;
        System.out.println(b);

        int a = (int) 1.1;
        long e = 1L;
        double c = 1.2f;
        float d = (float) 1.2d;

        System.out.println(123.45e3); // 科学记数法

        //todo reference类型的变量实际是一个地址

        int t1 = 2; // 初始类无地址
        Integer t2 = 2; //？
        var t3 = new int[1]; // 引用类有地址
        t3[0] = 2;

        String t4 = new String("2");
        String t5 = "2";

        test(t1);
        test(t2);
        test(t3);
        test(t4);
        test(t5);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3[0]);
        System.out.println(t4);
        System.out.println(t5);

        String s1 = "abc";
        String s2 = new String("abc");
        String s3 = new String("abc");

        System.out.println(s1==s2); //false
        System.out.println(s2==s3); //false

    }

    static void test(int a){
        a = 1;
    }
    static void test(Integer a){
        a = 1;
    }

    static void test(String a){
        a = "1";
    }

    //todo 上面两个改不了，因为 = 意思是把 a 指向了 1 的地址
    //值变量和引用变量

    static void test(int[] a){
        a[0] = 1;
    }
    //这个能改，是因为a[0]不是地址

}
