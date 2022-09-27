package simplephoneinfo;
public class PhoneBookManager {
    private final PhoneInfo[] phoneInfos = new PhoneInfo[100];

//    public void savePhoneInfo(String name, String phoneNumber, String birthday) {
//        for (int i = 0; i < phoneInfos.length; i++) {
//
//            if (phoneInfos[i] == null) {
//                phoneInfos[i] = new PhoneInfo(name, phoneNumber, birthday);
//                break;
//            } else if(i == phoneInfos.length-1){
//                System.out.println("저장 공간이 없습니다.");
//                continue;
//            } else {
//                continue;
//            }
//
//        }
//    }
    //데이터 저장 (도형)
    public void savePhoneInfo(PhoneInfo phoneInfo) {
        for (int i = 0; i <= this.phoneInfos.length; i++) {
            if (checkIndex(i)) {
                this.phoneInfos[i] = phoneInfo;
                break;
            }
        }
    }
    public boolean checkIndex(int index){
        PhoneInfo phoneInfo = this.phoneInfos[index];
        return  this.phoneInfos[index] == null;
    }
    public PhoneInfo[] getPhoneInfos() {
        return phoneInfos;
    }
    //데이터 검색 (현주)
    public void findPhoneInfo(String name) {
        for (int i = 0; i < phoneInfos.length; i++) {
            if (name.equals(phoneInfos[i].getName())) {
                System.out.println("이름 : " + phoneInfos[i].getName());
                System.out.println("전화번호 : " + phoneInfos[i].getPhoneNumber());
                System.out.println("생년월일 : " + phoneInfos[i].getBirthday());
                System.out.println("데이터의 검색이 완료 되었습니다.");
                break;
            }
        }
    }
    //데이터 삭제 (은경)
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
//    public void deletePhoneInfo(String name) {
//        for (int i = 0; i < phoneInfos.length; i++) {
//            if (name.equals(phoneInfos[i].getName())) {
//                for (int j = i; j < phoneInfos.length; j++) {
//                    if (j != phoneInfos.length - 1) {
//                        phoneInfos[j] = phoneInfos[j + 1];
//                    } else {
//                        phoneInfos[j] = null;
//                        break;
//                    }
//                }
//                break;
//            }
//        }
//    }
}
