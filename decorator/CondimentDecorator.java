package decorator;

public abstract class CondimentDecorator extends Beverage {

    Beverage wrappedBeverage;

    @Override
    public Size getSize() {
        return wrappedBeverage.getSize();
    }

    @Override
    public void setSize(Size size) {
        wrappedBeverage.setSize(size);
    }

    @Override
    public abstract String getDescription();
    
}
