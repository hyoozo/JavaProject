package hy_test_day6_super;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("홍길동",56);
        Student student = new Student("한늘봄", 41, 99010001);
        ForeignStudent foreignStudent = new ForeignStudent("Olivia",39,97060004,"U.S.A");

        System.out.println(person.show());
        System.out.println(student.show());
        System.out.println(foreignStudent.show());
    }
}
