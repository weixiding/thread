import com.weijinhao.singleThreadExecution.EatNoodleThread;
import com.weijinhao.singleThreadExecution.TableWare;
import com.weijinhao.singleThreadExecution.TableWarePair;

/**
 * Created by qd on 2019/1/5.
 */
public class Demo03 {
    public static void main(String[] args) {
        TableWare left = new TableWare("刀子");
        TableWare reight = new TableWare("叉子");
        TableWarePair tableWarePair = new TableWarePair(left, reight);
        new EatNoodleThread(tableWarePair,"A").start();
        new EatNoodleThread(tableWarePair,"S").start();
    }
}
