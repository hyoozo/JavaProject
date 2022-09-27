package phoneinfoproject;
//대학(학교) 동기들의 전화번호 저장
public class PhoneUnivInfo extends PhoneInfo{
    private String major;
    private int year;

    public PhoneUnivInfo(){

    }

    public PhoneUnivInfo(String name, String phoneNumber, String major, int year) {
        super(name, phoneNumber);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
