package homework;

//Implements the RITCateringService and redirects call to appropriate visitor's method
public class RITDessertCatering implements RITCateringService{
    private int price;
    private int discount;

    public RITDessertCatering(int price, int discount)
    {
        this.price = price;
        this.discount = discount;
    }
    @Override
    public void accept(RITCateringVisitor ritCateringVisitor) {
        ritCateringVisitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public int getDiscount() {
        return discount;
    }
}
