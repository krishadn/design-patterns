package observer;

/**
 * Codes from reading Head First Design Patterns
 * https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124
 */
public class Main {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay cd = new CurrentConditionsDisplay(wd);
        StatisticsDisplay sd = new StatisticsDisplay(wd);

        wd.setMeasurements(38, 20, 5);
        wd.setMeasurements(40, 21, 5);
        wd.setMeasurements(35, 21, 5);

    }
    
}
