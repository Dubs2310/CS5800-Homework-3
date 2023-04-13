public class AddOn implements FoodItem {
    private FoodItem foodItem;
    private double price;

    public AddOn(FoodItem foodItem, double price) {
        this.foodItem = foodItem;
        this.price = price;
    }

    @Override
    public double getPrice() { return foodItem.getPrice() + this.price; }
}