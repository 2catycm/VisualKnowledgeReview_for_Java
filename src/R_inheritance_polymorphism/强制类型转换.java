package R_inheritance_polymorphism;

public class 强制类型转换 {
    public static void main(String[] args) {
        Shape y  =new Shape();
        Circle x  = (Circle) y;
    }
}
class Shape{

}
class Circle extends Shape{

}