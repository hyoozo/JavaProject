package simplephoneinfo;

import phoneinfoproject.PhonebookVer04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuViewer {
    public static Scanner scan = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("  ================ [ 전 화 번 호 프 로 그 램 ] ================");
        System.out.print("1. 데이터 입력 \t2. 데이터 검색 \t3. 데이터 삭제 \t4. 프로그램 종료 \n선택 : ");
    }
    public static void saveMenu() {
        System.out.print("1. 일반 \t2. 대학\t3. 회사\n선택>> ");

    }
}