package R_enum;

public class enum的本质 {

}
class 模拟enum{
    public static final 模拟enum RED = new 模拟enum();//我没有id//其实默认是0了
    public static final 模拟enum GREEN = new 模拟enum(1);
    public static final 模拟enum YELLOW = new 模拟enum(2);
    public 模拟enum(int id) {
        this.id = id;
    }
    public 模拟enum() {
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
