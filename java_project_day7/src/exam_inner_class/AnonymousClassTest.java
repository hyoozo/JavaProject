package exam_inner_class;

import exam_interface.RemoteControl;

public class AnonymousClassTest {
    public static void main(String[] args) {
        //RemoteControl ac = new RemoteControl(); 객체 생성 불가능

        //이름없는 클래스의 부모.. 이름이 없는 클래스가 상속받은 객체
        RemoteControl ac = new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("TV 전원 켜기~~ On !");
            }

            @Override
            public void turnOff() {
                System.out.println("TV 전원 끄기 ~~ Off !");
            }

            @Override
            public void setVolume(int volume) {
            }
        };  //이름 없는 클래스 선언  뒤에 ; 세미콜론 붙이기기기기기기!!!!!!!
        ac.turnOn();
        ac.turnOff();
        /*  console
            TV 전원 켜기~~ On !
            TV 전원 끄기 ~~ Off !
         */
    }
}
