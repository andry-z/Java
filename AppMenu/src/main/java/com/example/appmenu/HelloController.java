package com.example.appmenu;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void registrazione() throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("registrazione.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Registrazione");
        stage.setScene(new Scene(root, 600, 400));
        stage.setResizable(true);
        stage.show();
    }
}