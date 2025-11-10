package decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        wrappedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        double cost = wrappedBeverage.cost();
        
        switch (size) {
            case Size.TALL:
                return cost + 0.15;
            case Size.GRANDE:
                return cost + 0.20;
            default:
                return cost + 0.25; 
        }
        
    }
    
}
