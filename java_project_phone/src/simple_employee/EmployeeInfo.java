package simple_employee;

public class EmployeeInfo {
    private String empNo; //사번
    private int basicPay; //기본급
    private int extraPay; //수당
    private int tax; //세금
    private int salary; //실수령액
    private String grade; //등급

    public EmployeeInfo (String empNo, int basicPay) {
        this.empNo = empNo;
        this.basicPay = basicPay;
        this.extraPay = (int) (this.basicPay * 0.15);
        this.tax = (int) (this.basicPay * 0.20);
        this.salary = this.basicPay + this.extraPay - this.tax;
        if(this.salary > 500000){
            this.grade = "관리자";
        }else {
            this.grade = "영업";
        }
    }
    public String getEmpNo(){
        return this.empNo;
    }
    public int getBasicPay(){
        return basicPay;
    }
    public int getExtraPay(){
        return this.extraPay;
    }
    public int getTax(){
        return this.tax;
    }
     public int getSalary(){
        return this.salary;
    }
    public String getGrade(){
        return this.grade;
    }
}
