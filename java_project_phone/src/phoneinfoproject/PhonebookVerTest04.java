package phoneinfoproject;

import com.sun.tools.javac.Main;
import simplephoneinfo.MenuViewer;

import java.util.InputMismatchException;

public class PhonebookVerTest04 {

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

    public static void main(String[] args) throws OutOfBoundException {

        PhoneBookTest book = PhoneBookTest.getInstance();

        int num = 0;
        MainMenu[] mainMenus = MainMenu.values();
        do {
            try {
                MenuViewer.showMainMenu(); //전화번호 메뉴

                num = MenuViewer.scan.nextInt();
                MenuViewer.scan.nextLine();
                MenuViewer.checkBound(num, 1, 4);

                switch (mainMenus[num - 1]) {  //열거형으로 확
                    case 데이터입력 -> {
                        book.saveData();  //저장 메서드
                    }
                    case 데이터검색 -> {
                        book.findPhoneInfo();  //검색 메서드
                    }
                    case 데이터삭제 -> {
                        book.deletePhoneInfo();  //삭제 메서드
                    }
                }

//        int num = 0;
//        do {
//
//            MenuViewer.showMainMenu(); //전화번호 메뉴
//
//            try { //문자 입력시 예외처리
//
//                num = MenuViewer.scan.nextInt();
//                MenuViewer.scan.nextLine();
//                MenuViewer.checkBound(num, 1, 4);
//
//                switch (num) {
//                    case 1 -> {
//                        book.saveData();
//                    }
//                    case 2 -> {
//                        book.findPhoneInfo();  //검색 메서드
//                    }
//                    case 3 -> {
//                        book.deletePhoneInfo();  //삭제 메서드
//                    }
//                }
//                if (num < 1 || num > 4) {
//                    throw new OutOfBoundException(num + "에 해당하는 선택은 존재하지 않습니다.\n메뉴 선택을 처음부터 다시 진행합니다.");
//                } else if (num == 1) {
//                    MenuViewer.showSubMenu();
//
//                    int saveNum = MenuViewer.scan.nextInt();
//                    System.out.println();
//                    if (saveNum < 1 || 3 < saveNum) {
//                        throw new OutOfBoundException(saveNum + "에 해당하는 선택은 존재하지 않습니다.\n메뉴 선택을 처음부터 다시 진행합니다.");
//                    }
//                    MenuViewer.scan.nextLine();
//                    book.saveData();
//
//                } else if (num == 2) {
//
//                    MenuViewer.scan.nextLine();
//                    book.findPhoneInfo();  //검색 메서드
//
//                } else if (num == 3) {
//
//                    MenuViewer.scan.nextLine();
//                    book.deletePhoneInfo();  //삭제 메서드
//
//                }
            } catch (InputMismatchException e) {
                System.out.print("\t\t\t\t( * 경고 * ) 다시 선택해주세요.\n");
                MenuViewer.scan.nextLine();
            } catch (OutOfBoundException e) {
                System.out.println(e.getMessage());
            }
        } while (num != 4);
        System.out.println("프로그램을 종료합니다.");
//            if (num == 1) {
//                MenuViewer.saveMenu(); //입력 메뉴
//                try { //문자 입력시 예외처리
//                    saveNum = MenuViewer.scan.nextInt();
//                    System.out.println();
//                    if(saveNum < 1 || 3 < saveNum) {
//                        throw new OutOfBoundException(saveNum+"에 해당하는 선택은 존재하지 않습니다.\n메뉴 선택을 처음부터 다시 진행합니다.");
//
//                    }
//                } catch (InputMismatchException e) {
//                    System.out.println("\t\t\t\t( * 경고 * ) 다시 선택해주세요.\n");
//                    MenuViewer.scan.nextLine();
//                    continue;
//                } catch (OutOfBoundException e) {
//                    System.out.println(e.getMessage());
//                    continue;
//                }

//                MenuViewer.scan.nextLine();
//                book.saveData();
//            } else if (num == 2) {
//                System.out.println("데이터 검색을 시작합니다.");
//                MenuViewer.scan.nextLine();
//                book.findPhoneInfo();  //검색 메서드
//
//            } else if (num == 3) {
//                System.out.println("데이터 삭제를 시작합니다.");
//                MenuViewer.scan.nextLine();
//                book.deletePhoneInfo();  //삭제 메서드
//            }

    }
}
