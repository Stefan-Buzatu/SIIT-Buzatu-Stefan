package Phone;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Phone!");
        Phone phone = new SamsungGalaxy6();
        phone.addContact("1", "0722729928", "Stefan", "Buzatu");
        phone.getFirstContact();
        phone.sendMessage("0722729928", "Hello Stefan");
        phone.sendMessage("0722729928", "How are you?");
        phone.getFirstMessage("0722729928");
        phone.getSecondMessage("0722729928");

        phone.addContact("2", "0711223344", "Alex", "Popescu");
        phone.getLastContact();

        phone.call("0711223344");
        phone.call("0711223344");
        phone.call("0711223344");

        phone.viewHistory();

        System.out.println("---------------------------------");

        Phone phone1 = new SamsungGalaxy23();
        phone1.addContact("1", "0723123123", "Andrei", "Ionescu");
        phone1.getFirstContact();
        phone1.sendMessage("0723123123", "Hello Andrei");
        phone1.sendMessage("0723123123", "How are you?");
        phone1.getFirstMessage("0723123123");
        phone1.getSecondMessage("0723123123");

        phone1.addContact("2", "0785659854", "John", "Mcdonalds");
        phone1.getLastContact();

        phone1.call("0723123123");
        phone1.call("0785659854");
        phone1.call("0785659854");

        phone1.viewHistory();

        System.out.println("---------------------------------");

        Phone phone2 = new iPhone11();
        phone2.addContact("1", "0754873512", "Leo", "Doe");
        phone2.getFirstContact();

        phone2.addContact("2", "0721356789", "Elena", "Sorescu");
        phone2.getLastContact();
        phone2.sendMessage("0721356789", "Hi Elena");
        phone2.sendMessage("0721356789", "How are you?");
        phone2.getFirstMessage("0721356789");
        phone2.getSecondMessage("0721356789");


        phone2.call("0721356789");
        phone2.call("0721356789");
        phone2.call("0754873512");

        phone2.viewHistory();

        System.out.println("---------------------------------");


        Phone phone3 = new iPhone11();
        phone3.addContact("1", "0798112248", "Maria", "Cornwell");
        phone3.getFirstContact();

        phone3.addContact("2", "0741256300", "Charles", "Hillman");
        phone3.getLastContact();
        phone3.sendMessage("0741256300", "Hi Charles");
        phone3.sendMessage("0798112248", "Hi Maria");
        phone3.sendMessage("0741256300", "Are you driving?");
        phone3.sendMessage("0798112248", "Are you feeling well?");

        phone3.getFirstMessage("0741256300");
        phone3.getSecondMessage("0741256300");

        phone3.getFirstMessage("0798112248");
        phone3.getSecondMessage("0798112248");


        phone3.call("0798112248");
        phone3.call("0741256300");
        phone3.call("0798112248");
        phone3.call("0741256300");
        phone3.call("0798112248");
        phone3.call("0741256300");
        phone3.call("0798112248");

        phone3.viewHistory();

        System.out.println("---------------------------------");


        Phone phone4 = new iPhone14ProMax();
        phone4.addContact("1", "0798112248", "Maria", "Cornwell");
        phone4.getFirstContact();

        phone4.addContact("2", "0741256300", "Charles", "Hillman");
        phone4.getLastContact();
        phone4.sendMessage("0741256300", "Hi Charles");
        phone4.sendMessage("0798112248", "Hi Maria");
        phone4.sendMessage("0741256300", "Are you driving?");
        phone4.sendMessage("0798112248", "Are you feeling well?");

        phone4.getFirstMessage("0741256300");
        phone4.getSecondMessage("0741256300");

        phone4.getFirstMessage("0798112248");
        phone4.getSecondMessage("0798112248");


        phone4.call("0798112248");
        phone4.call("0741256300");
        phone4.call("0798112248");
        phone4.call("0741256300");
        phone4.call("0798112248");
        phone4.call("0741256300");
        phone4.call("0798112248");

        phone4.viewHistory();

        System.out.println("---------------------------------");
    }
}
