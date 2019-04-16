import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

/**
 * 测试移除数组中的元素
 *
 * @author wangning040@ke.com
 * @date 2019-04-15 09:23
 */
public class IteratorTest {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(IteratorTest.class);
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list);
        // 在循环中移除元素的正确方式，使用Iterator，并发需加锁
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String item = iterator.next();
            if ("2".equals(item)) {
                iterator.remove();
            }
        }
        // 反例
        /*
        for (String item : list) {
            if ("2".equals(item)) {
                list.remove(item);
            }
        }*/
        System.out.println(list);
        // TODO wangning, 2019.04.10 上线 [2019.04.15]

        // FIXME wangning, 2019.04.10 [2019.04.11]

        System.out.println(Instant.now());

        /// 暂时被注释，以后还会使用的

        // 防止NEP
        Optional optional;

    }
}
