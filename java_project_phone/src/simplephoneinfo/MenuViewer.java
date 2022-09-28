package simplephoneinfo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuViewer {
    public static Scanner scan = new Scanner(System.in);
    public static void showMenu(){
        System.out.println("선택하세요.");
        System.out.print("1. 데이터 입력 \n2. 데이터 검색 \n3. 데이터 삭제 \n4. 프로그램 종료 \n선택 : ");

    }
    public static void saveMenu() {
        System.out.print("1. 일반 \t2. 대학\t3. 회사\n선택>> ");

    }
}
