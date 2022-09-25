package hy_test_day7_abstract;

public abstract class MessageSender {  //추상클래스
    private String title;
    private String senderName;

    public MessageSender(){

    }
    public MessageSender(String title, String senderName) {
        this.title = title;
        this.senderName = senderName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public abstract void sendMessage(String recipient);  // 추상메서드는 {} 본문을 가질 수 없다.
}
