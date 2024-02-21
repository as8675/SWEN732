package homework;

//Implements the RITCateringVisitor interface to calculate discount
public class DiscountCalculator implements RITCateringVisitor{
    public int total_discount = 0;
    @Override
    public void visit(RITFoodCatering ritfood) {
        int price = ritfood.getPrice();
        float discount_rate = (float) ritfood.getDiscount() /100;
//        System.out.println(discount_rate);
        int discount = (int) (price * (1 - discount_rate));
        total_discount = total_discount + discount;
    }

    @Override
    public void visit(RITDessertCatering ritdessert) {
        int price = ritdessert.getPrice();
        float discount_rate = (float) ritdessert.getDiscount()/100;
//        System.out.println(discount_rate);
        int discount = (int) (price * (1 - discount_rate));
        total_discount = total_discount + discount;
    }

    public int getDiscount() {
        return total_discount;
    }
}
