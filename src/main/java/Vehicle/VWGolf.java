package Vehicle;

public class VWGolf extends Volkswagen {


    public VWGolf(int fuelTankSize, String fuelType, int gears, double consumptionPer100Km) {
        super(fuelTankSize, fuelType, gears, consumptionPer100Km);
    }

    public VWGolf(double availableFuel, String chassisNumber) {
        super(35, "Diesel", 4, 1.8);
        this.setInitialAvailableFuel(availableFuel);
        this.setAvailableFuel(availableFuel);
        this.setChassisNumber(chassisNumber);
        this.setTireSize(15);
    }

    @Override
    public void start() {
        this.setAverageFuelConsumption(0);
        System.out.println("VWGolf has started");
    }

    @Override
    public void stop() {
        this.setAverageFuelConsumption(this.getInitialAvailableFuel() - this.getAvailableFuel());
        System.out.println("VWGolf has stopped");
    }

    @Override
    public void drive(double nKms) {
        if (this.getCurrentGear() > 4 || this.getCurrentGear() < 1) {
            this.setCurrentGear(1);
            this.setAverageFuelConsumption(this.getConsumptionPer100Km());
        }
        double auxiliar = this.getAvailableFuel();
        auxiliar = auxiliar - this.getAverageFuelConsumption() * nKms;
        this.setAvailableFuel(auxiliar);
        System.out.println("Driving VWGolf in " + this.getCurrentGear());


    }

    @Override
    public void shiftGear(int currentGear) {
        this.setCurrentGear(currentGear);
        switch (currentGear) {
            case 2: {
                this.setAverageFuelConsumption(1.7);
                this.setCurrentGear(2);
                break;
            }
            case 3: {
                this.setAverageFuelConsumption(1.6);
                this.setCurrentGear(3);
                break;
            }
            case 4: {
                this.setAverageFuelConsumption(1.5);
                this.setCurrentGear(4);
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
