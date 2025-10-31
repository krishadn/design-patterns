package observer;

/**
 * Codes from reading Head First Design Patterns
 * https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124
 */
public class StatisticsDisplay implements Observer, Display {

    private double average;
    private double maximum;
    private double minimum;
    private WeatherData weatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
        average = 0;
        maximum = Double.NEGATIVE_INFINITY;
        minimum = Double.POSITIVE_INFINITY;    
    }

    @Override
    public void display() {
        System.out.println(String.format("Ave/Max/Min: %.2f/%.2f/%.2f", average, maximum, minimum));
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        if (average == 0) {
            average = temp;
        } else {
            average = (average+temp) / 2;
        }

        maximum = Math.max(maximum, temp);
        minimum = Math.min(minimum, temp);
        display();
    }

    


    
}
