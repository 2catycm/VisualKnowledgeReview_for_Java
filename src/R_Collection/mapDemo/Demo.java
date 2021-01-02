package mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo {

    private Map<String, String> courses = new HashMap<>();

    /**
     * @param number the key in hashMap which represents the number of a course
     * @param name the value in hashMap which represents the value of a course
     */
    public void addCourses(String number, String name){
        if(!courses.containsKey(number)){
            courses.put(number, name);
        }
    }

    /**
     * @param number the key in hashMap which represents the number of a course
     * @return a value in hashMap which is the name of corresponding key of the course
     */
    public String findName(String number){
        return courses.get(number);
    }

    /**
     *
     * @return a set view of the key(number) contained in this map
     */
    public Set<String> getNameSet(){
        return courses.keySet();
    }


    public static void main(String[] args) {
        Demo demo=new Demo();
        demo.addCourses("CS102A","JavaA");
        demo.addCourses("CS102B","JavaB");
        demo.addCourses("CS309","OOAD");
        demo.addCourses("CS307","Database");

        System.out.println(demo.findName("CS102A"));

        for(String name: demo.getNameSet()){
            System.out.println(name);
        }

    }


}
