package R_重载;

public class 深入理解varargs {
    public static void main(String[] args) {
        method(1);
        method(1F);
        method(1,2);
        method(1,2,3);
        method(1,2,3,4);
    }
    public static void method(int integer) {
        System.out.println("a");
    }
    public static void method(float one) {
        System.out.println("a");
    }

    public static void method(float one, float two) {
        System.out.println("b");
    }
    public static void method(float one,float two,float three){
        System.out.println("c");
    }
    public static void method(float...a){
        System.out.println("varargs");
    }
//    public void method(float[] a){//Same Signature
//        System.out.println("varargs");
//    }
}
