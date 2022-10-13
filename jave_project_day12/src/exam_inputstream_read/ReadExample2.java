package exam_inputstream_read;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
    public static void main(String[] args) {
        int readByte;
        try (InputStream fis = new FileInputStream("C:/Temp/test.txt")) {
            while (true) {
                readByte = fis.read();
                if (readByte == -1) {
                    break;
                }
                System.out.println((char) readByte);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
