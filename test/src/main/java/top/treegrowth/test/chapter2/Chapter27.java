package top.treegrowth.test.chapter2;

/**
 * @author wusi
 * @version 2018/3/11 21:01.
 */
public class Chapter27 {

    public static void main(String[] args) {

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);

        String str1 = new StringBuilder("中国").append("钓鱼岛").toString();
        System.out.println(str1.intern() == str1);


    }
}
