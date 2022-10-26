package tsetExample;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        try {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            System.out.println("두 수의 나눗셈 결과: " + num1 / num2);

        } catch (ArithmeticException e) {
            System.out.println("부적절");
        }
    }
}
