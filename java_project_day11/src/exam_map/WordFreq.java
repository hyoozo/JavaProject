package exam_map;

import java.util.*;

/*
[요구사항]
문자열에 포함된 단어의 빈도를 계산하여
단어를 Key 로, 빈도를 Value 로 저장하여 출력하기
String[] sample = {"to", "be", "or", "not", "to", "bo", "is", "a", "problem"};

[실행결과]
총 단어 수 : 7개
{a=1, not=1, be=2, or=1, problem=1, is=1, to=2}
 */
public class WordFreq {
    public static void main(String[] args) {
        //Map 타입으로 확인하기??
        //TreeMap 은 인터페이스가 구현되어 있는 클래스만 담을 수 있다.

        String[] sample = {"to", "be", "or", "not", "to", "be", "is", "a", "problem"};

        HashMap map = new HashMap();

        for (int i = 0; i < sample.length; i++) {
            if (map.containsKey(sample[i])) {
                int value = (int) map.get(sample[i]);
                map.put(sample[i], value + 1);
            } else {
                map.put(sample[i], 1);
            }
        }
        System.out.println("총 단어 수 : " + map.size());
        Iterator it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            int value = (int) entry.getValue();
            System.out.print(entry.getKey() + " = " + value +", ");
        }
    }
}
