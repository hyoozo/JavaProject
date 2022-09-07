package hy_test_exam;

import java.util.Scanner;

//x개의 사탕을 y명의 학생들에게 똑같이 나누어 주려고 할때
//각 학생들이 받을 수 있는 사탕의 수와 남는 사탕의 수를 계산해 출력하는 프로그램을 작성하시오.
public class Example2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
//        int candy;
//        int add;
//        int studentNum = 30;
//        double num;
//
//        System.out.print("현재 갖고 있는 사탕의 수를 입력하세요 : " );
//        candy = scan.nextInt();
//
//        add = candy / studentNum;
//        num = candy % studentNum;
//        System.out.println("각 학생들이 받을 수 있는 사탕의 수는 : " + add);
//        System.out.println("나눈 후 남는 사탕의 수는 : " + num);

        System.out.print("현재 갖고 있는 사탕의 수를 입력하세요 : " );
        int candyNum = scan.nextInt();
        System.out.print("현재 학생 수를 입력하세요 : " );
        int stdNum = scan.nextInt();

        System.out.println("각 학생들이 받을 수 있는 사탕의 수는 : " + (candyNum / stdNum));
        System.out.println("남는 사탕의 수는 : " + (candyNum % stdNum));

        scan.close();

    }
}
