package com.example.lab4rgr1rgr2;

import com.example.lab4rgr1rgr2.ObjectOrientiriedProgramming.disciplines.Discipline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    public static Discipline math = new Discipline("Math");
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Студент-рейтинг-дисциплина");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        TCPClient.main(new String[] {"arg1", "arg2"});
        launch();
    }
}