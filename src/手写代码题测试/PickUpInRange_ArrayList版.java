package 手写代码题测试;

import java.util.ArrayList;
import java.util.Arrays;

public class PickUpInRange_ArrayList版 {
    public static void main(String[] args) {
        int[][] b = {
                {1,-2,0,3},
                {2,-4,3,3}
        };
        System.out.println(Arrays.deepToString(pickUpInRange(b,1,3)));
    }
    public static int[][] pickUpInRange(int[][] a,int x,int y){
        int rowsCnt = a.length;
        int[][] result = new int[rowsCnt][];
        for (int i = 0; i < rowsCnt; i++) {
            ArrayList<Integer> resultRow = new ArrayList<>();
            for (int number :
                    a[i]) {
                if (x<=number&&number<=y)
                    resultRow.add(number);
            }
//            result[i] = resultRow.toArray(new Integer[0])  ;
            int[] thisRow = new int[resultRow.size()];
            for (int j = 0; j < resultRow.size(); j++)
                thisRow[j] = resultRow.get(j);
            result[i] = thisRow;
        }
        return  result;
    }
}
