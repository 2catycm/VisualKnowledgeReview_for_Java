package R_interface;

public class 理解default1 {
    public static void main(String[] args) {
        var a = new Student();
        System.out.println(a.getName());
    }
    private interface Person{
        default String getName(){return "1";}
    }
    private interface Named{
        default String getName(){return "2";}
    }
    private static class Student implements Person, Named {
        @Override
        public String getName() {
            return Named.super.getName();
        }
    }
}
//private interface Person{ //No
