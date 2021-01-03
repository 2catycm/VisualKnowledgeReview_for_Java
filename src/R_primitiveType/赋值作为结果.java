package R_primitiveType;

public class 赋值作为结果 {
    public static void main(String[] args) {
        int i = 5,j=3;
        if ((j=0)==0)
            System.out.println("OK");

        i = (i=i+1)+1;
        i=  i = (i=i+1)+1 +1;
        System.out.println(i);
    }
}
