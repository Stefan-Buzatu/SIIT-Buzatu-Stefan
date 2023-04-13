package Person;

import java.util.Objects;
import java.util.Scanner;

class Address implements PersonInterface {
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public void add() {
        System.out.println("Address for hobby: ");
        Scanner stringScanner = new Scanner(System.in);
        country = stringScanner.next();
    }

    @Override
    public void print() {
        System.out.println("Address for hobby: " + country);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;
        Address address = (Address) o;
        return getCountry().equals(address.getCountry());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCountry());
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                '}';
    }
}
