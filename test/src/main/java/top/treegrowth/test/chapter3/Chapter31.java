package top.treegrowth.test.chapter3;

/**
 * @author wusi
 * @version 2018/3/12 7:20.
 */
public class Chapter31 {
    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    /**
     * 这个成员属性的唯一意义就是占点内存，以便在能在GC日志中看清楚是否有回收过
     */
    private byte[] bigSize = new byte[2 * _1MB];

    public static void main(String[] args) {
        Chapter31 objA = new Chapter31();
        Chapter31 objB = new Chapter31();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        // 假设在这行发生GC，objA和objB是否能被回收？
        System.gc();
    }
}
