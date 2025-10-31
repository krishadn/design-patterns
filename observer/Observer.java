package observer;

/**
 * Codes from reading Head First Design Patterns
 * https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124
 */
public interface Observer {
    
    public void update(float temp, float humidity, float pressure);

}
