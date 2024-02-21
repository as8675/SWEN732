package homework;

public class Main {
    public static void main(String[] args) {
        System.out.println("RIT Price and Discount Calculator using Visitor Pattern");
        System.out.println("----------------------------");

        // Use RITCateringService to create two instances: one for meal and one for dessert.
        RITCateringService food = new RITFoodCatering(100, 10);
        RITCateringService dessert = new RITDessertCatering(400, 20);

        //Instantiate the PriceCalculator and DiscountCalculator visitor
        PriceCalculator priceCalculator = new PriceCalculator();
        DiscountCalculator discountCalculator = new DiscountCalculator();

        // To get the total cost of all catering services
        food.accept(priceCalculator);
        dessert.accept(priceCalculator);
        System.out.println("Total price: " + priceCalculator.getTotalPrice());

        // To get the overall cost after discount of all catering services
        food.accept(discountCalculator);
        dessert.accept(discountCalculator);
        System.out.println("Price after discount: " + discountCalculator.getDiscount());

        System.out.println("----------------------------");
    }
}