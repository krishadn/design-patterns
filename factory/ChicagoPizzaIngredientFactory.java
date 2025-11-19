package factory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        // return new ThickCrustDough();
        return null;
    }

    @Override
    public Sauce createSauce() {
        // return new PlumTomatoSauce();
        return null;
    }

    @Override
    public Cheese createCheese() {
        // return new MozzarellaCheese();
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        // Veggies[] veggies = {new Spinach(), new BlackOlives(), new Eggplant()};
        // return veggies;
        return null;
    }

    @Override
    public Pepperoni createPepperoni() {
        // return new SlicedPepperoni();
        return null;
    }

    @Override
    public Clams createClams() {
        // return new FrozenClams();
        return null;
    }

}
