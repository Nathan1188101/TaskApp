module com.example.taskapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.taskapp to javafx.fxml;
    exports com.example.taskapp;
}