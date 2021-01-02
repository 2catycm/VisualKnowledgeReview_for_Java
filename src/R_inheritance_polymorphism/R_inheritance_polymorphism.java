package R_inheritance_polymorphism;

public class R_inheritance_polymorphism {
    public static void main(String[] args) {
        var a = new subclass();
        subclass.test();
        test();
    }
    public static void test(){
        System.out.println("from test");
    }
}
class subclass extends R_inheritance_polymorphism {
    public static void test(){
        System.out.println("从子类打印");
    }

}

class test{
    public static void main(String[] args) {
        var b = new R_inheritance_polymorphism();
        R_inheritance_polymorphism.test();
        var c  = new subclass();
        subclass.test();
    }
}
