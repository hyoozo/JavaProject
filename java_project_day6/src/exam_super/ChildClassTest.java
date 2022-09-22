package exam_super;
    class ParentClass{   // 같은 패키지 않에 클래스를 만들경우 public을 제외한다...!!
        protected int data;
        public ParentClass(){
            data = 100;
        }
        public void print(){
            System.out.println("super클래스(ParentClass)의 print()메서드 실행된거임");
        }
    }
    class ChildClass extends ParentClass{
        protected int data;
        public ChildClass(){
            data = 200;
        }

        @Override
        public void print() {
            super.print();
            System.out.println("서브 클래스(나는 ChildClass 의 print()메서드 실핸된거임... ㅡㅡ");
            System.out.println("data는 "+ data);
            System.out.println("this. data는 "+ this.data+"   200이 나오겠찌??");
            System.out.println("super.data는 "+super.data+"   100이 나오겠지??");
        }
    }
public class ChildClassTest {
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.print();
    }
}


