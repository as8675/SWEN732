package homework;

// Implements RITCateringVisitor to calculate total price of catering services
public class PriceCalculator implements RITCateringVisitor{
    private int totalPrice = 0;
    @Override
    public void visit(RITFoodCatering ritfood) {
        totalPrice = totalPrice + ritfood.getPrice();
    }

    @Override
    public void visit(RITDessertCatering ritdessert) {
        totalPrice = totalPrice + ritdessert.getPrice();
    }

    //Returns the total price of items
    public int getTotalPrice() {
        return totalPrice;
    }
}
