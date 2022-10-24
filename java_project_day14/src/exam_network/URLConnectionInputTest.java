package exam_network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class URLConnectionInputTest {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            URL url = new URL("https://tour.chungnam.go.kr/_prog/openapi/?func=tour&start=1&end=10");
            // 이 사이트로 부터 정보를 읽어 오자.  원하는 데이터만 추출 할 수 있다.
            URLConnection con = url.openConnection();

            System.out.println("응답헤더: " + con.getHeaderField(null)); //응답헤더: HTTP/1.1 404 Not Found
            System.out.println("문서의 타입: " + con.getHeaderField("Content-Type")); //문서의 타입: text/html
            System.out.println("/ 문서의 타입: " + con.getContentType()); /// 문서의 타입: text/html
            System.out.println("-");

            //전체 헤더 정보 출력
            Map<String, List<String>> map = con.getHeaderFields();
            //문자1개에   값이 여러개

            Set<String> set = map.keySet();
            //키값을 set 타입으로 준다.

            Iterator<String> iterator = set.iterator();
            System.out.println("-");

            while (iterator.hasNext()) {
                String key = iterator.next();
                System.out.println(key + " ---> " + con.getHeaderField(key));
            }
            //null ---> HTTP/1.1 404 Not Found
            //Server ---> Apache
            //Connection ---> keep-alive
            //Content-Length ---> 2010
            //Date ---> Mon, 24 Oct 2022 02:51:05 GMT
            //Content-Type ---> text/html


            System.out.println("\n-------------문서 내용--------------");
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inLine;
            while ((inLine = in.readLine()) != null) {
                System.out.println(inLine);    //파일로 안만들어지고 콘솔에 사이트 내용이 전부 출력됨.
            }
        } catch (MalformedURLException e) {
            System.out.println("URL ERROR");
        } catch (IOException e) {
            System.out.println("IO ERROR");
        } finally{
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e) {
                System.out.println("CLOSE ERROR");
            }
        }
    }
}
