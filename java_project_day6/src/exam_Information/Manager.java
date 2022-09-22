package exam_Information;

public class Manager extends Employee{
    private int bonus;
    private String job;

    public Manager(){

    }
    public Manager(String name, String address, String phoneNumber, int salary, int bonus, String job){
        super(name,address,phoneNumber,salary);   //super()는 부모 클래스의 생성자 호출
        this.bonus = bonus;
        this.job = job;
    }
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
    }

    public String toString(){
        return super.toString()+ "\t보너스 : "+ getBonus()+ "\t직업 : "+ getJob();
    }

}
