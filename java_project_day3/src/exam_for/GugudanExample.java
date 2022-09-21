package exam_for;

import java.util.Scanner;

public class GugudanExample {
    public static void main(String[] args) {
        int dan;

        Scanner sc = new Scanner(System.in);
        System.out.println("출력할 단을 입력해주세요.");
        dan = sc.nextInt();

        if (dan < 2 || dan > 9) {
            System.out.println("단은 2단에서부터 9단까지로 입력해 주세요.");
        } else {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan + " * " + i + " = " + (dan * i));
            }
        }
        sc.close();
    }
}
