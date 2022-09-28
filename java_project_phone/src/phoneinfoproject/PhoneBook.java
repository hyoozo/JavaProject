package phoneinfoproject;

import simplephoneinfo.MenuViewer;

public class PhoneBook {
    private static final int MAX_CNT = 100;
    private PhoneInfo[] phoneInfos;
    private PhoneCompanyInfo[] phoneCompanyInfos;
    private PhoneUnivInfo[] phoneUnivInfos;
    private int curCnt;

    public PhoneBook() {
        curCnt = 0;
        phoneInfos = new PhoneInfo[MAX_CNT];
        phoneCompanyInfos = new PhoneCompanyInfo[MAX_CNT];
        phoneUnivInfos = new PhoneUnivInfo[MAX_CNT];
    }

    public void saveData() {
        System.out.println("데이터 입력을 시작합니다.");

        System.out.print("이름 : ");
        String name = MenuViewer.scan.nextLine();
        System.out.print("전화번호 : ");
        String phoneNumber = MenuViewer.scan.nextLine();

        switch (PhonebookVer04.saveNum) {
            case 1:
                phoneInfos[curCnt++] = new PhoneInfo(name, phoneNumber);
                break;
            case 2:
                System.out.print("전공 : ");
                String majar = MenuViewer.scan.nextLine();
                System.out.print("학년 : ");
                int year = MenuViewer.scan.nextInt();
                phoneUnivInfos[curCnt++] = new PhoneUnivInfo(name, phoneNumber, majar, year);
                break;
            case 3:
                System.out.println("회사 : ");
                String company = MenuViewer.scan.nextLine();
                phoneCompanyInfos[curCnt++] = new PhoneCompanyInfo(name, phoneNumber, company);
                break;
        }
        System.out.println("데이터의 입력이 완료 되었습니다.");

    }

    //    public void savePhoneInfo(PhoneInfo phoneInfo) {
//        for (int i = 0; i <= this.phoneInfos.length; i++) {
//            if (checkIndex(i)) {
//                this.phoneInfos[i] = phoneInfo;
//                break;
//            }
//        }
//    }
//
//    public boolean checkIndex(int index){
//        PhoneInfo phoneInfo = this.phoneInfos[index];
//        return  this.phoneInfos[index] == null;
//    }
//    public PhoneInfo[] getPhoneInfos() {
//        return phoneInfos;
//    }
    //데이터 검색
    public void findPhoneInfo() {
        System.out.println("데이터 검색을 시작합니다.");
        System.out.print("이름 : ");
        String name = MenuViewer.scan.nextLine();

        int dataIdx = find(name);
        if (dataIdx < 0) {
            System.out.println("데이터가 존재하지 않습니다.");
        } else if(phoneInfos[dataIdx].equals(name)){
            phoneInfos[dataIdx].showPhoneInfo();
            System.out.println("데이터 검색이 완료되었습니다.");
            System.out.println();
        } else if(phoneUnivInfos[dataIdx].equals(name)){
            phoneUnivInfos[dataIdx].showPhoneInfo();
            System.out.println("데이터 검색이 완료되었습니다.");
            System.out.println();
        } else if(phoneCompanyInfos[dataIdx].equals(name)){
            phoneCompanyInfos[dataIdx].showPhoneInfo();
            System.out.println("데이터 검색이 완료되었습니다.");
            System.out.println();
        }
    }

    private int find(String name) {
        for (int idx = 0; idx < curCnt; idx++) {
            PhoneInfo curInfo = phoneInfos[idx];
            if (name.compareTo(curInfo.getName()) == 0) {
                return idx;
            }
        }
        return -1;
    }
    //데이터 삭제
    public void deletePhoneInfo(String  name){
        for (int i = 0; i < phoneInfos.length; i++) {
            if (name.equals(phoneInfos[i].getName())) {
                if(i == phoneInfos.length -1){
                    phoneInfos[i] = null;
                }else {
                    for (int c = i; c < phoneInfos.length - 1; c++) {
                        phoneInfos[c] = phoneInfos[c + 1];
                    }
                }
                phoneInfos[phoneInfos.length-1]=null;
                break;
            }
        }
    }

}

