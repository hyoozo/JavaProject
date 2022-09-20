package simplephoneinfo;

import java.util.Scanner;

public class PhonebookVer02 {
    public static Scanner scan = new Scanner(System.in);
    public static String name, phoneNumber, birthday;

    public static void scanData() {
        System.out.print("이름: ");
        name = scan.nextLine();
        System.out.print("전화번호: ");
        phoneNumber = scan.nextLine();
        System.out.print("생년월일 :  ");
        birthday = scan.nextLine();
        System.out.println();
    }

    public static void main(String[] args) {
        int num;
        PhoneInfo p = new PhoneInfo();
        do {
            System.out.println("1. 데이터 입력 (내용 입력을 원치 않을시 Enter) \n2. 프로그램 종료");
            num = scan.nextInt();
            scan.nextLine();
            System.out.println("선택 : " + num);
            if (num == 1) {
                scanData();
                if (birthday.equals("")) {
                    p = new PhoneInfo(name, phoneNumber);
                } else {
                    p = new PhoneInfo(name, phoneNumber, birthday);
                }
                p.showPhoneInfo();
            }
        } while (num != 2);
        System.out.println("프로그램 종료합니다.");
    }
}
