package exam_interface;

@SuppressWarnings("rawtypes")
public class Student implements Comparable {
    private String name;
    private double gpa; //평점

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return "이름 = "+ name + "   평점= "+gpa;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student) o;
        if (this.gpa < other.gpa) {
            return  -1;
        } else if (this.gpa > other.gpa) {
            return 1;
        }
            return 0;
    }
}
