package exam_collection_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetInterfaceTest {
    public static void main(String[] args) {
//        HashSet<String> set = new HashSet<>();
        //  [butter, Ham, Milk, Bread, cheese]  순서를 보장하지 않는다.

//        LinkedHashSet<String> set = new LinkedHashSet<>();
        //  [Milk, Bread, butter, cheese, Ham]  입력한 순서대로 정렬한다.

        TreeSet<String> set = new TreeSet<>();
        //  [Bread, Ham, Milk, butter, cheese]  오름차순으로 정렬한다.
        //A,B,C,D,E,F,G,H,I,J,K,L,N,M,O,P,Q,R,S,T,U,V,W,X,Y,Z
        set.add("Milk");
        set.add("Bread");
        set.add("butter");
        set.add("cheese");
        set.add("Ham");
        set.add("Ham");
        System.out.println(set.toString());

        //반복자
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        HashSet<Integer> set1 = new HashSet<>();
        set1.add(Integer.valueOf(3));
        set1.add(5);
        set1.add(3);
        set1.add(4);
        set1.add(2);

        System.out.println(set1.toString());
        //[2, 3, 4, 5]

        // 중복값은 제외되고 정렬되어 출력된다.
    }
}
