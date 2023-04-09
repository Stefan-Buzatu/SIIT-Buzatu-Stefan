package Phone;

import java.awt.*;

public abstract class Samsung extends Phone {


    public Samsung(int batteryLife, Color color, String material, String IMEI, int currentBatteryLife) {
        super(batteryLife, color, material, IMEI, currentBatteryLife);
    }
}
