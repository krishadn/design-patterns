package decorator;

public class App {

    public static void main(String[] args) {
        
        HouseBlend hb = new HouseBlend();
        Soy soy = new Soy(hb);
        Mocha mocha1 = new Mocha(soy);
        Mocha mocha2 = new Mocha(mocha1);
        Whip whip = new Whip(mocha2);

        System.out.printf("%s - %.2f %n", whip.getDescription(), whip.cost());

        Beverage bev1 = new Espresso();
        bev1 = new Milk(bev1);
        bev1 = new Whip(bev1);

        System.out.printf("%s - %.2f %n", bev1.getDescription(), bev1.cost());

        Beverage bev2 = new DarkRoast();
        bev2 = new Soy(bev2);
        bev2 = new Mocha(bev2);

        System.out.printf("%s - %.2f %n", bev2.getDescription(), bev2.cost());

        Beverage bev3 = new Decaf();
        bev3 = new Whip(bev3);

        System.out.printf("%s - %.2f %n", bev3.getDescription(), bev3.cost());

        System.out.println((char)65);

    }
    
}
