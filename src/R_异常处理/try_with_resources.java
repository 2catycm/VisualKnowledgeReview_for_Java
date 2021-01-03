package R_异常处理;

import javax.swing.*;
import java.io.Closeable;
import java.io.IOException;

public class try_with_resources {
    public static void main(String[] args) {
        try (var in = new resources()
        ) {
            System.out.println("trying1");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (var in = new resources2()
        ) {
            System.out.println("trying2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class resources implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("auto closable");
    }
}

class resources2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("closable");
    }
}

//关系: Closeable extends AutoCloseable
//AutoCloseable 是一个更高抽象层次的接口，不一定用在 IO 上，所以它里面的 close 方法抛出的异常是 Exception，而非 IOException。
//
//Closable 是一个被具现化了的接口：只用作 IO 流上，所以 close 方法抛出的异常是 IOException。
//最后一个区别是，Closeable 方法被设计为可重复调用：可以被自动调用：故 Closeable 继承了 AutoCloseable，也可以被手动调用，所以实现了 Closeable 的类的 close 方法必须要被设计为可重复被多次调用。而 AutoCloseabe 不具体这个性质，它就是被设计为“自动关闭”的，所以实现这个接口的类的 close 方法不应该被设计为“可被多次调用”。