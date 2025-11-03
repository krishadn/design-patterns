package strategy;

public class DuckSimulator {

    public static void main(String[] args) {

        MallardDuck md = new MallardDuck();

        md.performFly();
        md.performQuack();

        ModelDuck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
    
}
