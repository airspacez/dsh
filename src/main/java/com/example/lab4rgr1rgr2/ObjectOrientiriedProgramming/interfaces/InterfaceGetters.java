package com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.interfaces;

import com.example.lab4rgr1rgr2.*;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.disciplines.Discipline;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.students.Student;

import java.util.List;

public interface InterfaceGetters {
    List<Integer> getRatingsByDiscipline(Student student, Discipline discipline);
    double getAverageRating(Student student, Discipline discipline);
}
