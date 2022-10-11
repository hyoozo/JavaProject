package exam_collectionTest;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentManager {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StudentMethod sm = new StudentMethod();
        ArrayList<Student> st = new ArrayList<>();

        while (true) {
            try {
                System.out.println("* 입력을 원하시면 \"입력\"" +
                        " \n* 종료를 원하면 \"종료\" 라고 적으세요.");
                String choice = sc.nextLine();

                if (choice.equals("종료")) {
                    sm.processQuery();
//                break;
                } else if (choice.equals("입력")) {
                    Student obj = sm.inputData();
                    st.add(obj);
                    sc.nextLine();
                    sm.printAll(st);
                } else {
                    System.out.println("Error");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error");
                sc.nextLine();
            }
        }
    }
}

