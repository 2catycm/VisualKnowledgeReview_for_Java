package R_几个数据结构汇总;

import java.util.ArrayList;
import java.util.TreeMap;

public class DemoTreeMap {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        TreeMap<String,String> treeMap = new TreeMap<>();
        treeMap.put("12011042","Dylan");
        treeMap.put("12010101","Alice");
        treeMap.put("12010102","Bob");
        treeMap.put("12010634","Crick");
        treeMap.put("12011042","Dylan");



        treeMap.comparator();

        System.out.println(treeMap);

        //README  使用treemap时，要么在构造treemap时传入一个比较器，要么键必须继承了comparable接口
        //否则会报错
        TreeMap<TestClass,String> map2 = new TreeMap<>();
        map2.put(new TestClass(),"Hello");

    }
}
