package Vehicle;

public abstract class Car implements Vehicle {

    private final int fuelTankSize;
    private final String fuelType;
    private final int gears;
    private final double consumptionPer100Km;
    private double availableFuel;
    private int tireSize;
    private String chassisNumber;
    private double averageFuelConsumption;
    private int currentGear;

    private double initialAvailableFuel;


    public Car(int fuelTankSize, String fuelType, int gears, double consumptionPer100Km) {
        this.fuelTankSize = fuelTankSize;
        this.fuelType = fuelType;
        this.gears = gears;
        this.consumptionPer100Km = consumptionPer100Km;
    }

    public double getConsumptionPer100Km() {
        return consumptionPer100Km;
    }

    public double getAvailableFuel() {
        return availableFuel;
    }

    public void setAvailableFuel(double availableFuel) {
        this.availableFuel = availableFuel;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void shiftGear(int gear) {
        this.currentGear = gear;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public double getInitialAvailableFuel() {
        return initialAvailableFuel;
    }

    public void setInitialAvailableFuel(double initialAvailableFuel) {
        this.initialAvailableFuel = initialAvailableFuel;
    }
}
