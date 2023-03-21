package com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.interfaces;

import com.example.lab4rgr1rgr2.*;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.disciplines.Discipline;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.students.Student;

public interface InterfaceDiscipline {
    void addRating(Student student, Discipline discipline, int grade);
}
