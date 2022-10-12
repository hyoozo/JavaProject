package exam_collection_set;

import java.util.*;

public class ScoreTreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer>    set = new TreeSet<>();

        set.add(20);
        set.add(90);
        set.add(75);
        set.add(92);
        set.add(50);

        System.out.println("Sorting(오름차순): " + set);
        //Sorting(오름차순): [20, 50, 75, 90, 92] - 자동으로 정렬.  toString 안해도됨.
        System.out.println("Sorting(내림차순): " + set.descendingSet());
        //Sorting(내림차순): [92, 90, 75, 50, 20]
        System.out.println("가장 낮은 점수 : " + set.first());
        //가장 낮은 점수 : 20
        System.out.println("가장 높은 점수 : " + set.last());
        //가장 높은 점수 : 92
        System.out.println();

        //TreeSet 클래스는 NavigableSet<E> 인터페이스를 구현한 구현 클래스.
        //NavigableSet<E> 인터페이스는
        //SortedSet<E> 인터페이스를 상속받은 인터페이스
//        SortedSet<Member> mSet = new TreeSet<>();
//        mSet.add(new Member("홍길동", 30));  //에러남
//        mSet.add(new Member("김철수", 34));
//        mSet.add(new Member("이민수", 29));
//        mSet.add(new Member("김희진", 45));
//        mSet.add(new Member("홍길동", 30));
//
//        Iterator<Member> iter = mSet.iterator();
//        while (iter.hasNext()) {
//            System.out.println(iter.next());
//        }

//        TreeSet<Score> tSet = new TreeSet<>();
//        tSet.add(new Score(41,20));
//        tSet.add(new Score(71,78));
//        tSet.add(new Score(11,12));
//        tSet.add(new Score(31,32));
//
//        System.out.println("\n 반복자를 이용하여 출력 - 오름차순");
//        Iterator<Score> it = tSet.iterator();
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//
//        System.out.println("\nq반복자를 이요하여 출력 - 내림차순");
//        SortedSet<Score> sSet = tSet.descendingSet();
//        Iterator<Score> sIt = sSet.iterator(
//
//        );
//        while (sIt.hasNext()) {
//            System.out.println(sIt.next());
//        }

        HashSet<Score> hSet = new HashSet<>();
        hSet.add(new Score(41,20));
        hSet.add(new Score(71,78));
        hSet.add(new Score(11,12));
        hSet.add(new Score(31,32));



    }
}
