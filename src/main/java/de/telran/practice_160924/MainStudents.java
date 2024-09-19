package de.telran.practice_160924;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainStudents {
    public static void main(String[] args) {

        Student student1 = new Student("Peter", 1, "ag/gmail", 2000);
        Student student2 = new Student("Vano", 2, "ag1/gmail", 2001);
        Student student3 = new Student("Linux", 3, "ag22/gmail", 2000);
        Student student4 = new Student("Eva", 4, "ag7/gmail", 2002);
        Student student5 = new Student("Ira", 5, "ag4/gmail", 2003);

        Set<Student> students = new TreeSet<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        System.out.println(students);
        System.out.println(findStudentById(students, 2));

        apdateEmail(students, 5, "ggg.gmail");
        System.out.println(students);
    }

    static Student findStudentById(Set<Student> students, int id) {
        for (Student student : students) {
            if (student.getId() == id) return student;
        }
        return null;
    }

    static void apdateEmail(Set<Student> students, int id, String newEmail) {
        Student s = findStudentById(students, 5);

        if (s != null)
            s.setEmail(newEmail);
    }


}
