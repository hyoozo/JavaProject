package hy_test_exam;

public class Day5Test_2 {
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        int sum = 0;
        for (int i = 0, num = 1; i < array.length; i++) {  //행
            for (int j = 0; j < array[i].length; j++) {  //열
                array[i][j] = num++;  //배열에 저장하는 값 1,2,3,4,5 ...
                System.out.print(array[i][j] +"\t");
            }
            System.out.println(); //5개 출력하고 줄 바꿈
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {  ///  j <= i 행 0,1,2,3,4, 열 0,1,2,3,4
                sum += array[i][j];
            }
        }
        System.out.println();
        System.out.println("합계 : " + sum);
    }
}
//대각선아래 숫자 합계
// 1	2	3	4	5
// 6	7	8	9	10
// 11	12	13	14	15
// 16	17	18	19	20
// 21	22	23	24	25
//
//합계 : 235