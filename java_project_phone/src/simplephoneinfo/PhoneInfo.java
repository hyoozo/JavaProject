package simplephoneinfo;

import java.util.Objects;

public class PhoneInfo {
    private String name;
    private String phoneNumber;
    private String birthday;

    public PhoneInfo(String name, String phoneNumber, String birthday){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
    }
    public PhoneInfo(String name, String phoneNumber){
//        this.name = name;
//        this.phoneNumber = phoneNumber;
        this(name,phoneNumber,null);
    }
    public PhoneInfo(){

    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void showPhoneInfo(){
        System.out.println("name : "+ name);
        System.out.println("phoneNumber : "+phoneNumber);
        if(birthday != null) {
            System.out.println("birthday : "+birthday);
        }
        System.out.println();
    }
    public void showPhoneInfo2(){
        System.out.println( "[입력된 정보 출력]");
        System.out.println("name : "+ name);
        System.out.println("phoneNumber : "+phoneNumber);
        if(!this.birthday.equals("")) {
            System.out.println("birthday : "+birthday);
        }
        System.out.println();
    }
}
