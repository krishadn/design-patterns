package decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "Houseblend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
    
    
}
