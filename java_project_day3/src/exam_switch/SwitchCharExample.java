package exam_switch;

public class SwitchCharExample {
    public static void main(String[] args) {
        char grade = 'B';

        switch (grade) {     //java 12 이후부터는 switch 문에서 break 문을 없애는 대신에 ->를 사용합니다.
            case 'A', 'a' -> System.out.println("우수 회원입니다.");
            case 'B', 'b' -> System.out.println("일반 회원입니다.");
            default -> System.out.println("손님입니다.");
        }
    }
}
// 버전에 맞는 코드를 사용할때는 버전을 꼭 사용하고 웬만하면 모든 버전에 맞는 코드를 작성한다.
