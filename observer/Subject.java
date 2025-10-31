package observer;

/**
 * Codes from reading Head First Design Patterns
 * https://www.amazon.com/Head-First-Design-Patterns-Brain-Friendly/dp/0596007124
 */
public interface Subject {
    
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
