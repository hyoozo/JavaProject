package simplephoneinfo;

public class PhonebookVer01 {
    public static void main(String[] args) {
        PhoneInfo pif = new PhoneInfo();
        pif.setName("임미경");
        pif.setPhoneNumber("010-2345-6573");
        pif.setBirthday("1965.03.28");

        PhoneInfo pif1 = new PhoneInfo();
        pif1.setName("김현수");
        pif1.setPhoneNumber("011-6435-1249");

        System.out.println(pif.showPhoneInfo());
        System.out.println();
        System.out.println(pif1.showPhoneInfo());
    }
}
