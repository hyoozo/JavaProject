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

    public void setEmpNo(String empNo){  // 초기화
        this.empNo = empNo;
    }
    public String getEmpNo(){
        return this.empNo;
    }
    public void setBasicPay(int basicPay){
        this.basicPay = basicPay;
    }
    public int getBasicPay(){
        return basicPay;
    }

    public void setExtraPay(int basicPay){
        this.extraPay = (int)(basicPay * 0.15);
    }
    public int getExtraPay(){
        return this.extraPay;
    }

//    public void setTax(int basicPay){
//        this.tax = (int)(basicPay * 0.20);
//    }
    public int getTax(){
        return this.tax;
    }

    public void setSalary(int basicPay, int extraPay, int tax){
        this.salary = basicPay + extraPay - tax;
    }
    public int getSalary(){
        return this.salary;
    }

    public void setGrade(int salary){
        if(salary > 500000){
            this.grade = "관리자";
        }else {
            this.grade = "영업";
        }
    }
    public String getGrade(){
        return this.grade;
    }
}
