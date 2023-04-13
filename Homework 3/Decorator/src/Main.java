public class Main {
    public static void main(String[] args) {
        FoodItem burger = new MainFoodItem(10);
        burger = new AddOn(burger, 3);
        burger = new AddOn(burger, 5);

        FoodItem fries = new MainFoodItem(6);
        fries = new AddOn(fries, 2);

        FoodItem drink = new MainFoodItem(3);
        drink = new AddOn(drink, 1);
        drink = new AddOn(drink, 0.5);

        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.25);
        Order order = new Order(loyaltyStatus);

        order.addItem(burger);
        order.addItem(fries);
        order.addItem(drink);

        double orderTotal = order.getOrderTotal();
        System.out.println("Your order total is: $" + orderTotal);
    }
}