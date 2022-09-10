package hy_test_day4;

import java.util.Scanner;

public class Day4_Exam1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int sum;
        char ch = ' ';

        Scanner scan = new Scanner(System.in);

        System.out.println("계산하고 싶은 값을 두번 입력하세요.");
        a = scan.nextInt();
        b = scan.nextInt();
        System.out.println("계산하고 싶은 계산식을 입력하세요. (+, -, *, /");
        ch = scan.next().charAt(0);

        if ( ch == '+' ){
            System.out.println(a+"+"+b+"="+(a + b));
        } else if( ch == '-'){
            System.out.println(a+"-"+b+"="+(a - b));
        } else if (ch == '*'){
            System.out.println(a+"*"+b+"="+(a * b));
        } else if (ch == '/'){
            System.out.println(a+"/"+b+"="+((double) a / (double)b));
        }
    }
}
