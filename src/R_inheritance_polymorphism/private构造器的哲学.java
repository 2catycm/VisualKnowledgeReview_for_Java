package R_inheritance_polymorphism;

public class private构造器的哲学 {
    public static void main(String[] args) {
//        namespaceSTD a = new namespaceSTD();//No
        namespaceSTD a = namespaceSTD.输入密码构造对象(null);
//        Math math = new Math();//No
    }

}
class namespaceSTD{
    private namespaceSTD(){
        System.out.println("How dare you");
    }
    public static namespaceSTD 输入密码构造对象(String 密码){
        return new namespaceSTD();
    }
}