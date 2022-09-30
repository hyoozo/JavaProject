package simplephoneinfo;
public class PhonebookVer03 {
//    public static void showArr(PhoneInfo[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            try {
//                System.out.println(arr[i].getName());
//            } catch (NullPointerException e) {
//                continue;
//            }
//        }
//    }
    public static void main(String[] args) {
        PhoneBookManager pbManager = new PhoneBookManager();

        int num = 0;
        do {
            MenuViewer.showMenu();
            num = MenuViewer.scan.nextInt();
            MenuViewer.scan.nextLine();

            if (num == 1) {
                System.out.print("이름 : ");
                String name = MenuViewer.scan.nextLine();
                System.out.print("전화번호 : ");
                String phoneNumber = MenuViewer.scan.nextLine();
                System.out.print("생년월일 : ");
                String birthday = MenuViewer.scan.nextLine();

//                pbManager.savePhoneInfo(name, phoneNumber, birthday);
                pbManager.savePhoneInfo(new PhoneInfo(name, phoneNumber, birthday));
                System.out.println("데이터 입력이 완료되었습니다.");
//                showArr(pbManager.getPhoneInfos());

            } else if (num == 2) {
                System.out.println("데이터 검색을 시작합니다.");

                String name = MenuViewer.scan.nextLine();
                pbManager.findPhoneInfo(name);

            } else if (num == 3) {
                System.out.println("데이터 삭제를 시작합니다.");
                System.out.print("이름 : ");

                String name = MenuViewer.scan.nextLine();
                pbManager.deletePhoneInfo(name);

//                System.out.println("데이터의 삭제가 완료되었습니다.");
//                showArr(pbManager.getPhoneInfos());
            }
        } while (num != 4);
        System.out.println("프로그램을 종료합니다.");
    }
}
