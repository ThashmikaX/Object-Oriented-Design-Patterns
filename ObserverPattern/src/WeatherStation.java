import java.util.ArrayList;
import java.util.List;

// Concrete implementation of Subject
public class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>(); // List of observers
    private String weather; // State of the subject

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer); // Add observer to the list
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer); // Remove observer from the list
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(weather); // Notify each observer with the current weather state
        }
    }

    // Method to update weather and notify observers
    public void setWeather(String newWeather) {
        this.weather = newWeather; // Update the weather state
        notifyObservers(); // Notify all observers of the change
    }
}