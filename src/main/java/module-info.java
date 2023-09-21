module com.example.taskapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.taskapp to javafx.fxml;
    exports com.example.taskapp;
}