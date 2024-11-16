public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation(); // Create a WeatherStation instance

        PhoneDisplay phoneDisplay = new PhoneDisplay(); // Create a PhoneDisplay instance

        weatherStation.addObserver(phoneDisplay); // Register PhoneDisplay as an observer

        // Simulate changing weather conditions
        weatherStation.setWeather("Sunny"); // Update weather to Sunny, should notify PhoneDisplay
        weatherStation.setWeather("Rainy"); // Update weather to Rainy, should notify PhoneDisplay again
    }
}