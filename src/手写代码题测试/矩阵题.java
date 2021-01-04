package 手写代码题测试;

public class 矩阵题 {
    public static int[][] multiply(int[][] a,int[][] b){//by ycm in assignment2
        int l_ax=a.length;
        int l_ay=a[0].length;
        int l_bx=b.length;
        int l_by=b[0].length;
        if (l_ay!=l_bx) return null;
        int[][] r = new int[l_ax][l_by];
        for (int x = 0; x < l_ax; x++)
            for (int y = 0; y < l_by; y++)
                //for every point in target array
                for (int k = 0; k < l_ay; k++)
                    r[x][y]+=a[x][k]*b[k][y];


        return r;
    }

    public static void main(String[] args) {

    }
}
