package simplephoneinfo;

import java.util.Scanner;

public class PhonebookVer01 {
    public static Scanner scan = new Scanner(System.in);
    public static void scanData(PhoneInfo ab){ // 매재변수 : 클래스명 참조변수 = 주솟값
        System.out.print("이름: ");
        String name = scan.nextLine();
        ab.setName(name);
        System.out.print("전화번호: ");
        String phoneNumber = scan.nextLine();
        ab.setPhoneNumber(phoneNumber);
        System.out.print("생년월일 :  ");
        String bithday = scan.nextLine();
        ab.setBirthday(bithday);
    }

    public static void main(String[] args) {
        PhoneInfo pif = new PhoneInfo();

        int num ;
        do {
            System.out.println("1. 데이터 입력");
            System.out.println("2. 프로그램 종료");
            num = scan.nextInt();
            scan.nextLine();
            if(num == 1){
                scanData(pif);
//                System.out.println(pif.showPhoneInfo());
            }
        }while(num != 2) ;

    }
}
