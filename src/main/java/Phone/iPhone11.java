package Phone;

import java.awt.*;

public class iPhone11 extends iPhone {


    public iPhone11() {
        super(7, Color.darkGray, "Plastic", "45321564564");
    }

    @Override
    public void addContact(String number, String phoneNumber, String firstName, String lastName) {

        this.getContacts().add(new Contact(number, phoneNumber, firstName, lastName));

    }

    @Override
    public void getFirstContact() {
        System.out.println(this.getContacts().get(0));
    }

    @Override
    public void getLastContact() {
        System.out.println(this.getContacts().get(1));
    }

    @Override
    public void sendMessage(String phoneNumber, String message) {

        this.setMessage(phoneNumber, message);
    }

    @Override
    public void getFirstMessage(String phoneNumber) {
        System.out.println("First message: " + this.getMessage(phoneNumber, 0));
    }

    @Override
    public void getSecondMessage(String phoneNumber) {
        System.out.println("Second message: " + this.getMessage(phoneNumber, 1));
    }

    @Override
    public void call(String phoneNumber) {
        System.out.println("Calling " + this.getName(phoneNumber));
        this.setCall(phoneNumber);
    }

    @Override
    public void viewHistory() {

        for (Contact contact : this.getContacts()) {
            System.out.println("Name:" + contact.getFirstName() + " " + contact.getLastName() + " ; Phone number:" + contact.getPhoneNumber() + " ; Call date:" + contact.getCallHistory());
        }


    }
}
