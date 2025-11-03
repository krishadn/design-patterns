package strategy;

public abstract class Duck {

    protected IFly flyBehavior;
    protected IQuack quackBehavior;

    public Duck() {

    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("Swim swim swim");
    }

    public void setFlyBehavior(IFly flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuack quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();

    
}
