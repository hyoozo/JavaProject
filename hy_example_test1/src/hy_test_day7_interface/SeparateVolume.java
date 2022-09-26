package hy_test_day7_interface;

public class SeparateVolume implements Lendable{
    private String requestNo;  //청구번호
    private String bookTitle; //제목
    private String writer; //저자
    private String borrower; //대출인
    private String checkOutDate; //대출일
    private String state; //대출상태

    public String getState() {
        return getBookTitle()+"("+getWriter()+") 이(가) 대출되었습니다.";
    }

    @Override
    public void checkOut(String borrower, String date) {
        System.out.println("대출인 : "+borrower);
        System.out.println("대출일 : "+date);
        System.out.println();

    }

    @Override
    public void checkIn() {
        System.out.println(getBookTitle()+ "이(가) 반납되었습니다.");
        System.out.println();
    }
    public String getBookTitle() {
        return bookTitle;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
