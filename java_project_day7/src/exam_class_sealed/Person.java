package exam_class_sealed;

public sealed class Person permits Employee, Manager {
    //필드
    public String name;

    public void work(){
        System.out.println("하는 일이 결정되지 않았습니다.");
    }
}
