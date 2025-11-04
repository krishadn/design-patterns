package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * pull implementation
 */
public class PullWeatherData implements PullSubject {

 private List<PullObserver> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public PullWeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(PullObserver o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(PullObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(PullObserver o: observers) {
            o.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

}
