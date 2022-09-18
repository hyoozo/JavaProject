package exam_array;
//가장 큰값, 가장 작은값을 출격해보자.
public class MaxMinExample {
    public static void main(String[] args) {
        int[] arr = new int[] {12,26,68, 98, 76, 54, 8, 6, 4};

        int min = arr[0];
        int max = arr[0];
        int minpos = 0;
        int maxpos = 0;

        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                minpos = i + 1;
            }
            if (max < arr[i]){
                max = arr[i];
                maxpos = i + 1;
            }
        }
        System.out.println("min의 값은 : " + min + "이고, 자리는 : " + minpos + "이다.");
        System.out.println("min의 값은 : " + max + "이고, 자리는 : " + maxpos + "이다.");
    }
}
