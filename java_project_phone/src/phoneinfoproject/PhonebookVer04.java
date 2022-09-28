package phoneinfoproject;

import simplephoneinfo.MenuViewer;

public class PhonebookVer04 {
    static int saveNum = 0;
    public static void showArr(PhoneInfo[] arr) {
        for (int i = 0; i < arr.length; i++) {
            try {
                System.out.println(arr[i].getName());
            } catch (NullPointerException e) {
                continue;
            }
        }
    }
    public static void main(String[] args) {

        PhoneBook book = new PhoneBook();

        int num = 0;
        do {
            MenuViewer.showMenu();  //메뉴메서드
            num = MenuViewer.scan.nextInt();
//            System.out.println("선택하세요.");
//            System.out.print("1. 데이터 입력 \n2. 데이터 검색 \n3. 데이터 삭제 \n4. 프로그램 종료 \n선택 : ");
            if (num == 1) {
//              System.out.print("1. 일반 \t2. 대학\t3. 회사\n선택>> ");
                MenuViewer.saveMenu();  //저장메뉴메서드
                saveNum = MenuViewer.scan.nextInt();

                MenuViewer.scan.nextLine();

                System.out.println("데이터 입력을 시작합니다.");
                book.saveData();  //저장메서드

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
