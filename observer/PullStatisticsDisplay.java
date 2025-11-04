package observer;

public class PullStatisticsDisplay implements PullObserver, Display{
    
    private double average;
    private double maximum;
    private double minimum;
    private PullWeatherData weatherData;

    public PullStatisticsDisplay(PullWeatherData weatherData) {
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
    public void update() {
        double temp = weatherData.getTemperature();
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
