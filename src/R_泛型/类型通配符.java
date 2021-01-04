package R_泛型;


import java.util.*;

public class 类型通配符 {

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        //getUperNumber(name);//1
        getUpperNumber(age);//2
        getUpperNumber(number);//3

    }

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    //erasure 之后的方法签名不能一样

    public static void getUpperNumber2(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }
//    public static <T> void getUpperNumber3(List<T extends Number> data) {
//        System.out.println("data :" + data.get(0));
//    }//No
    public static <T extends List<? extends Number> > void getUpperNumber(T data) {
        System.out.println("data :" + data.get(0));
    }
    public static <哈哈 extends Number>  void getUpperNumber4(List<哈哈> data) {
        System.out.println("data :" + data.get(0));
    }
}

