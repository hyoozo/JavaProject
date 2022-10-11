package exam_collectionTest;

public class Student {
    private String name;
    private String department;
    private int grade;
    private String id;

    public Student(String name, String department, String id, int grade){
        this.name =  name;
        this.department = department;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getGrade() {
        return grade;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[이름: " +getName()+" | 학과: "+getDepartment()+" | 학번: "+getId()+" | 학점평균: "+getGrade()+"]";
    }
}
