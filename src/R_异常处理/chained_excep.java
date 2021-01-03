package R_异常处理;

public class chained_excep /*throws只能在方法后写*/{
    public static void main(String[] args) throws Exception{
        try {
            method1();
        }catch (Exception e){
            //e.printStackTrace();
            throw new Exception("exce from main",e);
        }
    }

    private static void method1() throws Exception {
        //System.out.println("exce from method 1");
        try {
            method2();
        } catch (Exception e) {
            throw new Exception("exce freom method 1",e);
        }

    }
    private static void method2() throws Exception {
        //System.out.println("exce from method 1");
        throw new Exception("exce freom method 2");
    }

}

