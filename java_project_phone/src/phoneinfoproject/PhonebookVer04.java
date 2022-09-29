package phoneinfoproject;

import simplephoneinfo.MenuViewer;

import java.util.InputMismatchException;

public class PhonebookVer04 {
    static int saveNum = 0;

    public static void showArr(PhoneInfoVer04[] arr) { // 배열 보여주는 메서드
        System.out.println("[ 전화번호 리스트 ]");
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(arr[i].getName());
            } catch (NullPointerException e) {
                continue;
            }
        }
        System.out.println("--------------------");
    }
    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        int num = 0;
        do {
            try {
                MenuViewer.showMenu();  //메뉴메서드
                num = MenuViewer.scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("메뉴를 다시 선택하세요.(1~4)");
                MenuViewer.scan.nextLine();
            }

                if (num == 1) {
                    MenuViewer.saveMenu();  //저장메뉴메서드
                    saveNum = MenuViewer.scan.nextInt();
                    System.out.println();

                    if (saveNum > 0 && saveNum < 4) {
                        MenuViewer.scan.nextLine();
                        System.out.println("데이터 입력을 시작합니다.");
                        book.saveData();  //저장메서드
                    } else {
                        System.out.println("메뉴를 다시 선택하세요.(1~3)");
                    }

                } else if (num == 2) {
                    System.out.println("데이터 검색을 시작합니다.");
                    MenuViewer.scan.nextLine();
                    book.findPhoneInfo();  //검색메서드


                } else if (num == 3) {
                    System.out.println("데이터 삭제를 시작합니다.");
                    MenuViewer.scan.nextLine();
                    book.deletePhoneInfo();  //삭제메서드
                }

        } while (num != 4);
        System.out.println("프로그램을 종료합니다.");


    }
}
