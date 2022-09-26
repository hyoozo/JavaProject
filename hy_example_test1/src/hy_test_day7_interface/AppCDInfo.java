package hy_test_day7_interface;

//부록 CD클래스
public class AppCDInfo extends CDInfo implements Lendable  {
    public String borrower; //대출인
    public String checkOutDate; //대출일
    public String sate; //대출상태

    @Override
    public String checkOut(String borrower, String date) {
        System.out.println(borrower+"가 대출되었습니다.");
        System.out.println("대출인 : " + this.borrower);
        System.out.println("대출일 : " + date);
        return this.borrower;
    }

    @Override
    public String checkIn() {
        return this.borrower+"가 반납되었습니다.";
    }
}
