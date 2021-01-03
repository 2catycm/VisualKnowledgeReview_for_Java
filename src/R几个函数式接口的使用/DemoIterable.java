package R几个函数式接口的使用;

import java.util.Iterator;


//集合应实现Iterable接口，重写其中的方法iterator，该方法用于获取集合的迭代器
//迭代器应实现Iterator接口，重写其中的next和hasNext方法
//若要遍历集合，可先调用iterator方法，然后用while循环 这等效于forEach
//下面是我自己写的个集合，底层用的是数组，用于测试iterator和iterable接口

public class DemoIterable implements Iterable<String>{

    String[] array;
    int capability;
    int size;

    //创建一个内部类实现iterator接口，用于对外部类的元素进行遍历
    Iterator<String> iterator = new Iterator<String>() {

        int thisIndex = 0;

        @Override
        public boolean hasNext() {
            //特殊语法，调用外部类的同名变量，必须使用"外部类名.this.变量名"的格式
            return thisIndex < DemoIterable.this.size;
        }

        @Override
        public String next() {
            String temp = array[thisIndex];
            thisIndex ++;
            return temp;
        }
    };

    public DemoIterable(int capability){
        array = new String[capability];
        this.capability = capability;
        size = 0;
    }


    public void add(String element){
        array[size] = element;
        size ++;
    }

    public String remove(){
        String temp = array[size - 1];
        array[size] = null;
        size --;
        return temp;
    }


    @Override
    public Iterator<String> iterator() {
        return iterator;
    }


    public static void main(String[] args) {
        DemoIterable iterable = new DemoIterable(3);
        iterable.add("Hello");
        iterable.add("World");
        iterable.add("!");

        //调用迭代器进行遍历
        while(iterable.iterator().hasNext()){
            System.out.println(iterable.iterator().next());
        }
    }
}
