package hy_test_exam;

public class Calendar {
    public static void main(String[] args) {
        int[] month = new int[12];
        int[][] day = new int[5][7];
        int q;
        int j;
        int num;

        for (int i = 1; i < month.length + 1; i++) {
            System.out.println(i + "월");

            for (q = 0, num = 1; q < day.length; q++) {
                for (j = 0; j < day[q].length; j++) {
                    day[q][j] = num++;
                    System.out.print(day[q][j] + "\t");
                }
                System.out.println();//행끝나고줄바꿈
            }
            System.out.println();//월끝나고 띄움

            }
        }
    }


