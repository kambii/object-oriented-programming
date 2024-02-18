package org.example.courseWithStudentsAndTeachers;

import java.util.*;

class Course {
    private String courseName;
    private Set<String> students;
    private Set<String> teachers;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new HashSet<>();
        this.teachers = new HashSet<>();
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void removeStudent(String student) {
        students.remove(student);
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
    }

    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Students:");
        List<String> sortedStudents = new ArrayList<>(students);
        Collections.sort(sortedStudents);
        for (String student : sortedStudents) {
            System.out.println(student);
        }
        System.out.println("Teachers:");
        List<String> sortedTeachers = new ArrayList<>(teachers);
        Collections.sort(sortedTeachers);
        for (String teacher : sortedTeachers) {
            System.out.println(teacher);
        }
        System.out.println();
    }

    public void displayCourseInfo2() {
        // System.out.println("Course: " + courseName);
        System.out.println("Students:");
        List<String> sortedStudents = new ArrayList<>(students);
        Collections.sort(sortedStudents);
        for (String student : sortedStudents) {
            System.out.println(student);
        }
    }
}

class CourseWithStudentsAndTeachers {
    public static void main(String[] args) {
        Course mathCourse = new Course("Math");
        mathCourse.addStudent("Bob");
        mathCourse.addStudent("Eve");
        mathCourse.addStudent("Alice");
        mathCourse.addStudent("Charlie");
        mathCourse.addStudent("David");
        mathCourse.addTeacher("Ms. Johnson");
        mathCourse.addTeacher("Mr. Smith");

        System.out.println("Before removing a student:");
        mathCourse.displayCourseInfo();

        // Let's remove a student
        mathCourse.removeStudent("Bob");

        System.out.println("After removing a student:");
        mathCourse.displayCourseInfo2();
    }
}
