package exam_inheritance;

public class Employee extends Person{
    private String dept;
    public Employee(){
        super();
    }

    public Employee(String name, int age, String dept) {
        super(name, age);
        this.dept = dept;
    }

    public String getDept(){
        return dept;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    public String toString(){
        return super.toString()+":"+getDept();
    }
}

class Test{
    public static void main(String[] args) {
        Employee a = new Employee("현주",20,"ㅎㅎ");
        System.out.println(a);
    }
}