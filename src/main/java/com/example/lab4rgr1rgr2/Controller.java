package com.example.lab4rgr1rgr2;

import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.enums.Course;
import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.students.Student;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

import static com.example.lab4rgr1rgr2.Main.math;

public class Controller {

    @FXML
    private Button buttonAddRating2AlinaToMath;

    @FXML
    private Button buttonAddRating2DashaToMath;

    @FXML
    private Button buttonAddRating3AlinaToMath;

    @FXML
    private Button buttonAddRating3DashaToMath;

    @FXML
    private Button buttonAddRating4AlinaToMath;

    @FXML
    private Button buttonAddRating4DashaToMath;

    @FXML
    private Button buttonAddRating5AlinaToMath;

    @FXML
    private Button buttonAddRating5DashaToMath;

    @FXML
    private Button buttonAddStudentAlinaToDiscipline;

    @FXML
    private Button buttonAddStudentDashaToDiscipline;

    @FXML
    private Button buttonGetInfoDiscipline;

    @FXML
    private TextArea info;

    @FXML
    private Button buttonCreateStudentAlina;

    @FXML
    private Button buttonCreateStudentDasha;

    @FXML
    private Button buttonCheckAllRatingListAlina;

    @FXML
    private Button buttonCheckAllRatingListDasha;

    @FXML
    private Button buttonCheckAverageRatingAlina;

    @FXML
    private Button buttonCheckAverageRatingDasha;

    static Student dasha = null;
    static Student alina = null;

    @FXML
    void addRating2AlinaToMath(ActionEvent event) {
        if(alina == null){
            info.setText("Невозможно! Студента Алина не существует");
        } else {
            math.addRating(alina, math, 2);
            info.setText("Алине поставлена оценка 2 по Math");
        }
    }

    @FXML
    void addRating2DashaToMath(ActionEvent event) {
        if(dasha == null){
            info.setText("Невозможно! Студента Даша не существует");
        } else {
            math.addRating(dasha, math, 2);
            info.setText("Даше поставлена оценка 2 по Math");
        }
    }

    @FXML
    void addRating3AlinaToMath(ActionEvent event) {
        if(alina == null){
            info.setText("Невозможно! Студента Алина не существует");
        } else {
            math.addRating(alina, math, 3);
            info.setText("Алине поставлена оценка 3 по Math");
        }
    }

    @FXML
    void addRating3DashaToMath(ActionEvent event) {
        if(dasha == null){
            info.setText("Невозможно! Студента Даша не существует");
        } else {
            math.addRating(dasha, math, 3);
            info.setText("Даше поставлена оценка 3 по Math");
        }
    }

    @FXML
    void addRating4AlinaToMath(ActionEvent event) {
        if(alina == null){
            info.setText("Невозможно! Студента Алина не существует");
        } else {
            math.addRating(alina, math, 4);
            info.setText("Алине поставлена оценка 4 по Math");
        }
    }

    @FXML
    void addRating4DashaToMath(ActionEvent event) {
        if(dasha == null){
            info.setText("Невозможно! Студента Даша не существует");
        } else {
            math.addRating(dasha, math, 4);
            info.setText("Даше поставлена оценка 4 по Math");
        }
    }

    @FXML
    void addRating5AlinaToMath(ActionEvent event) {
        if(alina == null){
            info.setText("Невозможно! Студента Алина не существует");
        } else {
            math.addRating(alina, math, 5);
            info.setText("Алине поставлена оценка 5 по Math");
        }
    }

    @FXML
    void addRating5DashaToMath(ActionEvent event) {
        if(dasha == null){
            info.setText("Невозможно! Студента Даша не существует");
        } else {
            math.addRating(dasha, math, 5);
            info.setText("Даше поставлена оценка 5 по Math");
        }
    }

    @FXML
    void createStudentAlina(ActionEvent event) {
        if (alina == null) {
            alina = new Student("Alina", "Kilovich", 21,  new ArrayList<>(), Course.fourth);
            info.setText("Создан студент Алина!");
        } else {
            info.setText("Студент Алина уже создан!");
        }
    }

    @FXML
    void createStudentDasha(ActionEvent event) {
        if (dasha == null) {
            dasha = new Student("Dasha", "Emasueva", 21, new ArrayList<>(), Course.fourth);
            info.setText("Создан студент Даша!");
        } else {
            info.setText("Студент Даша уже создан!");
        }
    }

    @FXML
    void addStudentAlinaToDiscipline(ActionEvent event) {
        if (alina == null) {
            info.setText("Невозможно! Студента Алина не существует");
        } else {
            math.addStudent(alina);
            info.setText("Студент Алина добавлен в дисциплину Math");
        }
    }

    @FXML
    void addStudentDashaToDiscipline(ActionEvent event) {
        if (dasha == null) {
            info.setText("Невозможно! Студента Даша не существует");
        } else {
            math.addStudent(dasha);
            info.setText("Студент Даша добавлен в дисциплину Math");
        }
    }

    @FXML
    void getInfoDiscipline(ActionEvent event) {
        info.clear();
        List<Student> students = math.getStudents();
        if (students.isEmpty()) {
            info.setText("В данной дисциплине не добавлено студентов!");
        } else {
            for (Student student : students) {
                info.appendText(student.getFirstName() + " " + student.getLastName() + ". Курс: " + student.getCourse() + "\n");
            }
        }
    }

    @FXML
    void checkAllRatingListAlina(ActionEvent event) {
        info.clear();
        if (alina == null) {
            info.setText("Невозможно! Студента Алина не существует");
        } else if (alina.getRatings().isEmpty()){
            info.setText("Оценок нет!");
        } else {
            for(int i = 0; i < alina.getRatings().size(); ++i) {
                if(i == alina.getRatings().size() - 1){
                    info.appendText(String.valueOf(alina.getRatings().get(i).getGrade()));
                } else {
                    info.appendText(alina.getRatings().get(i).getGrade() + ", ");
                }
            }
        }
    }

    @FXML
    void checkAllRatingListDasha(ActionEvent event) {
        info.clear();
        if (dasha == null) {
            info.setText("Невозможно! Студента Даша не существует");
        } else if (dasha.getRatings().isEmpty()){
            info.setText("Оценок нет!");
        } else {
            for(int i = 0; i < dasha.getRatings().size(); ++i) {
                if(i == dasha.getRatings().size() - 1){
                    info.appendText(String.valueOf(dasha.getRatings().get(i).getGrade()));
                } else {
                    info.appendText(dasha.getRatings().get(i).getGrade() + ", ");
                }
            }
        }
    }

    @FXML
    void checkAverageRatingAlina(ActionEvent event) {
        if (alina == null) {
            info.setText("Невозможно! Студента Алина не существует");
        } else {
            info.setText("Средний балл у Алины: " + math.getAverageRating(alina, math));
        }
    }

    @FXML
    void checkAverageRatingDasha(ActionEvent event) {
        if (dasha == null) {
            info.setText("Невозможно! Студента Даша не существует");
        } else {
            info.setText("Средний балл у Даши: " + math.getAverageRating(dasha, math));
        }
    }

}
