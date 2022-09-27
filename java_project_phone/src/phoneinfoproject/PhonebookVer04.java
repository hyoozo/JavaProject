//package phoneinfoproject;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class PhonebookVer04 {
//    private static String name;
//    private static String phoneNumber;
//    private static String major;
//    private static int year;
//    private static String company;
//    static int dataNum = 0;
//
//    public static void showArr(PhoneInfo[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            try {
//                System.out.println(arr[i].getName());
//            } catch (NullPointerException e) {
//                continue;
//            }
//        }
//    }
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        PhoneBookManager book = new PhoneBookManager();
//
//        int num = 0;
//
//        do {
//            System.out.println("선택하세요.");
//            System.out.print("1. 데이터 입력 \n2. 데이터 검색 \n3. 데이터 삭제 \n4. 프로그램 종료 \n선택 : ");
//            try{
//                num = scan.nextInt();
//            } catch (InputMismatchException e) {
//                System.out.println("숫자만 입력하세요.");
//            }
//            scan.nextLine();
//
//            if (num == 1) {
//                System.out.print("1. 일반 \t2. 대학\t3. 회사\n선택>> ");
//                try{
//                    dataNum = scan.nextInt();
//                } catch (InputMismatchException e) {
//                    System.out.println("숫자만 입력하세요.");
//                }
//                scan.nextLine();
//
//                if ( dataNum == 1){
//                    System.out.print("이름 : ");
//                     name = scan.nextLine();
//                    System.out.print("전화번호 : ");
//                     phoneNumber = scan.nextLine();
//
//                    book.savePhoneInfo(new PhoneInfo(name,phoneNumber));  //일반정보 입력.
//                    System.out.println("데이터 입력이 완료되었습니다.");
//                    showArr(book.getPhoneInfos());
//
//                } else if (dataNum == 2) {
//                    System.out.print("이름 : ");
//                     name = scan.nextLine();
//                    System.out.print("전화번호 : ");
//                     phoneNumber = scan.nextLine();
//                    System.out.print("전공 : ");
//                     major = scan.nextLine();
//                    System.out.print("학년 : ");
//                     year = scan.nextInt();
//
//                    book.savePhoneInfo(new PhoneUnivInfo(name,phoneNumber,major,year));  //학교정보 입력
//                    System.out.println("데이터 입력이 완료되었습니다.");
//
//                } else if (dataNum == 3) {
//                    System.out.print("이름 : ");
//                     name = scan.nextLine();
//                    System.out.print("전화번호 : ");
//                     phoneNumber = scan.nextLine();
//                    System.out.print("회사 : ");
//                     company = scan.nextLine();
//
//                    book.savePhoneInfo(new PhoneCompanyInfo(name, phoneNumber, company)); //회사정보 입력
//                    System.out.println("데이터 입력이 완료되었습니다.");
//
//                }
//
//            } else if (num == 2) {
//                System.out.println("데이터 검색을 시작합니다.");
//                System.out.print("이름 : ");
//                name = scan.nextLine();
//                book.findPhoneInfo(name);
//
//            } else if (num == 3) {
//                System.out.println("데이터 삭제를 시작합니다.");
//                System.out.print("이름 : ");
//
//                 name = scan.nextLine();
//                book.deletePhoneInfo(name);
//                System.out.println("데이터 삭제가 완료되었습니다.");
//
////                showArr(pbManager.getPhoneInfos());
//            }
//        } while (num != 4);
//        System.out.println("프로그램을 종료합니다.");
//
//    }
//}
