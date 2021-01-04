package R正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegularExpression {
    public static void main(String[] args) {
        String regex = "Hel{1}[^ei]World\\W";
        //构造pattern类不能使用构造器，而是要调用静态的compile方法！！
        //太神奇了
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher("HelloWorld!");
        System.out.println(matcher.find());
    }
}
