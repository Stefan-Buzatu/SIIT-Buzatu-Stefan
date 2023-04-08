package Vehicle;

public class Main {
    public static void main(String[] args) {
        // Car car = new Car(); // this should not compile.

        //Car car = new Dacia(27, "oiqe0934hkkadsn"); // this should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.

        Car car = new Logan(27, "oiqe0934hkkadsn"); // Logan can extend from Dacia, while Dacia extends from Car

        car.start();

        car.shiftGear(1);

        car.drive(0.01); // drives 0.01 KMs

        car.shiftGear(2);

        car.drive(0.02);

        car.shiftGear(3);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(5);

        car.drive(10);

        car.shiftGear(4);

        car.drive(0.5);

        car.shiftGear(3);

        car.drive(0.1);

        car.stop();

        double availableFuel = car.getAvailableFuel();

        double fuelConsumedPer100Km = car.getAverageFuelConsumption();

        System.out.println("Available Fuel for Dacia Logan: " + availableFuel);
        System.out.println("Fuel consumed after driving Dacia Logan: " + fuelConsumedPer100Km);

        Vehicle vehicle = new VWGolf(30, "1987ddkshik289"); // available fuel and chassis number

        vehicle.start();

        vehicle.drive(1);

        vehicle.stop();

        Car carVWGolf = (Car) vehicle;
        availableFuel = carVWGolf.getAvailableFuel();

        fuelConsumedPer100Km = carVWGolf.getAverageFuelConsumption();

        System.out.println("Available Fuel for VWGolf: " + availableFuel);
        System.out.println("Fuel consumed after driving VWGolf: " + fuelConsumedPer100Km);

    }
}
