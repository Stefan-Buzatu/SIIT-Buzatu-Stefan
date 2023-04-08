package Vehicle;

public class Sandero extends Dacia {


    public Sandero(int fuelTankSize, String fuelType, int gears, float consumptionPer100Km) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km);
    }

    public Sandero(double availableFuel, String chassisNumber) {
        super(30, "Diesel", 5, 2.1);
        this.setInitialAvailableFuel(availableFuel);
        this.setAvailableFuel(availableFuel);
        this.setChassisNumber(chassisNumber);
        this.setTireSize(15);
    }

    @Override
    public void start() {
        this.setAverageFuelConsumption(0);
        System.out.println("Dacia Sandero has started");
    }

    @Override
    public void stop() {
        this.setAverageFuelConsumption(this.getInitialAvailableFuel() - this.getAvailableFuel());
        System.out.println("Dacia Sandero has stopped");
    }

    @Override
    public void drive(double nKms) {
        if (this.getCurrentGear() > 5 || this.getCurrentGear() < 1) {
            this.setCurrentGear(1);
            this.setAverageFuelConsumption(this.getConsumptionPer100Km());
        }
        double auxiliar = this.getAvailableFuel();
        auxiliar = auxiliar - this.getAverageFuelConsumption() * nKms;
        this.setAvailableFuel(auxiliar);
        System.out.println("Driving Dacia Sandero in " + this.getCurrentGear());
    }

    @Override
    public void shiftGear(int currentGear) {
        this.setCurrentGear(currentGear);
        switch (currentGear) {
            case 2: {
                this.setAverageFuelConsumption(2.0);
                this.setCurrentGear(2);
                break;
            }
            case 3: {
                this.setAverageFuelConsumption(1.9);
                this.setCurrentGear(3);
                break;
            }
            case 4: {
                this.setAverageFuelConsumption(1.8);
                this.setCurrentGear(4);
                break;
            }
            case 5: {
                this.setAverageFuelConsumption(1.7);
                this.setCurrentGear(5);
                break;
            }
            default: {
                this.setAverageFuelConsumption(this.getConsumptionPer100Km());
                this.setCurrentGear(1);
                break;
            }
        }
    }
}
