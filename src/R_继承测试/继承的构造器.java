package R_继承测试;

public class 继承的构造器 {
    public static void main(String[] args) {
        fa fa1 = new fa(1);
        so so1 = new so();

        fa1.c = 1;
        so1.c = 1;

        fa.b = 3;
        so.b = 2;

        fa fa2 = new so();
        System.out.println(fa2.b);

    }

    public 继承的构造器() {
        super();
    }
}

