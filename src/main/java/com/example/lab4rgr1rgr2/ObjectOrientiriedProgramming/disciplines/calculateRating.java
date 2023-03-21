package com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.disciplines;

import com.example.lab4rgr1rgr2.*;

import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.interfaces.InterfaceGetters;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.rating.Rating;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.students.Student;

import java.util.ArrayList;
import java.util.List;

public class calculateRating implements InterfaceGetters {
    @Override
    public List<Integer> getRatingsByDiscipline(Student student, Discipline discipline) {
        List<Integer> ratings = new ArrayList<>();
        for (Rating rating : student.getRatings()) {
            if (rating.getDiscipline().equals(discipline)) {
                ratings.add(rating.getGrade());
            }
        }
        return ratings;
    }

    @Override
    public double getAverageRating(Student student, Discipline discipline) {
        List<Integer> ratings = getRatingsByDiscipline(student, discipline);
        int sum = 0;
        for (int rating : ratings) {
            sum += rating;
        }
        return ratings.size() > 0 ? (double) sum / ratings.size() : 0;
    }
}
