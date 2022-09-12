package hy_test_day4;

import java.util.Scanner;
// -1이 입력될 때까지 정수를 입력받아 그 수들의 합을 출력하는 프로그램을 작성하시오.
public class Day4_Exam4 {
    public static void main(String[] args) {

        double sum = 0;
        double i;

        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("정수를 입력하세요.");
            i = scan.nextInt();
            sum += i;
        }
        while (!(i == -1));
        System.out.println("입력한 수들의 합은 : " + sum);
        scan.close();
    }

}
