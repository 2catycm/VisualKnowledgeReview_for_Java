package R几个函数式接口的使用;

import java.util.Comparator;

public class DemoComparator<T extends Comparable> implements Comparator<T> {

    //comparator也能实现对两个元素的比较，但与comarable不同，多用于工具类或集合
    //若一个工具类实现了该接口，就可以调用该方法对传入的参数进行比较（如本demo）
    //若一个集合实现了该接口，就可以对集合中任意两个元素进行比较，然后可以排序，让它成为一个有序集
    //在实际使用时，一个集合不必自身实现该接口，而是让其内部类实现，这tring样可以实现解耦
    //同样的思路也适用于Iterator、Listener等接口的实现
    //（如。component本身并不实现listner，而是让其内部类实现）
    //值得注意的是，该方法要求所比较的两个对象的数据类型必须相同，但comparable接口并没有此要求

    //使用了泛型进行重写，提高了代码的可移植性

    @Override
    public int compare(T o1, T o2) {
        return o1.compareTo(o2);
    }

    public static void main(String[] args) {
        System.out.println(4.4%2);
        //0.40000000000000036
    }
}
