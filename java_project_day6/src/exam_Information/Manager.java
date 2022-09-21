package exam_Information;

public class Manager extends Employee{
    private int bonus;
    private String job;

    public int getBonus() {
        return bonus;
    }
    public String getJob() {
        return job;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public void setJob(String job) {
        this.job = job;
    }
    public void setMgrData(String name, String address, String phoneNumber, int salary){
        setEmpData(name, address, phoneNumber, salary);
        this.job = job;
        this.bonus = bonus;
    }

    public String toString(){
        return super.toString()+
                "\n보너스 : "+ getBonus()+
                "\n직업 : "+ getJob();
    }
    public static void main(String[] args) {
        Manager e = new Manager();
        e.setName("이현주");
        e.setAddress("용산구");
        e.setPhoneNumber("4561");
        e.setSalary(5000);
        e.setBonus(500);
        e.setJob("프로그래머");
        System.out.println(e.toString());

    }
}
