import com.sun.source.tree.TryTree;

import java.io.Closeable;
import java.io.IOException;

public class R_异常处理 {
    public static void main(String[] args) {
        try (var in =  new resources()
        ){
            System.out.println("trying1");
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (var in =  new resources2()
        ){
            System.out.println("trying2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class resources implements AutoCloseable{

    @Override
    public void close() throws Exception {
        System.out.println("auto closable");
    }
}
class resources2 implements Closeable{

    @Override
    public void close() throws IOException {
        System.out.println("closable");
    }
}