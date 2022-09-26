package hy_test_day7_interface;

//부록 CD클래스
public class AppCDInfo extends CDInfo implements Lendable  {
    private String borrower; //대출인
    private String checkOutDate; //대출일
    private String sate; //대출상태

    public String getSate() {
        return getTitle()+"CD가 대출되었습니다.";
    }

    @Override
    public void checkOut(String borrower, String date) {
        System.out.println("대출인 : "+borrower);
        System.out.println("대출일 : "+date);
        System.out.println();
    }

    @Override
    public void checkIn() {
        System.out.println(getTitle()+"CD가 반납되었습니다.");
        System.out.println();
    }
}
