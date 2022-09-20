package simplephoneinfo;
public class PhonebookVer01 {
    public static void main(String[] args) {
        PhoneInfo p1 = new PhoneInfo("임미경","010-2345-6573","1965.03.28");
        PhoneInfo p2 = new PhoneInfo("김현수","011-6435-1249");

        p1.showPhoneInfo();
        p2.showPhoneInfo();

    }
}
