package observer;

public class Main {

    public static void main(String[] args) {
        // WeatherData wd = new WeatherData();

        // CurrentConditionsDisplay cd = new CurrentConditionsDisplay(wd);
        // StatisticsDisplay sd = new StatisticsDisplay(wd);

        PullWeatherData wd = new PullWeatherData();

        PullCurrentConditionsDisplay cd = new PullCurrentConditionsDisplay(wd);
        PullStatisticsDisplay sd = new PullStatisticsDisplay(wd);

        wd.setMeasurements(38, 20, 5);
        wd.setMeasurements(40, 21, 5);
        wd.setMeasurements(35, 21, 5);
        


    }
    
}
