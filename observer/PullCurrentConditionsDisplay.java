package observer;

public class PullCurrentConditionsDisplay implements PullObserver, Display {
    
    private float temperature;
    private float humidity;
    private PullWeatherData weatherData;

    public PullCurrentConditionsDisplay(PullWeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %.2f degrees Celsius and %.2f%% humidity", temperature, humidity));
    }
    
}

