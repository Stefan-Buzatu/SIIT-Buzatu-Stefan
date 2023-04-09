package Phone;

public interface PhoneInterface {
    void addContact(String number, String phoneNumber, String firstName, String lastName);

    void getFirstContact();

    void getLastContact();

    void sendMessage(String phoneNumber, String message);

    void getFirstMessage(String phoneNumber);

    void getSecondMessage(String phoneNumber);

    void call(String phoneNumber);

    void viewHistory();

}
