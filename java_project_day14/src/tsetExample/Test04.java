package tsetExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeSet;

public class Test04 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("one");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+ " ");
        }
        String[] s = {"사과", "배", "바나나"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(s));

        list.add("포도");
        System.out.println(list);

        list.add(2, "자몽");
        System.out.println(list);

        System.out.println(list.get(3));

        list.remove(1);
        System.out.println(list);

        System.out.println(list.contains("사과"));
        System.out.println(list.indexOf("사과"));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello Java");
        String str = arrayList.get(0);
        System.out.println(str);
    }
}
