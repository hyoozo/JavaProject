package phoneinfoproject;
//회사 동료들의 전화번호 저장
public class PhoneCompanyInfo extends PhoneInfoVer04 {

    private String company;  //회사

    public PhoneCompanyInfo(){

    }
    public PhoneCompanyInfo(String name, String phoneNumber, String company) {
        super(name, phoneNumber);
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public void showPhoneInfo() {
        super.showPhoneInfo();
        System.out.println("직업 : " +company);
    }
}
