package exam_network;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodingTest {
    public static void main(String[] args) {
        String strEncoding;
        try {
            strEncoding = URLEncoder.encode("JAVA 안녕하세요  ! @ # $ % ^ &12344", "utf-8");
            String strDecoding = URLDecoder.decode(strEncoding, "utf-8");

            System.out.println("인코딩된 문자열: " + strEncoding);
                        //인코딩된 문자열: JAVA+%EC%95%88%EB%85%95%ED%95%98%EC%84%B8%EC%9A%94++%21+%40+%23+%24+%25+%5E+%2612344
            System.out.println("디코딩된 문자열: " + strDecoding);
                        //디코딩된 문자열: JAVA 안녕하세요  ! @ # $ % ^ &12344
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
