package hy_test_exam;

import java.util.Scanner;

//100부터 999까지의 숫자(3자리수)를 입력 받아 각 자리수의 수를 합한 합계를 출력하세요.
public class Example4 {
    public static void main(String[] args) {
        int value = 0;
        int tmp;

        Scanner scan = new Scanner(System.in);

        System.out.print("100에서 999사이의 값을 입력하세요. : ");
        tmp = scan.nextInt();

        while (tmp != 0) {
            value += tmp % 10;
            tmp /= 10;
        }

        System.out.println("각 자리수의 합계 : " + value);

    }

}
