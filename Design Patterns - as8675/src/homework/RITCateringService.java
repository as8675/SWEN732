package homework;

public interface RITCateringService {
    // Method to accept a visitor that performs operations on the catering service
    public void accept(RITCateringVisitor ritCateringVisitor);
}
