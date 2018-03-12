package top.treegrowth.test.chapter2;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 *
 * 本机直接内存溢出
 *
 * @author wusi
 * @version 2018/3/11 21:15.
 */
public class Chapter29 {

    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
