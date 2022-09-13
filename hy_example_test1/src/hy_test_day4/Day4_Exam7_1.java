package hy_test_day4;

import java.util.Scanner;

public class Day4_Exam7_1 {
//    static void print(int opt, int num1, int num2){
//        switch (opt) {
//            case 1:
//                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
//                break;
//            case 2:
//                System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
//                break;
//            case 3:
//                System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
//                break;
//            case 4:
//                double dvsn = (double) num1 / (double) num2;
//                System.out.println(num1 + "/" + num2 + "=" + Math.round (dvsn*100) /100.0);
//                break;
//        }
//    }

    static void plus(int a, int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
    static void minus(int a, int b){
        System.out.println(a+"-"+b+"="+(a-b));
    }
    static void mltpl(int a, int b){
        System.out.println(a+"-"+b+"="+(a*b));
    }
    static void dvsn(int a, int b){
        System.out.println(a+"-"+b+"="+((double)a/(double) b));
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

//            if(opt == 1){
//                System.out.println(Day4_Exam7_1.plus(num1,num2));
//            } else if (opt == 2) {
//                int minus = num1 - num2;
//                System.out.println(num1 + "-" + num2 + "=" + minus);
//            } else if (opt == 3) {
//                int mltpl = num1 * num2;
//                System.out.println(num1 + "*" + num2 + "=" + mltpl);
//            } else if (opt == 4) {
//                double dvsn = (double)num1 / (double) num2;
//                System.out.println(num1 + "/" + num2 + "=" + Math.round (dvsn*100) /100.0);
//            }

        } while(0 < opt && opt < 6);
    }
}
