//package phoneinfoproject;
//
//import simplephoneinfo.MenuViewer;
//
//public class PhoneBook {
//    private static final int MAX_CNT = 3;
//    private final PhoneInfoVer04[] obj ;
//    private int count;
//    public PhoneBook() {
//        obj = new PhoneInfoVer04[MAX_CNT];
//        count = 0;
//    }
//    PhoneUnivInfo u = new PhoneUnivInfo();
//    PhoneCompanyInfo c = new PhoneCompanyInfo();
//
//    //데이더 저장
//    public void saveData() {
//        if (obj[2] != null){
//            System.out.println("저장 공간이 없습니다. 연락처를 삭제하거나 종료해주세요.");
//        } else {
//            System.out.print("이름 : ");
//            String name = MenuViewer.scan.nextLine();
//            System.out.print("전화번호 : ");
//            String phoneNumber = MenuViewer.scan.nextLine();
//
//            switch (PhonebookVer04.saveNum) {
//                case 5:
//                    obj[count++] = new PhoneInfoVer04(name, phoneNumber);
//                    break;
//                case 6:
//                    System.out.print("전공 : ");
//                    String major = MenuViewer.scan.nextLine();
//                    System.out.print("학년 : ");
//                    int year = MenuViewer.scan.nextInt();
//                    obj[count++] = new PhoneUnivInfo(name, phoneNumber, major, year);
//                    break;
//                case 7:
//                    System.out.print("회사 : ");
//                    String company = MenuViewer.scan.nextLine();
//                    obj[count++] = new PhoneCompanyInfo(name, phoneNumber, company);
//                    break;
//            }
//            System.out.println("데이터의 입력이 완료 되었습니다.\n");
//            PhonebookVer04.showArr(obj);
//        }
//    }
//
//
//    //데이터 검색
//    public void findPhoneInfo(){
//        System.out.print("이름 : ");
//        String name = MenuViewer.scan.nextLine();
//        for (int i = 0; i < obj.length; i++) {
//            if (obj[i] == null) {
//                System.out.println("검색 데이터가 없습니다.");
//                break;
//            }
//            if (name.equals(obj[i].getName())){
//
//                obj[i].showPhoneInfo();
//                System.out.println("*-------------*\n");
//                System.out.println("데이터 검색이 완료 되었습니다.\n");
//                break;
//            }
//
//        }
//        System.out.println("검색 데이터가 없습니다.");
//    }
//
//    //데이터 삭제
//    public void deletePhoneInfo() {
//        System.out.print("이름 : ");
//        String name = MenuViewer.scan.nextLine();
//        for (int i = 0; i < obj.length; i++) {
//            if (name.equals(obj[i].getName())) {
//                if (i == obj.length - 1) {
//                    obj[i] = null;
//                } else {
//                    for (int c = i; c < obj.length - 1; c++) {
//                        obj[c] = obj[c + 1];
//                    }
//                }
//                obj[obj.length - 1] = null;
//                System.out.println("데이터 삭제가 완료되었습니다.\n");
//                count--;
//                break;
//            }
//        }
//        PhonebookVer04.showArr(obj);
//    }
//}
