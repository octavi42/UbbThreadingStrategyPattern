package StrategyPattern;

public class Card implements RestaurantInterface {

    @Override
    public void pay(int amount) {
        System.out.println("pay card " + amount);
    }
}
