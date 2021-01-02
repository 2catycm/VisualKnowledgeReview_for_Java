package wrapper;
//TODO 没理解，好像是能变的。
public class immutable {
    public static void main(String[] args) {
        Integer a = 1;
        System.out.println(a);
        Integer b = 1;
        a = b;
        System.out.println(a);

        a = 2;
        System.out.println(a);

        b = 3;
        System.out.println(b);
    }
}
