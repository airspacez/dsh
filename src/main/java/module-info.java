module com.example.lab4rgr1rgr2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab4rgr1rgr2 to javafx.fxml;
    exports com.example.lab4rgr1rgr2;
}