package R_几个数据结构汇总;

import java.util.HashMap;

public class DemoHashMap {
    public static void main(String[] args) {

        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("12010101","Alice");
        hashMap.put("12010102","Bob");
        hashMap.put("12010634","Crick");
        hashMap.put("12011042","Dylan");
        hashMap.put("12012029","Emily");
        System.out.println(hashMap);

        System.out.println(hashMap.get("12012029"));

        System.out.println(hashMap.containsKey("12010101"));
        System.out.println(hashMap.containsKey("110"));

        //"Put" method will return the old value when it is replaced by a new one
        //If two values share the same key,the latter one will reolace the former one,
        //thus making one key only maps one single value.
        System.out.println(hashMap.put("12010101","American"));
        System.out.println(hashMap.get("12010101"));
        hashMap.put("12010928","American");
        //However,one value can map several keys.
        System.out.println(hashMap);

        System.out.println(hashMap.keySet());
        System.out.println(hashMap.entrySet());

        System.out.println(hashMap.remove("12010101"));
    }
}
