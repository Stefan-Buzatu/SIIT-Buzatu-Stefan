package Vehicle;

public class Logan extends Dacia {


    public Logan(int fuelTankSize, String fuelType, int gears, float consumptionPer100Km) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km);
    }

    public Logan(double availableFuel, String chassisNumber) {
        super(120, "Petrol", 6, 1.2);
        this.setInitialAvailableFuel(availableFuel);
        this.setAvailableFuel(availableFuel);
        this.setChassisNumber(chassisNumber);
        this.setTireSize(15);
    }

    @Override
    public void start() {
        this.setAverageFuelConsumption(0);
        System.out.println("Dacia Logan has started");
    }

    @Override
    public void stop() {
        this.setAverageFuelConsumption(this.getInitialAvailableFuel() - this.getAvailableFuel());
        System.out.println("Dacia Logan has stopped");
    }

    @Override
    public void drive(double nKms) {
        if (this.getCurrentGear() > 6 || this.getCurrentGear() < 1) {
            this.setCurrentGear(1);
            this.setAverageFuelConsumption(this.getConsumptionPer100Km());
        }
        double auxiliar = this.getAvailableFuel();
        auxiliar = auxiliar - this.getAverageFuelConsumption() * nKms;
        this.setAvailableFuel(auxiliar);
        System.out.println("Driving Dacia Logan in " + this.getCurrentGear());

    }

    @Override
    public void shiftGear(int currentGear) {
        this.setCurrentGear(currentGear);
        switch (currentGear) {
            case 2: {
                this.setAverageFuelConsumption(1.1);
                this.setCurrentGear(2);
                break;
            }
            case 3: {
                this.setAverageFuelConsumption(1.0);
                this.setCurrentGear(3);
                break;
            }
            case 4: {
                this.setAverageFuelConsumption(0.9);
                this.setCurrentGear(4);
                break;
            }
            case 5: {
                this.setAverageFuelConsumption(0.8);
                this.setCurrentGear(5);
                break;
            }
            case 6: {
                this.setAverageFuelConsumption(0.7);
                this.setCurrentGear(6);
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
