package R_enum;

import javax.xml.transform.Source;

public enum 我才是enum {
        RED,
        GREEN(1),
        YELLOW(2);
        private int id;

        private 我才是enum(int id) {
            this.id = id;
        }

        private 我才是enum() {
        }
//        public 我才是enum(int id,int id2){//enum的构造方法是自动私有的
//
//        }
    public void 我是方法(){

    }
    public static void 我也是方法(){//强调：static不能作为方法签名的一部分

    }
    private static void 我还是方法(){

    }
    private void 你不能说我不是方法(){
        System.out.println("OK");
    }

    public static void main(String[] args) {
        RED.你不能说我不是方法();
    }
}
