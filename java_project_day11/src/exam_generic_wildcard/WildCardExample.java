package exam_generic_wildcard;

import java.util.Arrays;

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
//직장인 클래스
class Worker extends Person {
    public Worker(String name) {
        super(name);  //.super 생략하면 오류남. 왜냐하면 Person 기본생성자가 없기떄문에
    }
}
//학생 클래스
class Student extends Person {
    public Student(String name) {
        super(name);
    }
}
//고등학교 클래스
class HighStudent extends Person {
    public HighStudent(String name) {
        super(name);
    }
}

class Course<T>{
    private String name; //강좌명
    private T[] students; //학생

    @SuppressWarnings("unchecked")
    public Course(String name, int size) {
                                //주소를 받는게 아닌, 사이즈를 받겠다는 의미
        this.name = name;
        students = (T[])(new Object[size]);
//        students = new T[size];
                    // T에러   틀린문법이다. t는 타입의 매개변수로
    }

    public String getName(){
        return name;
    }
    public T[] getStudents(){
        return students;
    }

    public void add(T t) {
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){  //배열이 비어있다면?
                students[i] = t;  //i번째에 학생대입..
                break;
            }
        }
    }
}
public class WildCardExample {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }
    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + " 수강생: " + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        //일반인 과정
        Course<Person> personCourse = new Course<>("일반인과정", 4);
        personCourse.add(new Person("일반인"));
        personCourse.add(new Worker("직장인"));
        personCourse.add(new Student("학생"));
        personCourse.add(new HighStudent("고등학생"));

        //직장인 과정
        Course<Worker> workerCourse = new Course<>("직장인과정", 1);
        workerCourse.add(new Worker("직장인"));

        //학생 과정
        Course<Student> studentCourse = new Course<>("학생과정", 2);
        studentCourse.add(new Student("학생"));
//        studentCourse.add(new HighStudent("고등학생"));

        //고등학교 과정
        Course<HighStudent> highStudentCourse = new Course<>("고등학생과정", 1);
        highStudentCourse.add(new HighStudent("고등학생"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

//        registerCourseStudent(personCourse);  //x
//        registerCourseStudent(workerCourse);  //x
        registerCourseStudent(studentCourse);
//        registerCourseStudent(highStudentCourse);
        System.out.println();


        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);
//        registerCourseWorker(studentCourse);  //x
//        registerCourseWorker(highStudentCourse);  //x
    }
}
