package decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        wrappedBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return wrappedBeverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        double cost = wrappedBeverage.cost();
        
        switch (size) {
            case Size.TALL:
                return cost + 0.20;
            case Size.GRANDE:
                return cost + 0.25;
            default:
                return cost + 0.30; 
        }
        
    }


}
