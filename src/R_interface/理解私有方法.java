package R_interface;

public interface 理解私有方法 {
//    private void test();//No.Private methods in interfaces should have a body
//    private static void test();//No.Private methods in interfaces should have a body
    private static void test(){
        System.out.println("from test");
    }
    //    private void test(){}//No.This doesn't form an override case.

    //    void implementME(){ }//No.Interface abstract methods cannot have bod
    void implementME();
    public  void main2(String[] args) ;
//    public static void main(String[] args);//No.Static methods in interfaces should have a body
public static void main(String[] args) {

}
    public float getVol(float c);


    class classInAn_interface implements 理解私有方法{
        @Override
        public void implementME() {
            test();//Yes,because inside it.
        }//must be public

        @Override
        public void main2(String[] args) {

        }

        @Override
        public float getVol(float c) {
            return 0;
        }

    }
}
