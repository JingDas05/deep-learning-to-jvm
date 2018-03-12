package top.treegrowth.test.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * java堆溢出
 *
 * @author wusi
 * @version 2018/3/11 20:24.
 */
public class Chapter23 {

    static class OOMObject {
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
