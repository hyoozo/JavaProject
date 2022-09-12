package hy_test_day4;

import java.util.Scanner;

public class Day4_Exam8 {
    public static void main(String[] args) {
        int distance; //거리입력
        int basicCharge = 3000; //기본요금

        Scanner scan = new Scanner(System.in);
        System.out.print("거리를 입력하세요.>>  ");
        distance = scan.nextInt();

        if(distance > 2000){
            int payment = ( (distance - 2000)/140 )* 150;
            System.out.println((basicCharge+payment) + "원");
        }else{
            System.out.println("기본요금"+basicCharge+"입니다.");
        }
    }
}
