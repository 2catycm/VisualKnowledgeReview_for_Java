package R正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegularExpression {
    public static void main(String[] args) {
        String regex = "Hel{2}[^ei]World\\D";
        //构造pattern类不能使用构造器，而是要调用静态的compile方法！！
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("HelloWorld!");
        System.out.println(matcher.find());

        matcher = pattern.matcher("HeloWorld ");
        System.out.println(matcher.find());

        matcher.reset("HellWorld ");
        System.out.println(matcher.matches());

        String a = "\"HellWorld \"";
        matcher.reset(a);
        System.out.println(matcher.matches());
        System.out.println(matcher.find());
    }
}
