package exam_class_basic;

public class Employee {
    public String name;
    public String phoneNumber;
    public int salary;
//    public String toString(String name, String phonNumber, int salary){
//        return "직원정보[ 사원명:"+name+", 전화번호="+phonNumber+", 급여 ="+salary+"]";
//    }
    public void human(String name, String phoneNumber, int salary){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }
    public String toString(){
        return String.format("직원정보[ 사원명: %s, 전화번호= %s, 급여= %d]",name,phoneNumber,salary);
    }
}
