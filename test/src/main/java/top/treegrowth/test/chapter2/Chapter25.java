package top.treegrowth.test.chapter2;

/**
 *
 * 创建线程导致内存溢出异常
 *
 * @author wusi
 * @version 2018/3/11 20:47.
 */
public class Chapter25 {

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }

    public static void main(String[] args) throws Throwable {
        Chapter25 oom = new Chapter25();
        oom.stackLeakByThread();
    }
}
