package com.example.taskapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CreateUserController implements Initializable {

    @FXML
    private TextField confirmEmail;

    @FXML
    private TextField email;

    @FXML
    private Label msgLabel;

    @FXML
    private TextField userName;

    @FXML
    void submit(ActionEvent event) throws SQLException {
        if(email.getText().equals(confirmEmail.getText()))
        {
            //
            try {
                Person person = new Person(userName.getText(), email.getText());
                msgLabel.setText(DBUtility.saveUserToDB(person));
            }
            catch (IllegalArgumentException e)
            {
                msgLabel.setText(e.getMessage());
            }
        }
        else
            msgLabel.setText("emails must match");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        msgLabel.setText("");

    }

}