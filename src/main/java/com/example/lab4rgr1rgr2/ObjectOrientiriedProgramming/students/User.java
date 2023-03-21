package com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.students;

import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.enums.Course;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.rating.Rating;

import java.util.ArrayList;
import java.util.List;

public abstract class User {
    protected String firstName;
    protected String lastName;
    protected int age;
    protected List<Rating> ratings;
    protected Course course;

    public User(String firstName, String lastName, int age, List<Rating> ratings, Course course){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.ratings = new ArrayList<>();
        this.course = course;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    abstract void study();
}
