package R_常量池问题;

public class String是不可变的 {
    public static void main(String[] args) {
        String a = "123";
        a = "1";//改变了地址，不是改变值
    }
}
