package R_重载;

import javax.sound.midi.MetaEventListener;

public class 方法的overload {
    public static void main(String... args) {
        method(null);
        var_args("1","2","3");
//        var_args({"1", "2", "3"});//No

        String[] a = {"1", "2", "3"};
//        var b = {"1", "2", "3"};//NO

        var_args(a);//YES
        var_args(new String[]{"1", "2", "3"});

        var_args(1,2,3);

//        var b = {1, 2, 3};//No
//        var_args({1,2,3});//No
        var_args(new int[]{1, 2, 3});

        我是一个泛型方法(null);
        我是一个泛型方法("String");
        我是一个泛型方法(1);
    }
    public float method(float a,float b){return 0F;}
//    public int method(float a,float b){}//NO
    public int method(int a,float b){return (int) 0F;}//YES
    public int method(double a,float b){return (int) 0F;}//YES
    private int method(String a,String b){return 0;}//YES

    private int method(String a,Object b){return 0;}//YES
//    public int method(String a,Object b){return 0;}//NO!修饰符不作为方法不一样的依据
//    private static int method(String a,Object b){return 0;}//NO!修饰符不作为方法不一样的依据

    public static void method(String a){
        System.out.println("from String");
    }
    public static void method(Object a){
        System.out.println("from Object");
    }


//    public static void var_args(String[] args){
//
//    }
    public static void var_args(String...args){
        for (var i:args){
            System.out.println(i);
        }
    }
    public static void var_args(int...args){
        for (var i:args){
            System.out.println(i);
        }
    }

    public static void 我是一个泛型方法(String string){//我不是泛型方法

    }
    public static <Ti> void 我是一个泛型方法(Ti mi){
        System.out.println(mi.toString());//动态绑定
    }
}
