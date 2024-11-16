// Concrete implementation of Observer
public class PhoneDisplay implements Observer {
    private String weather; // Holds current weather state

    @Override
    public void update(String weather) {
        this.weather = weather; // Update local weather state with new data
        display(); // Call method to display updated weather information
    }

    private void display() {
        System.out.println("Phone Display: Weather updated - " + weather); // Display updated weather on console
    }
}