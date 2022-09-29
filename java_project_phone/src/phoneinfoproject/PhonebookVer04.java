package phoneinfoproject;

import simplephoneinfo.MenuViewer;

import java.util.InputMismatchException;

public class PhonebookVer04 {
    public static int num = 0;
    public static int saveNum = 0;

    public static void showArr(PhoneInfoVer04[] arr) { // 저장된 배열 보여주는 메서드
        System.out.println("[ 전화번호 리스트 ]");
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println((i + 1) + ". " + arr[i].getName());
            } catch (NullPointerException e) {
                continue;
            }
        }
        System.out.println("[-------------]\n");
    }

    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        do {
            MenuViewer.showMenu(); //전화번호 메뉴
            try { //문자 입력시 예외처리
                num = MenuViewer.scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("\t\t\t\t( * 경고 * ) 다시 선택해주세요.\n");
                MenuViewer.scan.nextLine();
                num = 0;
            }

            if (num == 1) {
                MenuViewer.saveMenu(); //입력 메뉴
                try { //문자 입력시 예외처리
                    saveNum = MenuViewer.scan.nextInt();
                    System.out.println();
                } catch (InputMismatchException r) {
                    System.out.println("\t\t\t\t( * 경고 * ) 다시 선택해주세요.\n");
                    MenuViewer.scan.nextLine();
                    saveNum = 0;
                }
                if (saveNum > 4 && saveNum < 8) {//saveNum 입력 오류 잡기
                    System.out.println("데이터 입력을 시작합니다.");
                    MenuViewer.scan.nextLine();
                    book.saveData();  //저장 메서드
                }
            } else if (num == 2) {
                System.out.println("데이터 검색을 시작합니다.");
                MenuViewer.scan.nextLine();
                book.findPhoneInfo();  //검색 메서드

            } else if (num == 3) {
                System.out.println("데이터 삭제를 시작합니다.");
                MenuViewer.scan.nextLine();
                book.deletePhoneInfo();  //삭제 메서드
            }
        } while (num != 4);
        System.out.println("프로그램을 종료합니다.");
    }
}