public class LoyaltyStatus {
    private double discount;
    
    public LoyaltyStatus(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double price) {
        return price * (1 - discount);
    }
}