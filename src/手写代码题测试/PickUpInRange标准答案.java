package 手写代码题测试;

import java.util.ArrayList;
import java.util.Arrays;

public class PickUpInRange标准答案 {
    public static void main(String[] args) {
        int[][] b = {
                {1,-2,0,3},
                {2,-4,3,3}
        };
        System.out.println(Arrays.deepToString(pickUpSomething(b,1,3)));
    }

    private static int[][] pickUpSomething(int[][] a, int x, int y) {
        int[][] result = new int[a.length][];
        for (int i = 0; i < a.length; i++) {
            int[] temp = new int[a[i].length];
            int count = 0;
            for (int n:a[i])
                if (x<=n&&n<=y) temp[count++] = n;//点评：这个++用的好
            //方法1
            int[] row = Arrays.copyOf(temp,count);
            result[i] = row;
            //方法2：官方答案：比较快，内部用c++实现
            int[] row2 = new int[count];
            System.arraycopy(temp,0,row,0,count);//源数组，从哪开始源数组，目标数组，从哪开始，多少个
        }
        return result;
    }
}
