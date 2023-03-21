package com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.students;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.enums.Course;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.rating.Rating;

import java.util.ArrayList;
import java.util.List;


public class Student extends User {

    public Student(String firstName, String lastName, int age, List<Rating> ratings, Course course) {
        super(firstName, lastName, age, ratings, course);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    public Course getCourse() {
        return course;
    }

    @Override
    void study() {
        System.out.println("Already study");
    }
}