package hy_test_exam;

import java.util.Scanner;

//국어, 영어, 수학 점수를 입력 받아 총점과 평균(소수 첫번째 자리)을 구해 출력하는 프로그램을 작성하시오.
public class Example1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kor, eng, math, sum;
        float avg;

        System.out.print("국어 점수를 입력하세요. : " );
        kor = scan.nextInt();

        System.out.print("영어 점수를 입력하세요. : ");
        eng = scan.nextInt();

        System.out.print("수학 점수를 입력하세요. : ");
        math = scan.nextInt();

        sum = kor + eng + math;
        avg = sum / 3.0f;

        System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n", kor, eng , math);
        System.out.printf("학생의 총점은 : %d\n ", sum);
        System.out.printf("학생의 평균은 : %.1f ", avg);

        scan.close();

    }
}
