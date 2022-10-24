package exam_network;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class URLOpenStreamTest {
    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
            URL url = new URL("https://www.hanbit.co.kr/");
            //url.openStream() 의 반환형 -
            // InputStream => InputStreamReader 로 바이트 스트림 문자 스트림으로 변환 => BufferedReader
            in = new BufferedReader(new InputStreamReader(url.openStream()));
                       //메모리에 올리기  <- //문자로 변환  <- //읽어드릴 url 가져오기.

            out = new PrintWriter(new FileWriter("index.html"));
                        //FileWriter 의 문서가 존재하면 덮어 쓸건지 이어쓸건지
            //PrintWriter 이걸 쓰면 println 사용 가능.

            String inLine;
            while ((inLine = in.readLine()) != null) { //한줄씩읽어라. null 이 아닌동안.
//                System.out.println(inLin);
                out.println(inLine); //"index.html" 에 붙여 넣어라.
            }
            System.out.println("파일이 복사 완료되었습니다.");  //복사완료. 프로젝트에 파일생성됨.
        } catch (MalformedURLException e) {
            System.out.println("URL ERROR");
        } catch (IOException e) {
            System.out.println("IO ERROR");        //IO ERROR
        } finally {
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
