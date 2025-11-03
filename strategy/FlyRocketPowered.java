package strategy;

public class FlyRocketPowered implements IFly {
    
    @Override
    public void fly() {
        System.out.println("Vroooom flying with a rocket");
    }
}
