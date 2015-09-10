package LITS.ChupilKreminKosar;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    private String surname;
    private int age;
    private int course;

    @JsonCreator
    public Student(@JsonProperty("surname") String surname,
                   @JsonProperty("age") int age,
                   @JsonProperty("course") int course) {
        this.surname = surname;
        this.age = age;
        this.course = course;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "surname='" + surname + '\'' +
                ", age=" + age +
                ", course=" + course +
                '}';
    }
}