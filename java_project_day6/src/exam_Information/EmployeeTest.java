package exam_Information;

public class EmployeeTest {
    public static void main(String[] args) {
//        Manager e = new Manager();
//        e.setName("이현주");
//        e.setAddress("용산구");
//        e.setPhoneNumber("4561");
//        e.setSalary(5000);
//        e.setBonus(500);
//        e.setJob("프로그래머");
//
//        Manager m1 = new Manager("현주","용산","7777",6000,344,"프로그래머짱");
//
//        Employee employee = new Employee("김철수","영등포","010-8888",1500000);
//        System.out.println(e.toString());
//        System.out.println(m1.toString());
//        System.out.println(employee.toString());

        Employee[] em = {
                new Employee("이진희","서울시 영등포", "010-2353-3553",1500000),
                new Manager("홍길동","성동구","010-7869-0987",20000,10000,"대리")
                };
        for (int i = 0; i < em.length; i++) {
            System.out.println(em[i]);
            System.out.println(em[i].toString());  //위와 동일.
        }
//        for (Employee ee : em) {      // 향상된 for문
//            System.out.println(ee);
//        }

    }
}
