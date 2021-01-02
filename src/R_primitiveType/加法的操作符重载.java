package R_primitiveType;

public class 加法的操作符重载 {
    public static void main(String[] args) {
        String s = ""+1;    print(s);
        s = 1+"";           print(s);

//        int i = 1+1D;//No
        double i = 1+1f+1d;print(""+i);
//        float j  =1d;//No

        char a = '\u0000';//u表示Unicode
        print(""+a);
        a = '\uFFFF';

        s = ""+a ;
        System.out.println(s.length());

        int j = 0xface;
        System.out.println(j);
        j = 0xbee;
        System.out.println(j);
    }
    private static void print(String s){
        System.out.println(s);
    }
}
