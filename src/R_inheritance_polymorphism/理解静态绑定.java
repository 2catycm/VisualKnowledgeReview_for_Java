package R_inheritance_polymorphism;

public class 理解静态绑定 {
    public static void 方法() {
        System.out.println("理解得不够深入哦");
    }
}
class 深入理解静态绑定 extends 理解静态绑定 {
    //@Override//No
    public static void 方法() {
        System.out.println("理解得非常深入");
    }
}
class TestClient{
    public static void main(String[] args) {
        理解静态绑定 super_class = new 深入理解静态绑定();
        super_class.方法();
        ((深入理解静态绑定)super_class).方法();
    }
}