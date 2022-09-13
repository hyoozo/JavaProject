package hy_test_day5;
import java.util.Scanner;
//[요구사항1] 세번째캡쳐본
//최대,최소점수값을 제외한 나머지 점수의 평균을 구하기 (소수 2자리수)
public class Day5_Exam1 {
    public static void main(String[] args) {
        int[] jumsu = new int[5];
        int total = 0;
        int num = 0;
        double avg = 0;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < jumsu.length; i++) {
            System.out.print("점수를 입력해요 : ");
            num = scan.nextInt();

            while (num < 0 || 100 < num) {
                System.out.println("0부터 100까지 입력하세요");
                num = scan.nextInt();
            }
            jumsu[i] = num;
        }

        System.out.println("---총 입력된 점수들---");
        for (int k : jumsu) {
            System.out.println(k + "점");
        }

        for (int i = 0; i < jumsu.length; i++) {
            for (int j = i + 1; j < jumsu.length; j++) {
                if (jumsu[i] > jumsu[j]) {
                    int tmp = jumsu[i];
                    jumsu[i] = jumsu[j];
                    jumsu[j] = tmp;
                }
            }
        }
        System.out.println("---제거 대상 점수---");
        System.out.println("최고 점수 : " + jumsu[4] + "점");
        System.out.println("최소 점수 : " + jumsu[0] + "점");

        System.out.println("---최종 입력 점수---");
        for (int i = 1; i < jumsu.length - 1; i++) {
            System.out.println(jumsu[i] + "점");

            total += jumsu[i];

        }
        System.out.println("------------------");
        System.out.println("총점 : " + total);
        avg = (double) total / (double) (jumsu.length - 2);
        System.out.printf("평균 : %.2f ", avg);
    }
}