import java.util.ArrayList;

public class Order {
    private ArrayList<FoodItem> foodItems;
    private LoyaltyStatus loyaltyStatus;

    public Order(LoyaltyStatus loyaltyStatus) {
        this.foodItems = new ArrayList<>();
        this.loyaltyStatus = loyaltyStatus;
    }

    public void addItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public double getOrderTotal() {
        double orderTotal = 0;
        for (FoodItem foodItem : foodItems)
            orderTotal += foodItem.getPrice();
        return loyaltyStatus.applyDiscount(orderTotal);
    }
}