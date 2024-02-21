package homework;

// This interface specifies how to visit various catering service kinds.
public interface RITCateringVisitor {
    // Method to visit RITFoodCatering objects.
    public void visit(RITFoodCatering ritfood);
    // Method to visit RITDessertCatering objects.
    public void visit(RITDessertCatering ritdessert);
}
