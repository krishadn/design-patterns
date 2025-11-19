package factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        // return new ThinCrustDough();
        return null;
    }

    @Override
    public Sauce createSauce() {
        // return new MarinaraSauce();
        return null;
    }

    @Override
    public Cheese createCheese() {
        // return new ReggianoCheese();
        return null;
    }

    @Override
    public Veggies[] createVeggies() {
        // Veggies[] veggies = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
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
        // return new FreshClams();
        return null;
    }



}
