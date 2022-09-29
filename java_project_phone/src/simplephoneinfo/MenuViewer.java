package simplephoneinfo;

import phoneinfoproject.PhoneInfoVer04;
import phoneinfoproject.PhonebookVer04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuViewer {
    public static Scanner scan = new Scanner(System.in);

    public static void showMenu(){  //전화번호 메인 메뉴 메서드
        System.out.println("  ---------------- [ 전 화 번 호 프 로 그 램 ] ----------------");
        System.out.print("1. 데이터 입력 \t2. 데이터 검색 \t3. 데이터 삭제 \t4. 프로그램 종료 \n선택 : ");
    }
    public static void saveMenu() {  //전화번호 입력 메뉴 메서드
        System.out.print("5. 일반 \t6. 대학\t7. 회사\n선택>> ");
    }
}
