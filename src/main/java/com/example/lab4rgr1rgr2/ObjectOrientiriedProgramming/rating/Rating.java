package com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.rating;

import com.example.lab4rgr1rgr2.*;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.disciplines.Discipline;

public class Rating {
    private Discipline discipline;
    private int grade;

    public Rating(Discipline discipline, int grade) {
        this.discipline = discipline;
        this.grade = grade;
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}