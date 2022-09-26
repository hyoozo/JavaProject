package exam_interface_check;

public class MessengerTest {
    public static void main(String[] args) {
//        Messenger msg = new Messenger(); // 인터페이스도 인스턴스를 생성할 수 없다.

        IPhoneMessenger iPhone = new IPhoneMessenger();
        GalaxyMessenger galaxy = new GalaxyMessenger();

        System.out.println("메신저 최소 문자 크기"+Messenger.MIN_SIZE);
        //메신저 최소 문자 크기1
        System.out.println("메신저 최대 문자 크기"+Messenger.MAX_SIZE);
        //메신저 최대 문자 크기104857600

        iPhone.setLogin(true);//start job!!!
                                //로그인 처리합니다.
        System.out.println(iPhone.getMessage());//iPhone
        iPhone.setMessage("난 아이폰 셋 메세지 인자값이다. ㅋㅋ");  //iPhone에서 메시지를 설정합니다. : 난 아이폰 셋 메세지 인자값이다. ㅋㅋ
        iPhone.clearMessage();  //좌우로 흔들어 문자열을 지웁니다.

        iPhone.draw_textBox();
        iPhone.draw_textBox(); //텍스트 상자를 그린다.

        galaxy.setLogin(true);//start job!!! 로그인 처리합니다.
        System.out.println(galaxy.getMessage());//galaxy
        galaxy.setMessage("난 갤럭시 셋 메세지 인자값이다 ㅋㅋ");//galaxy에서 메시지를 설정합니다. : 난 갤럭시 셋 메세지 인자값이다 ㅋㅋ
        galaxy.changeKeyboard();//키보드아이콘 터치 후 키보드를 변경합니다.

        galaxy.fileUpload();//file을 업로드합니다.
        galaxy.fileDownload();//file을 다운로드합니다.
    }
}
