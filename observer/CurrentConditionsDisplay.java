package observer;

/**
 * Codes from reading Head First Design Patterns
 * https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124
 */
public class CurrentConditionsDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("Current conditions: %.2f degrees Celsius and %.2f%% humidity", temperature, humidity));
    }
    
}
