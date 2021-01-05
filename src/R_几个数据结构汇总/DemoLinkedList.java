package R_几个数据结构汇总;

import java.util.LinkedList;

public class DemoLinkedList {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Good");
        list.add("Morning");
        System.out.println(list);
        list.add(0,"你好");
        list.add(list.size(), "hi");
        System.out.println(list);
        list.remove("你好");
        System.out.println(list.remove("23"));
        System.out.println(list+"op");

        list.remove(1);
        list.add(2,"Bad");
        System.out.println(list);

    }
}
