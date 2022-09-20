package simple_smartphone;

public class SmartPhone {
    private String maker; //제조사
    private String name; //명칭
    private int price; //가격
    private int discountRate; //할인율
    int total=0;
    public SmartPhone(String maker, String name, int price){
//        this.maker = maker;
//        this.name = name;
//        this.price = price;
        this(maker,name,price,0);
    }
    public SmartPhone(String maker, String name, int price, int discountRate) {
        this.maker = maker;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
    }
    public SmartPhone(){

    }
    public int calculateDiscount(int discountRate){
         total = (int)this.price - (this.price * discountRate)/100;
        return total;
    }
    public String getMaker(){
        return this.maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public int getDiscountRate(){
        return this.discountRate;
    }
    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }
}
