// Subject interface defines methods for observers to register and unregister
public interface Subject {
    void addObserver(Observer observer);    // Add an observer to the list
    void removeObserver(Observer observer); // Remove an observer from the list
    void notifyObservers(); // Notify all registered observers of a change
}
