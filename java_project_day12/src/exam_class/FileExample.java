package exam_class;

import java.io.*;
import java.util.*;

/*
[요구사항]
랜덤 메소드나 랜덤 클래스 등을 이용하여 정수10개 (각각의 임의의 수)를
문자열의 형태로 들어있는 파일(input.txt)을 생성한다.
생성된 파일을 읽어서 오름차순으로 정렬한 다음 정렬된 숫자를 문자열의 형태로
파일 (output.txt)에 쓰는 프로그램을 작성하라.
input.txt  ------------------> output.txt
127                             28
28                              37
37                              48
48                              127
223                             223

 */
public class FileExample {
    public static void main(String[] args) {
        try {
//
//            File file = new File("input.txt");
            FileWriter fw = new FileWriter("input.txt");
//            BufferedWriter file = new BufferedWriter(new FileWriter("input.txt"));

            Random random = new Random();

            for (int i = 0; i < 10; i++) {
//                String s = String.valueOf(random.nextInt(100)+1);
//                fw.write(s +" \n");
            fw.write(String.valueOf(random.nextInt(100)+1)); // 정수를 문자열로 변환
            fw.write("\r\n");
            }

            fw.flush();  // 꼭 해줘야 함. 파일 저장 안됨.

            System.out.println("랜덤 수가 input.txt 파일이 저장되었습니다.");

            List<Integer> list = new ArrayList<>(); // 순서대로 저장할 ArrayList 준비.

            BufferedReader in = new BufferedReader(new FileReader("input.txt"));
            //읽어온 순서대로 메모리에 올려놓을 수 있게 Buffer 사용. 한 줄씩 읽는 장점이 있다.

            String str;
            while ((str = in.readLine()) != null) {
//                list.add(str);
//                Collections.sort(list);
                int value = Integer.parseInt(str);   // 문자열을 숫자로 변환
                list.add(value);            // ArrayList 에 저장.
            }
            Collections.sort(list); // 컬렉션의 데이터를 오름차순으로 정렬.

            BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"));
            for (int i = 0; i < list.size(); i++) {
                out.write(String.valueOf(list.get(i)));
                out.write("\r\n");
            }

            System.out.println("랜덤 수가 정렬 되어 output.txt 파일이 저장되었습니다.");

            out.flush();
            out.close();
            fw.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
