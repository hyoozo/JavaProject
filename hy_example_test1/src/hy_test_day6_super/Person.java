package hy_test_day6_super;

public class Person {
    private String name;
    private int age;
    public Person(){

    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String show(){
        return "이름 : "+ name + " 나이 : "+age;
    }
}
