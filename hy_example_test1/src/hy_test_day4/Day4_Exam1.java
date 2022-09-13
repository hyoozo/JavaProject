package hy_test_day4;

//import jdk.incubator.foreign.ResourceScope;

import java.util.Scanner;

public class Day4_Exam1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        char ch = ' ';

        Scanner scan = new Scanner(System.in);

        System.out.println("계산하고 싶은 값을 두번 입력하세요.");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("계산하고 싶은 계산식을 입력하세요. (+, -, *, /)");
        ch = scan.next().charAt(0);

        if ( ch == '+' ){
            System.out.println(a+"+"+b+"="+(a + b));
        } else if( ch == '-'){
            System.out.println(a+"-"+b+"="+(a - b));
        } else if (ch == '*'){
            System.out.println(a+"*"+b+"="+(a * b));
        } else if (ch == '/') {
            if (b != 0) {
                float result = a / b;
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
                scan.close();
                return;
            }
        }else{
            System.out.println("사칙연산이 아닙니다.");
            scan.close();
            return;
        }
        System.out.println(a+"/"+b+"="+((double) a / (double)b));
    }
}
