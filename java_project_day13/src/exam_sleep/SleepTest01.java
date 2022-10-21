package exam_sleep;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class SleepTest01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        SimpleDateFormat DF = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
        long start = System.currentTimeMillis();
        for (int x : list) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(DF.format(new Date()) + " : " + x);
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) + "ms");
        //2022/10/21 13:45:50 : 1
        //2022/10/21 13:45:51 : 2
        //2022/10/21 13:45:52 : 3
        //2022/10/21 13:45:53 : 4
        //2022/10/21 13:45:54 : 5
        //5048ms

        //2022/10/21 13:46:35 : 1
        //2022/10/21 13:46:36 : 2
        //2022/10/21 13:46:37 : 3
        //2022/10/21 13:46:38 : 4
        //2022/10/21 13:46:39 : 5
        //5042ms
    }
}
