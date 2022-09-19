package simplephoneinfo;

import java.util.Objects;

public class PhoneInfo {
    private String name;
    private String phoneNumber;
    private String birthday;

    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void showPhoneInfo() {
        if(!this.birthday.equals("")) {
            System.out.println(
                    "[입력된 정보 출력]" +
                            "\nName: " + this.name +
                            "\nPhone Number: " + this.phoneNumber +
                            "\nBirthday: " + this.birthday);
        }else{
            System.out.println(
                    "[입력된 정보 출력]"+
                            "\nName: " + this.name +
                            "\nPhone Number: " + this.phoneNumber );
        }
    }
}
