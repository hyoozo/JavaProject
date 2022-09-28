package exam_interface;

import java.util.Arrays;

public class StudentSort {
    public static void main(String[] args) {
        //5개의 숫자를 오름차순 정렬하여 출력하는 코드
        int[] numbers = {60, 88, 10, 45, 90};
        Arrays.sort(numbers);
        //배열정렬이라는 매서드를 가져온것이다.

        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        //3명의 학생 평점으로 오름차순 정렬하여 출력하는 코드를 작성해 주세요.
        Student[] students = new Student[3];
        students[0] = new Student("홍길동", 3.39);
        students[1] = new Student("이한솔", 4.21);
        students[2] = new Student("김희진", 2.19);
        Arrays.sort(students);
        //implements Comparable
        //Overried 재정의 해줘야 실행이 된다.
        //sort 는 어떤값으로 정의를 해야되는지 알려줘야 하기때문이다.

        for (Student s : students) {
            System.out.println(s.toString());           //출력 첫번째 방법 (향상된 for문)
        }
        System.out.println();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].toString()); //출력 두번째 방법
        }
    }
}
