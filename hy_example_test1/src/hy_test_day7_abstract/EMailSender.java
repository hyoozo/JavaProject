package hy_test_day7_abstract;

public class EMailSender extends MessageSender{
    private String senderAddr; //발송자 주소
    private String emailBody;  //이메일 내용

    public EMailSender(){

    }
    public EMailSender(String title, String senderName, String senderAddr, String emailBody){
        super(title, senderName);
        this.senderAddr = senderAddr;
        this.emailBody = emailBody;
    }
    public String getSenderAddr(){
        return senderAddr;
    }

    public void setSenderAddr(String senderAddr) {
        this.senderAddr = senderAddr;
    }

    public String getEmailBody(){
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    @Override
    public void sendMessage(String recipient) {
        System.out.println("===============================");
        System.out.println("제목 : "+getTitle());
        System.out.println("보내는 사람 : "+getSenderName()+"  " + senderAddr);
        System.out.println("받는 사람 : "+recipient);
        System.out.println("내용 : "+emailBody);

    }
}
