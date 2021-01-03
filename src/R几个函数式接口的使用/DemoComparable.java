package R几个函数式接口的使用;

public class DemoComparable implements Comparable<DemoComparable>{

    int ID;
    static int cout;

    public DemoComparable(){
        ID = cout;
        cout++;
    }

    //若要进行比较必须实现comparable<T>接口
    //T表示比较对象的数据类型
    //所比较的两个数据类型可以不同
    //
    //编程规范：compareTo方法必须满足以下性质
    //
    //自反性
    //sgn(x.compareTo(y)) == -sgn(y.compareTo(x))
    //
    //传递性
    //{@code (x.compareTo(y) > 0 && y.compareTo(z) > 0)} implies
    //     * {@code x.compareTo(z) > 0}
    //@code x.compareTo(y)==0}
    //     * implies that {@code sgn(x.compareTo(z)) == sgn(y.compareTo(z))}
    @Override
    public int compareTo(DemoComparable o) {
        return ID - o.ID;
    }
}
