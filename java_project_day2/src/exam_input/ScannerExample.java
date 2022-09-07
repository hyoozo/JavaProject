package exam_input;

import java.util.Scanner;
// 이름, 도시, 나이, 체중, 독신 여부(true/false)를 입력 받아 여려분이 원하는 형태로 출력하시요.
public class ScannerExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name, add; //이름 주소
        int age, wet; //나이, 체중

        System.out.println("이름을 입력하세요");
        name = scan.nextLine();

        System.out.println("나이를 입력하세요");
        age = scan.nextInt();
        scan.nextLine();

        System.out.println("도시를 입력하세요");
        add = scan.nextLine();

        System.out.println("체중을 입력하세요");
        wet = scan.nextInt();


        System.out.println("독신여부를 입력하세요 (true/false)");
        boolean mer = scan.nextBoolean();
        System.out.println("독신여부는" + mer);
//        String mer = (mer == true)? "미혼":"기혼";
//
        scan.close();
    }
}
