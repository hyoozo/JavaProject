package hy_test_day7_interface;

public class SeparateVolume implements Lendable{
    public String requestNo;
    public String bookTitle;
    public String writer;
    public String borrower;
    public String checkOutDate;
    public String state;

    @Override
    public String checkOut(String borrower, String date) {
        System.out.println(this.bookTitle+"("+this.writer+")"+ "이(가) 대출되었습니다.");
        System.out.println("대출인 : "+borrower);
        System.out.println("대출일 : "+date);
        return null;
    }

    @Override
    public String checkIn() {
        return this.bookTitle+ "이(가) 반납되었습니다.";
    }
}
