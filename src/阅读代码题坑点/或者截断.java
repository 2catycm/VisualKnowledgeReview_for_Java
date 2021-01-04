package 阅读代码题坑点;

public class 或者截断 {
    public static void main(String[] args) {
        int a = 2, b =  1;
        if(a > 1 || (b = 4) > 3)
            System.out.println(b);
    }
}
