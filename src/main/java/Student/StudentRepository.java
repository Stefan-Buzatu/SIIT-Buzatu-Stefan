package Student;

import java.time.LocalDate;
import java.util.*;

public class StudentRepository {
    List<Student> students = new ArrayList<>();

    public void add(Student student) {
        try {
            if (student.getFirstName().equals("") || student.getFirstName().isEmpty())
                throw new NullPointerException("First name should not be empty");

            if (student.getLastName().equals("") || student.getLastName().isEmpty())
                throw new NullPointerException("Last name should not be empty");


            LocalDate currentTime = LocalDate.now();
            if (student.getDateOfBirth().getYear() < 1900 || student.getDateOfBirth().getYear() > currentTime.getYear() - 18)
                throw new IllegalArgumentException("Date should be between 1900 and current year -18");


            if (student.getGender().toLowerCase().equals("male") || student.getGender().toLowerCase().equals("m") || student.getGender().toLowerCase().equals("female") || student.getGender().toLowerCase().equals("f"))
                student.getGender();
            else
                throw new IllegalArgumentException("The gender should be male(M) or female(F)");


            students.add(student);
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public void deleteStudent(String id) {
        try {
            boolean elementDoesExist = false;
            int elementToDelete = -1;
            for (int i = 0; i < students.size(); i++)
                if (students.get(i).getId().equals(id)) {
                    elementDoesExist = true;
                    elementToDelete = i;
                }
            if (!elementDoesExist)
                throw new NoSuchElementException();
            else
                students.remove(elementToDelete);

        } catch (NoSuchElementException e) {
            System.out.println("student with this id does not exist");
        }
    }

    public void printStudentsByAge(String ageString) {

        try {
            Integer age;
            age = Integer.parseInt(ageString);
            if (age < 0)
                throw new IllegalArgumentException("Age must be positive");
            for (int i = 0; i < students.size(); i++) {
                int ageForEachStudent = LocalDate.now().getYear() - students.get(i).getDateOfBirth().getYear();
                if (ageForEachStudent == age)
                    System.out.println(students.get(i));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Age must be a positive number");
        }
    }

    public void printStudentsByBirthdate() {
        Collections.sort(students, new BithdateComparator());
        System.out.println(students);

    }

    public void printStudentsByLastName() {
        Collections.sort(students, new LastNameComparator());
        System.out.println(students);
    }

    @Override
    public String toString() {
        return "StudentRepository{" +
                "students=" + students +
                '}';
    }

    public int getSize() {
        return students.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentRepository that)) return false;
        return Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }
}
