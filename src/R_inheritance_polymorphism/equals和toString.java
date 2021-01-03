package R_inheritance_polymorphism;

public class equals和toString {
    public static void main(String[] args) {
        var a = new equals和toString();
        a.toString();
        a.equals("b");

        a.equals(1.0);
        a.equals(true);
        a.equals(' ');


        Object b = null;
        if (            b.equals(null))//NullPointerException
            System.out.println("Yes");

        Object c = 1;
        if (c instanceof Integer)
            System.out.println("Yes");
    }
}
