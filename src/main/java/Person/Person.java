package Person;

import java.util.*;

public class Person implements PersonInterface, Comparable<Person> {
    private String name;
    private int age;
    private Map<Person, List<Hobby>> hobbies = new HashMap<>();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public void add() {
        System.out.println("Name of the person:");
        Scanner scanner1 = new Scanner(System.in);
        name = scanner1.next();
        System.out.println("Person's age:");
        Scanner scanner2 = new Scanner(System.in);
        age = scanner2.nextInt();
        System.out.println("How many hobbies does " + name + " have:");
        hobbies.put(this, new ArrayList<>());
        Scanner scanner3 = new Scanner(System.in);
        int numberOfHobbies;
        numberOfHobbies = scanner3.nextInt();
        for (int i = 0; i < numberOfHobbies; i++) {
            Hobby hobby = new Hobby();
            hobby.add();
            hobbies.get(this).add(hobby);

        }

    }


    @Override
    public void print() {
        System.out.println("Name of the person:" + name + "  age:" + age + " list of hobbies:" + hobbies.get(this).toString());


    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareToIgnoreCase(o.name) == 0)
            return this.age - o.age;
        return this.name.compareToIgnoreCase(o.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies.get(this).toString() +
                '}';
    }
}
