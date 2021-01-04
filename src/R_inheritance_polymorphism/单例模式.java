package R_inheritance_polymorphism;

public class 单例模式 {
    private 单例模式(){

    }
    public static 单例模式 getInstance(){
         return new 单例模式();
    }
    public void methodTest(){
        System.out.println("Hello");
    }
}
enum enum实现单例模式{
    INSTANCE;
    public void methodTest(){
        System.out.println("From enum");
    }
}
class testClient{
    public static void main(String[] args) {
        单例模式.getInstance().methodTest();
        enum实现单例模式.INSTANCE.methodTest();
    }
}
