package exam_class_basic;

public class EmployeeTest {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.human("홍길동","010-4565-8888",1000000);
        System.out.println(employee.toString());



        Employee emp = new Employee();
        emp.human("김철수","010-7894-5612",700000);
        System.out.println(emp.toString());


    }
}