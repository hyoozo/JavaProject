package exam_inner_class;

import exam_interface_check.Messenger;

public class MessengerTest {
    public static void main(String[] args) {

        // 이거슨 말이죠<<<< 익 명 클 래 스 >>>>>입니다.
        Messenger test = new Messenger() {
            @Override
            public String getMessage() {
                return " 점심 맛있게 먹으라구 ";
            }

            @Override
            public void setMessage(String msg) {
                System.out.println("test에서 메시지를 설정합니다. : " + msg);
            }
        };  // ; 세미콜론 붙이라구!!!!!!!!!!!!!!!!!!!

        System.out.println(test.getMessage());
        test.setMessage("아주 조흔날입니다요 ㅋ ㅋ ㅋ ㅋ ");
    }
}
