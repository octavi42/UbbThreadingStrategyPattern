package StrategyPattern;

public class PayPal implements RestaurantInterface{

    @Override
    public void pay(int amount) {
        System.out.println("pay paypal: " + amount);
    }
}
