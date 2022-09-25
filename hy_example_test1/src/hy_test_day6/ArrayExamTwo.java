package hy_test_day6;

public class ArrayExamTwo {
    public static void main(String[] args) {
        int[][] num = {
                {10, 10, 10, 10, 0},
                {30, 30, 30, 30, 0},
                {40, 40, 40, 40, 0},
                {50, 50, 50, 50, 0},
                {0, 0, 0, 0, 0}};
        System.out.println(" === 실행전 ===");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.printf("%-5d", num[i][j]);     // 배열 전체 출력 코드
            }
            System.out.println();
        }
//        int sum;
//        int sum2;
//        int j;
//        for (int i = 0; i < num.length; i++) {
//            sum = 0;
//            sum2 = 0;
//            for (j = 0; j < num.length - 1; j++) {
//                System.out.print(num[i][j] + " ");
//                sum += num[i][j];
//                sum2 += num[j][i];
//            }
//            System.out.print("");
//            num[i][4] = sum;
//            System.out.println(num[i][4]);
//            num[4][j] = sum2;
//            System.out.println(num[4][j]);
//        }
//    }
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num[i].length - 1; j++) {  // -1을해서 인데스3까지 계산.
                num[i][4] += num[i][j];  // 가로 더하고, 다음행 가로 더하고 ,
                num[4][j] += num[i][j];  // 세로 130값을 가로로 더해서 세로값 냄 누적.
                if (i == j) {
                    num[4][4] += num[i][j]; // 대각선 값 누적.
                }
            }
        }
        System.out.println(" === 계산후 ===");

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.printf("%-5d", num[i][j]);  // 배열 전체 출력 코드..
            }
            System.out.println();
        }
    }
}

