package test2;

public class MarketGood {
    private String name;
    private int retailPrice;
    private int discountRate;

    public MarketGood(String name, int retailPrice, int discountRate){
        this.name = name;
        this.retailPrice = retailPrice;
        if(discountRate < 0 || discountRate >100) this.discountRate = 0;
        this.discountRate = discountRate;
    }

    public MarketGood(String name, int retailPrice){
        this.name = name;
        this.retailPrice = retailPrice;
        this.discountRate = 0;
    }
    public String getName(){
        return name;
    }
    public int getRetailPrice(){
        return retailPrice;
    }
    public void setDiscountRate(int discountRate){
        this.discountRate = discountRate;
    }
    public int getDiscountRate(){
        return discountRate;
    }
    public int getDiCountedPrice(){
        return retailPrice*(100-20)/100;
    }
}
