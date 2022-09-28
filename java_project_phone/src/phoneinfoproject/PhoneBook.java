package phoneinfoproject;

import simplephoneinfo.MenuViewer;

public class PhoneBook {
    private static final int MAX_CNT = 100;
    private PhoneInfo[] obj ;

    private int count;

    public PhoneBook() {
        obj = new PhoneInfo[MAX_CNT];
        count = 0;
    }

    public void saveData() {
        System.out.print("이름 : ");
        String name = MenuViewer.scan.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = MenuViewer.scan.nextLine();

        switch (PhonebookVer04.saveNum) {
            case 1:
                obj[count++] = new PhoneInfo(name, phoneNumber);
                break;
            case 2:
                System.out.print("전공 : ");
                String majar = MenuViewer.scan.nextLine();
                System.out.print("학년 : ");
                int year = MenuViewer.scan.nextInt();
                obj[count++] = new PhoneUnivInfo(name, phoneNumber, majar, year);
                break;
            case 3:
                System.out.print("회사 : ");
                String company = MenuViewer.scan.nextLine();
                obj[count++] = new PhoneCompanyInfo(name, phoneNumber, company);
                break;
        }
        System.out.println("데이터의 입력이 완료 되었습니다.");
        PhonebookVer04.showArr(obj);
    }


    //데이터 검색
    public void findPhoneInfo(){
        System.out.print("이름 : ");
        String name = MenuViewer.scan.nextLine();
        for (int i = 0; i < obj.length; i++) {
            if (name.equals(obj[i].getName())){
                obj[i].showPhoneInfo();
                System.out.println("데이터 검색이 완료 되었습니다.");
                break;
            }
        }
    }

    //데이터 삭제
    public void deletePhoneInfo() {
        System.out.print("이름 : ");
        String name = MenuViewer.scan.nextLine();
        for (int i = 0; i < obj.length; i++) {
            if (name.equals(obj[i].getName())) {
                if (i == obj.length - 1) {
                    obj[i] = null;
                } else {
                    for (int c = i; c < obj.length - 1; c++) {
                        obj[c] = obj[c + 1];

                    }
                }
                obj[obj.length - 1] = null;
                break;
            }
        }

        System.out.println("데이터 삭제가 완료되었습니다.");
        PhonebookVer04.showArr(obj);
    }


}

