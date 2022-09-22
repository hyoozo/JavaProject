package hy_test_day6_super2;

public class Monata extends Car {
    private String series;
    private String use;

    public Monata(String color, int account, String series, String use){
        super(color, account);
        this.series = series;
        this.use = use;
    }
    public String toString(){
        return super.toString() + "  [용도]  "+use +"  [시리즈]  "+series;
    }
}
