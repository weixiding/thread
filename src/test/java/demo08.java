import com.weijinhao.Balking.DocumentEditThread;

/**
 * balking设计模式的测试
 */
public class demo08 {
    public static void main(String[] args) {
        new DocumentEditThread("tmp","E:\\git_repository\\thread").start();
    }
}
