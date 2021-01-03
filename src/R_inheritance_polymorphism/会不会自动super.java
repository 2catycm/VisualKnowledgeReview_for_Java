package R_inheritance_polymorphism;

public class 会不会自动super {
    public static void main(String[] args) {
        var a  = new Sub("my constructor");
        var b  = new Sub();
        //总结：构造的时候必须自动super（），但是@override可以选择
    }
}
class Super{
    public Super(){
        System.out.println("Super is used");
    }
    private Super(String 内部构造器_不信任外部的计算结果){

    }
}
class Sub extends Super{

    public Sub() {
        System.out.println("this() is used");
    }
    public Sub(String 你的构造器){
        System.out.println("你的构造器");
    }
}