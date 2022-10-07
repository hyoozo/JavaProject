package phoneinfoproject;

import simplephoneinfo.MenuViewer;

public class PhoneBookTest {
    private static PhoneBookTest instance = new PhoneBookTest();
    private static final int MAX_CNT = 3;
    private final PhoneInfoVer04[] obj ;
    private int count;
    private PhoneBookTest() {
        obj = new PhoneInfoVer04[MAX_CNT];
        count = 0;
    }

    public static PhoneBookTest getInstance() {
        return PhoneBookTest.instance;
    }
    //데이더 저장
    public void saveData() throws OutOfBoundException {
        if (obj[MAX_CNT-1] != null){
            System.out.println("저장 공간이 없습니다. 연락처를 삭제하거나 종료해주세요.");
        } else {
            MenuViewer.showSubMenu();
            int saveNum = MenuViewer.scan.nextInt();
            MenuViewer.scan.nextLine();
            MenuViewer.checkBound(saveNum, 1, 3);

            System.out.println("데이터 입력을 시작합니다.");
            System.out.print("이름 : ");
            String name = MenuViewer.scan.nextLine();
            System.out.print("전화번호 : ");
            String phoneNumber = MenuViewer.scan.nextLine();

            switch (saveNum) {
                case 1:
                    obj[count++] = new PhoneInfoVer04(name, phoneNumber);
                    break;
                case 2:
                    System.out.print("전공 : ");
                    String major = MenuViewer.scan.nextLine();
                    System.out.print("학년 : ");
                    int year = MenuViewer.scan.nextInt();
                    obj[count++] = new PhoneUnivInfo(name, phoneNumber, major, year);
                    break;
                case 3:
                    System.out.print("회사 : ");
                    String company = MenuViewer.scan.nextLine();
                    obj[count++] = new PhoneCompanyInfo(name, phoneNumber, company);
                    break;
            }
            System.out.println("데이터의 입력이 완료 되었습니다.\n");
            PhonebookVerTest04.showArr(obj);
        }
    }


    //데이터 검색
    public void findPhoneInfo(){
        System.out.println("데이터 검색을 시작합니다.");
        System.out.print("이름 : ");
        String name = MenuViewer.scan.nextLine();
        for (int i = 0; i < obj.length; i++) {
            if (obj[i] == null){
                System.out.println("없는 이름입니다. 전화번호 리스트를 확인하세요.");
                break;
            } else if (name.equals(obj[i].getName())){
                obj[i].showPhoneInfo();
                System.out.println("*-------------*\n");
                System.out.println("데이터 검색이 완료 되었습니다.\n");
                break;
            }
        }
    }

    //데이터 삭제
    public void deletePhoneInfo() {
        System.out.println("데이터 삭제를 시작합니다.");
        System.out.print("이름 : ");
        String name = MenuViewer.scan.nextLine();
        for (int i = 0; i < obj.length; i++) {
            if(obj[i] == null){
                System.out.println("없는 이름입니다. 전화번호 리스트를 확인하세요.");
                break;
            } else if (name.equals(obj[i].getName())) {
                if (i == obj.length - 1) {
                    obj[i] = null;
                } else {
                    for (int c = i; c < obj.length - 1; c++) {
                        obj[c] = obj[c + 1];
                    }
                }
                obj[obj.length - 1] = null;
                System.out.println("데이터 삭제가 완료되었습니다.\n");
                count--;
                break;
            }
        }
        PhonebookVerTest04.showArr(obj);
    }
}
