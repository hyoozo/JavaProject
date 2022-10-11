package exam_collection_set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
전체 문자에서 중복된 단어를 검출하는 프로그램을 작성하여 보자.
이 예제 HashSet 을 이용하여 코딩해 보세요.
String[] sample = {"단어", "의미'", "구절", "의미", "단락"};

[출력 결과]
중복된 단어 : 의미
단어 수 : 4
중복되지 않은 단어 : [ 단락, 의미, 구절, 단어]
 */
public class FindDupplication {
    public static void main(String[] args) {
        Set<String> list = new HashSet<>();
        String[] sample = {"단어", "의미", "구절", "의미", "단락"};
        //배열을 add

        for (String word : sample) {
            if (! list.add(word)) {
                //! (부정연산자)는 true -> false, false -> true. if( list.add(word) == false)
                // 거짓일때 실행되서 아래 출력문에 출력됨.
                // add 에 false 를 주는 경우는 중복된 단어를 찾는거나 마찬가지..

                System.out.println("중복된 단어 : " +word );
            }
        }

        System.out.println("단어 수 : " + list.size());
        System.out.println("중복되지 않은 단어 : " + list.toString()); //반복자로 출력해도 된다.

    }
}
