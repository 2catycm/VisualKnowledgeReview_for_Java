package R数组;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList转换为Array {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>(10);
        stringArrayList.add("0");
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        stringArrayList.add("4");
        stringArrayList.add("4");
        Object[] stringArray0 =             stringArrayList.toArray();//Not Recommended,没有使用泛型编程(generic programming)
        //toArray得到的是新的Object[]
//        String[] stringArray1 =             stringArrayList.toArray();//No!
//        String[] stringArray1 = (String[])  stringArrayList.toArray();//No!

        String[] stringArray2 =             stringArrayList.toArray(new String[0]);//OK
        //我传递的实质是 传递了一个类型,让它知道他转换的目标,是什么array


        stringArray0[4] = "5";
//        stringArray1[4] = "5";
        stringArray2[4] = "5";

        System.out.println(Arrays.toString(stringArray0));
//        System.out.println(Arrays.toString(stringArray1));
        System.out.println(Arrays.toString(stringArray2));

    }
}
