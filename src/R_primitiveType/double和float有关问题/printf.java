package R_primitiveType.double和float有关问题;

public class printf {
    public static void main(String[] args) {
//        System.out.printf("%。2f",0.199);//标点符号写错：UnknownFormatConversionException: Conversion = '。'
        System.out.printf("%2f\n",0.199);
        System.out.printf("%.2f\n",0.199);

        System.out.printf("%06.2f\n",0.198);
        System.out.printf("%-6.2f\n",0.198);

        System.out.printf("%66.2f\n",0.198);
    }
}
