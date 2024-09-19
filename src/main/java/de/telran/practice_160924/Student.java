package de.telran.practice_160924;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private String email;
    private int year;

    public Student(String name, int id, String email, int year) {
        this.name = name;
        this.id = id;
        this.email = email;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return '\n' + "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && year == student.year && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, email, year);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Student o) {
        if (this.year > o.year) {
            return 1;
        } else if (this.year < o.getYear()) {
            return -1;
        } else {
            if (this.getName().charAt(0) > o.getName().charAt(0)) return 1;
            else if (this.getName().charAt(0) < o.getName().charAt(0)) return -1;
            else
                return 0;
        }
    }

//    @Override
//    public int compareTo(Student other) {
//        // Сначала сортируем по году обучения
//        int yearComparison = Integer.compare(this.yearOfStudy, other.yearOfStudy);
//        if (yearComparison != 0) {
//            return yearComparison;
//        }
//        // Если год обучения одинаковый, сортируем по имени
//        return this.name.compareTo(other.name);
//    }
}
