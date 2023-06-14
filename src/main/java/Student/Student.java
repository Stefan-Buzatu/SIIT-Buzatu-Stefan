package Student;

import java.time.LocalDate;

public class Student {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String id;

    public Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
    }

//    public Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, String id) {
//
//        if (firstName.equals("") || firstName.isEmpty())
//            throw new NullPointerException("First name should not be empty");
//        else
//            this.firstName = firstName;
//
//        if (lastName.equals("") || lastName.isEmpty())
//            throw new NullPointerException("Last name should not be empty");
//        else
//            this.lastName = lastName;
//
//            LocalDate currentTime = LocalDate.now();
//            if (dateOfBirth.getYear() < 1900 || dateOfBirth.getYear() > currentTime.getYear() - 18)
//                throw new IllegalArgumentException("Date should be between 1900 and current year -18");
//            else
//                this.dateOfBirth = dateOfBirth;
//
//            if (!gender.toLowerCase().equals("male") || !gender.toLowerCase().equals("m") || !gender.toLowerCase().equals("female") || !gender.toLowerCase().equals("f"))
//                throw new IllegalArgumentException("The gender should be male(M) or female(F)");
//            else
//                this.gender = gender;
//
//            this.id = id;
//        }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

}
