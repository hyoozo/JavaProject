package exam_collection_set;

import java.util.*;

//[요구사항]
//알파벳 대문자들 중 무작위로 추출하여 다음 [ 보기 ]와 같은 형식으로 출력해 보자.
//단 반복문은 한번만 사용해야 한다.
//[보기]
//G K O P W
//R V T S K
//B Z Q U Y
public class API_Example {
    public static void main(String[] args) {
//        Random random = new Random();
//65~90

        for (int i = 0; i < 15; i++) {
            char ch = (char) ((int) (Math.random() * 26) + 65);
            char tmp = ch;
            System.out.print(ch+" ");
            if (i == 4 || i == 9) {
                System.out.println();

            }
        }

    }

//    public static String getKey(int key) {
//        Random r = new Random();
//        StringBuffer buf = new StringBuffer();
//        for (int i = 1; i <= key; i++) {
//            if (r.nextBoolean()) {
//                buf.append((char) (r.nextInt(26)+65));
//
//            } else {
//                buf.append(r.nextInt(10));
//
//            }
//        }
//        return buf.toString();
//    }
}
