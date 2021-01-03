package R_inheritance_polymorphism;

public class 深入理解动态绑定 {
    public static void main(String[] args) {
        var a = new subclass();
        subclass.test();
        test();
    }
    public static void test(){
        System.out.println("from test");
    }
}
class subclass extends 深入理解动态绑定 {
    public static void test(){
        System.out.println("从子类打印");
    }

}

class test{
    public static void main(String[] args) {
        var b = new 深入理解动态绑定();
        深入理解动态绑定.test();
        var c  = new subclass();
        subclass.test();
    }
}
