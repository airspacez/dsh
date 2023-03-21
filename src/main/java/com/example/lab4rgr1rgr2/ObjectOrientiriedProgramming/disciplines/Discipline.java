package com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.disciplines;

import com.example.lab4rgr1rgr2.*;

import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.interfaces.InterfaceDiscipline;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.rating.Rating;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.students.Student;

import java.util.ArrayList;
import java.util.List;

public class Discipline extends calculateRating implements InterfaceDiscipline {
    private String name;
    private List<Student> students;

    public Discipline(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void addRating(Student student, Discipline discipline, int grade) {
        Rating newRating = new Rating(discipline, grade);
        student.addRating(newRating);
    }
}