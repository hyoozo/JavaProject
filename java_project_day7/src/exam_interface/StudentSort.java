package exam_interface;

import java.util.Arrays;

public class StudentSort {
    public static void main(String[] args) {
        //5개의 숫자를 오름차순 정렬하여 출력하는 코드
        int[] numbers = {60, 88, 10, 45, 90};
        Arrays.sort(numbers);

        for (int num : numbers) {
            System.out.println(num + " ");
        }
        System.out.println("\n");

        //3명의 학생 평점으로 오름차순 정렬하여 출력하는 코드를 작성해 주세요.
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 3.39);
        students[1] = new Student("이한솔", 4.21);
        students[2] = new Student("김희진", 2.19);
        Arrays.sort(students);

        for (Student s : students) {
            System.out.println(s.toString());
        }
    }
}
