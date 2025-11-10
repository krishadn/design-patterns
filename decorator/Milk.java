package decorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        wrappedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        double cost = wrappedBeverage.cost();
        
        switch (size) {
            case Size.TALL:
                return cost + 0.10;
            case Size.GRANDE:
                return cost + 0.15;
            default:
                return cost + 0.20; 
        }
        
    }
    

}
