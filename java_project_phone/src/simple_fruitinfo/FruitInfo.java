package simple_fruitinfo;

public class FruitInfo {
    private String fname;
    private int price;
    public FruitInfo(){  //디폴트 생성자

    }
    public FruitInfo(String fname, int price) {
        this.fname = fname;
        this.price = price;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString(){
        return this.fname+" : "+this.price;
    }
}
