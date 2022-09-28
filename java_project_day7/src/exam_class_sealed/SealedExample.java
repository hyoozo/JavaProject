package exam_class_sealed;

public class SealedExample {
    public static void main(String[] args) {
        Person p = new Person();
        Employee e = new Employee();
        Manager m = new Manager();
        Director d = new Director();

        p.work();  //        하는 일이 결정되지 않았습니다.
        e.work();  //        제품을 생산합니다.
        m.work();  //        생산 관리를 합니다.
        d.work();  //        제품을 기획합니다.

        Person[] p1 = {
                    new Person(),
                    new Employee(),
                    new Manager(),
                    new Director()
        };

        for (Person per : p1) {
            per.work();
        }
        /* console
        하는 일이 결정되지 않았습니다.
        제품을 생산합니다.
        생산 관리를 합니다.
        제품을 기획합니다.
         */
    }
}
