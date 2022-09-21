package exam_while;

import java.util.Scanner;

public class WhileExample3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("문자열을 입력하라 :");
            String str = sc.nextLine();
            if (str.equals("exit")) {
                break;
            } else {
                System.out.println(str.length() + "글자입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();

    }
}
