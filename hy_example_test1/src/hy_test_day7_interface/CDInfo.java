package hy_test_day7_interface;

public class CDInfo {
    private String registerNo; //관리번호
    private String title; //타이틀

    public CDInfo(){

    }

    public CDInfo(String registerNo, String title) {
        this.registerNo = registerNo;
        this.title = title;
    }

    public String getRegisterNo() {
        return registerNo;
    }

    public void setRegisterNo(String registerNo) {
        this.registerNo = registerNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
