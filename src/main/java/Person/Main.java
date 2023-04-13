package Person;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person();
        System.out.println("Person 1:");
        person1.add();
        System.out.println("Person 2:");
        person2.add();

        Set<Person> persons = new TreeSet<>();
        persons.add(person1);
        persons.add(person2);

        System.out.println("------------------------------------------------");
        System.out.println("Persons in TreeSet:");
        for (Person person : persons) {
            person.print();
        }

        System.out.println("------------------------------------------------");
        System.out.println("Persons sorted by name:");
        Set<Person> personsSortedByName = new TreeSet<Person>(new NameComparator());
        personsSortedByName.addAll(persons);

        for (Person person : personsSortedByName) {
            System.out.println(person);
        }

        System.out.println("------------------------------------------------");
        System.out.println("Persons sorted by name:");
        Set<Person> personsSortedByAge = new TreeSet<Person>(new AgeComparator());
        personsSortedByAge.addAll(persons);

        for (Person person : personsSortedByAge) {
            System.out.println(person);
        }
    }
}
