package exam_for;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + ". ");
            System.out.print("Hello World!!   ");
            System.out.println("I lover Coding yeeeeeya");
        }
        System.out.println("-----------------------------");

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.println("1부터 10까지의 정수의 합 = " + sum);
        System.out.println("-----------------------------");

        int start, end;
        Scanner input = new Scanner(System.in);
        System.out.println("두개의 수를 입력해주세요: ");
        start = input.nextInt();
        end = input.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println(i + " ");
        }
        input.close();
        System.out.println("-----------------------------");

        //for문을 이용해서 1부터 10까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보세요.
        sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) { //i를 3으로 나눈 나머지가 0과 같다면? 3,6,9
                sum += i;
            }
        }
        System.out.println("3의 배수의 합 : " + sum);
        System.out.println();
    }
}

