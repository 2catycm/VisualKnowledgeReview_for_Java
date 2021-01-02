package R_Collection.R_ArrayList;

import java.util.ArrayList;

public class insertByAdd {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("C++");
        list.add("Kotlin");
        list.add("Python");
        list.add(list.indexOf("Kotlin"), "GO");
        list.remove(1);
        System.out.println(list);

    }
}
