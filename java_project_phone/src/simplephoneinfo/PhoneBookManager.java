package simplephoneinfo;

import java.awt.print.PrinterJob;

public class PhoneBookManager {
    public PhoneInfo[] phoneInfos = new PhoneInfo[100];

    public PhoneInfo[] getPhoneInfos() {
        return this.phoneInfos;
    }
    //데이터 저장
    public void savePhoneInfo(String name, String phoneNumber, String birthday){
        for (int i = 0; i < this.phoneInfos.length; i++) {
//            if() {
//                phoneInfos[i] = new PhoneInfo(name, phoneNumber, birthday);
//            } else {
//
//            }
        }
    }



    //데이터 검색






    //데이터 삭제

}
