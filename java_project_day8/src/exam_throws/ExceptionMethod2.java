package exam_throws;

import java.io.IOException;

public class ExceptionMethod2 {
    public static void main(String[] args) {
        try {
            System.out.println(readString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static String readString () throws IOException {
        byte[] buf = new byte[100];
        System.out.println("문자열을 입력하시오 :");
        int readCount = System.in.read(buf);
        return new String(buf, 0, readCount -2);
    }
}
