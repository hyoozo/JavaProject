package hy_test_exam;

import java.util.Scanner;

//국어, 영어, 수학 점수를 입력 받아 총점과 평균(소수 첫번째 자리)을 구해 출력하는 프로그램을 작성하시오.
public class Example1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kor, eng, math, sum;
        double avg;

        System.out.print("국어 점수를 입력하세요. : " );
        kor = scan.nextInt();

        System.out.print("영어 점수를 입력하세요. : ");
        eng = scan.nextInt();

        System.out.print("수학 점수를 입력하세요. : ");
        math = scan.nextInt();

        sum = kor + eng + math;
        avg = sum / 3.0;
//        avg = sum / 3.0f; //avg가 float변수가 아니라 double형식의 변수였다면 sum/3.0으로 적어도됨
//        avg = (double)sum /3; //(강사님코드)정수형을 실수형으로 강제 형변환

        System.out.printf("국어 : %d, 영어 : %d, 수학 : %d\n", kor, eng , math);
        System.out.printf("학생의 총점은 : %d, 학생의 평균은 : %.1f", sum, avg);

        scan.close();
    }
}
