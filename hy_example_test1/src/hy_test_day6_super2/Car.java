package hy_test_day6_super2;

public class Car {
    private String color;
    private int account;

    public Car(String color, int account){
        this.color = color;
        this.account = account;
    }

    public String getColor() {
        return color;
    }

    public int getAccount() {
        return account;
    }
    public String toString(){
        return "[색상]  " + color + "  [생산수량]  "+account;
    }
}
