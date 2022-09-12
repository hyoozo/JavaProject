package hy_test_day4;

import java.util.Scanner;

//사용자가 입력한 점수의 총점, 평균을 내는 프로그램을 작성하시오.
public class Day4_Exam5 {
    public static void main(String[] args) {

        int sum = 0;
        double avg = 0;
        int a = 0;
        int b = 0;

        Scanner scan = new Scanner(System.in);

        a = scan.nextInt();
        b = scan.nextInt();


        if( (0 < a && a < 100) && (0 < b && b < 100) ){

            sum = a + b;
            avg = (double) (a + b) / 2;

            System.out.printf("당신이 입력한 점수의 총점은 : %d , 평균은 : %.2f", sum, avg);

        } else {
            System.out.println("a,b의 값을 체크하세요. 프로그램 종료.");
        }

        //0에서 100사이가 아닌 값 종료.


    }
}
