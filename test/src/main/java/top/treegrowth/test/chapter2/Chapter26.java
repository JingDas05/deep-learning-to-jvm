package top.treegrowth.test.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 运行时常量池内存溢出
 *
 * @author wusi
 * @version 2018/3/11 20:58.
 */
public class Chapter26 {

    public static void main(String[] args) {
        // 使用List保持着常量池引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<String>();
        // 10MB的PermSize在integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
