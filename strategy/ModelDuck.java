package strategy;

public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new NoFly();
        this.quackBehavior = new NormalQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }


}
