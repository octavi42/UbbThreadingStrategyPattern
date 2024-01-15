package StrategyPattern;

public class RestaurantService {

    private RestaurantInterface strategy;

    public RestaurantService(RestaurantInterface strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(RestaurantInterface strategy) {
        this.strategy = strategy;
    }

    public RestaurantInterface getStrategy() {
        return strategy;
    }
}
