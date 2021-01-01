package R_primitiveType;

public class 无穷和不定式 {
    public static void main(String[] args) {
        double a = 1.0D/0;
        int b=1;
        try{
            b = 0/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        double b_ = 0D/0;
        double c = Double.NEGATIVE_INFINITY/Double.NEGATIVE_INFINITY;
        double d = Double.NEGATIVE_INFINITY*0;

        System.out.println(b);

        System.out.println(""+a+b_+c+d);
//        System.out.println(a.toString()+b_+c+d);//No! double had no toString method
        System.out.println(new Double(a).toString()+b_+c+d);//Yes
        System.out.println(Double.toString(a) +b_+c+d);//Yes
//        System.out.println((String)a+b_+c+d);//No! double is not a reference type
        System.out.println(+a+b_+c+d);
//        System.out.println((String)null+null);
//        System.out.println(""+null+null);
    }
}
