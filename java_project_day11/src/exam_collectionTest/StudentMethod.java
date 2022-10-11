package exam_collectionTest;

import java.util.ArrayList;
import java.util.InputMismatchException;

public class StudentMethod {

    public Student inputData() throws InputMismatchException {   //저장하는 메소드 , grade 에서 문자 입력시 에러 잡기
        System.out.print("이름 : ");
        String name = StudentManager.sc.nextLine();
        System.out.print("학과 : ");
        String department = StudentManager.sc.nextLine();
        System.out.print("학번 : ");
        String id = StudentManager.sc.nextLine();
        System.out.print("학점 평균 : ");
        int grade = StudentManager.sc.nextInt();
        return new Student(name,department,id,grade);
    }
    public void processQuery(){   //프로그램 종료하는 메소드
        System.out.println("프로그램을 종료합니다.");
        System.exit(0);
    }
    public void printAll(ArrayList<Student> students) {   //배열 출력하는 메소드
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
