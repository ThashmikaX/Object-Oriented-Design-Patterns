// Observer interface defines the update method that concrete observers must implement
public interface Observer {
    void update(String weather); // Method to be called when the subject's state changes
}
