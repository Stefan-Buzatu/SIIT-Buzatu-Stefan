package Phone;

import java.awt.*;

public abstract class iPhone extends Phone {


    public iPhone(int batteryLife, Color color, String material, String IMEI, int currentBatteryLife) {
        super(batteryLife, color, material, IMEI, currentBatteryLife);
    }
}
