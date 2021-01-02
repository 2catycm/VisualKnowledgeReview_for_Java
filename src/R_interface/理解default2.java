package R_interface;

public class 理解default2 {
    public static void main(String[] args) {
        var a = new Student() {
            @Override
            public String getName() {
                return "from inner class";
            }
        };
        System.out.println(a.getName());
    }
    private static interface Person{
        default String getName(){return "1";}
    }

    private static interface Named{
        default String getName(){return "2";}
    }

    private static abstract class Student implements Person,Named{
        @Override
        public abstract String getName();
    }
}

