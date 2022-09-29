package phoneinfoproject;

public class PhoneInfoVer04 {
    private String name;
    private String phoneNumber;

    public PhoneInfoVer04() {

    }

    public PhoneInfoVer04(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
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

    public void showPhoneInfo() {
        System.out.println("[입력된 정보 출력]");
        System.out.println("이름 : " + name);
        System.out.println("번호 : " + phoneNumber);
    }
}

