package hy_test_day6;

public class ArrayExamTwo {
    public static void main(String[] args) {
        int[][] num = {
                {10, 10, 10, 10, 0},
                {30, 30, 30, 30, 0},
                {40, 40, 40, 40, 0},
                {50, 50, 50, 50, 0},
                {0, 0, 0, 0, 0}};
        int sum;
        int sum2;
        int j;
        for (int i = 0; i < num.length; i++) {
            sum = 0;
            sum2 = 0;
            for (j = 0; j < num.length - 1; j++) {
                System.out.print(num[i][j] + " ");
                sum += num[i][j];
                sum2 += num[j][i];
            }
            System.out.print("");
            num[i][4] = sum;
            System.out.println(num[i][4]);
            num[4][j] = sum2;
            System.out.println(num[4][j]);
        }
    }
//            num[5][5] = sum3;
//            System.out.println(num[5][5]);
}

