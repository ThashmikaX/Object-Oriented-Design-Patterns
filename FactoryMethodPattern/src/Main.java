public class Main {
    public static void main(String[] args) {
        CarFactory sedanFactory = new SedanFactory();
        sedanFactory.testDrive(); // Output: Driving a sedan.
        //when we call the testDrive its creating the car that line of code

        CarFactory suvFactory = new SUVFactory();
        suvFactory.testDrive(); // Output: Driving an SUV.
    }
}