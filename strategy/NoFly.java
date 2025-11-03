package strategy;

public class NoFly implements IFly {
    
    @Override
    public void fly() {
        System.out.println("This duck can't fly T_T");
    }

}
