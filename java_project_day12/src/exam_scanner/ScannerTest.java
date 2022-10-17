package exam_scanner;

import java.io.*;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) throws IOException {
        Scanner s =null;
        PrintWriter out = null;
        int sum = 0;

        out = new PrintWriter(new FileWriter("ScannerTest.txt"));
//        out.println("567,123,200");

        out.println("15");
        out.println("9.5");
        out.println("7");
        out.println("Java");
        out.println("3");

        out.flush();

        s = new Scanner(new BufferedReader(new FileReader("ScannerTest.txt")));

//        s.useDelimiter(",");  //콤마를 분리자로 사용.

        while (s.hasNext()) {  // 콤마로 나누어진 토큰이 존재합니까?
//            System.out.println(s.next());  //네 존재 합니다.
                                                    //567
                                                    //123
                                                    //200
            if (s.hasNextInt()) {  // 정수가 맞습니까.
                sum += s.nextInt();  // 정수만 sun에 저장.
            } else {  // 정수가 아닌걸 읽어오기만 하는 (커서를 다음으로 옮기기위헤)
                s.next();  //출력 안하고 넘어가기.
            }
        }
        System.out.println("정수의 합 : " + sum);
                                //정수의 합 : 25

        if (s != null) {
            s.close();
        }
        if (out != null) {
            out.close();
        }
    }
}
