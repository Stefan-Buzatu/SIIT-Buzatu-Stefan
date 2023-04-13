package Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

class Hobby implements PersonInterface {
    private String name;
    private int frequency;
    private List<Address> listOfAddresses = new ArrayList<>();

    @Override
    public void add() {
        System.out.println("Name of hobby: ");
        Scanner scanner1 = new Scanner(System.in);
        name = scanner1.next();
        System.out.println("How many times a week you do this hobby: ");
        Scanner scanner2 = new Scanner(System.in);
        frequency = scanner2.nextInt();
        System.out.println("How many addresses you want to add?");
        Scanner scanner3 = new Scanner(System.in);
        int numberOfAddresses;
        numberOfAddresses = scanner3.nextInt();
        for (int i = 0; i < numberOfAddresses; i++) {
            Address address = new Address();
            address.add();
            listOfAddresses.add(address);
        }

    }

    public void addAddressSeparately() {
        Address address = new Address();
        address.add();
        listOfAddresses.add(address);
    }

    @Override
    public void print() {
        System.out.println("Name of hobby:" + name + "  frequency:" + frequency + "  list of addresses:" + listOfAddresses);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hobby)) return false;
        Hobby hobby = (Hobby) o;
        return frequency == hobby.frequency && name.equals(hobby.name) && listOfAddresses.equals(hobby.listOfAddresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, frequency, listOfAddresses);
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", frequency=" + frequency +
                ", listOfAddresses=" + listOfAddresses +
                '}';
    }
}
