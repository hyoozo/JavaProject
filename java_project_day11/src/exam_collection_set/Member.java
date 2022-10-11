package exam_collection_set;

import javax.swing.plaf.PanelUI;
import java.util.Objects;

public class Member {
    private String name;
    private int age;

    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("member - (name : %s, age : %d) ",name,age);
    }
    // 나이 비교
    /*
    public boolean equals(Object obj) {   //obj로 부터 상속받은 맴버
        if (obj instanceof Member) {
            Member member = (Member) obj;  //맴버의 접근이 가능하게 변환.
            if (this.age == member.age) { //객체의 나이와 매개변수로 받아온 나이가 같으면
                return true;
            }
        }
        return false;
    }
    @Override
    public int hashCode() {
        return age;
    }
     */

    //이름 비교
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member) {
            Member member = (Member) obj;
            if (name.equals(member.name)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }


}
