package R_primitiveType;

public class 加加 {
    public static void main(String[] args) {
        int i = 1,j = 1;
        i = i++ + ++j;
        j = j++ + ++i;
        System.out.println("i="+i+"j="+j);

        int i0 = 1;
        int j0 = 1;
        i0 = i0 + 1;
        j0 = j0 + 1;
        i0 = i0 + j0;

        int var5 = j0++;
        ++i0;
        j0 = var5 + i0;
    }
}
