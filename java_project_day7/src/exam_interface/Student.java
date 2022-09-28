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
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        //학생이 가지고 있는 평점이 필요해서 (Student)로 형변환한것임.
//        // Arrays.sort(students); 이 코드를 실행하기 위해 평점을 기준으로 정령한다고 재정의한것임
//        if (this.gpa < other.gpa) {
//            return  -1;
//        } else if (this.gpa > other.gpa) {
//            return 1;
//        } else {
//            return 0;
//        }
//    }

    //public final class String 이 String은 부모가 될수없다.
    //Implements에 CompareTo가 있다.
    //문자열 정렬시 해주는 재정의 이다.
    public int compareTo(Object a){
        Student other = (Student) a;
            return this.name.compareTo(other.name);
    }
}
