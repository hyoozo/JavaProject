package hy_test_day6_super2;

public class CarMain {
    public static void main(String[] args) {
        Monata[] monata = {new Monata("흰색",5000,"승용","NF"),
                            new Monata("은색",7000,"업무","Brilliant"),
                            new Monata("감홍색",4000,"택시","EF"),
                            new Monata("검정색",6000,"승용","Hybrid")};

        for (int i = 0; i < monata.length; i++){
            System.out.println(monata[i]);
        }
    }
}
