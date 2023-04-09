package Phone;

import java.awt.*;

public class iPhone14ProMax extends iPhone {


    public iPhone14ProMax() {
        super(6, Color.orange, "Glass", "231564465", 6);
    }

    @Override
    public void addContact(String number, String phoneNumber, String firstName, String lastName) {

        if (this.isBatteryDead())
            System.out.println("Can't add contact, battery is dead");
        else
            this.getContacts().add(new Contact(number, phoneNumber, firstName, lastName));

    }

    @Override
    public void getFirstContact() {

        if (this.isBatteryDead())
            System.out.println("Cannot print contact, battery is dead");
        else
            System.out.println(this.getContacts().get(0));
    }

    @Override
    public void getLastContact() {

        if (this.isBatteryDead())
            System.out.println("Cannot print contact, battery is dead");
        else
            System.out.println(this.getContacts().get(1));
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {

        if (this.isBatteryDead())
            System.out.println("Cannot send message, battery is dead");
        else {
            this.setMessage(phoneNumber, message);
            this.setCurrentBatteryLife(getCurrentBatteryLife() - 1);
        }
    }

    @Override
    public void getFirstMessage(String phoneNumber) {
        if (this.isBatteryDead())
            System.out.println("Cannot print message, battery is dead");
        else
            System.out.println("First message: " + this.getMessage(phoneNumber, 0));
    }

    @Override
    public void getSecondMessage(String phoneNumber) {
        if (this.isBatteryDead())
            System.out.println("Cannot print message, battery is dead");
        else
            System.out.println("Second message: " + this.getMessage(phoneNumber, 1));
    }

    @Override
    public void call(String phoneNumber) {
        if (this.isBatteryDead())
            System.out.println("Cannot make a call, battery is dead");
        else {
            System.out.println("Calling " + this.getName(phoneNumber));
            this.setCall(phoneNumber);
            this.setCurrentBatteryLife(getCurrentBatteryLife() - 2);
        }
    }

    @Override
    public void viewHistory() {
        if (this.isBatteryDead())
            System.out.println("Cannot view call history, battery is dead");
        else {
            for (Contact contact : this.getContacts()) {
                System.out.println("Name:" + contact.getFirstName() + " " + contact.getLastName() + " ; Phone number:" + contact.getPhoneNumber() + " ; Call date:" + contact.getCallHistory());
            }
        }

    }
}
