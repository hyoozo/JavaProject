package exam_collection_set;

import java.util.HashSet;
import java.util.Set;
/*
Member 클래스를 생성한다.
필드는 이름, 나이를 가지고 있다.
[요구사항]
1. 나이가 같으면 동일 객체로 본다.
2. 이름이 같으면 동일 객체로 본다.
3. 이름과 나이가 같으면 동일 객체로 본다.
 */
public class HashSetExample03 {
    public static void main(String[] args) {
        Set<Member> set =new HashSet<>();

        set.add(new Member("홍길동",50));
        set.add(new Member("홍길동",40));
        set.add(new Member("김희진",50));  // 나이가 같아서 동일객체로 본다.
        set.add(new Member("김철수",36));

        System.out.println("총 객체 수 : " + set.size());
        System.out.println("\t"+set.toString());
    }
}
