package exam_collection_list;

import java.util.*;

public class ArrayListExample02 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        /*
        for(int i =0; i<10; i++
          System.out.print("심사위원의 점수 : ");
          double value = sc.netDouble();
          list.add(value);
         */

        //입력 단계
        int i = 1;
        double value = 0.0;
        while (true) {
            System.out.printf("(%d번째)심사위원의 점수 : ", i);
            value = sc.nextDouble();
            if (value < 0 || value > 10) {   //1에서10까지의 수를 입력하기 위한 조건문
                continue;
            }
            list.add(value);
            i++;
            if (i > 10) break;
        }

        //처리단계 및 출력 단계
        double max = Collections.max(list);
        double min = Collections.min(list);
        double sum = 0.0;
        double collValue = 0.0;

        for (int j = 0; j < 10; j++) {
            collValue = list.get(j);
            if (collValue != min && collValue != max)
                sum += collValue;
        }
        System.out.printf("점수의 합 %.1f",sum);

        sc.close();
    }

    public static Double max(List<Double> list) {
        Iterator<Double> iter = list.iterator();
        Double candidate = iter.next();

        while (iter.hasNext()) {
            Double next = iter.next();
            if (next.compareTo(candidate) > 0) {
                candidate = next;
            }
        }
        return candidate;
    }

    public static Double min(List<Double> list) {
        Iterator<Double> iter = list.iterator();
        Double candidate = iter.next();

        while (iter.hasNext()) {
            Double next = iter.next();
            if (next.compareTo(candidate) < 0) {
                candidate = next;
            }
        }
        return candidate;
    }
}