package R数组;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays的运用 {
    public static void main(String[] args) {
        int[] a = {1,3,2,6,4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.deepToString(a));//No,a只有一维，要求Object[]
    }
}
//class MyArrays extends Arrays{//No
//    @Override
//    public String toString() {
//        return super.toString();
//    }
//}