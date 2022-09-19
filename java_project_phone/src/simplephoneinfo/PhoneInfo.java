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
//        if (showPhoneInfo()) {
//            "name: " + name + "\nphone: " + phoneNumber + "\nbirth: " + birthday;
//        }
    }
}
