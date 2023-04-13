public class MainFoodItem implements FoodItem {
    private double price;
    public MainFoodItem(double price) { this.price = price; }
    
    @Override
    public double getPrice() { return this.price; }
}