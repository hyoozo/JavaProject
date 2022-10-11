package exam_collection_list;

import java.util.*;

public class ArrayListExample03 {
    public static void main(String[] args) {
        Random r = new Random();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(r.nextInt(100) + 1);  // 랜덤값 가져오는 반복문.
        }
        System.out.println("정렬 전 list 데이터");
        Iterator<Integer> iter = list.iterator();
        while (iter.hasNext()) {
            System.out.print(iter.next()+"\t");
        }
        Collections.sort(list);
        System.out.println("\n정렬 후 list 데이터");
        for (Integer i : list) {
            System.out.print(i+"\t");
        }
    }
}
