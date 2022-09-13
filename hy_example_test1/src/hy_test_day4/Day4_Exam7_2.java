package hy_test_day4;

import java.util.Scanner;

public class Day4_Exam7_2 {
    static void print(int opt, int num1, int num2){
        switch (opt) {
            case 1:
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case 2:
                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                break;
            case 3:
                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
                break;
            case 4:
                float dvsn = (float) num1 / (float) num2;
                System.out.println(num1 + "/" + num2 + "=" + Math.round (dvsn*10) /10.0);
                break;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int opt = 0;
        int num1 = 0;
        int num2 = 0;

        System.out.println("연산자를 1~4로 선택하세요. 종료는 : 5");
        do {
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. 종료");
            System.out.print("선택 >> ");
            opt = scan.nextInt();

            if (opt == 5){
                System.out.println("종료됨");
                break;
            } else if (opt <= 0 || 6 <= opt) {
                System.out.println("1~5 사이의 숫자를 입력해주세요.");
                opt = 1;
                continue;
            }
            System.out.println("사칙연산을 할 두 수를 입력하세요.");
            num1 = scan.nextInt();
            num2 = scan.nextInt();

            Day4_Exam7_2.print(opt, num1, num2);

        } while(0 < opt && opt < 6);
        scan.close();
    }
}
