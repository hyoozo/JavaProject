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
//        if(birthday != "")
            this.birthday = birthday;
//        else
//            this.phoneNumber = "";
    }
    public String showPhoneInfo(){
        if(birthday != "") {
            return "name : " + this.name + "\nphone : " + this.phoneNumber + "\nbirthday : " +this.birthday ;
        } else {
            return "name : " + this.name + "\nphone : " + this.phoneNumber ;
        }

    }
}
