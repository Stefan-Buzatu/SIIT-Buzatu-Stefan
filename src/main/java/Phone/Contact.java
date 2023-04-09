package Phone;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String number;
    private String phoneNumber;
    private String firstName;
    private String lastName;

    private List<String> inbox = new ArrayList<>();
    private List<LocalDate> callHistory = new ArrayList<>();

    public Contact(String number, String phoneNumber, String firstName, String lastName) {
        this.number = number;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    @Override
    public String toString() {
        return "No." + number + "  Phone number:" + phoneNumber + "  First name:" + firstName + "  Last name:" + lastName;
    }


    public String getInbox(int index) {
        return inbox.get(index);
    }

    public void setInbox(String message) {
        this.inbox.add(message);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public List<LocalDate> getCallHistory() {
        if (callHistory.isEmpty())
            return null;
        else
            return callHistory;
    }

    public void setCallHistory(LocalDate localDate) {
        callHistory.add(localDate);
    }
}
