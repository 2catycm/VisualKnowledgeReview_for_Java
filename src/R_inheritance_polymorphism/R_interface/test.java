package R_inheritance_polymorphism.R_interface;

public interface test {

    private int m1(){
        return 9;

    }

    static int m2(){
        return 9;
    }

    default int m3(){return 9;}

}
