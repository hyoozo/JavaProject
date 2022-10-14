package exam_buffered_stream;

import javax.swing.plaf.SeparatorUI;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.time.LocalDateTime;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception{
        FileInputStream fis1= null;
        FileInputStream fis2 = null;
        BufferedInputStream bis = null;
        long start = 0;
        long end = 0;

        fis1 = new FileInputStream("C:/ImageTest/slide-1.jpg");
        start = System.currentTimeMillis();
        while (fis1.read() != -1) {

        }
        end = System.currentTimeMillis();
                //currentTimeMillis() 현재시간을 구하거나, 프로그램이 수행된 시간을 구하는 것
        System.out.println("사용하지 않았을때: " + (end - start) + "ms");
        fis1.close();

        fis2 = new FileInputStream("C:/ImageTest/slide-1.jpg");
        bis = new BufferedInputStream(fis2);

//        bis = new BufferedInputStream(new FileInputStream("C:/ImageTest/slide-1/jpg"));
        start = System.currentTimeMillis();
        while (bis.read() != -1) {

        }
        end = System.currentTimeMillis();
        System.out.println("사용했을 때: " + (end - start) + "ms");
        bis.close();
        fis2.close();
        System.out.println(LocalDateTime.now());
        //2022-10-14T14:15:48.246516900


    }
}
