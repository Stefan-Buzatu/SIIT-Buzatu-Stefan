package StudentTest;

import Student.Student;
import Student.StudentRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class StudentTests {

    static Logger LOGGER = LogManager.getLogger(StudentTests.class);

    @Test
    public void addTest() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.add(new Student("", "1", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository.add(new Student("2", "2", LocalDate.parse("2020-11-05"), "m", "124"));
        studentRepository.add(new Student("3", "3", LocalDate.parse("2001-02-22"), "asd", "125"));
        studentRepository.add(new Student("4", "", LocalDate.parse("2005-02-28"), "f", "126"));
        studentRepository.add(new Student("5", "5", LocalDate.parse("1850-02-28"), "f", "127"));

        System.out.println(studentRepository.getSize());
        Assertions.assertEquals(0, studentRepository.getSize());
    }

    @Test
    public void deleteTest() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.add(new Student("1", "1", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository.add(new Student("2", "2", LocalDate.parse("2001-11-05"), "m", "124"));
        studentRepository.add(new Student("3", "3", LocalDate.parse("2001-02-22"), "f", "125"));
        studentRepository.add(new Student("4", "4", LocalDate.parse("2005-02-28"), "f", "126"));
        studentRepository.add(new Student("5", "5", LocalDate.parse("1980-02-15"), "f", "127"));
        studentRepository.deleteStudent("127");

        StudentRepository studentRepository2 = new StudentRepository();
        studentRepository2.add(new Student("1", "1", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository2.add(new Student("2", "2", LocalDate.parse("2001-11-05"), "m", "124"));
        studentRepository2.add(new Student("3", "3", LocalDate.parse("2001-02-22"), "f", "125"));
        studentRepository2.add(new Student("4", "4", LocalDate.parse("2005-02-28"), "f", "126"));

        Assertions.assertEquals(studentRepository2.toString(), studentRepository.toString());


    }

    @Test
    public void deleteTest2() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.add(new Student("1", "1", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository.add(new Student("2", "2", LocalDate.parse("2001-11-05"), "m", "124"));
        studentRepository.add(new Student("3", "3", LocalDate.parse("2001-02-22"), "f", "125"));
        studentRepository.add(new Student("4", "4", LocalDate.parse("2005-02-28"), "f", "126"));
        studentRepository.add(new Student("5", "5", LocalDate.parse("1980-02-15"), "f", "127"));
        studentRepository.deleteStudent("127");

        StudentRepository studentRepository2 = new StudentRepository();
        studentRepository2.add(new Student("1", "1", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository2.add(new Student("2", "2", LocalDate.parse("2001-11-05"), "m", "124"));
        studentRepository2.add(new Student("3", "3", LocalDate.parse("2001-02-22"), "f", "125"));
        studentRepository2.add(new Student("4", "4", LocalDate.parse("2005-02-28"), "f", "126"));

        Assertions.assertEquals(4, studentRepository.getSize());


    }

    @Test
    public void deleteTest3() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.add(new Student("1", "1", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository.add(new Student("2", "2", LocalDate.parse("2001-11-05"), "m", "124"));
        studentRepository.add(new Student("3", "3", LocalDate.parse("2001-02-22"), "f", "125"));
        studentRepository.add(new Student("4", "4", LocalDate.parse("2005-02-28"), "f", "126"));
        studentRepository.add(new Student("5", "5", LocalDate.parse("1980-02-15"), "f", "127"));
        studentRepository.deleteStudent("1");

        Assertions.assertEquals(5, studentRepository.getSize());
    }

    @Test
    public void ageTest() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.add(new Student("1", "1", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository.add(new Student("2", "2", LocalDate.parse("2001-11-05"), "m", "124"));
        studentRepository.add(new Student("3", "3", LocalDate.parse("2001-02-22"), "f", "125"));
        studentRepository.add(new Student("4", "4", LocalDate.parse("2005-02-28"), "f", "126"));
        studentRepository.add(new Student("5", "5", LocalDate.parse("1980-02-15"), "f", "127"));
        studentRepository.printStudentsByAge("a");
        studentRepository.printStudentsByAge("23");
        studentRepository.printStudentsByAge("22");

    }

    @Test
    public void printStudentsByBirthdateTest() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.add(new Student("1", "1", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository.add(new Student("2", "2", LocalDate.parse("2001-11-05"), "m", "124"));
        studentRepository.add(new Student("3", "3", LocalDate.parse("2001-02-22"), "f", "125"));
        studentRepository.add(new Student("4", "4", LocalDate.parse("2005-02-28"), "f", "126"));
        studentRepository.add(new Student("5", "5", LocalDate.parse("1980-02-15"), "f", "127"));
        studentRepository.printStudentsByBirthdate();
    }

    @Test
    public void printStudentsByLastNameTest() {
        StudentRepository studentRepository = new StudentRepository();
        studentRepository.add(new Student("Zoe", "Zoe", LocalDate.parse("2000-01-08"), "m", "123"));
        studentRepository.add(new Student("Alex", "Alex", LocalDate.parse("2001-11-05"), "m", "124"));
        studentRepository.add(new Student("Nelu", "Nelu", LocalDate.parse("2001-02-22"), "f", "125"));
        studentRepository.add(new Student("Mihaela", "Mihaela", LocalDate.parse("2005-02-28"), "f", "126"));
        studentRepository.add(new Student("Bogdan", "Bogdan", LocalDate.parse("1980-02-15"), "f", "127"));
        studentRepository.printStudentsByLastName();
    }

}
