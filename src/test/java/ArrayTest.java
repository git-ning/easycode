import org.junit.Test;

import java.util.ArrayList;

/**
 * 数组相关操作测试
 *
 * @author wangning040@ke.com
 * @date 2019-05-06 09:54
 */
public class ArrayTest {

    @Test
    public void outOfBandTest() {
        int[] a = new int[3];
        a[3] = 10;
    }

    @Test
    public void ifElseTest() {
        int x = 2;
        if (x == 1 || x == 3) {
            System.out.println("if statement");
        }
        if (x == 2 || x == 3) {
            System.out.println("else if statement");
        }
    }

    @Test
    public void newArrayListTest() {
        // 不指定ArrayList初始大小
        Long startTime = System.currentTimeMillis();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list1.add(i);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Without init size time cost(ms): " + (endTime - startTime));

        // 指定ArrayList初始大小
        Long startTime2 = System.currentTimeMillis();
        ArrayList<Integer> list2 = new ArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            list2.add(i);
        }
        Long endTime2 = System.currentTimeMillis();
        System.out.println("With init size 100000 time cost(ms): " + (endTime2 - startTime2));
    }
}
