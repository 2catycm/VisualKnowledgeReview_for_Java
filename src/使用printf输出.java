public class 使用printf输出 {
    public static void main(String[] args) {
        int i = 15;
        System.out.printf("%#x\n",15); //0xf
        System.out.printf("%x\n",15);//f 十六进制
        System.out.printf("%#o\n",15);//017
        System.out.printf("%o\n",15);//17 八进制
        System.out.printf("%b\n",15);// true boolean

        System.out.printf("%-9d\n",15);// 左对齐，占9位
        System.out.printf("%09d\n",15);// 左补零，占9位
        System.out.printf("%+09d\n",15);// 带符号
        System.out.printf("%+-9d\n",15);// 带符号，左对齐
        //fixme java里没有 %lf %ld

    }
}
