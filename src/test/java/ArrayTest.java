import org.junit.Test;

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
}
