package exam_array_in_array;

import java.sql.SQLOutput;

public class ArrayInArrayExample {
    public static void main(String[] args) {


        //2차원 배열
        //자료형[][] 배열명 = new 자료형[행의 요소][열의 요소]
        int[][] arr1 = new int[2][3];

        System.out.println("arr1.length = " + arr1.length); //배열의 행의 수
        System.out.println("arr1[0].length = "+ arr1[0].length);//0번째 행의 열의 수
        System.out.println("arr1[1].length = "+ arr1[1].length);//1번째 행의 열의 수
        System.out.println();

        for (int i = 0; i <arr1.length; i++){  //행의 요소
            for (int k = 0; k < arr1[i].length; k++){ //열의 요소
                System.out.print("arr["+i+"]["+k+"]="+arr1[i][k]+" ");
            }
            System.out.println();
        }
        int[][] arr2 = new int[][]{{10,20,30}, {40,50,60}};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%-5d", arr2[i][j]);
            }
            System.out.println();
        }
        //2차원 배열(가변 배열)
        int[][] arr3 = new int[2][];
        arr3[0] = new int[]{1,5};
        arr3[1] = new int[3];
        for (int i = 0; i < arr3.length; i++){
            for(int k = 0; k <arr3[i].length; k++){
                System.out.print("arr3["+i+"]["+k+"]="+arr3[i][k]+ " ");
            }
            System.out.println();
        }
    }
}