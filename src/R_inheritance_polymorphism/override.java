package R_inheritance_polymorphism;

public class override {
    public static void main(String[] args) {
        // 私有方法不能继承也无法重写
        //  访问修饰符在重写时不能比原方法更严格

        //变量调用最近的。
        new B();
        new C();
    }
}
class A {
    protected int x = 0;
    protected int getY(){return -1;}
    A(){
        System.out.println("from A"+getY());
    }
}
class B extends A{
    protected int x = 1;
//    private int getY(){return -1;}//No: 太严格了
    public int getY(){return -2;}
    B(){
//        System.out.println(x);
//        System.out.println(((A)this).x);
////        System.out.println((A.this.x);//No,这个是用在内部类里面的
//        System.out.println(super.x);//等价

        System.out.println("from B"+((A)this).getY());
        System.out.println("from B"+super.getY());
    }
}
class C extends B{
    private int x = 1;
    public int getY(){return -3;}
    C(){
//        System.out.println(((A)this).x);
        System.out.println("from C"+getY());
        System.out.println( ((A)this).getY());
    }
}
//其实可以理解为变量只有继承,没有覆盖;子类中从父类继承的变量其实是supper.i,跟之类自己定义的 this.i 不冲突。