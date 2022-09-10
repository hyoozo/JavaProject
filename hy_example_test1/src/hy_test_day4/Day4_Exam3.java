package hy_test_day4;

import java.util.Scanner;

public class Day4_Exam3 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("1~99까지의 정수를 입력하세요.");
        int value = scan.nextInt();
        int cnt = 0;
        if(value/10==3 || value/10==6 || value/10==9)
            cnt++;
        if(value%10==3 || value%10==6 || value%10==9)
            cnt++;
        if(cnt == 0 )
            System.out.println(value);
            else {
                System.out.print("박수");
                if(cnt == 1)
                    System.out.println("짝");
                else
                    System.out.println("짝짝");
        }
    }
}
