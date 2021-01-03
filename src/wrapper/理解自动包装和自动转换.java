package wrapper;

public class 理解自动包装和自动转换{
    public static void main(String[] args) {
//        var a  = true;//自动变成boolean而不是Boolean
//        if (a instanceof Boolean)// 编译错误：基本类型不能instanceof
//            System.out.println("yes");
        var b = Boolean.TRUE;//这是因为内部有：public static final Boolean TRUE = new Boolean(true);//就是enum自动的那个
        Boolean c = true;
        if (b.equals(c)) System.out.println("OK");
        boolean d = false;
//        if (d.equals(c))//No:编译错误。

        Integer e = 1;
        if (!e.equals(d)) System.out.println("YES");



    }
}
enum enumTest{
//    public static final TRUE,FALSE;//No:编译错误
    True,False;

}