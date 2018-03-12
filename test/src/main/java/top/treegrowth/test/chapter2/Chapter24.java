package top.treegrowth.test.chapter2;

/**
 *
 * 虚拟机栈和本地方法栈
 *
 * @author wusi
 * @version 2018/3/11 20:41.
 */
public class Chapter24 {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) throws Throwable {
        Chapter24 oom = new Chapter24();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length:" + oom.stackLength);
            throw e;
        }
    }
}
