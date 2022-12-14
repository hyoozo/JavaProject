package phoneinfoproject;

public class PhoneInfoVer04 {
    private String name;
    private String phoneNumber;
    private String group;

    public PhoneInfoVer04() {

    }

    public PhoneInfoVer04(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.group = "일반";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void showPhoneInfo() {
        System.out.println("*---- "+getGroup()+" ----*");
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phoneNumber);

    }

}

