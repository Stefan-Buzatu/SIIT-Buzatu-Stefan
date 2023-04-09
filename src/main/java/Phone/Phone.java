package Phone;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Phone implements PhoneInterface {


    private final int batteryLife;
    private List<Contact> contacts = new ArrayList<>();
    private Color color;
    private String material;
    private String IMEI;


    public Phone(int batteryLife, Color color, String material, String IMEI) {
        this.batteryLife = batteryLife;
        this.color = color;
        this.material = material;
        this.IMEI = IMEI;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public boolean validationPhoneNumber(String phoneNumber, int index) {
        return contacts.get(index).getPhoneNumber().equals(phoneNumber);
    }

    public void setMessage(String phoneNumber, String message) {
        for (int i = 0; i < contacts.size(); i++) {
            if (validationPhoneNumber(phoneNumber, i))
                contacts.get(i).setInbox(message);
        }
    }

    public String getMessage(String phoneNumber, int index) {
        for (int i = 0; i < contacts.size(); i++) {
            if (validationPhoneNumber(phoneNumber, i))
                return contacts.get(i).getInbox(index);
        }
        return "Invalid number";
    }

    public String getName(String phoneNumber) {
        for (int i = 0; i < contacts.size(); i++) {
            if (validationPhoneNumber(phoneNumber, i))
                return contacts.get(i).getFirstName() + " " + contacts.get(i).getLastName();
        }
        return "Invalid number";
    }

    public void setCall(String phoneNumber) {
        LocalDate localDate;
        localDate = java.time.LocalDate.now();
        for (int i = 0; i < contacts.size(); i++) {
            if (validationPhoneNumber(phoneNumber, i))
                contacts.get(i).setCallHistory(localDate);
        }
    }

}
