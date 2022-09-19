package simplephoneinfo;

import java.util.Scanner;

public class PhonebookVer01 {
    public static Scanner scan = new Scanner(System.in);
    public static void scanData(PhoneInfo ab){ // 매개변수 : 클래스명 참조변수 = 주솟값
        System.out.print("이름: ");
        String name = scan.nextLine();
        ab.setName(name);
        System.out.print("전화번호: ");
        String phoneNumber = scan.nextLine();
        ab.setPhoneNumber(phoneNumber);
        System.out.print("생년월일 :  ");
        String birthday = scan.nextLine();
        ab.setBirthday(birthday);
        System.out.println();
    }

    public static void main(String[] args) {
        PhoneInfo phoneinfo = new PhoneInfo();

        int num ;
        do {
            System.out.println("1. 데이터 입력 (내용 입력을 원치 않을시 Enter)");
            System.out.println("2. 프로그램 종료");
            num = scan.nextInt();
            scan.nextLine();
            if(num == 1){
                scanData(phoneinfo);
                phoneinfo.showPhoneInfo();
            }
        }while(num != 2) ;
        System.out.println("프로그램 종료합니다.");
    }
}
