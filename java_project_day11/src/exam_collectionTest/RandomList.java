package exam_collectionTest;

import java.util.*;


/*
1~100사이의 임의의 숫자 10개를 출력하고 오름차순(낮은 값에서 높은 값)으로 정렬하여 출력해 주세요.
*/
public class RandomList {
    public static void main(String[] args) {

        //배열을 이용해서 정렬하기
        int[] num = new int[10];
        int tmp;
        for (int i = 0; i < num.length; i++) {
            num[i] = (int)((int) (Math.random() * 100) +1);
        }
        System.out.print("정렬 전 : ");
        for (int i : num) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int j = 0; j < num.length; j++) {
            for (int k = j; k < num.length; k++) {
                if (num[k] < num[j]) {
                    tmp = num[j];
                    num[j] = num[k];
                    num[k] = tmp;
                }
            }
        }
        System.out.print("정렬 후 : ");
        for (int i : num) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        //ArrayList 로 정렬하기
        ArrayList<Integer> numArr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numArr.add(i, (int)((int) (Math.random() * 100) +1));
        }
        System.out.print("Array 정렬 전 :");
        for (int i : numArr) {
            System.out.print(i + " ");
        }
        System.out.println();

        numArr.sort(Comparator.naturalOrder());
        System.out.print("Array 정렬 후 : ");
        for (int i : numArr) {
            System.out.print(i + " ");
        }
    }
}
